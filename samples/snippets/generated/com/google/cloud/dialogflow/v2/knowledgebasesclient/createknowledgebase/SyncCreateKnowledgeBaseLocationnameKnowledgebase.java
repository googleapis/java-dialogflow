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
// dialogflow_v2_generated_knowledgebasesclient_createknowledgebase_locationnameknowledgebase_sync]
import com.google.cloud.dialogflow.v2.KnowledgeBase;
import com.google.cloud.dialogflow.v2.KnowledgeBasesClient;
import com.google.cloud.dialogflow.v2.LocationName;

public class SyncCreateKnowledgeBaseLocationnameKnowledgebase {

  public static void main(String[] args) throws Exception {
    syncCreateKnowledgeBaseLocationnameKnowledgebase();
  }

  public static void syncCreateKnowledgeBaseLocationnameKnowledgebase() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
      KnowledgeBase response = knowledgeBasesClient.createKnowledgeBase(parent, knowledgeBase);
    }
  }
}
// [END
// dialogflow_v2_generated_knowledgebasesclient_createknowledgebase_locationnameknowledgebase_sync]
