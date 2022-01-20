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
    internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_fieldAccessorTable;
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
      "\031google/api/resource.proto\032$google/cloud" +
      "/dialogflow/v2/gcs.proto\032#google/longrun" +
      "ning/operations.proto\032 google/protobuf/f" +
      "ield_mask.proto\032\037google/protobuf/timesta" +
      "mp.proto\032\027google/rpc/status.proto\"\342\006\n\010Do" +
      "cument\022\021\n\004name\030\001 \001(\tB\003\340A\001\022\031\n\014display_nam" +
      "e\030\002 \001(\tB\003\340A\002\022\026\n\tmime_type\030\003 \001(\tB\003\340A\002\022P\n\017" +
      "knowledge_types\030\004 \003(\01622.google.cloud.dia" +
      "logflow.v2.Document.KnowledgeTypeB\003\340A\002\022\025" +
      "\n\013content_uri\030\005 \001(\tH\000\022\025\n\013raw_content\030\t \001" +
      "(\014H\000\022\037\n\022enable_auto_reload\030\013 \001(\010B\003\340A\001\022T\n" +
      "\024latest_reload_status\030\014 \001(\01321.google.clo" +
      "ud.dialogflow.v2.Document.ReloadStatusB\003" +
      "\340A\003\022I\n\010metadata\030\007 \003(\01322.google.cloud.dia" +
      "logflow.v2.Document.MetadataEntryB\003\340A\001\032\\" +
      "\n\014ReloadStatus\022(\n\004time\030\001 \001(\0132\032.google.pr" +
      "otobuf.Timestamp\022\"\n\006status\030\002 \001(\0132\022.googl" +
      "e.rpc.Status\032/\n\rMetadataEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"c\n\rKnowledgeType\022\036" +
      "\n\032KNOWLEDGE_TYPE_UNSPECIFIED\020\000\022\007\n\003FAQ\020\001\022" +
      "\021\n\rEXTRACTIVE_QA\020\002\022\026\n\022ARTICLE_SUGGESTION" +
      "\020\003:\317\001\352A\313\001\n\"dialogflow.googleapis.com/Doc" +
      "ument\022Gprojects/{project}/knowledgeBases" +
      "/{knowledge_base}/documents/{document}\022\\" +
      "projects/{project}/locations/{location}/" +
      "knowledgeBases/{knowledge_base}/document" +
      "s/{document}B\010\n\006source\"N\n\022GetDocumentReq" +
      "uest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"dialogflow.g" +
      "oogleapis.com/Document\"\211\001\n\024ListDocuments" +
      "Request\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$\022\"dialogf" +
      "low.googleapis.com/Document\022\021\n\tpage_size" +
      "\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001" +
      "(\t\"i\n\025ListDocumentsResponse\0227\n\tdocuments" +
      "\030\001 \003(\0132$.google.cloud.dialogflow.v2.Docu" +
      "ment\022\027\n\017next_page_token\030\002 \001(\t\"\220\001\n\025Create" +
      "DocumentRequest\022:\n\006parent\030\001 \001(\tB*\340A\002\372A$\022" +
      "\"dialogflow.googleapis.com/Document\022;\n\010d" +
      "ocument\030\002 \001(\0132$.google.cloud.dialogflow." +
      "v2.DocumentB\003\340A\002\"Q\n\025DeleteDocumentReques" +
      "t\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"dialogflow.goog" +
      "leapis.com/Document\"\212\001\n\025UpdateDocumentRe" +
      "quest\022;\n\010document\030\001 \001(\0132$.google.cloud.d" +
      "ialogflow.v2.DocumentB\003\340A\002\0224\n\013update_mas" +
      "k\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001" +
      "\"\315\001\n\025ReloadDocumentRequest\0228\n\004name\030\001 \001(\t" +
      "B*\340A\002\372A$\n\"dialogflow.googleapis.com/Docu" +
      "ment\022\032\n\013content_uri\030\003 \001(\tB\003\340A\001H\000\022\'\n\032impo" +
      "rt_gcs_custom_metadata\030\004 \001(\010B\003\340A\001\022+\n\036sma" +
      "rt_messaging_partial_update\030\005 \001(\010B\003\340A\001B\010" +
      "\n\006source\"\354\001\n\025ExportDocumentRequest\0228\n\004na" +
      "me\030\001 \001(\tB*\340A\002\372A$\n\"dialogflow.googleapis." +
      "com/Document\022E\n\017gcs_destination\030\002 \001(\0132*." +
      "google.cloud.dialogflow.v2.GcsDestinatio" +
      "nH\000\022\033\n\023export_full_content\030\003 \001(\010\022&\n\036smar" +
      "t_messaging_partial_update\030\005 \001(\010B\r\n\013dest" +
      "ination\"\262\001\n\032KnowledgeOperationMetadata\022P" +
      "\n\005state\030\001 \001(\0162<.google.cloud.dialogflow." +
      "v2.KnowledgeOperationMetadata.StateB\003\340A\003" +
      "\"B\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007PEND" +
      "ING\020\001\022\013\n\007RUNNING\020\002\022\010\n\004DONE\020\0032\371\023\n\tDocumen" +
      "ts\022\271\002\n\rListDocuments\0220.google.cloud.dial" +
      "ogflow.v2.ListDocumentsRequest\0321.google." +
      "cloud.dialogflow.v2.ListDocumentsRespons" +
      "e\"\302\001\202\323\344\223\002\262\001\0222/v2/{parent=projects/*/know" +
      "ledgeBases/*}/documentsZ@\022>/v2/{parent=p" +
      "rojects/*/locations/*/knowledgeBases/*}/" +
      "documentsZ:\0228/v2/{parent=projects/*/agen" +
      "t/knowledgeBases/*}/documents\332A\006parent\022\246" +
      "\002\n\013GetDocument\022..google.cloud.dialogflow" +
      ".v2.GetDocumentRequest\032$.google.cloud.di" +
      "alogflow.v2.Document\"\300\001\202\323\344\223\002\262\001\0222/v2/{nam" +
      "e=projects/*/knowledgeBases/*/documents/" +
      "*}Z@\022>/v2/{name=projects/*/locations/*/k" +
      "nowledgeBases/*/documents/*}Z:\0228/v2/{nam" +
      "e=projects/*/agent/knowledgeBases/*/docu" +
      "ments/*}\332A\004name\022\367\002\n\016CreateDocument\0221.goo" +
      "gle.cloud.dialogflow.v2.CreateDocumentRe" +
      "quest\032\035.google.longrunning.Operation\"\222\002\202" +
      "\323\344\223\002\320\001\"2/v2/{parent=projects/*/knowledge" +
      "Bases/*}/documents:\010documentZJ\">/v2/{par" +
      "ent=projects/*/locations/*/knowledgeBase" +
      "s/*}/documents:\010documentZD\"8/v2/{parent=" +
      "projects/*/agent/knowledgeBases/*}/docum" +
      "ents:\010document\332A\017parent,document\312A&\n\010Doc" +
      "ument\022\032KnowledgeOperationMetadata\022\333\002\n\016De" +
      "leteDocument\0221.google.cloud.dialogflow.v" +
      "2.DeleteDocumentRequest\032\035.google.longrun" +
      "ning.Operation\"\366\001\202\323\344\223\002\262\001*2/v2/{name=proj" +
      "ects/*/knowledgeBases/*/documents/*}Z@*>" +
      "/v2/{name=projects/*/locations/*/knowled" +
      "geBases/*/documents/*}Z:*8/v2/{name=proj" +
      "ects/*/agent/knowledgeBases/*/documents/" +
      "*}\332A\004name\312A3\n\025google.protobuf.Empty\022\032Kno" +
      "wledgeOperationMetadata\022\227\003\n\016UpdateDocume" +
      "nt\0221.google.cloud.dialogflow.v2.UpdateDo" +
      "cumentRequest\032\035.google.longrunning.Opera" +
      "tion\"\262\002\202\323\344\223\002\353\0012;/v2/{document.name=proje" +
      "cts/*/knowledgeBases/*/documents/*}:\010doc" +
      "umentZS2G/v2/{document.name=projects/*/l" +
      "ocations/*/knowledgeBases/*/documents/*}" +
      ":\010documentZM2A/v2/{document.name=project" +
      "s/*/agent/knowledgeBases/*/documents/*}:" +
      "\010document\332A\024document,update_mask\312A&\n\010Doc" +
      "ument\022\032KnowledgeOperationMetadata\022\370\002\n\016Re" +
      "loadDocument\0221.google.cloud.dialogflow.v" +
      "2.ReloadDocumentRequest\032\035.google.longrun" +
      "ning.Operation\"\223\002\202\323\344\223\002\320\001\"9/v2/{name=proj" +
      "ects/*/knowledgeBases/*/documents/*}:rel" +
      "oad:\001*ZJ\"E/v2/{name=projects/*/locations" +
      "/*/knowledgeBases/*/documents/*}:reload:" +
      "\001*ZD\"?/v2/{name=projects/*/agent/knowled" +
      "geBases/*/documents/*}:reload:\001*\332A\020name," +
      "content_uri\312A&\n\010Document\022\032KnowledgeOpera" +
      "tionMetadata\022\237\002\n\016ExportDocument\0221.google" +
      ".cloud.dialogflow.v2.ExportDocumentReque" +
      "st\032\035.google.longrunning.Operation\"\272\001\202\323\344\223" +
      "\002\212\001\"9/v2/{name=projects/*/knowledgeBases" +
      "/*/documents/*}:export:\001*ZJ\"E/v2/{name=p" +
      "rojects/*/locations/*/knowledgeBases/*/d" +
      "ocuments/*}:export:\001*\312A&\n\010Document\022\032Know" +
      "ledgeOperationMetadata\032x\312A\031dialogflow.go" +
      "ogleapis.com\322AYhttps://www.googleapis.co" +
      "m/auth/cloud-platform,https://www.google" +
      "apis.com/auth/dialogflowB\234\001\n\036com.google." +
      "cloud.dialogflow.v2B\rDocumentProtoP\001ZDgo" +
      "ogle.golang.org/genproto/googleapis/clou" +
      "d/dialogflow/v2;dialogflow\370\001\001\242\002\002DF\252\002\032Goo" +
      "gle.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.GcsProto.getDescriptor(),
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
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
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
        new java.lang.String[] { "Name", "ContentUri", "ImportGcsCustomMetadata", "SmartMessagingPartialUpdate", "Source", });
    internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor,
        new java.lang.String[] { "Name", "GcsDestination", "ExportFullContent", "SmartMessagingPartialUpdate", "Destination", });
    internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
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
    com.google.cloud.dialogflow.v2.GcsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
