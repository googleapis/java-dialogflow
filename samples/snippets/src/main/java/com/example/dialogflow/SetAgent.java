/*
 * Copyright 2021 Google LLC
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

// [START dialogflow_es_create_agent]

import com.google.cloud.dialogflow.v2.Agent;
import com.google.cloud.dialogflow.v2.Agent.Builder;
import com.google.cloud.dialogflow.v2.AgentsClient;
import com.google.cloud.dialogflow.v2.AgentsSettings;
import java.io.IOException;

public class SetAgent {

  public static void main(String[] args) throws IOException {
    String projectId = "my-project-id";
    String displayName = "my-display-name";

    setAgent(projectId, displayName);
  }

  public static Agent setAgent(String parent, String displayName) throws IOException {
    String apiEndpoint = "global-dialogflow.googleapis.com:443";

    AgentsSettings agentsSettings = AgentsSettings.newBuilder().setEndpoint(apiEndpoint).build();
    try (AgentsClient client = AgentsClient.create(agentsSettings)) {
      // Set the details of the Agent to create
      Builder build = Agent.newBuilder();

      build.setDefaultLanguageCode("en");
      build.setDisplayName(displayName);
      // Correct format for timezone is location/city
      // For example America/Los_Angeles, Europe/Madrid, Asia/Tokyo
      build.setTimeZone("America/Los_Angeles");

      Agent agent = build.build();

      // Make API request to create agent
      Agent response = client.setAgent(agent);
      System.out.println(response);
      return response;
    }
  }
}
// [END dialogflow_es_create_agent]
