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
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ExportAgentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ExportAgentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri` is specified in `ExportAgentRequest`.
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   *
   * @return The agentUri.
   */
  java.lang.String getAgentUri();
  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri` is specified in `ExportAgentRequest`.
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   *
   * @return The bytes for agentUri.
   */
  com.google.protobuf.ByteString getAgentUriBytes();

  /**
   *
   *
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 2;</code>
   *
   * @return The agentContent.
   */
  com.google.protobuf.ByteString getAgentContent();

  public com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.AgentCase getAgentCase();
}
