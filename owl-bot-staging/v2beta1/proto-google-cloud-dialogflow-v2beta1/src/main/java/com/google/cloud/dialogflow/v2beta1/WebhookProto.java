// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/webhook.proto

package com.google.cloud.dialogflow.v2beta1;

public final class WebhookProto {
  private WebhookProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/webhoo" +
      "k.proto\022\037google.cloud.dialogflow.v2beta1" +
      "\032\034google/api/annotations.proto\032-google/c" +
      "loud/dialogflow/v2beta1/context.proto\032,g" +
      "oogle/cloud/dialogflow/v2beta1/intent.pr" +
      "oto\032-google/cloud/dialogflow/v2beta1/ses" +
      "sion.proto\0329google/cloud/dialogflow/v2be" +
      "ta1/session_entity_type.proto\032\034google/pr" +
      "otobuf/struct.proto\"\261\002\n\016WebhookRequest\022\017" +
      "\n\007session\030\004 \001(\t\022\023\n\013response_id\030\001 \001(\t\022B\n\014" +
      "query_result\030\002 \001(\0132,.google.cloud.dialog" +
      "flow.v2beta1.QueryResult\022O\n\031alternative_" +
      "query_results\030\005 \003(\0132,.google.cloud.dialo" +
      "gflow.v2beta1.QueryResult\022d\n\036original_de" +
      "tect_intent_request\030\003 \001(\0132<.google.cloud" +
      ".dialogflow.v2beta1.OriginalDetectIntent" +
      "Request\"\311\003\n\017WebhookResponse\022\030\n\020fulfillme" +
      "nt_text\030\001 \001(\t\022M\n\024fulfillment_messages\030\002 " +
      "\003(\0132/.google.cloud.dialogflow.v2beta1.In" +
      "tent.Message\022\016\n\006source\030\003 \001(\t\022(\n\007payload\030" +
      "\004 \001(\0132\027.google.protobuf.Struct\022A\n\017output" +
      "_contexts\030\005 \003(\0132(.google.cloud.dialogflo" +
      "w.v2beta1.Context\022I\n\024followup_event_inpu" +
      "t\030\006 \001(\0132+.google.cloud.dialogflow.v2beta" +
      "1.EventInput\022\032\n\022live_agent_handoff\030\007 \001(\010" +
      "\022\027\n\017end_interaction\030\010 \001(\010\022P\n\024session_ent" +
      "ity_types\030\n \003(\01322.google.cloud.dialogflo" +
      "w.v2beta1.SessionEntityType\"h\n\033OriginalD" +
      "etectIntentRequest\022\016\n\006source\030\001 \001(\t\022\017\n\007ve" +
      "rsion\030\002 \001(\t\022(\n\007payload\030\003 \001(\0132\027.google.pr" +
      "otobuf.StructB\252\001\n#com.google.cloud.dialo" +
      "gflow.v2beta1B\014WebhookProtoP\001ZIgoogle.go" +
      "lang.org/genproto/googleapis/cloud/dialo" +
      "gflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Googl" +
      "e.Cloud.Dialogflow.V2beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor,
        new java.lang.String[] { "Session", "ResponseId", "QueryResult", "AlternativeQueryResults", "OriginalDetectIntentRequest", });
    internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor,
        new java.lang.String[] { "FulfillmentText", "FulfillmentMessages", "Source", "Payload", "OutputContexts", "FollowupEventInput", "LiveAgentHandoff", "EndInteraction", "SessionEntityTypes", });
    internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor,
        new java.lang.String[] { "Source", "Version", "Payload", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}