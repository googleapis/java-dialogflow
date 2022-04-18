// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_dataset.proto

package com.google.cloud.dialogflow.v2;

public interface ConversationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ConversationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The language code of the conversation data within this dataset. See
   * https://cloud.google.com/apis/design/standard_fields for more information.
   * Supports all UTF-8 languages.
   * </pre>
   *
   * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Optional. The language code of the conversation data within this dataset. See
   * https://cloud.google.com/apis/design/standard_fields for more information.
   * Supports all UTF-8 languages.
   * </pre>
   *
   * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
