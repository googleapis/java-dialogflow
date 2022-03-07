/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dialogflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationProfilesClient;
import com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig;
import com.google.cloud.dialogflow.v2.KnowledgeBaseName;
import com.google.cloud.dialogflow.v2.SuggestionFeature.Type;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class CreateConversationProfileTest {

  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String LOCATION = "global";
  private static String conversationProfileNameToDelete = "";

  private static void requireEnvVar(String varName) {
    assertNotNull(System.getenv(varName));
  }

  private static void deleteConversationProfile(
      String conversationProfileName) throws IOException {
    try (ConversationProfilesClient conversationProfilesClient = 
        ConversationProfilesClient.create()) {
      conversationProfilesClient.deleteConversationProfile(conversationProfileName);
    }
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @After
  public void tearDown() throws IOException {
    if (conversationProfileNameToDelete.length() > 0) {
      deleteConversationProfile(conversationProfileNameToDelete);
      conversationProfileNameToDelete = "";
    }
  }

  @Test
  public void testCreateConversationProfileArticleFaq() throws IOException {
    String conversationProfileDisplayName = UUID.randomUUID().toString();
    
    // Create a conversation profile
    String articleSuggestionKnowledgeBaseId = UUID.randomUUID().toString();
    String faqKnowledgeBaseId = UUID.randomUUID().toString();
    ConversationProfile createdConversationProfile = 
        ConversationProfileManagement.createConversationProfileArticleFaq(
          PROJECT_ID, 
          conversationProfileDisplayName, 
          LOCATION,
          Optional.of(articleSuggestionKnowledgeBaseId), 
          Optional.of(faqKnowledgeBaseId));
    conversationProfileNameToDelete = createdConversationProfile.getName();
    assertEquals(conversationProfileDisplayName, createdConversationProfile.getDisplayName());
    List<SuggestionFeatureConfig> featureConfigsList = createdConversationProfile
          .getHumanAgentAssistantConfig().getHumanAgentSuggestionConfig().getFeatureConfigsList();
    assertEquals(2, featureConfigsList.size());
    assertTrue(featureConfigsList
          .stream()
          .filter(featureConfig -> 
            featureConfig.getSuggestionFeature().getType().equals(Type.ARTICLE_SUGGESTION))
          .anyMatch(featureConfig -> 
            KnowledgeBaseName.parse(
              featureConfig
                .getQueryConfig().getKnowledgeBaseQuerySource().getKnowledgeBases(0)
            ).getKnowledgeBase().equals(articleSuggestionKnowledgeBaseId)));
    assertTrue(featureConfigsList
          .stream()
          .filter(featureConfig -> 
            featureConfig.getSuggestionFeature().getType().equals(Type.FAQ))
          .anyMatch(featureConfig -> 
            KnowledgeBaseName.parse(
              featureConfig
                .getQueryConfig().getKnowledgeBaseQuerySource().getKnowledgeBases(0)
            ).getKnowledgeBase().equals(faqKnowledgeBaseId)));

    // Delete the conversation profile
    deleteConversationProfile(conversationProfileNameToDelete);
    conversationProfileNameToDelete = "";
  }
}
