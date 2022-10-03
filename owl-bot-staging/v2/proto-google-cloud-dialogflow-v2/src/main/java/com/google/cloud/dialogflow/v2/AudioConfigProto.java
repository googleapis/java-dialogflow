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
      "n.proto\"/\n\rSpeechContext\022\017\n\007phrases\030\001 \003(" +
      "\t\022\r\n\005boost\030\002 \001(\002\"\222\001\n\016SpeechWordInfo\022\014\n\004w" +
      "ord\030\003 \001(\t\022/\n\014start_offset\030\001 \001(\0132\031.google" +
      ".protobuf.Duration\022-\n\nend_offset\030\002 \001(\0132\031" +
      ".google.protobuf.Duration\022\022\n\nconfidence\030" +
      "\004 \001(\002\"\233\003\n\020InputAudioConfig\022A\n\016audio_enco" +
      "ding\030\001 \001(\0162).google.cloud.dialogflow.v2." +
      "AudioEncoding\022\031\n\021sample_rate_hertz\030\002 \001(\005" +
      "\022\025\n\rlanguage_code\030\003 \001(\t\022\030\n\020enable_word_i" +
      "nfo\030\r \001(\010\022\030\n\014phrase_hints\030\004 \003(\tB\002\030\001\022B\n\017s" +
      "peech_contexts\030\013 \003(\0132).google.cloud.dial" +
      "ogflow.v2.SpeechContext\022\r\n\005model\030\007 \001(\t\022E" +
      "\n\rmodel_variant\030\n \001(\0162..google.cloud.dia" +
      "logflow.v2.SpeechModelVariant\022\030\n\020single_" +
      "utterance\030\010 \001(\010\022*\n\"disable_no_speech_rec" +
      "ognized_event\030\016 \001(\010\"f\n\024VoiceSelectionPar" +
      "ams\022\014\n\004name\030\001 \001(\t\022@\n\013ssml_gender\030\002 \001(\0162+" +
      ".google.cloud.dialogflow.v2.SsmlVoiceGen" +
      "der\"\263\001\n\026SynthesizeSpeechConfig\022\025\n\rspeaki" +
      "ng_rate\030\001 \001(\001\022\r\n\005pitch\030\002 \001(\001\022\026\n\016volume_g" +
      "ain_db\030\003 \001(\001\022\032\n\022effects_profile_id\030\005 \003(\t" +
      "\022?\n\005voice\030\004 \001(\01320.google.cloud.dialogflo" +
      "w.v2.VoiceSelectionParams\"\322\001\n\021OutputAudi" +
      "oConfig\022L\n\016audio_encoding\030\001 \001(\0162/.google" +
      ".cloud.dialogflow.v2.OutputAudioEncoding" +
      "B\003\340A\002\022\031\n\021sample_rate_hertz\030\002 \001(\005\022T\n\030synt" +
      "hesize_speech_config\030\003 \001(\01322.google.clou" +
      "d.dialogflow.v2.SynthesizeSpeechConfig\"b" +
      "\n\022SpeechToTextConfig\022L\n\024speech_model_var" +
      "iant\030\001 \001(\0162..google.cloud.dialogflow.v2." +
      "SpeechModelVariant*\373\001\n\rAudioEncoding\022\036\n\032" +
      "AUDIO_ENCODING_UNSPECIFIED\020\000\022\034\n\030AUDIO_EN" +
      "CODING_LINEAR_16\020\001\022\027\n\023AUDIO_ENCODING_FLA" +
      "C\020\002\022\030\n\024AUDIO_ENCODING_MULAW\020\003\022\026\n\022AUDIO_E" +
      "NCODING_AMR\020\004\022\031\n\025AUDIO_ENCODING_AMR_WB\020\005" +
      "\022\033\n\027AUDIO_ENCODING_OGG_OPUS\020\006\022)\n%AUDIO_E" +
      "NCODING_SPEEX_WITH_HEADER_BYTE\020\007*v\n\022Spee" +
      "chModelVariant\022$\n SPEECH_MODEL_VARIANT_U" +
      "NSPECIFIED\020\000\022\026\n\022USE_BEST_AVAILABLE\020\001\022\020\n\014" +
      "USE_STANDARD\020\002\022\020\n\014USE_ENHANCED\020\003*\215\001\n\017Ssm" +
      "lVoiceGender\022!\n\035SSML_VOICE_GENDER_UNSPEC" +
      "IFIED\020\000\022\032\n\026SSML_VOICE_GENDER_MALE\020\001\022\034\n\030S" +
      "SML_VOICE_GENDER_FEMALE\020\002\022\035\n\031SSML_VOICE_" +
      "GENDER_NEUTRAL\020\003*\354\001\n\023OutputAudioEncoding" +
      "\022%\n!OUTPUT_AUDIO_ENCODING_UNSPECIFIED\020\000\022" +
      "#\n\037OUTPUT_AUDIO_ENCODING_LINEAR_16\020\001\022\035\n\031" +
      "OUTPUT_AUDIO_ENCODING_MP3\020\002\022%\n!OUTPUT_AU" +
      "DIO_ENCODING_MP3_64_KBPS\020\004\022\"\n\036OUTPUT_AUD" +
      "IO_ENCODING_OGG_OPUS\020\003\022\037\n\033OUTPUT_AUDIO_E" +
      "NCODING_MULAW\020\005B\334\002\n\036com.google.cloud.dia" +
      "logflow.v2B\020AudioConfigProtoP\001ZDgoogle.g" +
      "olang.org/genproto/googleapis/cloud/dial" +
      "ogflow/v2;dialogflow\370\001\001\242\002\002DF\252\002\032Google.Cl" +
      "oud.Dialogflow.V2\352AU\n\033automl.googleapis." +
      "com/Model\0226projects/{project}/locations/" +
      "{location}/models/{model}\352Ab\n\037speech.goo" +
      "gleapis.com/PhraseSet\022?projects/{project" +
      "}/locations/{location}/phraseSets/{phras" +
      "e_set}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
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
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
