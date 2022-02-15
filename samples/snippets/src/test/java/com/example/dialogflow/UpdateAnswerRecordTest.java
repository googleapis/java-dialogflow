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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.cloud.dialogflow.v2.AnswerRecord;
import com.google.cloud.dialogflow.v2.AnswerRecordName;
import com.google.cloud.dialogflow.v2.AnswerRecordsClient;
import com.google.cloud.dialogflow.v2.LocationName;
import java.io.IOException;
import java.util.Optional;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class UpdateAnswerRecordTest {
    
  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String LOCATION = "global";

  private static void requireEnvVar(String varName) {
    assertNotNull(String.format(varName), String.format(varName));
  }

  private static Optional<AnswerRecord> getOneAnswerRecord() throws IOException {
    try (AnswerRecordsClient answerRecordsClient = AnswerRecordsClient.create()) {
      LocationName locationName = LocationName.of(PROJECT_ID, LOCATION);
      for (AnswerRecord answerRecord : 
          answerRecordsClient.listAnswerRecords(locationName).iterateAll()) {
            return Optional.of(answerRecord);
      }
      return Optional.empty();
    }
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @Test
  public void testUpdateAnswerRecord() throws IOException {
    // Get one answer record
    Optional<AnswerRecord> answerRecordOptional = getOneAnswerRecord();
    assertTrue(answerRecordOptional.isPresent());

    AnswerRecord originalAnswerRecord = answerRecordOptional.get();
    String answerRecordId = AnswerRecordName.parse(originalAnswerRecord.getName()).getAnswerRecord();
    boolean originalClickedValue = originalAnswerRecord.getAnswerFeedback().getClicked();
    boolean newClickedValue = !originalClickedValue;

    // Update clicked value
    AnswerRecord updatedAnswerRecord = AnswerRecordManagement.updateAnswerRecord(
        PROJECT_ID, LOCATION, answerRecordId, newClickedValue);
    assertEquals(newClickedValue, updatedAnswerRecord.getAnswerFeedback().getClicked());

    // Reset clicked value
    AnswerRecord resetAnswerRecord = AnswerRecordManagement.updateAnswerRecord(
        PROJECT_ID, LOCATION, answerRecordId, originalClickedValue);
    assertEquals(originalClickedValue, resetAnswerRecord.getAnswerFeedback().getClicked());
    assertEquals(originalAnswerRecord, resetAnswerRecord);
  }
}
