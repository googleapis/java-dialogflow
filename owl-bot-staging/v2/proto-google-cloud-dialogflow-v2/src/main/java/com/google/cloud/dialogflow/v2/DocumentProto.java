// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/document.proto

package com.google.cloud.dialogflow.v2;

public final class DocumentProto {
  private DocumentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_Document_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/dialogflow/v2/document.pr" +
      "oto\022\032google.cloud.dialogflow.v2\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\032#google/longr" +
      "unning/operations.proto\032 google/protobuf" +
      "/field_mask.proto\032\037google/protobuf/times" +
      "tamp.proto\032\027google/rpc/status.proto\"\342\006\n\010" +
      "Document\022\021\n\004name\030\001 \001(\tB\003\340A\001\022\031\n\014display_n" +
      "ame\030\002 \001(\tB\003\340A\002\022\026\n\tmime_type\030\003 \001(\tB\003\340A\002\022P" +
      "\n\017knowledge_types\030\004 \003(\01622.google.cloud.d" +
      "ialogflow.v2.Document.KnowledgeTypeB\003\340A\002" +
      "\022\025\n\013content_uri\030\005 \001(\tH\000\022\025\n\013raw_content\030\t" +
      " \001(\014H\000\022\037\n\022enable_auto_reload\030\013 \001(\010B\003\340A\001\022" +
      "T\n\024latest_reload_status\030\014 \001(\01321.google.c" +
      "loud.dialogflow.v2.Document.ReloadStatus" +
      "B\003\340A\003\022I\n\010metadata\030\007 \003(\01322.google.cloud.d" +
      "ialogflow.v2.Document.MetadataEntryB\003\340A\001" +
      "\032\\\n\014ReloadStatus\022(\n\004time\030\001 \001(\0132\032.google." +
      "protobuf.Timestamp\022\"\n\006status\030\002 \001(\0132\022.goo" +
      "gle.rpc.Status\032/\n\rMetadataEntry\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"c\n\rKnowledgeType" +
      "\022\036\n\032KNOWLEDGE_TYPE_UNSPECIFIED\020\000\022\007\n\003FAQ\020" +
      "\001\022\021\n\rEXTRACTIVE_QA\020\002\022\026\n\022ARTICLE_SUGGESTI" +
      "ON\020\003:\317\001\352A\313\001\n\"dialogflow.googleapis.com/D" +
      "ocument\022Gprojects/{project}/knowledgeBas" +
      "es/{knowledge_base}/documents/{document}" +
      "\022\\projects/{project}/locations/{location" +
      "}/knowledgeBases/{knowledge_base}/docume" +
      "nts/{document}B\010\n\006source\"N\n\022GetDocumentR" +
      "equest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"dialogflow" +
      ".googleapis.com/Document\"y\n\024ListDocument" +
      "sRequest\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$\022\"dialog" +
      "flow.googleapis.com/Document\022\021\n\tpage_siz" +
      "e\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"i\n\025ListDocum" +
      "entsResponse\0227\n\tdocuments\030\001 \003(\0132$.google" +
      ".cloud.dialogflow.v2.Document\022\027\n\017next_pa" +
      "ge_token\030\002 \001(\t\"\220\001\n\025CreateDocumentRequest" +
      "\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$\022\"dialogflow.goo" +
      "gleapis.com/Document\022;\n\010document\030\002 \001(\0132$" +
      ".google.cloud.dialogflow.v2.DocumentB\003\340A" +
      "\002\"Q\n\025DeleteDocumentRequest\0228\n\004name\030\001 \001(\t" +
      "B*\340A\002\372A$\n\"dialogflow.googleapis.com/Docu" +
      "ment\"\212\001\n\025UpdateDocumentRequest\022;\n\010docume" +
      "nt\030\001 \001(\0132$.google.cloud.dialogflow.v2.Do" +
      "cumentB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.googl" +
      "e.protobuf.FieldMaskB\003\340A\001\"w\n\025ReloadDocum" +
      "entRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"dialog" +
      "flow.googleapis.com/Document\022\032\n\013content_" +
      "uri\030\003 \001(\tB\003\340A\001H\000B\010\n\006source\"\262\001\n\032Knowledge" +
      "OperationMetadata\022P\n\005state\030\001 \001(\0162<.googl" +
      "e.cloud.dialogflow.v2.KnowledgeOperation" +
      "Metadata.StateB\003\340A\003\"B\n\005State\022\025\n\021STATE_UN" +
      "SPECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\010\n" +
      "\004DONE\020\0032\327\021\n\tDocuments\022\271\002\n\rListDocuments\022" +
      "0.google.cloud.dialogflow.v2.ListDocumen" +
      "tsRequest\0321.google.cloud.dialogflow.v2.L" +
      "istDocumentsResponse\"\302\001\202\323\344\223\002\262\001\0222/v2/{par" +
      "ent=projects/*/knowledgeBases/*}/documen" +
      "tsZ@\022>/v2/{parent=projects/*/locations/*" +
      "/knowledgeBases/*}/documentsZ:\0228/v2/{par" +
      "ent=projects/*/agent/knowledgeBases/*}/d" +
      "ocuments\332A\006parent\022\246\002\n\013GetDocument\022..goog" +
      "le.cloud.dialogflow.v2.GetDocumentReques" +
      "t\032$.google.cloud.dialogflow.v2.Document\"" +
      "\300\001\202\323\344\223\002\262\001\0222/v2/{name=projects/*/knowledg" +
      "eBases/*/documents/*}Z@\022>/v2/{name=proje" +
      "cts/*/locations/*/knowledgeBases/*/docum" +
      "ents/*}Z:\0228/v2/{name=projects/*/agent/kn" +
      "owledgeBases/*/documents/*}\332A\004name\022\367\002\n\016C" +
      "reateDocument\0221.google.cloud.dialogflow." +
      "v2.CreateDocumentRequest\032\035.google.longru" +
      "nning.Operation\"\222\002\202\323\344\223\002\320\001\"2/v2/{parent=p" +
      "rojects/*/knowledgeBases/*}/documents:\010d" +
      "ocumentZJ\">/v2/{parent=projects/*/locati" +
      "ons/*/knowledgeBases/*}/documents:\010docum" +
      "entZD\"8/v2/{parent=projects/*/agent/know" +
      "ledgeBases/*}/documents:\010document\332A\017pare" +
      "nt,document\312A&\n\010Document\022\032KnowledgeOpera" +
      "tionMetadata\022\333\002\n\016DeleteDocument\0221.google" +
      ".cloud.dialogflow.v2.DeleteDocumentReque" +
      "st\032\035.google.longrunning.Operation\"\366\001\202\323\344\223" +
      "\002\262\001*2/v2/{name=projects/*/knowledgeBases" +
      "/*/documents/*}Z@*>/v2/{name=projects/*/" +
      "locations/*/knowledgeBases/*/documents/*" +
      "}Z:*8/v2/{name=projects/*/agent/knowledg" +
      "eBases/*/documents/*}\332A\004name\312A3\n\025google." +
      "protobuf.Empty\022\032KnowledgeOperationMetada" +
      "ta\022\227\003\n\016UpdateDocument\0221.google.cloud.dia" +
      "logflow.v2.UpdateDocumentRequest\032\035.googl" +
      "e.longrunning.Operation\"\262\002\202\323\344\223\002\353\0012;/v2/{" +
      "document.name=projects/*/knowledgeBases/" +
      "*/documents/*}:\010documentZS2G/v2/{documen" +
      "t.name=projects/*/locations/*/knowledgeB" +
      "ases/*/documents/*}:\010documentZM2A/v2/{do" +
      "cument.name=projects/*/agent/knowledgeBa" +
      "ses/*/documents/*}:\010document\332A\024document," +
      "update_mask\312A&\n\010Document\022\032KnowledgeOpera" +
      "tionMetadata\022\370\002\n\016ReloadDocument\0221.google" +
      ".cloud.dialogflow.v2.ReloadDocumentReque" +
      "st\032\035.google.longrunning.Operation\"\223\002\202\323\344\223" +
      "\002\320\001\"9/v2/{name=projects/*/knowledgeBases" +
      "/*/documents/*}:reload:\001*ZJ\"E/v2/{name=p" +
      "rojects/*/locations/*/knowledgeBases/*/d" +
      "ocuments/*}:reload:\001*ZD\"?/v2/{name=proje" +
      "cts/*/agent/knowledgeBases/*/documents/*" +
      "}:reload:\001*\332A\020name,content_uri\312A&\n\010Docum" +
      "ent\022\032KnowledgeOperationMetadata\032x\312A\031dial" +
      "ogflow.googleapis.com\322AYhttps://www.goog" +
      "leapis.com/auth/cloud-platform,https://w" +
      "ww.googleapis.com/auth/dialogflowB\234\001\n\036co" +
      "m.google.cloud.dialogflow.v2B\rDocumentPr" +
      "otoP\001ZDgoogle.golang.org/genproto/google" +
      "apis/cloud/dialogflow/v2;dialogflow\370\001\001\242\002" +
      "\002DF\252\002\032Google.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_Document_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "MimeType", "KnowledgeTypes", "ContentUri", "RawContent", "EnableAutoReload", "LatestReloadStatus", "Metadata", "Source", });
    internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor =
      internal_static_google_cloud_dialogflow_v2_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor,
        new java.lang.String[] { "Time", "Status", });
    internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor =
      internal_static_google_cloud_dialogflow_v2_Document_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor,
        new java.lang.String[] { "Documents", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor,
        new java.lang.String[] { "Parent", "Document", });
    internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor,
        new java.lang.String[] { "Document", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor,
        new java.lang.String[] { "Name", "ContentUri", "Source", });
    internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor,
        new java.lang.String[] { "State", });
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
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}