// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/webhook.proto

package com.google.cloud.dialogflow.v2;

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
    internal_static_google_cloud_dialogflow_v2_WebhookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_WebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_WebhookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_WebhookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/v2/webhook.pro" +
      "to\022\032google.cloud.dialogflow.v2\032(google/c" +
      "loud/dialogflow/v2/context.proto\032\'google" +
      "/cloud/dialogflow/v2/intent.proto\032(googl" +
      "e/cloud/dialogflow/v2/session.proto\0324goo" +
      "gle/cloud/dialogflow/v2/session_entity_t" +
      "ype.proto\032\034google/protobuf/struct.proto\"" +
      "\326\001\n\016WebhookRequest\022\017\n\007session\030\004 \001(\t\022\023\n\013r" +
      "esponse_id\030\001 \001(\t\022=\n\014query_result\030\002 \001(\0132\'" +
      ".google.cloud.dialogflow.v2.QueryResult\022" +
      "_\n\036original_detect_intent_request\030\003 \001(\0132" +
      "7.google.cloud.dialogflow.v2.OriginalDet" +
      "ectIntentRequest\"\200\003\n\017WebhookResponse\022\030\n\020" +
      "fulfillment_text\030\001 \001(\t\022H\n\024fulfillment_me" +
      "ssages\030\002 \003(\0132*.google.cloud.dialogflow.v" +
      "2.Intent.Message\022\016\n\006source\030\003 \001(\t\022(\n\007payl" +
      "oad\030\004 \001(\0132\027.google.protobuf.Struct\022<\n\017ou" +
      "tput_contexts\030\005 \003(\0132#.google.cloud.dialo" +
      "gflow.v2.Context\022D\n\024followup_event_input" +
      "\030\006 \001(\0132&.google.cloud.dialogflow.v2.Even" +
      "tInput\022K\n\024session_entity_types\030\n \003(\0132-.g" +
      "oogle.cloud.dialogflow.v2.SessionEntityT" +
      "ype\"h\n\033OriginalDetectIntentRequest\022\016\n\006so" +
      "urce\030\001 \001(\t\022\017\n\007version\030\002 \001(\t\022(\n\007payload\030\003" +
      " \001(\0132\027.google.protobuf.StructB\225\001\n\036com.go" +
      "ogle.cloud.dialogflow.v2B\014WebhookProtoP\001" +
      "Z>cloud.google.com/go/dialogflow/apiv2/d" +
      "ialogflowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\032Googl" +
      "e.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.dialogflow.v2.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.SessionProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2_WebhookRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_WebhookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_WebhookRequest_descriptor,
        new java.lang.String[] { "Session", "ResponseId", "QueryResult", "OriginalDetectIntentRequest", });
    internal_static_google_cloud_dialogflow_v2_WebhookResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_WebhookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_WebhookResponse_descriptor,
        new java.lang.String[] { "FulfillmentText", "FulfillmentMessages", "Source", "Payload", "OutputContexts", "FollowupEventInput", "SessionEntityTypes", });
    internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_OriginalDetectIntentRequest_descriptor,
        new java.lang.String[] { "Source", "Version", "Payload", });
    com.google.cloud.dialogflow.v2.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2.SessionProto.getDescriptor();
    com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
