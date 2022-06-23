/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.v2.samples;

// [START
// dialogflow_v2_generated_conversationsclient_createconversation_projectnameconversation_sync]
import com.google.cloud.dialogflow.v2.Conversation;
import com.google.cloud.dialogflow.v2.ConversationsClient;
import com.google.cloud.dialogflow.v2.ProjectName;

public class SyncCreateConversationProjectnameConversation {

  public static void main(String[] args) throws Exception {
    syncCreateConversationProjectnameConversation();
  }

  public static void syncCreateConversationProjectnameConversation() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ConversationsClient conversationsClient = ConversationsClient.create()) {
      ProjectName parent = ProjectName.of("[PROJECT]");
      Conversation conversation = Conversation.newBuilder().build();
      Conversation response = conversationsClient.createConversation(parent, conversation);
    }
  }
}
// [END dialogflow_v2_generated_conversationsclient_createconversation_projectnameconversation_sync]
