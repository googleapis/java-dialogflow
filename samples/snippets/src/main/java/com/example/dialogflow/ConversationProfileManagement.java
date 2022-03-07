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

// [START dialogflow_create_conversation_profile_article_faq]

import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationProfilesClient;
import com.google.cloud.dialogflow.v2.CreateConversationProfileRequest;
import com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig;
import com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionConfig;
import com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig;
import com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionQueryConfig;
import com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionQueryConfig.KnowledgeBaseQuerySource;
import com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionTriggerSettings;
import com.google.cloud.dialogflow.v2.KnowledgeBaseName;
import com.google.cloud.dialogflow.v2.LocationName;
import com.google.cloud.dialogflow.v2.SuggestionFeature;
import com.google.cloud.dialogflow.v2.SuggestionFeature.Type;
import java.io.IOException;
import java.util.Optional;

public class ConversationProfileManagement {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "my-project-id";
    String location = "my-location";
    String conversationProfileDisplayName = "my-conversation-profile-display-name";

    // Create a conversation profile
    String articleSuggestionKnowledgeBaseId = "my-fake-article-suggestion-knowledge-base-id";
    String faqKnowledgeBaseId = "my-fake-faq-knowledge-base-id";
    createConversationProfileArticleFaq(
        projectId, 
        conversationProfileDisplayName, 
        location,
        Optional.of(articleSuggestionKnowledgeBaseId), 
        Optional.of(faqKnowledgeBaseId));
  }
  
  // Create a conversation profile with given values about article suggestion or faq
  public static ConversationProfile createConversationProfileArticleFaq(
      String projectId, 
      String displayName, 
      String location,
      Optional<String> articleSuggestionKnowledgeBaseId, 
      Optional<String> faqKnowledgeBaseId) throws ApiException, IOException {
    try (ConversationProfilesClient conversationProfilesClient = 
        ConversationProfilesClient.create()) {
      SuggestionConfig.Builder suggestionConfigBuilder = SuggestionConfig.newBuilder();

      // Add knowledge base for article suggestion
      if (articleSuggestionKnowledgeBaseId.isPresent()) {
        KnowledgeBaseName articleSuggestionKbName = 
            KnowledgeBaseName.of(projectId, articleSuggestionKnowledgeBaseId.get());
        SuggestionFeatureConfig articleSuggestionFeatureConfig = 
            SuggestionFeatureConfig.newBuilder()
              .setSuggestionFeature(
                SuggestionFeature.newBuilder().setType(Type.ARTICLE_SUGGESTION).build())
              .setSuggestionTriggerSettings(
                SuggestionTriggerSettings.newBuilder()
                  .setNoSmalltalk(true).setOnlyEndUser(true).build())
              .setQueryConfig(
                SuggestionQueryConfig.newBuilder()
                  .setKnowledgeBaseQuerySource(
                    KnowledgeBaseQuerySource.newBuilder()
                    .addKnowledgeBases(articleSuggestionKbName.toString()))
                  .setMaxResults(3).build())
              .build();
        suggestionConfigBuilder.addFeatureConfigs(articleSuggestionFeatureConfig);
      }

      // Add knowledge base for faq
      if (faqKnowledgeBaseId.isPresent()) {
        KnowledgeBaseName faqKbName = KnowledgeBaseName.of(projectId, faqKnowledgeBaseId.get());
        SuggestionFeatureConfig faqFeatureConfig = SuggestionFeatureConfig.newBuilder()
            .setSuggestionFeature(
              SuggestionFeature.newBuilder().setType(Type.FAQ).build())
            .setSuggestionTriggerSettings(
              SuggestionTriggerSettings.newBuilder()
                .setNoSmalltalk(true).setOnlyEndUser(true).build())
            .setQueryConfig(
              SuggestionQueryConfig.newBuilder()
                .setKnowledgeBaseQuerySource(
                  KnowledgeBaseQuerySource.newBuilder()
                  .addKnowledgeBases(faqKbName.toString()))
                .setMaxResults(3).build())
            .build();
        suggestionConfigBuilder.addFeatureConfigs(faqFeatureConfig); 
      }
      
      LocationName locationName = LocationName.of(projectId, location);
      ConversationProfile conversationProfile = 
          conversationProfilesClient.createConversationProfile(
            CreateConversationProfileRequest.newBuilder()
              .setParent(locationName.toString())
              .setConversationProfile(
                ConversationProfile.newBuilder()
                  .setDisplayName(displayName)
                  .setLanguageCode("en-US")
                  .setHumanAgentAssistantConfig(
                    HumanAgentAssistantConfig.newBuilder()
                      .setHumanAgentSuggestionConfig(suggestionConfigBuilder.build()))
                .build())
              .build());
      System.out.println("====================");
      System.out.println("Conversation Profile created:");
      System.out.format("Display name: %s\n", conversationProfile.getDisplayName());
      System.out.format("Name: %s\n", conversationProfile.getName());
      return conversationProfile;
    }
  }
}
// [END dialogflow_create_conversation_profile_article_faq]