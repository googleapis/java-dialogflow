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

import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.v2.Conversation;
import com.google.cloud.dialogflow.v2.Conversation.LifecycleState;
import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationProfileName;
import com.google.cloud.dialogflow.v2.ConversationProfilesClient;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class CreateConversationTest {
  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String CONVERSATION_PROFILE_DISPLAY_NAME = UUID.randomUUID().toString();
  private static final String LOCATION = "global";
  private String conversationProfileId;

  private static void requireEnvVar(String varName) {
    assertNotNull(System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @Before
  public void setUp() throws IOException {
    // Create a conversation profile 
    ConversationProfile conversationProfile = 
        ConversationProfileManagement.createConversationProfileArticleFaq(
          PROJECT_ID, CONVERSATION_PROFILE_DISPLAY_NAME, LOCATION, 
          Optional.empty(), Optional.empty());
    conversationProfileId = 
      ConversationProfileName.parse(conversationProfile.getName()).getConversationProfile();
  }

  @After
  public void tearDown() throws IOException {
    // Delete the created conversation profile
    try (ConversationProfilesClient conversationProfilesClient = 
        ConversationProfilesClient.create()) {
      ConversationProfileName conversationProfileName = 
          ConversationProfileName.ofProjectLocationConversationProfileName(
            PROJECT_ID, LOCATION, conversationProfileId);
      conversationProfilesClient.deleteConversationProfile(conversationProfileName.toString());
    }
  }

  @Test
  public void testCreateConversation() throws ApiException, IOException {
    Conversation createdConversation = 
        ConversationManagement.createConversation(PROJECT_ID, LOCATION, conversationProfileId);
    assertEquals(LifecycleState.IN_PROGRESS, createdConversation.getLifecycleState());
  }
}
