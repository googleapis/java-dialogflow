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
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface BatchUpdateIntentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the agent to update or create intents in.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the agent to update or create intents in.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing intents to update or
   * create. The file format can either be a serialized proto (of IntentBatch
   * type) or JSON object. Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string intent_batch_uri = 2;</code>
   */
  java.lang.String getIntentBatchUri();
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing intents to update or
   * create. The file format can either be a serialized proto (of IntentBatch
   * type) or JSON object. Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string intent_batch_uri = 2;</code>
   */
  com.google.protobuf.ByteString getIntentBatchUriBytes();

  /**
   *
   *
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentBatch intent_batch_inline = 3;</code>
   */
  boolean hasIntentBatchInline();
  /**
   *
   *
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentBatch intent_batch_inline = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentBatch getIntentBatchInline();
  /**
   *
   *
   * <pre>
   * The collection of intents to update or create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentBatch intent_batch_inline = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentBatchOrBuilder getIntentBatchInlineOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intents`. If not specified, the agent's default language is
   * used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intents`. If not specified, the agent's default language is
   * used. [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 6;</code>
   */
  int getIntentViewValue();
  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentView getIntentView();

  public com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest.IntentBatchCase
      getIntentBatchCase();
}
