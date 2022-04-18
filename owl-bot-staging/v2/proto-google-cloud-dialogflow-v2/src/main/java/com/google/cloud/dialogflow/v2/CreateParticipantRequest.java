// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * The request message for [Participants.CreateParticipant][google.cloud.dialogflow.v2.Participants.CreateParticipant].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.CreateParticipantRequest}
 */
public final class CreateParticipantRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.CreateParticipantRequest)
    CreateParticipantRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateParticipantRequest.newBuilder() to construct.
  private CreateParticipantRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateParticipantRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateParticipantRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateParticipantRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.dialogflow.v2.Participant.Builder subBuilder = null;
            if (participant_ != null) {
              subBuilder = participant_.toBuilder();
            }
            participant_ = input.readMessage(com.google.cloud.dialogflow.v2.Participant.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(participant_);
              participant_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.CreateParticipantRequest.class, com.google.cloud.dialogflow.v2.CreateParticipantRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. Resource identifier of the conversation adding the participant.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Resource identifier of the conversation adding the participant.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTICIPANT_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.Participant participant_;
  /**
   * <pre>
   * Required. The participant to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the participant field is set.
   */
  @java.lang.Override
  public boolean hasParticipant() {
    return participant_ != null;
  }
  /**
   * <pre>
   * Required. The participant to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The participant.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Participant getParticipant() {
    return participant_ == null ? com.google.cloud.dialogflow.v2.Participant.getDefaultInstance() : participant_;
  }
  /**
   * <pre>
   * Required. The participant to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ParticipantOrBuilder getParticipantOrBuilder() {
    return getParticipant();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (participant_ != null) {
      output.writeMessage(2, getParticipant());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (participant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParticipant());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.CreateParticipantRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.CreateParticipantRequest other = (com.google.cloud.dialogflow.v2.CreateParticipantRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasParticipant() != other.hasParticipant()) return false;
    if (hasParticipant()) {
      if (!getParticipant()
          .equals(other.getParticipant())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasParticipant()) {
      hash = (37 * hash) + PARTICIPANT_FIELD_NUMBER;
      hash = (53 * hash) + getParticipant().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.CreateParticipantRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request message for [Participants.CreateParticipant][google.cloud.dialogflow.v2.Participants.CreateParticipant].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.CreateParticipantRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.CreateParticipantRequest)
      com.google.cloud.dialogflow.v2.CreateParticipantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.CreateParticipantRequest.class, com.google.cloud.dialogflow.v2.CreateParticipantRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.CreateParticipantRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (participantBuilder_ == null) {
        participant_ = null;
      } else {
        participant_ = null;
        participantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_CreateParticipantRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateParticipantRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.CreateParticipantRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateParticipantRequest build() {
      com.google.cloud.dialogflow.v2.CreateParticipantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateParticipantRequest buildPartial() {
      com.google.cloud.dialogflow.v2.CreateParticipantRequest result = new com.google.cloud.dialogflow.v2.CreateParticipantRequest(this);
      result.parent_ = parent_;
      if (participantBuilder_ == null) {
        result.participant_ = participant_;
      } else {
        result.participant_ = participantBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.CreateParticipantRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.CreateParticipantRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.CreateParticipantRequest other) {
      if (other == com.google.cloud.dialogflow.v2.CreateParticipantRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasParticipant()) {
        mergeParticipant(other.getParticipant());
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
      com.google.cloud.dialogflow.v2.CreateParticipantRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2.CreateParticipantRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. Resource identifier of the conversation adding the participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource identifier of the conversation adding the participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource identifier of the conversation adding the participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource identifier of the conversation adding the participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource identifier of the conversation adding the participant.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2.Participant participant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Participant, com.google.cloud.dialogflow.v2.Participant.Builder, com.google.cloud.dialogflow.v2.ParticipantOrBuilder> participantBuilder_;
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the participant field is set.
     */
    public boolean hasParticipant() {
      return participantBuilder_ != null || participant_ != null;
    }
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The participant.
     */
    public com.google.cloud.dialogflow.v2.Participant getParticipant() {
      if (participantBuilder_ == null) {
        return participant_ == null ? com.google.cloud.dialogflow.v2.Participant.getDefaultInstance() : participant_;
      } else {
        return participantBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setParticipant(com.google.cloud.dialogflow.v2.Participant value) {
      if (participantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        participant_ = value;
        onChanged();
      } else {
        participantBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setParticipant(
        com.google.cloud.dialogflow.v2.Participant.Builder builderForValue) {
      if (participantBuilder_ == null) {
        participant_ = builderForValue.build();
        onChanged();
      } else {
        participantBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeParticipant(com.google.cloud.dialogflow.v2.Participant value) {
      if (participantBuilder_ == null) {
        if (participant_ != null) {
          participant_ =
            com.google.cloud.dialogflow.v2.Participant.newBuilder(participant_).mergeFrom(value).buildPartial();
        } else {
          participant_ = value;
        }
        onChanged();
      } else {
        participantBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearParticipant() {
      if (participantBuilder_ == null) {
        participant_ = null;
        onChanged();
      } else {
        participant_ = null;
        participantBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.Participant.Builder getParticipantBuilder() {
      
      onChanged();
      return getParticipantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.ParticipantOrBuilder getParticipantOrBuilder() {
      if (participantBuilder_ != null) {
        return participantBuilder_.getMessageOrBuilder();
      } else {
        return participant_ == null ?
            com.google.cloud.dialogflow.v2.Participant.getDefaultInstance() : participant_;
      }
    }
    /**
     * <pre>
     * Required. The participant to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Participant, com.google.cloud.dialogflow.v2.Participant.Builder, com.google.cloud.dialogflow.v2.ParticipantOrBuilder> 
        getParticipantFieldBuilder() {
      if (participantBuilder_ == null) {
        participantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Participant, com.google.cloud.dialogflow.v2.Participant.Builder, com.google.cloud.dialogflow.v2.ParticipantOrBuilder>(
                getParticipant(),
                getParentForChildren(),
                isClean());
        participant_ = null;
      }
      return participantBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.CreateParticipantRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.CreateParticipantRequest)
  private static final com.google.cloud.dialogflow.v2.CreateParticipantRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.CreateParticipantRequest();
  }

  public static com.google.cloud.dialogflow.v2.CreateParticipantRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateParticipantRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateParticipantRequest>() {
    @java.lang.Override
    public CreateParticipantRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateParticipantRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateParticipantRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateParticipantRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.CreateParticipantRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

