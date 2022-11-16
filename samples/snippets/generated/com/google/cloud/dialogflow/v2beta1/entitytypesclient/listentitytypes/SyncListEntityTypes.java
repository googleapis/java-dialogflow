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

// [START dialogflow_v2beta1_generated_entitytypesclient_listentitytypes_sync]
import com.google.cloud.dialogflow.v2beta1.AgentName;
import com.google.cloud.dialogflow.v2beta1.EntityType;
import com.google.cloud.dialogflow.v2beta1.EntityTypesClient;
import com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest;

public class SyncListEntityTypes {

  public static void main(String[] args) throws Exception {
    syncListEntityTypes();
  }

  public static void syncListEntityTypes() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
      ListEntityTypesRequest request =
          ListEntityTypesRequest.newBuilder()
              .setParent(AgentName.ofProjectName("[PROJECT]").toString())
              .setLanguageCode("languageCode-2092349083")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (EntityType element : entityTypesClient.listEntityTypes(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dialogflow_v2beta1_generated_entitytypesclient_listentitytypes_sync]