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
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

public final class DocumentProto {
  private DocumentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Document_ReloadStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Document_ReloadStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dialogflow/v2beta1/docume"
          + "nt.proto\022\037google.cloud.dialogflow.v2beta"
          + "1\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032)go"
          + "ogle/cloud/dialogflow/v2beta1/gcs.proto\032"
          + "#google/longrunning/operations.proto\032\033go"
          + "ogle/protobuf/empty.proto\032 google/protob"
          + "uf/field_mask.proto\032\037google/protobuf/tim"
          + "estamp.proto\032\027google/rpc/status.proto\"\357\005"
          + "\n\010Document\022\021\n\004name\030\001 \001(\tB\003\340A\001\022\031\n\014display"
          + "_name\030\002 \001(\tB\003\340A\002\022\026\n\tmime_type\030\003 \001(\tB\003\340A\002"
          + "\022U\n\017knowledge_types\030\004 \003(\01627.google.cloud"
          + ".dialogflow.v2beta1.Document.KnowledgeTy"
          + "peB\003\340A\002\022\025\n\013content_uri\030\005 \001(\tH\000\022\025\n\007conten"
          + "t\030\006 \001(\tB\002\030\001H\000\022\025\n\013raw_content\030\t \001(\014H\000\022\037\n\022"
          + "enable_auto_reload\030\013 \001(\010B\003\340A\001\022Y\n\024latest_"
          + "reload_status\030\014 \001(\01326.google.cloud.dialo"
          + "gflow.v2beta1.Document.ReloadStatusB\003\340A\003"
          + "\032\\\n\014ReloadStatus\022(\n\004time\030\001 \001(\0132\032.google."
          + "protobuf.Timestamp\022\"\n\006status\030\002 \001(\0132\022.goo"
          + "gle.rpc.Status\"K\n\rKnowledgeType\022\036\n\032KNOWL"
          + "EDGE_TYPE_UNSPECIFIED\020\000\022\007\n\003FAQ\020\001\022\021\n\rEXTR"
          + "ACTIVE_QA\020\002:\317\001\352A\313\001\n\"dialogflow.googleapi"
          + "s.com/Document\022Gprojects/{project}/knowl"
          + "edgeBases/{knowledge_base}/documents/{do"
          + "cument}\022\\projects/{project}/locations/{l"
          + "ocation}/knowledgeBases/{knowledge_base}"
          + "/documents/{document}B\010\n\006source\"N\n\022GetDo"
          + "cumentRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"dia"
          + "logflow.googleapis.com/Document\"\211\001\n\024List"
          + "DocumentsRequest\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$"
          + "\022\"dialogflow.googleapis.com/Document\022\021\n\t"
          + "page_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006f"
          + "ilter\030\004 \001(\t\"n\n\025ListDocumentsResponse\022<\n\t"
          + "documents\030\001 \003(\0132).google.cloud.dialogflo"
          + "w.v2beta1.Document\022\027\n\017next_page_token\030\002 "
          + "\001(\t\"\271\001\n\025CreateDocumentRequest\022:\n\006parent\030"
          + "\001 \001(\tB*\340A\002\372A$\022\"dialogflow.googleapis.com"
          + "/Document\022@\n\010document\030\002 \001(\0132).google.clo"
          + "ud.dialogflow.v2beta1.DocumentB\003\340A\002\022\"\n\032i"
          + "mport_gcs_custom_metadata\030\003 \001(\010\"Q\n\025Delet"
          + "eDocumentRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\""
          + "dialogflow.googleapis.com/Document\"\217\001\n\025U"
          + "pdateDocumentRequest\022@\n\010document\030\001 \001(\0132)"
          + ".google.cloud.dialogflow.v2beta1.Documen"
          + "tB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.pro"
          + "tobuf.FieldMaskB\003\340A\001\"\267\001\n\032KnowledgeOperat"
          + "ionMetadata\022U\n\005state\030\001 \001(\0162A.google.clou"
          + "d.dialogflow.v2beta1.KnowledgeOperationM"
          + "etadata.StateB\003\340A\003\"B\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\010\n\004"
          + "DONE\020\003\"\301\001\n\025ReloadDocumentRequest\0228\n\004name"
          + "\030\001 \001(\tB*\340A\002\372A$\n\"dialogflow.googleapis.co"
          + "m/Document\022@\n\ngcs_source\030\003 \001(\0132*.google."
          + "cloud.dialogflow.v2beta1.GcsSourceH\000\022\"\n\032"
          + "import_gcs_custom_metadata\030\004 \001(\010B\010\n\006sour"
          + "ce2\343\022\n\tDocuments\022\322\002\n\rListDocuments\0225.goo"
          + "gle.cloud.dialogflow.v2beta1.ListDocumen"
          + "tsRequest\0326.google.cloud.dialogflow.v2be"
          + "ta1.ListDocumentsResponse\"\321\001\202\323\344\223\002\301\001\0227/v2"
          + "beta1/{parent=projects/*/knowledgeBases/"
          + "*}/documentsZE\022C/v2beta1/{parent=project"
          + "s/*/locations/*/knowledgeBases/*}/docume"
          + "ntsZ?\022=/v2beta1/{parent=projects/*/agent"
          + "/knowledgeBases/*}/documents\332A\006parent\022\277\002"
          + "\n\013GetDocument\0223.google.cloud.dialogflow."
          + "v2beta1.GetDocumentRequest\032).google.clou"
          + "d.dialogflow.v2beta1.Document\"\317\001\202\323\344\223\002\301\001\022"
          + "7/v2beta1/{name=projects/*/knowledgeBase"
          + "s/*/documents/*}ZE\022C/v2beta1/{name=proje"
          + "cts/*/locations/*/knowledgeBases/*/docum"
          + "ents/*}Z?\022=/v2beta1/{name=projects/*/age"
          + "nt/knowledgeBases/*/documents/*}\332A\004name\022"
          + "\213\003\n\016CreateDocument\0226.google.cloud.dialog"
          + "flow.v2beta1.CreateDocumentRequest\032\035.goo"
          + "gle.longrunning.Operation\"\241\002\202\323\344\223\002\337\001\"7/v2"
          + "beta1/{parent=projects/*/knowledgeBases/"
          + "*}/documents:\010documentZO\"C/v2beta1/{pare"
          + "nt=projects/*/locations/*/knowledgeBases"
          + "/*}/documents:\010documentZI\"=/v2beta1/{par"
          + "ent=projects/*/agent/knowledgeBases/*}/d"
          + "ocuments:\010document\332A\017parent,document\312A&\n"
          + "\010Document\022\032KnowledgeOperationMetadata\022\357\002"
          + "\n\016DeleteDocument\0226.google.cloud.dialogfl"
          + "ow.v2beta1.DeleteDocumentRequest\032\035.googl"
          + "e.longrunning.Operation\"\205\002\202\323\344\223\002\301\001*7/v2be"
          + "ta1/{name=projects/*/knowledgeBases/*/do"
          + "cuments/*}ZE*C/v2beta1/{name=projects/*/"
          + "locations/*/knowledgeBases/*/documents/*"
          + "}Z?*=/v2beta1/{name=projects/*/agent/kno"
          + "wledgeBases/*/documents/*}\332A\004name\312A3\n\025go"
          + "ogle.protobuf.Empty\022\032KnowledgeOperationM"
          + "etadata\022\266\003\n\016UpdateDocument\0226.google.clou"
          + "d.dialogflow.v2beta1.UpdateDocumentReque"
          + "st\032\035.google.longrunning.Operation\"\314\002\202\323\344\223"
          + "\002\372\0012@/v2beta1/{document.name=projects/*/"
          + "knowledgeBases/*/documents/*}:\010documentZ"
          + "X2L/v2beta1/{document.name=projects/*/lo"
          + "cations/*/knowledgeBases/*/documents/*}:"
          + "\010documentZR2F/v2beta1/{document.name=pro"
          + "jects/*/agent/knowledgeBases/*/documents"
          + "/*}:\010document\332A\024document,update_mask\332A\010d"
          + "ocument\312A&\n\010Document\022\032KnowledgeOperation"
          + "Metadata\022\213\003\n\016ReloadDocument\0226.google.clo"
          + "ud.dialogflow.v2beta1.ReloadDocumentRequ"
          + "est\032\035.google.longrunning.Operation\"\241\002\202\323\344"
          + "\223\002\337\001\">/v2beta1/{name=projects/*/knowledg"
          + "eBases/*/documents/*}:reload:\001*ZO\"J/v2be"
          + "ta1/{name=projects/*/locations/*/knowled"
          + "geBases/*/documents/*}:reload:\001*ZI\"D/v2b"
          + "eta1/{name=projects/*/agent/knowledgeBas"
          + "es/*/documents/*}:reload:\001*\332A\017name,gcs_s"
          + "ource\312A&\n\010Document\022\032KnowledgeOperationMe"
          + "tadata\032x\312A\031dialogflow.googleapis.com\322AYh"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tform,https://www.googleapis.com/auth/di"
          + "alogflowB\253\001\n#com.google.cloud.dialogflow"
          + ".v2beta1B\rDocumentProtoP\001ZIgoogle.golang"
          + ".org/genproto/googleapis/cloud/dialogflo"
          + "w/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cl"
          + "oud.Dialogflow.V2beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.GcsProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Document_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "MimeType",
              "KnowledgeTypes",
              "ContentUri",
              "Content",
              "RawContent",
              "EnableAutoReload",
              "LatestReloadStatus",
              "Source",
            });
    internal_static_google_cloud_dialogflow_v2beta1_Document_ReloadStatus_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Document_ReloadStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Document_ReloadStatus_descriptor,
            new java.lang.String[] {
              "Time", "Status",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Documents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Document", "ImportGcsCustomMetadata",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Document", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor,
            new java.lang.String[] {
              "State",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name", "GcsSource", "ImportGcsCustomMetadata", "Source",
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.GcsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
