/*
 * Copyright 2018 Google LLC
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

import com.google.cloud.dialogflow.v2.Intent.Builder;
import com.google.protobuf.FieldMask;
import java.io.IOException;

public class UpdateIntent {

  public static Intent updateIntent(String projectId, String intentId, String location,
      String displayName) throws IOException {
    IntentsClient client = IntentsClient.create();

    String intentPath =
        "projects/" + projectId + "/locations/" + location + "/agent/intents/" + intentId;

    Builder intentBuilder = client.getIntent(intentPath).toBuilder();

    intentBuilder.setDisplayName(displayName);
    FieldMask fieldMask = FieldMask.newBuilder().addPaths("display_name").build();

    Intent intent = intentBuilder.build();
    UpdateIntentRequest request = UpdateIntentRequest.newBuilder()
        .setIntent(intent)
        .setLanguageCode("en")
        .setUpdateMask(fieldMask)
        .build();
    return client.updateIntent(request);
  }
}
