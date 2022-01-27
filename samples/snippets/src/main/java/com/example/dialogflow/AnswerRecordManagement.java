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

import java.io.IOException;
import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.v2.AnswerRecordsClient;
import com.google.cloud.dialogflow.v2.UpdateAnswerRecordRequest;
import com.google.cloud.dialogflow.v2.AnswerFeedback;
import com.google.cloud.dialogflow.v2.AnswerRecord;
import com.google.protobuf.FieldMask;
public class AnswerRecordManagement {

  // [START dialogflow_update_answer_record]
  /**
   * Update the answer record
   * @param projectId The GCP project linked with the conversation profile.
   * @param answerRecordId The answer record id returned along with the suggestion.
   * @param clicked The boolean value indicating whether the answer record was clicked.
   * @return updated answer record.
   * @throws ApiException
   * @throws IOException
   */
  /**
   * 
   * @param projectId
   * @param answerRecordId
   * @param clicked
   * @return
   * @throws ApiException
   * @throws IOException
   */
  public static AnswerRecord updateAnswerRecord(
      String projectId, 
      String answerRecordId, 
      boolean clicked)
      throws ApiException, IOException {
    try (AnswerRecordsClient answerRecordsClient = AnswerRecordsClient.create()) {
      String answerRecordName = 
        "projects/" + projectId + "/locations/global/answerRecords/" + answerRecordId;
      AnswerFeedback answerFeedback = AnswerFeedback.newBuilder()
        .setClicked(clicked).build();
      AnswerRecord answerRecord = AnswerRecord.newBuilder()
        .setName(answerRecordName)
        .setAnswerFeedback(answerFeedback)
        .build();
      FieldMask fieldMask = FieldMask.newBuilder().addPaths("answer_feedback").build();

      UpdateAnswerRecordRequest request =
        UpdateAnswerRecordRequest.newBuilder()
            .setAnswerRecord(answerRecord)
            .setUpdateMask(fieldMask)
            .build();
      AnswerRecord response = answerRecordsClient.updateAnswerRecord(request);
      return response;
    }
  }
  // [END dialogflow_update_answer_record]
}