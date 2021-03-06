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
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public interface MessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the message.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the message.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The message content.
   * </pre>
   *
   * <code>string content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * Required. The message content.
   * </pre>
   *
   * <code>string content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The message language.
   * This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag. Example: "en-US".
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The message language.
   * This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag. Example: "en-US".
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The participant that sends this message.
   * </pre>
   *
   * <code>string participant = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The participant.
   */
  java.lang.String getParticipant();
  /**
   *
   *
   * <pre>
   * Output only. The participant that sends this message.
   * </pre>
   *
   * <code>string participant = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for participant.
   */
  com.google.protobuf.ByteString getParticipantBytes();

  /**
   *
   *
   * <pre>
   * Output only. The role of the participant.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Participant.Role participant_role = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for participantRole.
   */
  int getParticipantRoleValue();
  /**
   *
   *
   * <pre>
   * Output only. The role of the participant.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Participant.Role participant_role = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The participantRole.
   */
  com.google.cloud.dialogflow.v2.Participant.Role getParticipantRole();

  /**
   *
   *
   * <pre>
   * Output only. The time when the message was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the message was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the message was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The annotation for the message.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.MessageAnnotation message_annotation = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the messageAnnotation field is set.
   */
  boolean hasMessageAnnotation();
  /**
   *
   *
   * <pre>
   * Output only. The annotation for the message.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.MessageAnnotation message_annotation = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The messageAnnotation.
   */
  com.google.cloud.dialogflow.v2.MessageAnnotation getMessageAnnotation();
  /**
   *
   *
   * <pre>
   * Output only. The annotation for the message.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.MessageAnnotation message_annotation = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2.MessageAnnotationOrBuilder getMessageAnnotationOrBuilder();
}
