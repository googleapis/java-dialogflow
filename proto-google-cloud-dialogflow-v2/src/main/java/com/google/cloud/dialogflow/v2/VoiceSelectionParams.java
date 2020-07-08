/*
 * Copyright 2020 Google LLC
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

/**
 *
 *
 * <pre>
 * Description of which voice to use for speech synthesis.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.VoiceSelectionParams}
 */
public final class VoiceSelectionParams extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.VoiceSelectionParams)
    VoiceSelectionParamsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VoiceSelectionParams.newBuilder() to construct.
  private VoiceSelectionParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VoiceSelectionParams() {
    name_ = "";
    ssmlGender_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VoiceSelectionParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VoiceSelectionParams(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              ssmlGender_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.VoiceSelectionParams.class,
            com.google.cloud.dialogflow.v2.VoiceSelectionParams.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
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
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
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
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSML_GENDER_FIELD_NUMBER = 2;
  private int ssmlGender_;
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
   *
   * @return The enum numeric value on the wire for ssmlGender.
   */
  @java.lang.Override
  public int getSsmlGenderValue() {
    return ssmlGender_;
  }
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
   *
   * @return The ssmlGender.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SsmlVoiceGender getSsmlGender() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2.SsmlVoiceGender result =
        com.google.cloud.dialogflow.v2.SsmlVoiceGender.valueOf(ssmlGender_);
    return result == null ? com.google.cloud.dialogflow.v2.SsmlVoiceGender.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (ssmlGender_
        != com.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, ssmlGender_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (ssmlGender_
        != com.google.cloud.dialogflow.v2.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, ssmlGender_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.v2.VoiceSelectionParams)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.VoiceSelectionParams other =
        (com.google.cloud.dialogflow.v2.VoiceSelectionParams) obj;

    if (!getName().equals(other.getName())) return false;
    if (ssmlGender_ != other.ssmlGender_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SSML_GENDER_FIELD_NUMBER;
    hash = (53 * hash) + ssmlGender_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.VoiceSelectionParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Description of which voice to use for speech synthesis.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.VoiceSelectionParams}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.VoiceSelectionParams)
      com.google.cloud.dialogflow.v2.VoiceSelectionParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.VoiceSelectionParams.class,
              com.google.cloud.dialogflow.v2.VoiceSelectionParams.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.VoiceSelectionParams.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      ssmlGender_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.VoiceSelectionParams getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.VoiceSelectionParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.VoiceSelectionParams build() {
      com.google.cloud.dialogflow.v2.VoiceSelectionParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.VoiceSelectionParams buildPartial() {
      com.google.cloud.dialogflow.v2.VoiceSelectionParams result =
          new com.google.cloud.dialogflow.v2.VoiceSelectionParams(this);
      result.name_ = name_;
      result.ssmlGender_ = ssmlGender_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.VoiceSelectionParams) {
        return mergeFrom((com.google.cloud.dialogflow.v2.VoiceSelectionParams) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.VoiceSelectionParams other) {
      if (other == com.google.cloud.dialogflow.v2.VoiceSelectionParams.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.ssmlGender_ != 0) {
        setSsmlGenderValue(other.getSsmlGenderValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.dialogflow.v2.VoiceSelectionParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.VoiceSelectionParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
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
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
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
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
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
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
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
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int ssmlGender_ = 0;
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
     *
     * @return The enum numeric value on the wire for ssmlGender.
     */
    @java.lang.Override
    public int getSsmlGenderValue() {
      return ssmlGender_;
    }
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
     *
     * @param value The enum numeric value on the wire for ssmlGender to set.
     * @return This builder for chaining.
     */
    public Builder setSsmlGenderValue(int value) {

      ssmlGender_ = value;
      onChanged();
      return this;
    }
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
     *
     * @return The ssmlGender.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SsmlVoiceGender getSsmlGender() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2.SsmlVoiceGender result =
          com.google.cloud.dialogflow.v2.SsmlVoiceGender.valueOf(ssmlGender_);
      return result == null ? com.google.cloud.dialogflow.v2.SsmlVoiceGender.UNRECOGNIZED : result;
    }
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
     *
     * @param value The ssmlGender to set.
     * @return This builder for chaining.
     */
    public Builder setSsmlGender(com.google.cloud.dialogflow.v2.SsmlVoiceGender value) {
      if (value == null) {
        throw new NullPointerException();
      }

      ssmlGender_ = value.getNumber();
      onChanged();
      return this;
    }
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
     *
     * @return This builder for chaining.
     */
    public Builder clearSsmlGender() {

      ssmlGender_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.VoiceSelectionParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.VoiceSelectionParams)
  private static final com.google.cloud.dialogflow.v2.VoiceSelectionParams DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.VoiceSelectionParams();
  }

  public static com.google.cloud.dialogflow.v2.VoiceSelectionParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoiceSelectionParams> PARSER =
      new com.google.protobuf.AbstractParser<VoiceSelectionParams>() {
        @java.lang.Override
        public VoiceSelectionParams parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VoiceSelectionParams(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VoiceSelectionParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoiceSelectionParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.VoiceSelectionParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
