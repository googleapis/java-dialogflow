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

import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.v2.Conversation;
import com.google.cloud.dialogflow.v2.ConversationName;
import com.google.cloud.dialogflow.v2.ConversationProfileName;
import com.google.cloud.dialogflow.v2.ConversationsClient;
import com.google.cloud.dialogflow.v2.LocationName;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class ConversationManagement {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "my-project-id";
    String location = "my-location";
    String conversationProfileId = "my-conversation-profile-id";
    
    // Create a conversation
    Conversation conversation = 
        createConversation(projectId, location, conversationProfileId);

    // Complete the conversation
    String conversationId = ConversationName.parse(conversation.getName()).getConversation();
    completeConversation(projectId, location, conversationId);

    // Get the conversation
    getConversation(projectId, location, conversationId);

    // List conversations
    listConversations(projectId, location);
  }

  // [START dialogflow_list_conversations]
  public static List<Conversation> listConversations(String projectId, String location) 
      throws ApiException, IOException {
    List<Conversation> conversations = Lists.newArrayList();
    try (ConversationsClient conversationsClient = ConversationsClient.create()) {
      LocationName locationName = LocationName.of(projectId, location);
      for (Conversation conversation : 
          conversationsClient.listConversations(locationName).iterateAll()) {
        System.out.println("====================");
        System.out.format("Life Cycle State: %s\n", conversation.getLifecycleState());
        System.out.format("Conversation Profile Name: %s\n", 
            conversation.getConversationProfile());
        System.out.format("Name: %s\n", conversation.getName());
        conversations.add(conversation);
      }
    }
    return conversations;
  }
  // [END dialogflow_list_conversations]

  // [START dialogflow_create_conversation]
  public static Conversation createConversation(
      String projectId, String location, String conversationProfileId) 
      throws ApiException, IOException {
    try (ConversationsClient conversationsClient = ConversationsClient.create()) {
      LocationName locationName = LocationName.of(projectId, location);
      ConversationProfileName conversationProfileName = 
          ConversationProfileName.ofProjectLocationConversationProfileName(
            projectId, location, conversationProfileId);
      Conversation conversation = 
          Conversation.newBuilder().setConversationProfile(
            conversationProfileName.toString()).build();
      Conversation newConversation = 
          conversationsClient.createConversation(locationName, conversation);
      System.out.println("====================");
      System.out.println("Conversation Created:");
      System.out.format("Life Cycle State: %s\n", newConversation.getLifecycleState());
      System.out.format("Conversation Profile Name: %s\n", 
          newConversation.getConversationProfile());
      System.out.format("Name: %s\n", newConversation.getName());
      return newConversation;
    }
  }
  // [END dialogflow_create_conversation]

  // [START dialogflow_get_conversation]
  public static Conversation getConversation(
      String projectId, String location, String conversationId) 
      throws ApiException, IOException {
    try (ConversationsClient conversationsClient = ConversationsClient.create()) {
      ConversationName conversationName = 
          ConversationName.ofProjectLocationConversationName(projectId, location, conversationId);
      Conversation conversation = conversationsClient.getConversation(conversationName);
      System.out.println("====================");
      System.out.println("Conversation Got:");
      System.out.format("Life Cycle State: %s\n", conversation.getLifecycleState());
      System.out.format("Conversation Profile Name: %s\n", 
          conversation.getConversationProfile());
      System.out.format("Name: %s\n", conversation.getName());
      return conversation;
    }
  }
  // [END dialogflow_get_conversation]

  // [START dialogflow_complete_conversation]
  public static Conversation completeConversation(
      String projectId, String location, String conversationId) 
      throws ApiException, IOException {
    try (ConversationsClient conversationsClient = ConversationsClient.create()) {
      ConversationName conversationName = 
          ConversationName.ofProjectLocationConversationName(projectId, location, conversationId);
      Conversation conversation = conversationsClient.completeConversation(conversationName);
      System.out.println("====================");
      System.out.println("Conversation Completed:");
      System.out.format("Life Cycle State: %s\n", conversation.getLifecycleState());
      System.out.format("Conversation Profile Name: %s\n", 
          conversation.getConversationProfile());
      System.out.format("Name: %s\n", conversation.getName());
      return conversation;
    }
  }
  // [END dialogflow_complete_conversation]
}
