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

// [START dialogflow_v2beta1_generated_answerrecordsclient_listanswerrecords_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.AnswerRecord;
import com.google.cloud.dialogflow.v2beta1.AnswerRecordsClient;
import com.google.cloud.dialogflow.v2beta1.ListAnswerRecordsRequest;
import com.google.cloud.dialogflow.v2beta1.ProjectName;

public class AsyncListAnswerRecords {

  public static void main(String[] args) throws Exception {
    asyncListAnswerRecords();
  }

  public static void asyncListAnswerRecords() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AnswerRecordsClient answerRecordsClient = AnswerRecordsClient.create()) {
      ListAnswerRecordsRequest request =
          ListAnswerRecordsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<AnswerRecord> future =
          answerRecordsClient.listAnswerRecordsPagedCallable().futureCall(request);
      // Do something.
      for (AnswerRecord element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dialogflow_v2beta1_generated_answerrecordsclient_listanswerrecords_async]
