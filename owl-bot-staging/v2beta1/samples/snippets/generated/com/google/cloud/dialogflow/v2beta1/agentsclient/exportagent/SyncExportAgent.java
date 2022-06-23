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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_agentsclient_exportagent_sync]
import com.google.cloud.dialogflow.v2beta1.AgentsClient;
import com.google.cloud.dialogflow.v2beta1.ExportAgentRequest;
import com.google.cloud.dialogflow.v2beta1.ExportAgentResponse;
import com.google.cloud.dialogflow.v2beta1.ProjectName;

public class SyncExportAgent {

  public static void main(String[] args) throws Exception {
    syncExportAgent();
  }

  public static void syncExportAgent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AgentsClient agentsClient = AgentsClient.create()) {
      ExportAgentRequest request =
          ExportAgentRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setAgentUri("agentUri1469149223")
              .build();
      ExportAgentResponse response = agentsClient.exportAgentAsync(request).get();
    }
  }
}
// [END dialogflow_v2beta1_generated_agentsclient_exportagent_sync]
