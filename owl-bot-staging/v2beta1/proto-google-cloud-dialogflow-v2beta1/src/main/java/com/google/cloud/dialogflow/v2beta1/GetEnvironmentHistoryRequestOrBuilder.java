// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/environment.proto

package com.google.cloud.dialogflow.v2beta1;

public interface GetEnvironmentHistoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.GetEnvironmentHistoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the environment to retrieve history for.
   * Supported formats:
   * - `projects/&lt;Project Number / ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * - `projects/&lt;Project Number / ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the environment to retrieve history for.
   * Supported formats:
   * - `projects/&lt;Project Number / ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * - `projects/&lt;Project Number / ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The maximum number of items to return in a single page. By default 100 and
   * at most 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
