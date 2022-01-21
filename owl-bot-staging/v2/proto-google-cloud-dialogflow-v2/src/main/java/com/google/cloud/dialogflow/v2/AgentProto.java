// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

public final class AgentProto {
  private AgentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_Agent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/dialogflow/v2/agent.proto" +
      "\022\032google.cloud.dialogflow.v2\032\034google/api" +
      "/annotations.proto\032\027google/api/client.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\0322google/cloud/di" +
      "alogflow/v2/validation_result.proto\032#goo" +
      "gle/longrunning/operations.proto\032\033google" +
      "/protobuf/empty.proto\032 google/protobuf/f" +
      "ield_mask.proto\"\245\007\n\005Agent\022C\n\006parent\030\001 \001(" +
      "\tB3\340A\002\372A-\n+cloudresourcemanager.googleap" +
      "is.com/Project\022\031\n\014display_name\030\002 \001(\tB\003\340A" +
      "\002\022\"\n\025default_language_code\030\003 \001(\tB\003\340A\002\022%\n" +
      "\030supported_language_codes\030\004 \003(\tB\003\340A\001\022\026\n\t" +
      "time_zone\030\005 \001(\tB\003\340A\002\022\030\n\013description\030\006 \001(" +
      "\tB\003\340A\001\022\027\n\navatar_uri\030\007 \001(\tB\003\340A\001\022\033\n\016enabl" +
      "e_logging\030\010 \001(\010B\003\340A\001\022F\n\nmatch_mode\030\t \001(\016" +
      "2+.google.cloud.dialogflow.v2.Agent.Matc" +
      "hModeB\005\030\001\340A\001\022%\n\030classification_threshold" +
      "\030\n \001(\002B\003\340A\001\022F\n\013api_version\030\016 \001(\0162,.googl" +
      "e.cloud.dialogflow.v2.Agent.ApiVersionB\003" +
      "\340A\001\0229\n\004tier\030\017 \001(\0162&.google.cloud.dialogf" +
      "low.v2.Agent.TierB\003\340A\001\"V\n\tMatchMode\022\032\n\026M" +
      "ATCH_MODE_UNSPECIFIED\020\000\022\025\n\021MATCH_MODE_HY" +
      "BRID\020\001\022\026\n\022MATCH_MODE_ML_ONLY\020\002\"l\n\nApiVer" +
      "sion\022\033\n\027API_VERSION_UNSPECIFIED\020\000\022\022\n\016API" +
      "_VERSION_V1\020\001\022\022\n\016API_VERSION_V2\020\002\022\031\n\025API" +
      "_VERSION_V2_BETA_1\020\003\"b\n\004Tier\022\024\n\020TIER_UNS" +
      "PECIFIED\020\000\022\021\n\rTIER_STANDARD\020\001\022\023\n\017TIER_EN" +
      "TERPRISE\020\002\022\034\n\024TIER_ENTERPRISE_PLUS\020\003\032\002\010\001" +
      ":m\352Aj\n\037dialogflow.googleapis.com/Agent\022\030" +
      "projects/{project}/agent\022-projects/{proj" +
      "ect}/locations/{location}/agent\"J\n\017GetAg" +
      "entRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037dial" +
      "ogflow.googleapis.com/Agent\"~\n\017SetAgentR" +
      "equest\0225\n\005agent\030\001 \001(\0132!.google.cloud.dia" +
      "logflow.v2.AgentB\003\340A\002\0224\n\013update_mask\030\002 \001" +
      "(\0132\032.google.protobuf.FieldMaskB\003\340A\001\"M\n\022D" +
      "eleteAgentRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A" +
      "!\022\037dialogflow.googleapis.com/Agent\"z\n\023Se" +
      "archAgentsRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A" +
      "!\022\037dialogflow.googleapis.com/Agent\022\026\n\tpa" +
      "ge_size\030\002 \001(\005B\003\340A\001\022\022\n\npage_token\030\003 \001(\t\"b" +
      "\n\024SearchAgentsResponse\0221\n\006agents\030\001 \003(\0132!" +
      ".google.cloud.dialogflow.v2.Agent\022\027\n\017nex" +
      "t_page_token\030\002 \001(\t\"L\n\021TrainAgentRequest\022" +
      "7\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037dialogflow.goog" +
      "leapis.com/Agent\"e\n\022ExportAgentRequest\0227" +
      "\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037dialogflow.googl" +
      "eapis.com/Agent\022\026\n\tagent_uri\030\002 \001(\tB\003\340A\002\"" +
      "L\n\023ExportAgentResponse\022\023\n\tagent_uri\030\001 \001(" +
      "\tH\000\022\027\n\ragent_content\030\002 \001(\014H\000B\007\n\005agent\"\204\001" +
      "\n\022ImportAgentRequest\0227\n\006parent\030\001 \001(\tB\'\340A" +
      "\002\372A!\022\037dialogflow.googleapis.com/Agent\022\023\n" +
      "\tagent_uri\030\002 \001(\tH\000\022\027\n\ragent_content\030\003 \001(" +
      "\014H\000B\007\n\005agent\"\205\001\n\023RestoreAgentRequest\0227\n\006" +
      "parent\030\001 \001(\tB\'\340A\002\372A!\022\037dialogflow.googlea" +
      "pis.com/Agent\022\023\n\tagent_uri\030\002 \001(\tH\000\022\027\n\rag" +
      "ent_content\030\003 \001(\014H\000B\007\n\005agent\"q\n\032GetValid" +
      "ationResultRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372" +
      "A!\022\037dialogflow.googleapis.com/Agent\022\032\n\rl" +
      "anguage_code\030\003 \001(\tB\003\340A\0012\252\021\n\006Agents\022\267\001\n\010G" +
      "etAgent\022+.google.cloud.dialogflow.v2.Get" +
      "AgentRequest\032!.google.cloud.dialogflow.v" +
      "2.Agent\"[\202\323\344\223\002L\022\035/v2/{parent=projects/*}" +
      "/agentZ+\022)/v2/{parent=projects/*/locatio" +
      "ns/*}/agent\332A\006parent\022\320\001\n\010SetAgent\022+.goog" +
      "le.cloud.dialogflow.v2.SetAgentRequest\032!" +
      ".google.cloud.dialogflow.v2.Agent\"t\202\323\344\223\002" +
      "f\"#/v2/{agent.parent=projects/*}/agent:\005" +
      "agentZ8\"//v2/{agent.parent=projects/*/lo" +
      "cations/*}/agent:\005agent\332A\005agent\022\262\001\n\013Dele" +
      "teAgent\022..google.cloud.dialogflow.v2.Del" +
      "eteAgentRequest\032\026.google.protobuf.Empty\"" +
      "[\202\323\344\223\002L*\035/v2/{parent=projects/*}/agentZ+" +
      "*)/v2/{parent=projects/*/locations/*}/ag" +
      "ent\332A\006parent\022\334\001\n\014SearchAgents\022/.google.c" +
      "loud.dialogflow.v2.SearchAgentsRequest\0320" +
      ".google.cloud.dialogflow.v2.SearchAgents" +
      "Response\"i\202\323\344\223\002Z\022$/v2/{parent=projects/*" +
      "}/agent:searchZ2\0220/v2/{parent=projects/*" +
      "/locations/*}/agent:search\332A\006parent\022\374\001\n\n" +
      "TrainAgent\022-.google.cloud.dialogflow.v2." +
      "TrainAgentRequest\032\035.google.longrunning.O" +
      "peration\"\237\001\202\323\344\223\002^\"#/v2/{parent=projects/" +
      "*}/agent:train:\001*Z4\"//v2/{parent=project" +
      "s/*/locations/*}/agent:train:\001*\332A\006parent" +
      "\312A/\n\025google.protobuf.Empty\022\026google.proto" +
      "buf.Struct\022\231\002\n\013ExportAgent\022..google.clou" +
      "d.dialogflow.v2.ExportAgentRequest\032\035.goo" +
      "gle.longrunning.Operation\"\272\001\202\323\344\223\002`\"$/v2/" +
      "{parent=projects/*}/agent:export:\001*Z5\"0/" +
      "v2/{parent=projects/*/locations/*}/agent" +
      ":export:\001*\332A\006parent\312AH\n.google.cloud.dia" +
      "logflow.v2.ExportAgentResponse\022\026google.p" +
      "rotobuf.Struct\022\367\001\n\013ImportAgent\022..google." +
      "cloud.dialogflow.v2.ImportAgentRequest\032\035" +
      ".google.longrunning.Operation\"\230\001\202\323\344\223\002`\"$" +
      "/v2/{parent=projects/*}/agent:import:\001*Z" +
      "5\"0/v2/{parent=projects/*/locations/*}/a" +
      "gent:import:\001*\312A/\n\025google.protobuf.Empty" +
      "\022\026google.protobuf.Struct\022\373\001\n\014RestoreAgen" +
      "t\022/.google.cloud.dialogflow.v2.RestoreAg" +
      "entRequest\032\035.google.longrunning.Operatio" +
      "n\"\232\001\202\323\344\223\002b\"%/v2/{parent=projects/*}/agen" +
      "t:restore:\001*Z6\"1/v2/{parent=projects/*/l" +
      "ocations/*}/agent:restore:\001*\312A/\n\025google." +
      "protobuf.Empty\022\026google.protobuf.Struct\022\361" +
      "\001\n\023GetValidationResult\0226.google.cloud.di" +
      "alogflow.v2.GetValidationResultRequest\032," +
      ".google.cloud.dialogflow.v2.ValidationRe" +
      "sult\"t\202\323\344\223\002n\022./v2/{parent=projects/*}/ag" +
      "ent/validationResultZ<\022:/v2/{parent=proj" +
      "ects/*/locations/*}/agent/validationResu" +
      "lt\032x\312A\031dialogflow.googleapis.com\322AYhttps" +
      "://www.googleapis.com/auth/cloud-platfor" +
      "m,https://www.googleapis.com/auth/dialog" +
      "flowB\231\001\n\036com.google.cloud.dialogflow.v2B" +
      "\nAgentProtoP\001ZDgoogle.golang.org/genprot" +
      "o/googleapis/cloud/dialogflow/v2;dialogf" +
      "low\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.ValidationResultProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2_Agent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Agent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_Agent_descriptor,
        new java.lang.String[] { "Parent", "DisplayName", "DefaultLanguageCode", "SupportedLanguageCodes", "TimeZone", "Description", "AvatarUri", "EnableLogging", "MatchMode", "ClassificationThreshold", "ApiVersion", "Tier", });
    internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_GetAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor,
        new java.lang.String[] { "Parent", });
    internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_SetAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor,
        new java.lang.String[] { "Agent", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor,
        new java.lang.String[] { "Parent", });
    internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor,
        new java.lang.String[] { "Agents", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor,
        new java.lang.String[] { "Parent", });
    internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor,
        new java.lang.String[] { "Parent", "AgentUri", });
    internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor,
        new java.lang.String[] { "AgentUri", "AgentContent", "Agent", });
    internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor,
        new java.lang.String[] { "Parent", "AgentUri", "AgentContent", "Agent", });
    internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor,
        new java.lang.String[] { "Parent", "AgentUri", "AgentContent", "Agent", });
    internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_descriptor,
        new java.lang.String[] { "Parent", "LanguageCode", });
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
    com.google.cloud.dialogflow.v2.ValidationResultProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}