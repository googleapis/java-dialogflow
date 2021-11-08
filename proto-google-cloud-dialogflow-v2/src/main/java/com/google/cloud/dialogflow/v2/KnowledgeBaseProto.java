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
// source: google/cloud/dialogflow/v2/knowledge_base.proto

package com.google.cloud.dialogflow.v2;

public final class KnowledgeBaseProto {
  private KnowledgeBaseProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_KnowledgeBase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_KnowledgeBase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetKnowledgeBaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetKnowledgeBaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateKnowledgeBaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateKnowledgeBaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteKnowledgeBaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteKnowledgeBaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateKnowledgeBaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateKnowledgeBaseRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/dialogflow/v2/knowledge_b"
          + "ase.proto\022\032google.cloud.dialogflow.v2\032\034g"
          + "oogle/api/annotations.proto\032\027google/api/"
          + "client.proto\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\032\033google"
          + "/protobuf/empty.proto\032 google/protobuf/f"
          + "ield_mask.proto\"\374\001\n\rKnowledgeBase\022\014\n\004nam"
          + "e\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\025\n\rla"
          + "nguage_code\030\004 \001(\t:\252\001\352A\246\001\n\'dialogflow.goo"
          + "gleapis.com/KnowledgeBase\0222projects/{pro"
          + "ject}/knowledgeBases/{knowledge_base}\022Gp"
          + "rojects/{project}/locations/{location}/k"
          + "nowledgeBases/{knowledge_base}\"\203\001\n\031ListK"
          + "nowledgeBasesRequest\022?\n\006parent\030\001 \001(\tB/\340A"
          + "\002\372A)\022\'dialogflow.googleapis.com/Knowledg"
          + "eBase\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003"
          + " \001(\t\"y\n\032ListKnowledgeBasesResponse\022B\n\017kn"
          + "owledge_bases\030\001 \003(\0132).google.cloud.dialo"
          + "gflow.v2.KnowledgeBase\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\"X\n\027GetKnowledgeBaseRequest\022=\n\004na"
          + "me\030\001 \001(\tB/\340A\002\372A)\n\'dialogflow.googleapis."
          + "com/KnowledgeBase\"\245\001\n\032CreateKnowledgeBas"
          + "eRequest\022?\n\006parent\030\001 \001(\tB/\340A\002\372A)\022\'dialog"
          + "flow.googleapis.com/KnowledgeBase\022F\n\016kno"
          + "wledge_base\030\002 \001(\0132).google.cloud.dialogf"
          + "low.v2.KnowledgeBaseB\003\340A\002\"o\n\032DeleteKnowl"
          + "edgeBaseRequest\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n\'d"
          + "ialogflow.googleapis.com/KnowledgeBase\022\022"
          + "\n\005force\030\002 \001(\010B\003\340A\001\"\232\001\n\032UpdateKnowledgeBa"
          + "seRequest\022F\n\016knowledge_base\030\001 \001(\0132).goog"
          + "le.cloud.dialogflow.v2.KnowledgeBaseB\003\340A"
          + "\002\0224\n\013update_mask\030\002 \001(\0132\032.google.protobuf"
          + ".FieldMaskB\003\340A\0012\264\r\n\016KnowledgeBases\022\244\002\n\022L"
          + "istKnowledgeBases\0225.google.cloud.dialogf"
          + "low.v2.ListKnowledgeBasesRequest\0326.googl"
          + "e.cloud.dialogflow.v2.ListKnowledgeBases"
          + "Response\"\236\001\202\323\344\223\002\216\001\022&/v2/{parent=projects"
          + "/*}/knowledgeBasesZ4\0222/v2/{parent=projec"
          + "ts/*/locations/*}/knowledgeBasesZ.\022,/v2/"
          + "{parent=projects/*/agent}/knowledgeBases"
          + "\332A\006parent\022\221\002\n\020GetKnowledgeBase\0223.google."
          + "cloud.dialogflow.v2.GetKnowledgeBaseRequ"
          + "est\032).google.cloud.dialogflow.v2.Knowled"
          + "geBase\"\234\001\202\323\344\223\002\216\001\022&/v2/{name=projects/*/k"
          + "nowledgeBases/*}Z4\0222/v2/{name=projects/*"
          + "/locations/*/knowledgeBases/*}Z.\022,/v2/{n"
          + "ame=projects/*/agent/knowledgeBases/*}\332A"
          + "\004name\022\330\002\n\023CreateKnowledgeBase\0226.google.c"
          + "loud.dialogflow.v2.CreateKnowledgeBaseRe"
          + "quest\032).google.cloud.dialogflow.v2.Knowl"
          + "edgeBase\"\335\001\202\323\344\223\002\276\001\"&/v2/{parent=projects"
          + "/*}/knowledgeBases:\016knowledge_baseZD\"2/v"
          + "2/{parent=projects/*/locations/*}/knowle"
          + "dgeBases:\016knowledge_baseZ>\",/v2/{parent="
          + "projects/*/agent}/knowledgeBases:\016knowle"
          + "dge_base\332A\025parent,knowledge_base\022\204\002\n\023Del"
          + "eteKnowledgeBase\0226.google.cloud.dialogfl"
          + "ow.v2.DeleteKnowledgeBaseRequest\032\026.googl"
          + "e.protobuf.Empty\"\234\001\202\323\344\223\002\216\001*&/v2/{name=pr"
          + "ojects/*/knowledgeBases/*}Z4*2/v2/{name="
          + "projects/*/locations/*/knowledgeBases/*}"
          + "Z.*,/v2/{name=projects/*/agent/knowledge"
          + "Bases/*}\332A\004name\022\212\003\n\023UpdateKnowledgeBase\022"
          + "6.google.cloud.dialogflow.v2.UpdateKnowl"
          + "edgeBaseRequest\032).google.cloud.dialogflo"
          + "w.v2.KnowledgeBase\"\217\002\202\323\344\223\002\353\00125/v2/{knowl"
          + "edge_base.name=projects/*/knowledgeBases"
          + "/*}:\016knowledge_baseZS2A/v2/{knowledge_ba"
          + "se.name=projects/*/locations/*/knowledge"
          + "Bases/*}:\016knowledge_baseZM2;/v2/{knowled"
          + "ge_base.name=projects/*/agent/knowledgeB"
          + "ases/*}:\016knowledge_base\332A\032knowledge_base"
          + ",update_mask\032x\312A\031dialogflow.googleapis.c"
          + "om\322AYhttps://www.googleapis.com/auth/clo"
          + "ud-platform,https://www.googleapis.com/a"
          + "uth/dialogflowB\241\001\n\036com.google.cloud.dial"
          + "ogflow.v2B\022KnowledgeBaseProtoP\001ZDgoogle."
          + "golang.org/genproto/googleapis/cloud/dia"
          + "logflow/v2;dialogflow\370\001\001\242\002\002DF\252\002\032Google.C"
          + "loud.Dialogflow.V2b\006proto3"
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
            });
    internal_static_google_cloud_dialogflow_v2_KnowledgeBase_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_KnowledgeBase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_KnowledgeBase_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListKnowledgeBasesResponse_descriptor,
            new java.lang.String[] {
              "KnowledgeBases", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_GetKnowledgeBaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetKnowledgeBaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetKnowledgeBaseRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_CreateKnowledgeBaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateKnowledgeBaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateKnowledgeBaseRequest_descriptor,
            new java.lang.String[] {
              "Parent", "KnowledgeBase",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteKnowledgeBaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_DeleteKnowledgeBaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteKnowledgeBaseRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateKnowledgeBaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_UpdateKnowledgeBaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateKnowledgeBaseRequest_descriptor,
            new java.lang.String[] {
              "KnowledgeBase", "UpdateMask",
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}