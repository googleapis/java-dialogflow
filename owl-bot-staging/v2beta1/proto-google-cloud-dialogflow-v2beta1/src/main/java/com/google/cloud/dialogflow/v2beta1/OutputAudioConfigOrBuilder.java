// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

public interface OutputAudioConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.OutputAudioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Audio encoding of the synthesized audio content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioEncoding audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for audioEncoding.
   */
  int getAudioEncodingValue();
  /**
   * <pre>
   * Required. Audio encoding of the synthesized audio content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioEncoding audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The audioEncoding.
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioEncoding getAudioEncoding();

  /**
   * <pre>
   * The synthesis sample rate (in hertz) for this audio. If not
   * provided, then the synthesizer will use the default sample rate based on
   * the audio encoding. If this is different from the voice's natural sample
   * rate, then the synthesizer will honor this request by converting to the
   * desired sample rate (which might result in worse audio quality).
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   * <pre>
   * Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   * @return Whether the synthesizeSpeechConfig field is set.
   */
  boolean hasSynthesizeSpeechConfig();
  /**
   * <pre>
   * Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   * @return The synthesizeSpeechConfig.
   */
  com.google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig getSynthesizeSpeechConfig();
  /**
   * <pre>
   * Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SynthesizeSpeechConfigOrBuilder getSynthesizeSpeechConfigOrBuilder();
}
