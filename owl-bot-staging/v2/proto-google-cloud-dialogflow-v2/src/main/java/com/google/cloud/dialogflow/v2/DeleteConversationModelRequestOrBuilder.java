// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

public interface DeleteConversationModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.DeleteConversationModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The conversation model to delete. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The conversation model to delete. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
