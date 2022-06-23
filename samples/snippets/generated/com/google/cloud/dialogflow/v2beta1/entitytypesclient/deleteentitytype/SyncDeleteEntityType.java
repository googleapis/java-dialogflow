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

// [START dialogflow_v2beta1_generated_entitytypesclient_deleteentitytype_sync]
import com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest;
import com.google.cloud.dialogflow.v2beta1.EntityTypeName;
import com.google.cloud.dialogflow.v2beta1.EntityTypesClient;

public class SyncDeleteEntityType {

  public static void main(String[] args) throws Exception {
    syncDeleteEntityType();
  }

  public static void syncDeleteEntityType() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
      DeleteEntityTypeRequest request =
          DeleteEntityTypeRequest.newBuilder()
              .setName(
                  EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
              .build();
      entityTypesClient.deleteEntityType(request);
    }
  }
}
// [END dialogflow_v2beta1_generated_entitytypesclient_deleteentitytype_sync]
