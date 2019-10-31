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
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ListKnowledgeBasesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.KnowledgeBase> getKnowledgeBasesList();
  /**
   *
   *
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBases(int index);
  /**
   *
   *
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  int getKnowledgeBasesCount();
  /**
   *
   *
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>
      getKnowledgeBasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of knowledge bases.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_bases = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBasesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
