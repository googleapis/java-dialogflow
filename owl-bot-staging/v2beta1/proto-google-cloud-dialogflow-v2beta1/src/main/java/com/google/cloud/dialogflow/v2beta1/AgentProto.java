// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

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
    internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SubAgent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dialogflow/v2beta1/agent." +
      "proto\022\037google.cloud.dialogflow.v2beta1\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\0327googl" +
      "e/cloud/dialogflow/v2beta1/validation_re" +
      "sult.proto\032#google/longrunning/operation" +
      "s.proto\032\033google/protobuf/empty.proto\032 go" +
      "ogle/protobuf/field_mask.proto\032\034google/p" +
      "rotobuf/struct.proto\"\377\006\n\005Agent\022C\n\006parent" +
      "\030\001 \001(\tB3\340A\002\372A-\n+cloudresourcemanager.goo" +
      "gleapis.com/Project\022\024\n\014display_name\030\002 \001(" +
      "\t\022\035\n\025default_language_code\030\003 \001(\t\022 \n\030supp" +
      "orted_language_codes\030\004 \003(\t\022\021\n\ttime_zone\030" +
      "\005 \001(\t\022\023\n\013description\030\006 \001(\t\022\022\n\navatar_uri" +
      "\030\007 \001(\t\022\026\n\016enable_logging\030\010 \001(\010\022H\n\nmatch_" +
      "mode\030\t \001(\01620.google.cloud.dialogflow.v2b" +
      "eta1.Agent.MatchModeB\002\030\001\022 \n\030classificati" +
      "on_threshold\030\n \001(\002\022F\n\013api_version\030\016 \001(\0162" +
      "1.google.cloud.dialogflow.v2beta1.Agent." +
      "ApiVersion\0229\n\004tier\030\017 \001(\0162+.google.cloud." +
      "dialogflow.v2beta1.Agent.Tier\"V\n\tMatchMo" +
      "de\022\032\n\026MATCH_MODE_UNSPECIFIED\020\000\022\025\n\021MATCH_" +
      "MODE_HYBRID\020\001\022\026\n\022MATCH_MODE_ML_ONLY\020\002\"l\n" +
      "\nApiVersion\022\033\n\027API_VERSION_UNSPECIFIED\020\000" +
      "\022\022\n\016API_VERSION_V1\020\001\022\022\n\016API_VERSION_V2\020\002" +
      "\022\031\n\025API_VERSION_V2_BETA_1\020\003\"b\n\004Tier\022\024\n\020T" +
      "IER_UNSPECIFIED\020\000\022\021\n\rTIER_STANDARD\020\001\022\023\n\017" +
      "TIER_ENTERPRISE\020\002\022\034\n\024TIER_ENTERPRISE_PLU" +
      "S\020\003\032\002\010\001:m\352Aj\n\037dialogflow.googleapis.com/" +
      "Agent\022\030projects/{project}/agent\022-project" +
      "s/{project}/locations/{location}/agent\"J" +
      "\n\017GetAgentRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A" +
      "!\022\037dialogflow.googleapis.com/Agent\"~\n\017Se" +
      "tAgentRequest\022:\n\005agent\030\001 \001(\0132&.google.cl" +
      "oud.dialogflow.v2beta1.AgentB\003\340A\002\022/\n\013upd" +
      "ate_mask\030\002 \001(\0132\032.google.protobuf.FieldMa" +
      "sk\"M\n\022DeleteAgentRequest\0227\n\006parent\030\001 \001(\t" +
      "B\'\340A\002\372A!\022\037dialogflow.googleapis.com/Agen" +
      "t\"0\n\010SubAgent\022\017\n\007project\030\001 \001(\t\022\023\n\013enviro" +
      "nment\030\002 \001(\t\"u\n\023SearchAgentsRequest\0227\n\006pa" +
      "rent\030\001 \001(\tB\'\340A\002\372A!\022\037dialogflow.googleapi" +
      "s.com/Agent\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t" +
      "oken\030\003 \001(\t\"g\n\024SearchAgentsResponse\0226\n\006ag" +
      "ents\030\001 \003(\0132&.google.cloud.dialogflow.v2b" +
      "eta1.Agent\022\027\n\017next_page_token\030\002 \001(\t\"L\n\021T" +
      "rainAgentRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!" +
      "\022\037dialogflow.googleapis.com/Agent\"`\n\022Exp" +
      "ortAgentRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022" +
      "\037dialogflow.googleapis.com/Agent\022\021\n\tagen" +
      "t_uri\030\002 \001(\t\"L\n\023ExportAgentResponse\022\023\n\tag" +
      "ent_uri\030\001 \001(\tH\000\022\027\n\ragent_content\030\002 \001(\014H\000" +
      "B\007\n\005agent\"\204\001\n\022ImportAgentRequest\0227\n\006pare" +
      "nt\030\001 \001(\tB\'\340A\002\372A!\022\037dialogflow.googleapis." +
      "com/Agent\022\023\n\tagent_uri\030\002 \001(\tH\000\022\027\n\ragent_" +
      "content\030\003 \001(\014H\000B\007\n\005agent\"\205\001\n\023RestoreAgen" +
      "tRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037dialog" +
      "flow.googleapis.com/Agent\022\023\n\tagent_uri\030\002" +
      " \001(\tH\000\022\027\n\ragent_content\030\003 \001(\014H\000B\007\n\005agent" +
      "\"q\n\032GetValidationResultRequest\0227\n\006parent" +
      "\030\001 \001(\tB\'\340A\002\372A!\022\037dialogflow.googleapis.co" +
      "m/Agent\022\032\n\rlanguage_code\030\003 \001(\tB\003\340A\0012\312\022\n\006" +
      "Agents\022\313\001\n\010GetAgent\0220.google.cloud.dialo" +
      "gflow.v2beta1.GetAgentRequest\032&.google.c" +
      "loud.dialogflow.v2beta1.Agent\"e\202\323\344\223\002V\022\"/" +
      "v2beta1/{parent=projects/*}/agentZ0\022./v2" +
      "beta1/{parent=projects/*/locations/*}/ag" +
      "ent\332A\006parent\022\344\001\n\010SetAgent\0220.google.cloud" +
      ".dialogflow.v2beta1.SetAgentRequest\032&.go" +
      "ogle.cloud.dialogflow.v2beta1.Agent\"~\202\323\344" +
      "\223\002p\"(/v2beta1/{agent.parent=projects/*}/" +
      "agent:\005agentZ=\"4/v2beta1/{agent.parent=p" +
      "rojects/*/locations/*}/agent:\005agent\332A\005ag" +
      "ent\022\301\001\n\013DeleteAgent\0223.google.cloud.dialo" +
      "gflow.v2beta1.DeleteAgentRequest\032\026.googl" +
      "e.protobuf.Empty\"e\202\323\344\223\002V*\"/v2beta1/{pare" +
      "nt=projects/*}/agentZ0*./v2beta1/{parent" +
      "=projects/*/locations/*}/agent\332A\006parent\022" +
      "\360\001\n\014SearchAgents\0224.google.cloud.dialogfl" +
      "ow.v2beta1.SearchAgentsRequest\0325.google." +
      "cloud.dialogflow.v2beta1.SearchAgentsRes" +
      "ponse\"s\202\323\344\223\002d\022)/v2beta1/{parent=projects" +
      "/*}/agent:searchZ7\0225/v2beta1/{parent=pro" +
      "jects/*/locations/*}/agent:search\332A\006pare" +
      "nt\022\213\002\n\nTrainAgent\0222.google.cloud.dialogf" +
      "low.v2beta1.TrainAgentRequest\032\035.google.l" +
      "ongrunning.Operation\"\251\001\202\323\344\223\002h\"(/v2beta1/" +
      "{parent=projects/*}/agent:train:\001*Z9\"4/v" +
      "2beta1/{parent=projects/*/locations/*}/a" +
      "gent:train:\001*\332A\006parent\312A/\n\025google.protob" +
      "uf.Empty\022\026google.protobuf.Struct\022\255\002\n\013Exp" +
      "ortAgent\0223.google.cloud.dialogflow.v2bet" +
      "a1.ExportAgentRequest\032\035.google.longrunni" +
      "ng.Operation\"\311\001\202\323\344\223\002j\")/v2beta1/{parent=" +
      "projects/*}/agent:export:\001*Z:\"5/v2beta1/" +
      "{parent=projects/*/locations/*}/agent:ex" +
      "port:\001*\332A\006parent\312AM\n3google.cloud.dialog" +
      "flow.v2beta1.ExportAgentResponse\022\026google" +
      ".protobuf.Struct\022\206\002\n\013ImportAgent\0223.googl" +
      "e.cloud.dialogflow.v2beta1.ImportAgentRe" +
      "quest\032\035.google.longrunning.Operation\"\242\001\202" +
      "\323\344\223\002j\")/v2beta1/{parent=projects/*}/agen" +
      "t:import:\001*Z:\"5/v2beta1/{parent=projects" +
      "/*/locations/*}/agent:import:\001*\312A/\n\025goog" +
      "le.protobuf.Empty\022\026google.protobuf.Struc" +
      "t\022\212\002\n\014RestoreAgent\0224.google.cloud.dialog" +
      "flow.v2beta1.RestoreAgentRequest\032\035.googl" +
      "e.longrunning.Operation\"\244\001\202\323\344\223\002l\"*/v2bet" +
      "a1/{parent=projects/*}/agent:restore:\001*Z" +
      ";\"6/v2beta1/{parent=projects/*/locations" +
      "/*}/agent:restore:\001*\312A/\n\025google.protobuf" +
      ".Empty\022\026google.protobuf.Struct\022\205\002\n\023GetVa" +
      "lidationResult\022;.google.cloud.dialogflow" +
      ".v2beta1.GetValidationResultRequest\0321.go" +
      "ogle.cloud.dialogflow.v2beta1.Validation" +
      "Result\"~\202\323\344\223\002x\0223/v2beta1/{parent=project" +
      "s/*}/agent/validationResultZA\022?/v2beta1/" +
      "{parent=projects/*/locations/*}/agent/va" +
      "lidationResult\032x\312A\031dialogflow.googleapis" +
      ".com\322AYhttps://www.googleapis.com/auth/c" +
      "loud-platform,https://www.googleapis.com" +
      "/auth/dialogflowB\242\001\n#com.google.cloud.di" +
      "alogflow.v2beta1B\nAgentProtoP\001ZCcloud.go" +
      "ogle.com/go/dialogflow/apiv2beta1/dialog" +
      "flowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\037Google.Clo" +
      "ud.Dialogflow.V2Beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.ValidationResultProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Agent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor,
        new java.lang.String[] { "Parent", "DisplayName", "DefaultLanguageCode", "SupportedLanguageCodes", "TimeZone", "Description", "AvatarUri", "EnableLogging", "MatchMode", "ClassificationThreshold", "ApiVersion", "Tier", });
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor,
        new java.lang.String[] { "Parent", });
    internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor,
        new java.lang.String[] { "Agent", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor,
        new java.lang.String[] { "Parent", });
    internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_SubAgent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor,
        new java.lang.String[] { "Project", "Environment", });
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor,
        new java.lang.String[] { "Agents", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor,
        new java.lang.String[] { "Parent", });
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor,
        new java.lang.String[] { "Parent", "AgentUri", });
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor,
        new java.lang.String[] { "AgentUri", "AgentContent", "Agent", });
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor,
        new java.lang.String[] { "Parent", "AgentUri", "AgentContent", "Agent", });
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor,
        new java.lang.String[] { "Parent", "AgentUri", "AgentContent", "Agent", });
    internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_descriptor,
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
    com.google.cloud.dialogflow.v2beta1.ValidationResultProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
