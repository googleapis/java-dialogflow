// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public final class AudioConfigProto {
  private AudioConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2/audio_confi" +
      "g.proto\022\032google.cloud.dialogflow.v2\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\036google/protobuf/duratio" +
      "n.proto\032\037google/protobuf/timestamp.proto" +
      "\032\034google/api/annotations.proto\"/\n\rSpeech" +
      "Context\022\017\n\007phrases\030\001 \003(\t\022\r\n\005boost\030\002 \001(\002\"" +
      "\222\001\n\016SpeechWordInfo\022\014\n\004word\030\003 \001(\t\022/\n\014star" +
      "t_offset\030\001 \001(\0132\031.google.protobuf.Duratio" +
      "n\022-\n\nend_offset\030\002 \001(\0132\031.google.protobuf." +
      "Duration\022\022\n\nconfidence\030\004 \001(\002\"\233\003\n\020InputAu" +
      "dioConfig\022A\n\016audio_encoding\030\001 \001(\0162).goog" +
      "le.cloud.dialogflow.v2.AudioEncoding\022\031\n\021" +
      "sample_rate_hertz\030\002 \001(\005\022\025\n\rlanguage_code" +
      "\030\003 \001(\t\022\030\n\020enable_word_info\030\r \001(\010\022\030\n\014phra" +
      "se_hints\030\004 \003(\tB\002\030\001\022B\n\017speech_contexts\030\013 " +
      "\003(\0132).google.cloud.dialogflow.v2.SpeechC" +
      "ontext\022\r\n\005model\030\007 \001(\t\022E\n\rmodel_variant\030\n" +
      " \001(\0162..google.cloud.dialogflow.v2.Speech" +
      "ModelVariant\022\030\n\020single_utterance\030\010 \001(\010\022*" +
      "\n\"disable_no_speech_recognized_event\030\016 \001" +
      "(\010\"f\n\024VoiceSelectionParams\022\014\n\004name\030\001 \001(\t" +
      "\022@\n\013ssml_gender\030\002 \001(\0162+.google.cloud.dia" +
      "logflow.v2.SsmlVoiceGender\"\263\001\n\026Synthesiz" +
      "eSpeechConfig\022\025\n\rspeaking_rate\030\001 \001(\001\022\r\n\005" +
      "pitch\030\002 \001(\001\022\026\n\016volume_gain_db\030\003 \001(\001\022\032\n\022e" +
      "ffects_profile_id\030\005 \003(\t\022?\n\005voice\030\004 \001(\01320" +
      ".google.cloud.dialogflow.v2.VoiceSelecti" +
      "onParams\"\322\001\n\021OutputAudioConfig\022L\n\016audio_" +
      "encoding\030\001 \001(\0162/.google.cloud.dialogflow" +
      ".v2.OutputAudioEncodingB\003\340A\002\022\031\n\021sample_r" +
      "ate_hertz\030\002 \001(\005\022T\n\030synthesize_speech_con" +
      "fig\030\003 \001(\01322.google.cloud.dialogflow.v2.S" +
      "ynthesizeSpeechConfig\"g\n\022SpeechToTextCon" +
      "fig\022Q\n\024speech_model_variant\030\001 \001(\0162..goog" +
      "le.cloud.dialogflow.v2.SpeechModelVarian" +
      "tB\003\340A\001*\373\001\n\rAudioEncoding\022\036\n\032AUDIO_ENCODI" +
      "NG_UNSPECIFIED\020\000\022\034\n\030AUDIO_ENCODING_LINEA" +
      "R_16\020\001\022\027\n\023AUDIO_ENCODING_FLAC\020\002\022\030\n\024AUDIO" +
      "_ENCODING_MULAW\020\003\022\026\n\022AUDIO_ENCODING_AMR\020" +
      "\004\022\031\n\025AUDIO_ENCODING_AMR_WB\020\005\022\033\n\027AUDIO_EN" +
      "CODING_OGG_OPUS\020\006\022)\n%AUDIO_ENCODING_SPEE" +
      "X_WITH_HEADER_BYTE\020\007*v\n\022SpeechModelVaria" +
      "nt\022$\n SPEECH_MODEL_VARIANT_UNSPECIFIED\020\000" +
      "\022\026\n\022USE_BEST_AVAILABLE\020\001\022\020\n\014USE_STANDARD" +
      "\020\002\022\020\n\014USE_ENHANCED\020\003*\215\001\n\017SsmlVoiceGender" +
      "\022!\n\035SSML_VOICE_GENDER_UNSPECIFIED\020\000\022\032\n\026S" +
      "SML_VOICE_GENDER_MALE\020\001\022\034\n\030SSML_VOICE_GE" +
      "NDER_FEMALE\020\002\022\035\n\031SSML_VOICE_GENDER_NEUTR" +
      "AL\020\003*\354\001\n\023OutputAudioEncoding\022%\n!OUTPUT_A" +
      "UDIO_ENCODING_UNSPECIFIED\020\000\022#\n\037OUTPUT_AU" +
      "DIO_ENCODING_LINEAR_16\020\001\022\035\n\031OUTPUT_AUDIO" +
      "_ENCODING_MP3\020\002\022%\n!OUTPUT_AUDIO_ENCODING" +
      "_MP3_64_KBPS\020\004\022\"\n\036OUTPUT_AUDIO_ENCODING_" +
      "OGG_OPUS\020\003\022\037\n\033OUTPUT_AUDIO_ENCODING_MULA" +
      "W\020\005B\237\001\n\036com.google.cloud.dialogflow.v2B\020" +
      "AudioConfigProtoP\001ZDgoogle.golang.org/ge" +
      "nproto/googleapis/cloud/dialogflow/v2;di" +
      "alogflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogfl" +
      "ow.V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_SpeechContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor,
        new java.lang.String[] { "Phrases", "Boost", });
    internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor,
        new java.lang.String[] { "Word", "StartOffset", "EndOffset", "Confidence", });
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor,
        new java.lang.String[] { "AudioEncoding", "SampleRateHertz", "LanguageCode", "EnableWordInfo", "PhraseHints", "SpeechContexts", "Model", "ModelVariant", "SingleUtterance", "DisableNoSpeechRecognizedEvent", });
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor,
        new java.lang.String[] { "Name", "SsmlGender", });
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor,
        new java.lang.String[] { "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice", });
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor,
        new java.lang.String[] { "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig", });
    internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor,
        new java.lang.String[] { "SpeechModelVariant", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
