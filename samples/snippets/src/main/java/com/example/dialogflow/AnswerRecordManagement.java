/*
 * Copyright 2022 Google LLC
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

// [START dialogflow_update_answer_record]
import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.v2.AnswerFeedback;
import com.google.cloud.dialogflow.v2.AnswerRecord;
import com.google.cloud.dialogflow.v2.AnswerRecordName;
import com.google.cloud.dialogflow.v2.AnswerRecordsClient;
import com.google.cloud.dialogflow.v2.UpdateAnswerRecordRequest;
import com.google.protobuf.FieldMask;
import java.io.IOException;

public class AnswerRecordManagement {

  // Update whether the answer record was clicked.
  public static AnswerRecord updateAnswerRecord(
      String projectId, 
      String answerRecordId, 
      boolean clicked)
      throws ApiException, IOException {
    try (AnswerRecordsClient answerRecordsClient = AnswerRecordsClient.create()) {
      AnswerRecordName answerRecordName = 
          AnswerRecordName.ofProjectLocationAnswerRecordName(projectId, "global", answerRecordId);
      AnswerFeedback answerFeedback = AnswerFeedback.newBuilder().setClicked(clicked).build();
      AnswerRecord answerRecord = AnswerRecord.newBuilder()
          .setName(answerRecordName.toString())
          .setAnswerFeedback(answerFeedback)
          .build();
      FieldMask fieldMask = FieldMask.newBuilder().addPaths("answer_feedback").build();

      UpdateAnswerRecordRequest request =
          UpdateAnswerRecordRequest.newBuilder()
            .setAnswerRecord(answerRecord)
            .setUpdateMask(fieldMask)
            .build();
      AnswerRecord response = answerRecordsClient.updateAnswerRecord(request);
      System.out.format("AnswerRecord updated:\n");
      System.out.format("Name: %s \n", response.getName());
      System.out.format("Clicked: %s \n", response.getAnswerFeedback().getClicked());
      return response;
    }
  }
}
// [END dialogflow_update_answer_record]