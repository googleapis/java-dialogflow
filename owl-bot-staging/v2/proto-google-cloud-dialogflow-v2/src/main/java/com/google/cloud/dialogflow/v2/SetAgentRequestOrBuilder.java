// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

public interface SetAgentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SetAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Agent agent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the agent field is set.
   */
  boolean hasAgent();
  /**
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Agent agent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The agent.
   */
  com.google.cloud.dialogflow.v2.Agent getAgent();
  /**
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Agent agent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2.AgentOrBuilder getAgentOrBuilder();

  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}