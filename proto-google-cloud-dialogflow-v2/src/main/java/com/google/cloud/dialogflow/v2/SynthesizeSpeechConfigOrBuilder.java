/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public interface SynthesizeSpeechConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SynthesizeSpeechConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the normal
   * native speed supported by the specific voice. 2.0 is twice as fast, and
   * 0.5 is half as fast. If unset(0.0), defaults to the native 1.0 speed. Any
   * other values &lt; 0.25 or &gt; 4.0 will return an error.
   * </pre>
   *
   * <code>double speaking_rate = 1;</code>
   *
   * @return The speakingRate.
   */
  double getSpeakingRate();

  /**
   *
   *
   * <pre>
   * Optional. Speaking pitch, in the range [-20.0, 20.0]. 20 means increase 20
   * semitones from the original pitch. -20 means decrease 20 semitones from the
   * original pitch.
   * </pre>
   *
   * <code>double pitch = 2;</code>
   *
   * @return The pitch.
   */
  double getPitch();

  /**
   *
   *
   * <pre>
   * Optional. Volume gain (in dB) of the normal native volume supported by the
   * specific voice, in the range [-96.0, 16.0]. If unset, or set to a value of
   * 0.0 (dB), will play at normal native signal amplitude. A value of -6.0 (dB)
   * will play at approximately half the amplitude of the normal native signal
   * amplitude. A value of +6.0 (dB) will play at approximately twice the
   * amplitude of the normal native signal amplitude. We strongly recommend not
   * to exceed +10 (dB) as there's usually no effective increase in loudness for
   * any value greater than that.
   * </pre>
   *
   * <code>double volume_gain_db = 3;</code>
   *
   * @return The volumeGainDb.
   */
  double getVolumeGainDb();

  /**
   *
   *
   * <pre>
   * Optional. An identifier which selects 'audio effects' profiles that are
   * applied on (post synthesized) text to speech. Effects are applied on top of
   * each other in the order they are given.
   * </pre>
   *
   * <code>repeated string effects_profile_id = 5;</code>
   *
   * @return A list containing the effectsProfileId.
   */
  java.util.List<java.lang.String> getEffectsProfileIdList();
  /**
   *
   *
   * <pre>
   * Optional. An identifier which selects 'audio effects' profiles that are
   * applied on (post synthesized) text to speech. Effects are applied on top of
   * each other in the order they are given.
   * </pre>
   *
   * <code>repeated string effects_profile_id = 5;</code>
   *
   * @return The count of effectsProfileId.
   */
  int getEffectsProfileIdCount();
  /**
   *
   *
   * <pre>
   * Optional. An identifier which selects 'audio effects' profiles that are
   * applied on (post synthesized) text to speech. Effects are applied on top of
   * each other in the order they are given.
   * </pre>
   *
   * <code>repeated string effects_profile_id = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The effectsProfileId at the given index.
   */
  java.lang.String getEffectsProfileId(int index);
  /**
   *
   *
   * <pre>
   * Optional. An identifier which selects 'audio effects' profiles that are
   * applied on (post synthesized) text to speech. Effects are applied on top of
   * each other in the order they are given.
   * </pre>
   *
   * <code>repeated string effects_profile_id = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the effectsProfileId at the given index.
   */
  com.google.protobuf.ByteString getEffectsProfileIdBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.VoiceSelectionParams voice = 4;</code>
   *
   * @return Whether the voice field is set.
   */
  boolean hasVoice();
  /**
   *
   *
   * <pre>
   * Optional. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.VoiceSelectionParams voice = 4;</code>
   *
   * @return The voice.
   */
  com.google.cloud.dialogflow.v2.VoiceSelectionParams getVoice();
  /**
   *
   *
   * <pre>
   * Optional. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.VoiceSelectionParams voice = 4;</code>
   */
  com.google.cloud.dialogflow.v2.VoiceSelectionParamsOrBuilder getVoiceOrBuilder();
}
