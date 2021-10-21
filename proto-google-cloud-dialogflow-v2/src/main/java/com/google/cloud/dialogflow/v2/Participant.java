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
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Represents a conversation participant (human agent, virtual agent, end-user).
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.Participant}
 */
public final class Participant extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.Participant)
    ParticipantOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Participant.newBuilder() to construct.
  private Participant(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Participant() {
    name_ = "";
    role_ = 0;
    sipRecordingMediaLabel_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Participant();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Participant(
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

              role_ = rawValue;
              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              sipRecordingMediaLabel_ = s;
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
    return com.google.cloud.dialogflow.v2.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2_Participant_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2_Participant_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.Participant.class,
            com.google.cloud.dialogflow.v2.Participant.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enumeration of the roles a participant can play in a conversation.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.v2.Participant.Role}
   */
  public enum Role implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Participant role not set.
     * </pre>
     *
     * <code>ROLE_UNSPECIFIED = 0;</code>
     */
    ROLE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Participant is a human agent.
     * </pre>
     *
     * <code>HUMAN_AGENT = 1;</code>
     */
    HUMAN_AGENT(1),
    /**
     *
     *
     * <pre>
     * Participant is an automated agent, such as a Dialogflow agent.
     * </pre>
     *
     * <code>AUTOMATED_AGENT = 2;</code>
     */
    AUTOMATED_AGENT(2),
    /**
     *
     *
     * <pre>
     * Participant is an end user that has called or chatted with
     * Dialogflow services.
     * </pre>
     *
     * <code>END_USER = 3;</code>
     */
    END_USER(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Participant role not set.
     * </pre>
     *
     * <code>ROLE_UNSPECIFIED = 0;</code>
     */
    public static final int ROLE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Participant is a human agent.
     * </pre>
     *
     * <code>HUMAN_AGENT = 1;</code>
     */
    public static final int HUMAN_AGENT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Participant is an automated agent, such as a Dialogflow agent.
     * </pre>
     *
     * <code>AUTOMATED_AGENT = 2;</code>
     */
    public static final int AUTOMATED_AGENT_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Participant is an end user that has called or chatted with
     * Dialogflow services.
     * </pre>
     *
     * <code>END_USER = 3;</code>
     */
    public static final int END_USER_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Role valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Role forNumber(int value) {
      switch (value) {
        case 0:
          return ROLE_UNSPECIFIED;
        case 1:
          return HUMAN_AGENT;
        case 2:
          return AUTOMATED_AGENT;
        case 3:
          return END_USER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Role> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Role> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Role>() {
          public Role findValueByNumber(int number) {
            return Role.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.Participant.getDescriptor().getEnumTypes().get(0);
    }

    private static final Role[] VALUES = values();

    public static Role valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Role(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2.Participant.Role)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Optional. The unique identifier of this participant.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. The unique identifier of this participant.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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

  public static final int ROLE_FIELD_NUMBER = 2;
  private int role_;
  /**
   *
   *
   * <pre>
   * Immutable. The role this participant plays in the conversation. This field must be set
   * during participant creation and is then immutable.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for role.
   */
  @java.lang.Override
  public int getRoleValue() {
    return role_;
  }
  /**
   *
   *
   * <pre>
   * Immutable. The role this participant plays in the conversation. This field must be set
   * during participant creation and is then immutable.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The role.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Participant.Role getRole() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2.Participant.Role result =
        com.google.cloud.dialogflow.v2.Participant.Role.valueOf(role_);
    return result == null ? com.google.cloud.dialogflow.v2.Participant.Role.UNRECOGNIZED : result;
  }

  public static final int SIP_RECORDING_MEDIA_LABEL_FIELD_NUMBER = 6;
  private volatile java.lang.Object sipRecordingMediaLabel_;
  /**
   *
   *
   * <pre>
   * Optional. Label applied to streams representing this participant in SIPREC
   * XML metadata and SDP. This is used to assign transcriptions from that
   * media stream to this participant. This field can be updated.
   * </pre>
   *
   * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sipRecordingMediaLabel.
   */
  @java.lang.Override
  public java.lang.String getSipRecordingMediaLabel() {
    java.lang.Object ref = sipRecordingMediaLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sipRecordingMediaLabel_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Label applied to streams representing this participant in SIPREC
   * XML metadata and SDP. This is used to assign transcriptions from that
   * media stream to this participant. This field can be updated.
   * </pre>
   *
   * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sipRecordingMediaLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSipRecordingMediaLabelBytes() {
    java.lang.Object ref = sipRecordingMediaLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sipRecordingMediaLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (role_ != com.google.cloud.dialogflow.v2.Participant.Role.ROLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, role_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sipRecordingMediaLabel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, sipRecordingMediaLabel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (role_ != com.google.cloud.dialogflow.v2.Participant.Role.ROLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, role_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sipRecordingMediaLabel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, sipRecordingMediaLabel_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.Participant)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.Participant other =
        (com.google.cloud.dialogflow.v2.Participant) obj;

    if (!getName().equals(other.getName())) return false;
    if (role_ != other.role_) return false;
    if (!getSipRecordingMediaLabel().equals(other.getSipRecordingMediaLabel())) return false;
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
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (37 * hash) + SIP_RECORDING_MEDIA_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getSipRecordingMediaLabel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.Participant parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.Participant prototype) {
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
   * Represents a conversation participant (human agent, virtual agent, end-user).
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.Participant}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.Participant)
      com.google.cloud.dialogflow.v2.ParticipantOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2_Participant_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2_Participant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.Participant.class,
              com.google.cloud.dialogflow.v2.Participant.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.Participant.newBuilder()
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

      role_ = 0;

      sipRecordingMediaLabel_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2_Participant_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Participant getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.Participant.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Participant build() {
      com.google.cloud.dialogflow.v2.Participant result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Participant buildPartial() {
      com.google.cloud.dialogflow.v2.Participant result =
          new com.google.cloud.dialogflow.v2.Participant(this);
      result.name_ = name_;
      result.role_ = role_;
      result.sipRecordingMediaLabel_ = sipRecordingMediaLabel_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.Participant) {
        return mergeFrom((com.google.cloud.dialogflow.v2.Participant) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.Participant other) {
      if (other == com.google.cloud.dialogflow.v2.Participant.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
      }
      if (!other.getSipRecordingMediaLabel().isEmpty()) {
        sipRecordingMediaLabel_ = other.sipRecordingMediaLabel_;
        onChanged();
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
      com.google.cloud.dialogflow.v2.Participant parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2.Participant) e.getUnfinishedMessage();
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
     * Optional. The unique identifier of this participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The unique identifier of this participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The unique identifier of this participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The unique identifier of this participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The unique identifier of this participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/participants/&lt;Participant ID&gt;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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

    private int role_ = 0;
    /**
     *
     *
     * <pre>
     * Immutable. The role this participant plays in the conversation. This field must be set
     * during participant creation and is then immutable.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The enum numeric value on the wire for role.
     */
    @java.lang.Override
    public int getRoleValue() {
      return role_;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The role this participant plays in the conversation. This field must be set
     * during participant creation and is then immutable.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {

      role_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The role this participant plays in the conversation. This field must be set
     * during participant creation and is then immutable.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The role.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Participant.Role getRole() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2.Participant.Role result =
          com.google.cloud.dialogflow.v2.Participant.Role.valueOf(role_);
      return result == null ? com.google.cloud.dialogflow.v2.Participant.Role.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The role this participant plays in the conversation. This field must be set
     * during participant creation and is then immutable.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(com.google.cloud.dialogflow.v2.Participant.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }

      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The role this participant plays in the conversation. This field must be set
     * during participant creation and is then immutable.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role role = 2 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRole() {

      role_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sipRecordingMediaLabel_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Label applied to streams representing this participant in SIPREC
     * XML metadata and SDP. This is used to assign transcriptions from that
     * media stream to this participant. This field can be updated.
     * </pre>
     *
     * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The sipRecordingMediaLabel.
     */
    public java.lang.String getSipRecordingMediaLabel() {
      java.lang.Object ref = sipRecordingMediaLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sipRecordingMediaLabel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Label applied to streams representing this participant in SIPREC
     * XML metadata and SDP. This is used to assign transcriptions from that
     * media stream to this participant. This field can be updated.
     * </pre>
     *
     * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for sipRecordingMediaLabel.
     */
    public com.google.protobuf.ByteString getSipRecordingMediaLabelBytes() {
      java.lang.Object ref = sipRecordingMediaLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sipRecordingMediaLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Label applied to streams representing this participant in SIPREC
     * XML metadata and SDP. This is used to assign transcriptions from that
     * media stream to this participant. This field can be updated.
     * </pre>
     *
     * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The sipRecordingMediaLabel to set.
     * @return This builder for chaining.
     */
    public Builder setSipRecordingMediaLabel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sipRecordingMediaLabel_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Label applied to streams representing this participant in SIPREC
     * XML metadata and SDP. This is used to assign transcriptions from that
     * media stream to this participant. This field can be updated.
     * </pre>
     *
     * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSipRecordingMediaLabel() {

      sipRecordingMediaLabel_ = getDefaultInstance().getSipRecordingMediaLabel();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Label applied to streams representing this participant in SIPREC
     * XML metadata and SDP. This is used to assign transcriptions from that
     * media stream to this participant. This field can be updated.
     * </pre>
     *
     * <code>string sip_recording_media_label = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for sipRecordingMediaLabel to set.
     * @return This builder for chaining.
     */
    public Builder setSipRecordingMediaLabelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      sipRecordingMediaLabel_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.Participant)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.Participant)
  private static final com.google.cloud.dialogflow.v2.Participant DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.Participant();
  }

  public static com.google.cloud.dialogflow.v2.Participant getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Participant> PARSER =
      new com.google.protobuf.AbstractParser<Participant>() {
        @java.lang.Override
        public Participant parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Participant(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Participant> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Participant> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Participant getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
