// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/context.proto

package com.google.cloud.dialogflow.v2;

public interface DeleteAllContextsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.DeleteAllContextsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the session to delete all contexts from. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or `projects/&lt;Project
   * ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   * ID&gt;`.
   * If `Environment ID` is not specified we assume default 'draft' environment.
   * If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the session to delete all contexts from. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or `projects/&lt;Project
   * ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   * ID&gt;`.
   * If `Environment ID` is not specified we assume default 'draft' environment.
   * If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
