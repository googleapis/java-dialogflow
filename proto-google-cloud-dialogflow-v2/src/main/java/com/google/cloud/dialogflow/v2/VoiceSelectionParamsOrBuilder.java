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

public interface VoiceSelectionParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.VoiceSelectionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The name of the voice. If not set, the service will choose a
   * voice based on the other parameters such as language_code and
   * [ssml_gender][google.cloud.dialogflow.v2.VoiceSelectionParams.ssml_gender].
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. The name of the voice. If not set, the service will choose a
   * voice based on the other parameters such as language_code and
   * [ssml_gender][google.cloud.dialogflow.v2.VoiceSelectionParams.ssml_gender].
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The preferred gender of the voice. If not set, the service will
   * choose a voice based on the other parameters such as language_code and
   * [name][google.cloud.dialogflow.v2.VoiceSelectionParams.name]. Note that this is only a preference, not requirement. If a
   * voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SsmlVoiceGender ssml_gender = 2;</code>
   */
  int getSsmlGenderValue();
  /**
   *
   *
   * <pre>
   * Optional. The preferred gender of the voice. If not set, the service will
   * choose a voice based on the other parameters such as language_code and
   * [name][google.cloud.dialogflow.v2.VoiceSelectionParams.name]. Note that this is only a preference, not requirement. If a
   * voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SsmlVoiceGender ssml_gender = 2;</code>
   */
  com.google.cloud.dialogflow.v2.SsmlVoiceGender getSsmlGender();
}
