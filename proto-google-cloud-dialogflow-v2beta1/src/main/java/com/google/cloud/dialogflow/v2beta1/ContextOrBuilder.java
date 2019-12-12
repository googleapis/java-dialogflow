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
// source: google/cloud/dialogflow/v2beta1/context.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.Context)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the context. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`,
   * or `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`.
   * The `Context ID` is always converted to lowercase, may only contain
   * characters in a-zA-Z0-9_-% and may be at most 250 bytes long.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
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
   * Required. The unique identifier of the context. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`,
   * or `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`.
   * The `Context ID` is always converted to lowercase, may only contain
   * characters in a-zA-Z0-9_-% and may be at most 250 bytes long.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
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
   * Optional. The number of conversational query requests after which the
   * context expires. If set to `0` (the default) the context expires
   * immediately. Contexts expire automatically after 20 minutes if there
   * are no matching queries.
   * </pre>
   *
   * <code>int32 lifespan_count = 2;</code>
   *
   * @return The lifespanCount.
   */
  int getLifespanCount();

  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   * Refer to [this
   * doc](https://cloud.google.com/dialogflow/docs/intents-actions-parameters)
   * for syntax.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   * Refer to [this
   * doc](https://cloud.google.com/dialogflow/docs/intents-actions-parameters)
   * for syntax.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   *
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   * Refer to [this
   * doc](https://cloud.google.com/dialogflow/docs/intents-actions-parameters)
   * for syntax.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();
}
