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
// source: google/cloud/dialogflow/v2/human_agent_assistant_event.proto

package com.google.cloud.dialogflow.v2;

public final class HumanAgentAssistantEventProto {
  private HumanAgentAssistantEventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_HumanAgentAssistantEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_HumanAgentAssistantEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/dialogflow/v2/human_agent"
          + "_assistant_event.proto\022\032google.cloud.dia"
          + "logflow.v2\032,google/cloud/dialogflow/v2/p"
          + "articipant.proto\"\217\001\n\030HumanAgentAssistant"
          + "Event\022\024\n\014conversation\030\001 \001(\t\022\023\n\013participa"
          + "nt\030\003 \001(\t\022H\n\022suggestion_results\030\005 \003(\0132,.g"
          + "oogle.cloud.dialogflow.v2.SuggestionResu"
          + "ltB\246\001\n\036com.google.cloud.dialogflow.v2B\035H"
          + "umanAgentAssistantEventProtoP\001Z>cloud.go"
          + "ogle.com/go/dialogflow/apiv2/dialogflowp"
          + "b;dialogflowpb\370\001\001\242\002\002DF\252\002\032Google.Cloud.Di"
          + "alogflow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.dialogflow.v2.ParticipantProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_HumanAgentAssistantEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_HumanAgentAssistantEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_HumanAgentAssistantEvent_descriptor,
            new java.lang.String[] {
              "Conversation", "Participant", "SuggestionResults",
            });
    com.google.cloud.dialogflow.v2.ParticipantProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
