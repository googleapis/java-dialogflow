/*
 * Copyright 2019 Google LLC
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

public interface QueryParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.QueryParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The time zone of this conversational query from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * </pre>
   *
   * <code>string time_zone = 1;</code>
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Optional. The time zone of this conversational query from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * </pre>
   *
   * <code>string time_zone = 1;</code>
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Optional. The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   */
  boolean hasGeoLocation();
  /**
   *
   *
   * <pre>
   * Optional. The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   */
  com.google.type.LatLng getGeoLocation();
  /**
   *
   *
   * <pre>
   * Optional. The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   */
  com.google.type.LatLngOrBuilder getGeoLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Context> getContextsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Context getContexts(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  int getContextsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ContextOrBuilder>
      getContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Specifies whether to delete all contexts in the current session
   * before the new ones are activated.
   * </pre>
   *
   * <code>bool reset_contexts = 4;</code>
   */
  boolean getResetContexts();

  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.SessionEntityType> getSessionEntityTypesList();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityType getSessionEntityTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;
   * </code>
   */
  int getSessionEntityTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.SessionEntityTypeOrBuilder>
      getSessionEntityTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 5;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityTypeOrBuilder getSessionEntityTypesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass custom data into the webhook
   * associated with the agent. Arbitrary JSON objects are supported.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass custom data into the webhook
   * associated with the agent. Arbitrary JSON objects are supported.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass custom data into the webhook
   * associated with the agent. Arbitrary JSON objects are supported.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. KnowledgeBases to get alternative results from. If not set, the
   * KnowledgeBases enabled in the agent (through UI) will be used.
   * Format:  `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>repeated string knowledge_base_names = 12;</code>
   */
  java.util.List<java.lang.String> getKnowledgeBaseNamesList();
  /**
   *
   *
   * <pre>
   * Optional. KnowledgeBases to get alternative results from. If not set, the
   * KnowledgeBases enabled in the agent (through UI) will be used.
   * Format:  `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>repeated string knowledge_base_names = 12;</code>
   */
  int getKnowledgeBaseNamesCount();
  /**
   *
   *
   * <pre>
   * Optional. KnowledgeBases to get alternative results from. If not set, the
   * KnowledgeBases enabled in the agent (through UI) will be used.
   * Format:  `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>repeated string knowledge_base_names = 12;</code>
   */
  java.lang.String getKnowledgeBaseNames(int index);
  /**
   *
   *
   * <pre>
   * Optional. KnowledgeBases to get alternative results from. If not set, the
   * KnowledgeBases enabled in the agent (through UI) will be used.
   * Format:  `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>repeated string knowledge_base_names = 12;</code>
   */
  com.google.protobuf.ByteString getKnowledgeBaseNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * Note: Sentiment Analysis is only currently available for Enterprise Edition
   * agents.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;
   * </code>
   */
  boolean hasSentimentAnalysisRequestConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * Note: Sentiment Analysis is only currently available for Enterprise Edition
   * agents.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig
      getSentimentAnalysisRequestConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * Note: Sentiment Analysis is only currently available for Enterprise Edition
   * agents.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SentimentAnalysisRequestConfigOrBuilder
      getSentimentAnalysisRequestConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook alone with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */
  int getWebhookHeadersCount();
  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook alone with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */
  boolean containsWebhookHeaders(java.lang.String key);
  /** Use {@link #getWebhookHeadersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getWebhookHeaders();
  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook alone with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getWebhookHeadersMap();
  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook alone with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */
  java.lang.String getWebhookHeadersOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass HTTP headers for a webhook
   * call. These headers will be sent to webhook alone with the headers that
   * have been configured through Dialogflow web console. The headers defined
   * within this field will overwrite the headers configured through Dialogflow
   * console if there is a conflict. Header names are case-insensitive.
   * Google's specified headers are not allowed. Including: "Host",
   * "Content-Length", "Connection", "From", "User-Agent", "Accept-Encoding",
   * "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * </pre>
   *
   * <code>map&lt;string, string&gt; webhook_headers = 14;</code>
   */
  java.lang.String getWebhookHeadersOrThrow(java.lang.String key);
}
