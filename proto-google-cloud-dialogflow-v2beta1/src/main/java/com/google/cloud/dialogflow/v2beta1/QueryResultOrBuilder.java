/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface QueryResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.QueryResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The original conversational query text:
   * - If natural language text was provided as input, `query_text` contains
   *   a copy of the input.
   * - If natural language speech audio was provided as input, `query_text`
   *   contains the speech recognition result. If speech recognizer produced
   *   multiple alternatives, a particular one is picked.
   * - If automatic spell correction is enabled, `query_text` will contain the
   *   corrected user input.
   * </pre>
   *
   * <code>string query_text = 1;</code>
   *
   * @return The queryText.
   */
  java.lang.String getQueryText();
  /**
   *
   *
   * <pre>
   * The original conversational query text:
   * - If natural language text was provided as input, `query_text` contains
   *   a copy of the input.
   * - If natural language speech audio was provided as input, `query_text`
   *   contains the speech recognition result. If speech recognizer produced
   *   multiple alternatives, a particular one is picked.
   * - If automatic spell correction is enabled, `query_text` will contain the
   *   corrected user input.
   * </pre>
   *
   * <code>string query_text = 1;</code>
   *
   * @return The bytes for queryText.
   */
  com.google.protobuf.ByteString getQueryTextBytes();

  /**
   *
   *
   * <pre>
   * The language that was triggered during intent detection.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 15;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language that was triggered during intent detection.
   * See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 15;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The Speech recognition confidence between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. The default of 0.0 is a sentinel value indicating that confidence
   * was not set.
   * This field is not guaranteed to be accurate or set. In particular this
   * field isn't set for StreamingDetectIntent since the streaming endpoint has
   * separate confidence estimates per portion of the audio in
   * StreamingRecognitionResult.
   * </pre>
   *
   * <code>float speech_recognition_confidence = 2;</code>
   *
   * @return The speechRecognitionConfidence.
   */
  float getSpeechRecognitionConfidence();

  /**
   *
   *
   * <pre>
   * The action name from the matched intent.
   * </pre>
   *
   * <code>string action = 3;</code>
   *
   * @return The action.
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * The action name from the matched intent.
   * </pre>
   *
   * <code>string action = 3;</code>
   *
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * The collection of extracted parameters.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: string or number, depending on parameter value type
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 4;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The collection of extracted parameters.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: string or number, depending on parameter value type
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 4;</code>
   *
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();
  /**
   *
   *
   * <pre>
   * The collection of extracted parameters.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: string or number, depending on parameter value type
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * This field is set to:
   * - `false` if the matched intent has required parameters and not all of
   *    the required parameter values have been collected.
   * - `true` if all required parameter values have been collected, or if the
   *    matched intent doesn't contain any required parameters.
   * </pre>
   *
   * <code>bool all_required_params_present = 5;</code>
   *
   * @return The allRequiredParamsPresent.
   */
  boolean getAllRequiredParamsPresent();

  /**
   *
   *
   * <pre>
   * The text to be pronounced to the user or shown on the screen.
   * Note: This is a legacy field, `fulfillment_messages` should be preferred.
   * </pre>
   *
   * <code>string fulfillment_text = 6;</code>
   *
   * @return The fulfillmentText.
   */
  java.lang.String getFulfillmentText();
  /**
   *
   *
   * <pre>
   * The text to be pronounced to the user or shown on the screen.
   * Note: This is a legacy field, `fulfillment_messages` should be preferred.
   * </pre>
   *
   * <code>string fulfillment_text = 6;</code>
   *
   * @return The bytes for fulfillmentText.
   */
  com.google.protobuf.ByteString getFulfillmentTextBytes();

  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Message> getFulfillmentMessagesList();
  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.Message getFulfillmentMessages(int index);
  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  int getFulfillmentMessagesCount();
  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder>
      getFulfillmentMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The collection of rich messages to present to the user.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 7;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder getFulfillmentMessagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `source` field returned in the webhook response.
   * </pre>
   *
   * <code>string webhook_source = 8;</code>
   *
   * @return The webhookSource.
   */
  java.lang.String getWebhookSource();
  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `source` field returned in the webhook response.
   * </pre>
   *
   * <code>string webhook_source = 8;</code>
   *
   * @return The bytes for webhookSource.
   */
  com.google.protobuf.ByteString getWebhookSourceBytes();

  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `payload` field returned in the webhook response.
   * </pre>
   *
   * <code>.google.protobuf.Struct webhook_payload = 9;</code>
   *
   * @return Whether the webhookPayload field is set.
   */
  boolean hasWebhookPayload();
  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `payload` field returned in the webhook response.
   * </pre>
   *
   * <code>.google.protobuf.Struct webhook_payload = 9;</code>
   *
   * @return The webhookPayload.
   */
  com.google.protobuf.Struct getWebhookPayload();
  /**
   *
   *
   * <pre>
   * If the query was fulfilled by a webhook call, this field is set to the
   * value of the `payload` field returned in the webhook response.
   * </pre>
   *
   * <code>.google.protobuf.Struct webhook_payload = 9;</code>
   */
  com.google.protobuf.StructOrBuilder getWebhookPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Context> getOutputContextsList();
  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Context getOutputContexts(int index);
  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  int getOutputContextsCount();
  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ContextOrBuilder>
      getOutputContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The collection of output contexts. If applicable,
   * `output_contexts.parameters` contains entries with name
   * `&lt;parameter name&gt;.original` containing the original parameter values
   * before the query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 10;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getOutputContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The intent that matched the conversational query. Some, not
   * all fields are filled in this message, including but not limited to:
   * `name`, `display_name`, `end_interaction` and `is_fallback`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 11;</code>
   *
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * The intent that matched the conversational query. Some, not
   * all fields are filled in this message, including but not limited to:
   * `name`, `display_name`, `end_interaction` and `is_fallback`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 11;</code>
   *
   * @return The intent.
   */
  com.google.cloud.dialogflow.v2beta1.Intent getIntent();
  /**
   *
   *
   * <pre>
   * The intent that matched the conversational query. Some, not
   * all fields are filled in this message, including but not limited to:
   * `name`, `display_name`, `end_interaction` and `is_fallback`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 11;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * The intent detection confidence. Values range from 0.0
   * (completely uncertain) to 1.0 (completely certain).
   * This value is for informational purpose only and is only used to
   * help match the best intent within the classification threshold.
   * This value may change for the same end-user expression at any time due to a
   * model retraining or change in implementation.
   * If there are `multiple knowledge_answers` messages, this value is set to
   * the greatest `knowledgeAnswers.match_confidence` value in the list.
   * </pre>
   *
   * <code>float intent_detection_confidence = 12;</code>
   *
   * @return The intentDetectionConfidence.
   */
  float getIntentDetectionConfidence();

  /**
   *
   *
   * <pre>
   * Free-form diagnostic information for the associated detect intent request.
   * The fields of this data can change without notice, so you should not write
   * code that depends on its structure.
   * The data may contain:
   * - webhook call latency
   * - webhook errors
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 14;</code>
   *
   * @return Whether the diagnosticInfo field is set.
   */
  boolean hasDiagnosticInfo();
  /**
   *
   *
   * <pre>
   * Free-form diagnostic information for the associated detect intent request.
   * The fields of this data can change without notice, so you should not write
   * code that depends on its structure.
   * The data may contain:
   * - webhook call latency
   * - webhook errors
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 14;</code>
   *
   * @return The diagnosticInfo.
   */
  com.google.protobuf.Struct getDiagnosticInfo();
  /**
   *
   *
   * <pre>
   * Free-form diagnostic information for the associated detect intent request.
   * The fields of this data can change without notice, so you should not write
   * code that depends on its structure.
   * The data may contain:
   * - webhook call latency
   * - webhook errors
   * </pre>
   *
   * <code>.google.protobuf.Struct diagnostic_info = 14;</code>
   */
  com.google.protobuf.StructOrBuilder getDiagnosticInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The sentiment analysis result, which depends on the
   * `sentiment_analysis_request_config` specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   *
   * @return Whether the sentimentAnalysisResult field is set.
   */
  boolean hasSentimentAnalysisResult();
  /**
   *
   *
   * <pre>
   * The sentiment analysis result, which depends on the
   * `sentiment_analysis_request_config` specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   *
   * @return The sentimentAnalysisResult.
   */
  com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult getSentimentAnalysisResult();
  /**
   *
   *
   * <pre>
   * The sentiment analysis result, which depends on the
   * `sentiment_analysis_request_config` specified in the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SentimentAnalysisResult sentiment_analysis_result = 17;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SentimentAnalysisResultOrBuilder
      getSentimentAnalysisResultOrBuilder();

  /**
   *
   *
   * <pre>
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeAnswers knowledge_answers = 18;</code>
   *
   * @return Whether the knowledgeAnswers field is set.
   */
  boolean hasKnowledgeAnswers();
  /**
   *
   *
   * <pre>
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeAnswers knowledge_answers = 18;</code>
   *
   * @return The knowledgeAnswers.
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeAnswers getKnowledgeAnswers();
  /**
   *
   *
   * <pre>
   * The result from Knowledge Connector (if any), ordered by decreasing
   * `KnowledgeAnswers.match_confidence`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeAnswers knowledge_answers = 18;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeAnswersOrBuilder getKnowledgeAnswersOrBuilder();
}
