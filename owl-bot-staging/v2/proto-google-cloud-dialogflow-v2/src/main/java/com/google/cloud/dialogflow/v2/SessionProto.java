// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public final class SessionProto {
  private SessionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_TextInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_TextInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_EventInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EventInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Sentiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/v2/session.pro" +
      "to\022\032google.cloud.dialogflow.v2\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032-google/cloud/" +
      "dialogflow/v2/audio_config.proto\032(google" +
      "/cloud/dialogflow/v2/context.proto\032$goog" +
      "le/cloud/dialogflow/v2/gcs.proto\032\'google" +
      "/cloud/dialogflow/v2/intent.proto\0324googl" +
      "e/cloud/dialogflow/v2/session_entity_typ" +
      "e.proto\032\036google/protobuf/duration.proto\032" +
      " google/protobuf/field_mask.proto\032\034googl" +
      "e/protobuf/struct.proto\032\027google/rpc/stat" +
      "us.proto\032\030google/type/latlng.proto\"\365\002\n\023D" +
      "etectIntentRequest\022:\n\007session\030\001 \001(\tB)\340A\002" +
      "\372A#\n!dialogflow.googleapis.com/Session\022A" +
      "\n\014query_params\030\002 \001(\0132+.google.cloud.dial" +
      "ogflow.v2.QueryParameters\022@\n\013query_input" +
      "\030\003 \001(\0132&.google.cloud.dialogflow.v2.Quer" +
      "yInputB\003\340A\002\022J\n\023output_audio_config\030\004 \001(\013" +
      "2-.google.cloud.dialogflow.v2.OutputAudi" +
      "oConfig\022<\n\030output_audio_config_mask\030\007 \001(" +
      "\0132\032.google.protobuf.FieldMask\022\023\n\013input_a" +
      "udio\030\005 \001(\014\"\370\001\n\024DetectIntentResponse\022\023\n\013r" +
      "esponse_id\030\001 \001(\t\022=\n\014query_result\030\002 \001(\0132\'" +
      ".google.cloud.dialogflow.v2.QueryResult\022" +
      "*\n\016webhook_status\030\003 \001(\0132\022.google.rpc.Sta" +
      "tus\022\024\n\014output_audio\030\004 \001(\014\022J\n\023output_audi" +
      "o_config\030\006 \001(\0132-.google.cloud.dialogflow" +
      ".v2.OutputAudioConfig\"\215\004\n\017QueryParameter" +
      "s\022\021\n\ttime_zone\030\001 \001(\t\022)\n\014geo_location\030\002 \001" +
      "(\0132\023.google.type.LatLng\0225\n\010contexts\030\003 \003(" +
      "\0132#.google.cloud.dialogflow.v2.Context\022\026" +
      "\n\016reset_contexts\030\004 \001(\010\022K\n\024session_entity" +
      "_types\030\005 \003(\0132-.google.cloud.dialogflow.v" +
      "2.SessionEntityType\022(\n\007payload\030\006 \001(\0132\027.g" +
      "oogle.protobuf.Struct\022e\n!sentiment_analy" +
      "sis_request_config\030\n \001(\0132:.google.cloud." +
      "dialogflow.v2.SentimentAnalysisRequestCo" +
      "nfig\022X\n\017webhook_headers\030\016 \003(\0132?.google.c" +
      "loud.dialogflow.v2.QueryParameters.Webho" +
      "okHeadersEntry\0325\n\023WebhookHeadersEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\313\001\n\nQueryI" +
      "nput\022D\n\014audio_config\030\001 \001(\0132,.google.clou" +
      "d.dialogflow.v2.InputAudioConfigH\000\0225\n\004te" +
      "xt\030\002 \001(\0132%.google.cloud.dialogflow.v2.Te" +
      "xtInputH\000\0227\n\005event\030\003 \001(\0132&.google.cloud." +
      "dialogflow.v2.EventInputH\000B\007\n\005input\"\256\005\n\013" +
      "QueryResult\022\022\n\nquery_text\030\001 \001(\t\022\025\n\rlangu" +
      "age_code\030\017 \001(\t\022%\n\035speech_recognition_con" +
      "fidence\030\002 \001(\002\022\016\n\006action\030\003 \001(\t\022+\n\nparamet" +
      "ers\030\004 \001(\0132\027.google.protobuf.Struct\022#\n\033al" +
      "l_required_params_present\030\005 \001(\010\022\034\n\024cance" +
      "ls_slot_filling\030\025 \001(\010\022\030\n\020fulfillment_tex" +
      "t\030\006 \001(\t\022H\n\024fulfillment_messages\030\007 \003(\0132*." +
      "google.cloud.dialogflow.v2.Intent.Messag" +
      "e\022\026\n\016webhook_source\030\010 \001(\t\0220\n\017webhook_pay" +
      "load\030\t \001(\0132\027.google.protobuf.Struct\022<\n\017o" +
      "utput_contexts\030\n \003(\0132#.google.cloud.dial" +
      "ogflow.v2.Context\0222\n\006intent\030\013 \001(\0132\".goog" +
      "le.cloud.dialogflow.v2.Intent\022#\n\033intent_" +
      "detection_confidence\030\014 \001(\002\0220\n\017diagnostic" +
      "_info\030\016 \001(\0132\027.google.protobuf.Struct\022V\n\031" +
      "sentiment_analysis_result\030\021 \001(\01323.google" +
      ".cloud.dialogflow.v2.SentimentAnalysisRe" +
      "sult\"\234\003\n\034StreamingDetectIntentRequest\022:\n" +
      "\007session\030\001 \001(\tB)\340A\002\372A#\n!dialogflow.googl" +
      "eapis.com/Session\022A\n\014query_params\030\002 \001(\0132" +
      "+.google.cloud.dialogflow.v2.QueryParame" +
      "ters\022@\n\013query_input\030\003 \001(\0132&.google.cloud" +
      ".dialogflow.v2.QueryInputB\003\340A\002\022\034\n\020single" +
      "_utterance\030\004 \001(\010B\002\030\001\022J\n\023output_audio_con" +
      "fig\030\005 \001(\0132-.google.cloud.dialogflow.v2.O" +
      "utputAudioConfig\022<\n\030output_audio_config_" +
      "mask\030\007 \001(\0132\032.google.protobuf.FieldMask\022\023" +
      "\n\013input_audio\030\006 \001(\014\"\325\002\n\035StreamingDetectI" +
      "ntentResponse\022\023\n\013response_id\030\001 \001(\t\022R\n\022re" +
      "cognition_result\030\002 \001(\01326.google.cloud.di" +
      "alogflow.v2.StreamingRecognitionResult\022=" +
      "\n\014query_result\030\003 \001(\0132\'.google.cloud.dial" +
      "ogflow.v2.QueryResult\022*\n\016webhook_status\030" +
      "\004 \001(\0132\022.google.rpc.Status\022\024\n\014output_audi" +
      "o\030\005 \001(\014\022J\n\023output_audio_config\030\006 \001(\0132-.g" +
      "oogle.cloud.dialogflow.v2.OutputAudioCon" +
      "fig\"\235\003\n\032StreamingRecognitionResult\022X\n\014me" +
      "ssage_type\030\001 \001(\0162B.google.cloud.dialogfl" +
      "ow.v2.StreamingRecognitionResult.Message" +
      "Type\022\022\n\ntranscript\030\002 \001(\t\022\020\n\010is_final\030\003 \001" +
      "(\010\022\022\n\nconfidence\030\004 \001(\002\022D\n\020speech_word_in" +
      "fo\030\007 \003(\0132*.google.cloud.dialogflow.v2.Sp" +
      "eechWordInfo\0224\n\021speech_end_offset\030\010 \001(\0132" +
      "\031.google.protobuf.Duration\022\025\n\rlanguage_c" +
      "ode\030\n \001(\t\"X\n\013MessageType\022\034\n\030MESSAGE_TYPE" +
      "_UNSPECIFIED\020\000\022\016\n\nTRANSCRIPT\020\001\022\033\n\027END_OF" +
      "_SINGLE_UTTERANCE\020\002\":\n\tTextInput\022\021\n\004text" +
      "\030\001 \001(\tB\003\340A\002\022\032\n\rlanguage_code\030\002 \001(\tB\003\340A\002\"" +
      "h\n\nEventInput\022\021\n\004name\030\001 \001(\tB\003\340A\002\022+\n\npara" +
      "meters\030\002 \001(\0132\027.google.protobuf.Struct\022\032\n" +
      "\rlanguage_code\030\003 \001(\tB\003\340A\002\"F\n\036SentimentAn" +
      "alysisRequestConfig\022$\n\034analyze_query_tex" +
      "t_sentiment\030\001 \001(\010\"^\n\027SentimentAnalysisRe" +
      "sult\022C\n\024query_text_sentiment\030\001 \001(\0132%.goo" +
      "gle.cloud.dialogflow.v2.Sentiment\"-\n\tSen" +
      "timent\022\r\n\005score\030\001 \001(\002\022\021\n\tmagnitude\030\002 \001(\002" +
      "2\345\005\n\010Sessions\022\311\003\n\014DetectIntent\022/.google." +
      "cloud.dialogflow.v2.DetectIntentRequest\032" +
      "0.google.cloud.dialogflow.v2.DetectInten" +
      "tResponse\"\325\002\202\323\344\223\002\270\002\"6/v2/{session=projec" +
      "ts/*/agent/sessions/*}:detectIntent:\001*ZR" +
      "\"M/v2/{session=projects/*/agent/environm" +
      "ents/*/users/*/sessions/*}:detectIntent:" +
      "\001*ZG\"B/v2/{session=projects/*/locations/" +
      "*/agent/sessions/*}:detectIntent:\001*Z^\"Y/" +
      "v2/{session=projects/*/locations/*/agent" +
      "/environments/*/users/*/sessions/*}:dete" +
      "ctIntent:\001*\332A\023session,query_input\022\222\001\n\025St" +
      "reamingDetectIntent\0228.google.cloud.dialo" +
      "gflow.v2.StreamingDetectIntentRequest\0329." +
      "google.cloud.dialogflow.v2.StreamingDete" +
      "ctIntentResponse\"\000(\0010\001\032x\312A\031dialogflow.go" +
      "ogleapis.com\322AYhttps://www.googleapis.co" +
      "m/auth/cloud-platform,https://www.google" +
      "apis.com/auth/dialogflowB\360\003\n\036com.google." +
      "cloud.dialogflow.v2B\014SessionProtoP\001ZDgoo" +
      "gle.golang.org/genproto/googleapis/cloud" +
      "/dialogflow/v2;dialogflow\370\001\001\242\002\002DF\252\002\032Goog" +
      "le.Cloud.Dialogflow.V2\352A\321\002\n!dialogflow.g" +
      "oogleapis.com/Session\022+projects/{project" +
      "}/agent/sessions/{session}\022Sprojects/{pr" +
      "oject}/agent/environments/{environment}/" +
      "users/{user}/sessions/{session}\022@project" +
      "s/{project}/locations/{location}/agent/s" +
      "essions/{session}\022hprojects/{project}/lo" +
      "cations/{location}/agent/environments/{e" +
      "nvironment}/users/{user}/sessions/{sessi" +
      "on}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.GcsProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor,
        new java.lang.String[] { "Session", "QueryParams", "QueryInput", "OutputAudioConfig", "OutputAudioConfigMask", "InputAudio", });
    internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor,
        new java.lang.String[] { "ResponseId", "QueryResult", "WebhookStatus", "OutputAudio", "OutputAudioConfig", });
    internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_QueryParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor,
        new java.lang.String[] { "TimeZone", "GeoLocation", "Contexts", "ResetContexts", "SessionEntityTypes", "Payload", "SentimentAnalysisRequestConfig", "WebhookHeaders", });
    internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_descriptor =
      internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_QueryParameters_WebhookHeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_QueryInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor,
        new java.lang.String[] { "AudioConfig", "Text", "Event", "Input", });
    internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_QueryResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor,
        new java.lang.String[] { "QueryText", "LanguageCode", "SpeechRecognitionConfidence", "Action", "Parameters", "AllRequiredParamsPresent", "CancelsSlotFilling", "FulfillmentText", "FulfillmentMessages", "WebhookSource", "WebhookPayload", "OutputContexts", "Intent", "IntentDetectionConfidence", "DiagnosticInfo", "SentimentAnalysisResult", });
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor,
        new java.lang.String[] { "Session", "QueryParams", "QueryInput", "SingleUtterance", "OutputAudioConfig", "OutputAudioConfigMask", "InputAudio", });
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor,
        new java.lang.String[] { "ResponseId", "RecognitionResult", "QueryResult", "WebhookStatus", "OutputAudio", "OutputAudioConfig", });
    internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor,
        new java.lang.String[] { "MessageType", "Transcript", "IsFinal", "Confidence", "SpeechWordInfo", "SpeechEndOffset", "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2_TextInput_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_TextInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_TextInput_descriptor,
        new java.lang.String[] { "Text", "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2_EventInput_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_EventInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_EventInput_descriptor,
        new java.lang.String[] { "Name", "Parameters", "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor,
        new java.lang.String[] { "AnalyzeQueryTextSentiment", });
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor,
        new java.lang.String[] { "QueryTextSentiment", });
    internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_Sentiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor,
        new java.lang.String[] { "Score", "Magnitude", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2.GcsProto.getDescriptor();
    com.google.cloud.dialogflow.v2.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
