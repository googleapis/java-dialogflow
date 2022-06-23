// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/conversation.proto

package com.google.cloud.dialogflow.v2beta1;

public interface CreateMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.CreateMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource identifier of the conversation to create message.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource identifier of the conversation to create message.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The message to create.
   * [Message.participant][google.cloud.dialogflow.v2beta1.Message.participant] is required.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * Required. The message to create.
   * [Message.participant][google.cloud.dialogflow.v2beta1.Message.participant] is required.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The message.
   */
  com.google.cloud.dialogflow.v2beta1.Message getMessage();
  /**
   * <pre>
   * Required. The message to create.
   * [Message.participant][google.cloud.dialogflow.v2beta1.Message.participant] is required.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2beta1.MessageOrBuilder getMessageOrBuilder();
}
