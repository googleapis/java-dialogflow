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
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

public interface SuggestionResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SuggestionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Error status if the request failed.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Error status if the request failed.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Error status if the request failed.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * SuggestArticlesResponse if request is for ARTICLE_SUGGESTION.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SuggestArticlesResponse suggest_articles_response = 2;
   * </code>
   *
   * @return Whether the suggestArticlesResponse field is set.
   */
  boolean hasSuggestArticlesResponse();
  /**
   *
   *
   * <pre>
   * SuggestArticlesResponse if request is for ARTICLE_SUGGESTION.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SuggestArticlesResponse suggest_articles_response = 2;
   * </code>
   *
   * @return The suggestArticlesResponse.
   */
  com.google.cloud.dialogflow.v2beta1.SuggestArticlesResponse getSuggestArticlesResponse();
  /**
   *
   *
   * <pre>
   * SuggestArticlesResponse if request is for ARTICLE_SUGGESTION.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SuggestArticlesResponse suggest_articles_response = 2;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SuggestArticlesResponseOrBuilder
      getSuggestArticlesResponseOrBuilder();

  /**
   *
   *
   * <pre>
   * SuggestFaqAnswersResponse if request is for FAQ_ANSWER.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SuggestFaqAnswersResponse suggest_faq_answers_response = 3;
   * </code>
   *
   * @return Whether the suggestFaqAnswersResponse field is set.
   */
  boolean hasSuggestFaqAnswersResponse();
  /**
   *
   *
   * <pre>
   * SuggestFaqAnswersResponse if request is for FAQ_ANSWER.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SuggestFaqAnswersResponse suggest_faq_answers_response = 3;
   * </code>
   *
   * @return The suggestFaqAnswersResponse.
   */
  com.google.cloud.dialogflow.v2beta1.SuggestFaqAnswersResponse getSuggestFaqAnswersResponse();
  /**
   *
   *
   * <pre>
   * SuggestFaqAnswersResponse if request is for FAQ_ANSWER.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SuggestFaqAnswersResponse suggest_faq_answers_response = 3;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SuggestFaqAnswersResponseOrBuilder
      getSuggestFaqAnswersResponseOrBuilder();

  /**
   *
   *
   * <pre>
   * SuggestSmartRepliesResponse if request is for SMART_REPLY.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponse suggest_smart_replies_response = 4;
   * </code>
   *
   * @return Whether the suggestSmartRepliesResponse field is set.
   */
  boolean hasSuggestSmartRepliesResponse();
  /**
   *
   *
   * <pre>
   * SuggestSmartRepliesResponse if request is for SMART_REPLY.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponse suggest_smart_replies_response = 4;
   * </code>
   *
   * @return The suggestSmartRepliesResponse.
   */
  com.google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponse getSuggestSmartRepliesResponse();
  /**
   *
   *
   * <pre>
   * SuggestSmartRepliesResponse if request is for SMART_REPLY.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponse suggest_smart_replies_response = 4;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponseOrBuilder
      getSuggestSmartRepliesResponseOrBuilder();

  public com.google.cloud.dialogflow.v2beta1.SuggestionResult.SuggestionResponseCase
      getSuggestionResponseCase();
}