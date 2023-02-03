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
// source: google/cloud/dialogflow/v2/context.proto

package com.google.cloud.dialogflow.v2;

public final class ContextProto {
  private ContextProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Context_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListContextsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListContextsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListContextsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListContextsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetContextRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/v2/context.pro"
          + "to\022\032google.cloud.dialogflow.v2\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\033google/protob"
          + "uf/empty.proto\032 google/protobuf/field_ma"
          + "sk.proto\032\034google/protobuf/struct.proto\"\217"
          + "\004\n\007Context\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\033\n\016lifespa"
          + "n_count\030\002 \001(\005B\003\340A\001\0220\n\nparameters\030\003 \001(\0132\027"
          + ".google.protobuf.StructB\003\340A\001:\241\003\352A\235\003\n!dia"
          + "logflow.googleapis.com/Context\022>projects"
          + "/{project}/agent/sessions/{session}/cont"
          + "exts/{context}\022fprojects/{project}/agent"
          + "/environments/{environment}/users/{user}"
          + "/sessions/{session}/contexts/{context}\022S"
          + "projects/{project}/locations/{location}/"
          + "agent/sessions/{session}/contexts/{conte"
          + "xt}\022{projects/{project}/locations/{locat"
          + "ion}/agent/environments/{environment}/us"
          + "ers/{user}/sessions/{session}/contexts/{"
          + "context}\"\201\001\n\023ListContextsRequest\0229\n\006pare"
          + "nt\030\001 \001(\tB)\340A\002\372A#\022!dialogflow.googleapis."
          + "com/Context\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\np"
          + "age_token\030\003 \001(\tB\003\340A\001\"f\n\024ListContextsResp"
          + "onse\0225\n\010contexts\030\001 \003(\0132#.google.cloud.di"
          + "alogflow.v2.Context\022\027\n\017next_page_token\030\002"
          + " \001(\t\"L\n\021GetContextRequest\0227\n\004name\030\001 \001(\tB"
          + ")\340A\002\372A#\n!dialogflow.googleapis.com/Conte"
          + "xt\"\214\001\n\024CreateContextRequest\0229\n\006parent\030\001 "
          + "\001(\tB)\340A\002\372A#\022!dialogflow.googleapis.com/C"
          + "ontext\0229\n\007context\030\002 \001(\0132#.google.cloud.d"
          + "ialogflow.v2.ContextB\003\340A\002\"\207\001\n\024UpdateCont"
          + "extRequest\0229\n\007context\030\001 \001(\0132#.google.clo"
          + "ud.dialogflow.v2.ContextB\003\340A\002\0224\n\013update_"
          + "mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003"
          + "\340A\001\"O\n\024DeleteContextRequest\0227\n\004name\030\001 \001("
          + "\tB)\340A\002\372A#\n!dialogflow.googleapis.com/Con"
          + "text\"U\n\030DeleteAllContextsRequest\0229\n\006pare"
          + "nt\030\001 \001(\tB)\340A\002\372A#\022!dialogflow.googleapis."
          + "com/Context2\350\024\n\010Contexts\022\234\003\n\014ListContext"
          + "s\022/.google.cloud.dialogflow.v2.ListConte"
          + "xtsRequest\0320.google.cloud.dialogflow.v2."
          + "ListContextsResponse\"\250\002\202\323\344\223\002\230\002\0221/v2/{par"
          + "ent=projects/*/agent/sessions/*}/context"
          + "sZJ\022H/v2/{parent=projects/*/agent/enviro"
          + "nments/*/users/*/sessions/*}/contextsZ?\022"
          + "=/v2/{parent=projects/*/locations/*/agen"
          + "t/sessions/*}/contextsZV\022T/v2/{parent=pr"
          + "ojects/*/locations/*/agent/environments/"
          + "*/users/*/sessions/*}/contexts\332A\006parent\022"
          + "\211\003\n\nGetContext\022-.google.cloud.dialogflow"
          + ".v2.GetContextRequest\032#.google.cloud.dia"
          + "logflow.v2.Context\"\246\002\202\323\344\223\002\230\002\0221/v2/{name="
          + "projects/*/agent/sessions/*/contexts/*}Z"
          + "J\022H/v2/{name=projects/*/agent/environmen"
          + "ts/*/users/*/sessions/*/contexts/*}Z?\022=/"
          + "v2/{name=projects/*/locations/*/agent/se"
          + "ssions/*/contexts/*}ZV\022T/v2/{name=projec"
          + "ts/*/locations/*/agent/environments/*/us"
          + "ers/*/sessions/*/contexts/*}\332A\004name\022\275\003\n\r"
          + "CreateContext\0220.google.cloud.dialogflow."
          + "v2.CreateContextRequest\032#.google.cloud.d"
          + "ialogflow.v2.Context\"\324\002\202\323\344\223\002\274\002\"1/v2/{par"
          + "ent=projects/*/agent/sessions/*}/context"
          + "s:\007contextZS\"H/v2/{parent=projects/*/age"
          + "nt/environments/*/users/*/sessions/*}/co"
          + "ntexts:\007contextZH\"=/v2/{parent=projects/"
          + "*/locations/*/agent/sessions/*}/contexts"
          + ":\007contextZ_\"T/v2/{parent=projects/*/loca"
          + "tions/*/agent/environments/*/users/*/ses"
          + "sions/*}/contexts:\007context\332A\016parent,cont"
          + "ext\022\342\003\n\rUpdateContext\0220.google.cloud.dia"
          + "logflow.v2.UpdateContextRequest\032#.google"
          + ".cloud.dialogflow.v2.Context\"\371\002\202\323\344\223\002\334\00229"
          + "/v2/{context.name=projects/*/agent/sessi"
          + "ons/*/contexts/*}:\007contextZ[2P/v2/{conte"
          + "xt.name=projects/*/agent/environments/*/"
          + "users/*/sessions/*/contexts/*}:\007contextZ"
          + "P2E/v2/{context.name=projects/*/location"
          + "s/*/agent/sessions/*/contexts/*}:\007contex"
          + "tZg2\\/v2/{context.name=projects/*/locati"
          + "ons/*/agent/environments/*/users/*/sessi"
          + "ons/*/contexts/*}:\007context\332A\023context,upd"
          + "ate_mask\022\202\003\n\rDeleteContext\0220.google.clou"
          + "d.dialogflow.v2.DeleteContextRequest\032\026.g"
          + "oogle.protobuf.Empty\"\246\002\202\323\344\223\002\230\002*1/v2/{nam"
          + "e=projects/*/agent/sessions/*/contexts/*"
          + "}ZJ*H/v2/{name=projects/*/agent/environm"
          + "ents/*/users/*/sessions/*/contexts/*}Z?*"
          + "=/v2/{name=projects/*/locations/*/agent/"
          + "sessions/*/contexts/*}ZV*T/v2/{name=proj"
          + "ects/*/locations/*/agent/environments/*/"
          + "users/*/sessions/*/contexts/*}\332A\004name\022\214\003"
          + "\n\021DeleteAllContexts\0224.google.cloud.dialo"
          + "gflow.v2.DeleteAllContextsRequest\032\026.goog"
          + "le.protobuf.Empty\"\250\002\202\323\344\223\002\230\002*1/v2/{parent"
          + "=projects/*/agent/sessions/*}/contextsZJ"
          + "*H/v2/{parent=projects/*/agent/environme"
          + "nts/*/users/*/sessions/*}/contextsZ?*=/v"
          + "2/{parent=projects/*/locations/*/agent/s"
          + "essions/*}/contextsZV*T/v2/{parent=proje"
          + "cts/*/locations/*/agent/environments/*/u"
          + "sers/*/sessions/*}/contexts\332A\006parent\032x\312A"
          + "\031dialogflow.googleapis.com\322AYhttps://www"
          + ".googleapis.com/auth/cloud-platform,http"
          + "s://www.googleapis.com/auth/dialogflowB\225"
          + "\001\n\036com.google.cloud.dialogflow.v2B\014Conte"
          + "xtProtoP\001Z>cloud.google.com/go/dialogflo"
          + "w/apiv2/dialogflowpb;dialogflowpb\370\001\001\242\002\002D"
          + "F\252\002\032Google.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_Context_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Context_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Context_descriptor,
            new java.lang.String[] {
              "Name", "LifespanCount", "Parameters",
            });
    internal_static_google_cloud_dialogflow_v2_ListContextsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListContextsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListContextsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListContextsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListContextsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListContextsResponse_descriptor,
            new java.lang.String[] {
              "Contexts", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_GetContextRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetContextRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetContextRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateContextRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Context",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_descriptor,
            new java.lang.String[] {
              "Context", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
