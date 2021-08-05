/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dialogflow;

import com.google.cloud.dialogflow.v2.AgentName;
import com.google.cloud.dialogflow.v2.Intent;
import com.google.cloud.dialogflow.v2.Intent.Builder;
import com.google.cloud.dialogflow.v2.IntentsClient;
import java.io.IOException;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class UpdateIntentTest {

  private static String PROJECT_ID = System.getenv().get("GOOGLE_CLOUD_PROJECT");
  private static String IntentID = "";

  @Before
  public void setUp() throws IOException {

    try (IntentsClient intentsClient = IntentsClient.create()) {
      // Set the project agent name using the projectID (my-project-id)
      AgentName parent = AgentName.of(PROJECT_ID);

      // Performs the list intents request

      for (Intent intent : intentsClient.listIntents(parent).iterateAll()) {
        IntentID = intent.getName().split("/")[4];
      }
    }
  }

  @Test
  public void agentCreation() throws IOException {

    String fakeIntent = "fake_intent_" + UUID.randomUUID().toString();

    Intent actualResponse = UpdateIntent.updateIntent(PROJECT_ID, IntentID, "global", 
        fakeIntent);

    try (IntentsClient intentsClient = IntentsClient.create()) {
      // Set the project agent name using the projectID (my-project-id)
      intentsClient.deleteIntent(actualResponse.getName());
    }

    Assert.assertEquals(actualResponse.getDisplayName(), fakeIntent);
  }
}
