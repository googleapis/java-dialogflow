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

// [START dialogflow_detect_intent_with_sentiment_analysis]

import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.v2.DetectIntentRequest;
import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.cloud.dialogflow.v2.QueryInput;
import com.google.cloud.dialogflow.v2.QueryParameters;
import com.google.cloud.dialogflow.v2.QueryResult;
import com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig;
import com.google.cloud.dialogflow.v2.SessionName;
import com.google.cloud.dialogflow.v2.SessionsClient;
import com.google.cloud.dialogflow.v2.TextInput;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DetectIntentWithSentimentAnalysis {

  public static Map<String, QueryResult> detectIntentSentimentAnalysis(
      String projectId, List<String> texts, String sessionId, String languageCode)
      throws IOException, ApiException {
    Map<String, QueryResult> queryResults = Maps.newHashMap();
    // Instantiates a client
    try (SessionsClient sessionsClient = SessionsClient.create()) {
      // Set the session name using the sessionId (UUID) and projectID (my-project-id)
      SessionName session = SessionName.of(projectId, sessionId);
      System.out.println("Session Path: " + session.toString());

      // Detect intents for each text input
      for (String text : texts) {
        // Set the text (hello) and language code (en-US) for the query
        TextInput.Builder textInput =
            TextInput.newBuilder().setText(text).setLanguageCode(languageCode);

        // Build the query with the TextInput
        QueryInput queryInput = QueryInput.newBuilder().setText(textInput).build();

        //
        SentimentAnalysisRequestConfig sentimentAnalysisRequestConfig =
            SentimentAnalysisRequestConfig.newBuilder().setAnalyzeQueryTextSentiment(true).build();

        QueryParameters queryParameters =
            QueryParameters.newBuilder()
                .setSentimentAnalysisRequestConfig(sentimentAnalysisRequestConfig)
                .build();
        DetectIntentRequest detectIntentRequest =
            DetectIntentRequest.newBuilder()
                .setSession(session.toString())
                .setQueryInput(queryInput)
                .setQueryParams(queryParameters)
                .build();

        // Performs the detect intent request
        DetectIntentResponse response = sessionsClient.detectIntent(detectIntentRequest);

        // Display the query result
        QueryResult queryResult = response.getQueryResult();

        System.out.println("====================");
        System.out.format("Query Text: '%s'\n", queryResult.getQueryText());
        System.out.format(
            "Detected Intent: %s (confidence: %f)\n",
            queryResult.getIntent().getDisplayName(), queryResult.getIntentDetectionConfidence());
        System.out.format(
            "Fulfillment Text: '%s'\n",
            queryResult.getFulfillmentMessagesCount() > 0
                ? queryResult.getFulfillmentMessages(0).getText()
                : "Triggered Default Fallback Intent");
        System.out.format(
            "Sentiment Score: '%s'\n",
            queryResult.getSentimentAnalysisResult().getQueryTextSentiment().getScore());

        queryResults.put(text, queryResult);
      }
    }
    return queryResults;
  }
}
// [END dialogflow_detect_intent_with_sentiment_analysis]
