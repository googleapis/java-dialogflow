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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.cloud.dialogflow.v2.AnswerRecord;
import com.google.cloud.dialogflow.v2.AnswerRecordsClient;
import com.google.cloud.dialogflow.v2.LocationName;
import com.google.cloud.dialogflow.v2.AnswerRecordsClient.ListAnswerRecordsPagedResponse;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class UpdateAnswerRecordTest {
    
  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static String answerRecordId = "";

  private static void requireEnvVar(String varName) {
    assertNotNull(String.format(varName), String.format(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @Before
  public void setUp() throws IOException {
    // Get an unclicked answer record
    try (AnswerRecordsClient answerRecordsClient = AnswerRecordsClient.create()) {
      LocationName parent = LocationName.of(PROJECT_ID, "global");
      answerRecordsClient.listAnswerRecords(LocationName.of(PROJECT_ID, "global"));
      ListAnswerRecordsPagedResponse response = answerRecordsClient.listAnswerRecords(parent);
      for (AnswerRecord answerRecord : 
      response.iterateAll()) {
        if (!answerRecord.getAnswerFeedback().getClicked()) {
          answerRecordId = answerRecord.getName().split("/")[5];
          return;
        }
      }
    }
  }

  @After
  public void tearDown() throws IOException {
    // Reset unclicked answer record
    AnswerRecordManagement.updateAnswerRecord(PROJECT_ID, answerRecordId, false);
  }

  @Test
  public void testUpdateAnswerRecord() throws IOException {
    AnswerRecord answerRecord = AnswerRecordManagement.updateAnswerRecord(PROJECT_ID, answerRecordId, true);
    assertEquals(true, answerRecord.getAnswerFeedback().getClicked());
  }
}
