// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

public interface AutomatedAgentReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AutomatedAgentReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2beta1.Sessions.DetectIntent] call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.DetectIntentResponse detect_intent_response = 1;</code>
   * @return Whether the detectIntentResponse field is set.
   */
  boolean hasDetectIntentResponse();
  /**
   * <pre>
   * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2beta1.Sessions.DetectIntent] call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.DetectIntentResponse detect_intent_response = 1;</code>
   * @return The detectIntentResponse.
   */
  com.google.cloud.dialogflow.v2beta1.DetectIntentResponse getDetectIntentResponse();
  /**
   * <pre>
   * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2beta1.Sessions.DetectIntent] call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.DetectIntentResponse detect_intent_response = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.DetectIntentResponseOrBuilder getDetectIntentResponseOrBuilder();

  /**
   * <pre>
   * Response messages from the automated agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ResponseMessage response_messages = 3;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.ResponseMessage> 
      getResponseMessagesList();
  /**
   * <pre>
   * Response messages from the automated agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ResponseMessage response_messages = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessage getResponseMessages(int index);
  /**
   * <pre>
   * Response messages from the automated agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ResponseMessage response_messages = 3;</code>
   */
  int getResponseMessagesCount();
  /**
   * <pre>
   * Response messages from the automated agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ResponseMessage response_messages = 3;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ResponseMessageOrBuilder> 
      getResponseMessagesOrBuilderList();
  /**
   * <pre>
   * Response messages from the automated agent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ResponseMessage response_messages = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ResponseMessageOrBuilder getResponseMessagesOrBuilder(
      int index);

  /**
   * <pre>
   * Name of the intent if an intent is matched for the query.
   * For a V2 query, the value format is `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * For a V3 query, the value format is `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;Agent ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string intent = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   * <pre>
   * Name of the intent if an intent is matched for the query.
   * For a V2 query, the value format is `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * For a V3 query, the value format is `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;Agent ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string intent = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The intent.
   */
  java.lang.String getIntent();
  /**
   * <pre>
   * Name of the intent if an intent is matched for the query.
   * For a V2 query, the value format is `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * For a V3 query, the value format is `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;Agent ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string intent = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for intent.
   */
  com.google.protobuf.ByteString
      getIntentBytes();

  /**
   * <pre>
   * Event name if an event is triggered for the query.
   * </pre>
   *
   * <code>string event = 5;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <pre>
   * Event name if an event is triggered for the query.
   * </pre>
   *
   * <code>string event = 5;</code>
   * @return The event.
   */
  java.lang.String getEvent();
  /**
   * <pre>
   * Event name if an event is triggered for the query.
   * </pre>
   *
   * <code>string event = 5;</code>
   * @return The bytes for event.
   */
  com.google.protobuf.ByteString
      getEventBytes();

  /**
   * <pre>
   * The confidence of the match. Values range from 0.0 (completely uncertain)
   * to 1.0 (completely certain).
   * This value is for informational purpose only and is only used to help match
   * the best intent within the classification threshold. This value may change
   * for the same end-user expression at any time due to a model retraining or
   * change in implementation.
   * </pre>
   *
   * <code>float match_confidence = 9;</code>
   * @return The matchConfidence.
   */
  float getMatchConfidence();

  /**
   * <pre>
   * The collection of current parameters at the time of this response.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 10;</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * The collection of current parameters at the time of this response.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 10;</code>
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();
  /**
   * <pre>
   * The collection of current parameters at the time of this response.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 10;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();

  /**
   * <pre>
   * The collection of current Dialogflow CX agent session parameters at the
   * time of this response.
   * Deprecated: Use `parameters` instead.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_session_parameters = 6 [deprecated = true];</code>
   * @deprecated google.cloud.dialogflow.v2beta1.AutomatedAgentReply.cx_session_parameters is deprecated.
   *     See google/cloud/dialogflow/v2beta1/participant.proto;l=474
   * @return Whether the cxSessionParameters field is set.
   */
  @java.lang.Deprecated boolean hasCxSessionParameters();
  /**
   * <pre>
   * The collection of current Dialogflow CX agent session parameters at the
   * time of this response.
   * Deprecated: Use `parameters` instead.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_session_parameters = 6 [deprecated = true];</code>
   * @deprecated google.cloud.dialogflow.v2beta1.AutomatedAgentReply.cx_session_parameters is deprecated.
   *     See google/cloud/dialogflow/v2beta1/participant.proto;l=474
   * @return The cxSessionParameters.
   */
  @java.lang.Deprecated com.google.protobuf.Struct getCxSessionParameters();
  /**
   * <pre>
   * The collection of current Dialogflow CX agent session parameters at the
   * time of this response.
   * Deprecated: Use `parameters` instead.
   * </pre>
   *
   * <code>.google.protobuf.Struct cx_session_parameters = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.StructOrBuilder getCxSessionParametersOrBuilder();

  /**
   * <pre>
   * AutomatedAgentReply type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;</code>
   * @return The enum numeric value on the wire for automatedAgentReplyType.
   */
  int getAutomatedAgentReplyTypeValue();
  /**
   * <pre>
   * AutomatedAgentReply type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;</code>
   * @return The automatedAgentReplyType.
   */
  com.google.cloud.dialogflow.v2beta1.AutomatedAgentReply.AutomatedAgentReplyType getAutomatedAgentReplyType();

  /**
   * <pre>
   * Indicates whether the partial automated agent reply is interruptible when a
   * later reply message arrives. e.g. if the agent specified some music as
   * partial response, it can be cancelled.
   * </pre>
   *
   * <code>bool allow_cancellation = 8;</code>
   * @return The allowCancellation.
   */
  boolean getAllowCancellation();

  public com.google.cloud.dialogflow.v2beta1.AutomatedAgentReply.ResponseCase getResponseCase();

  public com.google.cloud.dialogflow.v2beta1.AutomatedAgentReply.MatchCase getMatchCase();
}
