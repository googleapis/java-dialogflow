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

// [START dialogflow_v2_generated_sessionentitytypesclient_getsessionentitytype_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2.GetSessionEntityTypeRequest;
import com.google.cloud.dialogflow.v2.SessionEntityType;
import com.google.cloud.dialogflow.v2.SessionEntityTypeName;
import com.google.cloud.dialogflow.v2.SessionEntityTypesClient;

public class AsyncGetSessionEntityType {

  public static void main(String[] args) throws Exception {
    asyncGetSessionEntityType();
  }

  public static void asyncGetSessionEntityType() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
      GetSessionEntityTypeRequest request =
          GetSessionEntityTypeRequest.newBuilder()
              .setName(
                  SessionEntityTypeName.ofProjectSessionEntityTypeName(
                          "[PROJECT]", "[SESSION]", "[ENTITY_TYPE]")
                      .toString())
              .build();
      ApiFuture<SessionEntityType> future =
          sessionEntityTypesClient.getSessionEntityTypeCallable().futureCall(request);
      // Do something.
      SessionEntityType response = future.get();
    }
  }
}
// [END dialogflow_v2_generated_sessionentitytypesclient_getsessionentitytype_async]
