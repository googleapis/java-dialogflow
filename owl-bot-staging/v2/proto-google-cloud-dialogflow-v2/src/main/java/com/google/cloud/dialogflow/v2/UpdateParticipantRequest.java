// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * The request message for [Participants.UpdateParticipant][google.cloud.dialogflow.v2.Participants.UpdateParticipant].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.UpdateParticipantRequest}
 */
public final class UpdateParticipantRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.UpdateParticipantRequest)
    UpdateParticipantRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateParticipantRequest.newBuilder() to construct.
  private UpdateParticipantRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateParticipantRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateParticipantRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.UpdateParticipantRequest.class, com.google.cloud.dialogflow.v2.UpdateParticipantRequest.Builder.class);
  }

  public static final int PARTICIPANT_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2.Participant participant_;
  /**
   * <pre>
   * Required. The participant to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the participant field is set.
   */
  @java.lang.Override
  public boolean hasParticipant() {
    return participant_ != null;
  }
  /**
   * <pre>
   * Required. The participant to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The participant.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Participant getParticipant() {
    return participant_ == null ? com.google.cloud.dialogflow.v2.Participant.getDefaultInstance() : participant_;
  }
  /**
   * <pre>
   * Required. The participant to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ParticipantOrBuilder getParticipantOrBuilder() {
    return getParticipant();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The mask to specify which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. The mask to specify which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The mask to specify which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (participant_ != null) {
      output.writeMessage(1, getParticipant());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (participant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParticipant());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.v2.UpdateParticipantRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.UpdateParticipantRequest other = (com.google.cloud.dialogflow.v2.UpdateParticipantRequest) obj;

    if (hasParticipant() != other.hasParticipant()) return false;
    if (hasParticipant()) {
      if (!getParticipant()
          .equals(other.getParticipant())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasParticipant()) {
      hash = (37 * hash) + PARTICIPANT_FIELD_NUMBER;
      hash = (53 * hash) + getParticipant().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.UpdateParticipantRequest prototype) {
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
   * The request message for [Participants.UpdateParticipant][google.cloud.dialogflow.v2.Participants.UpdateParticipant].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.UpdateParticipantRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.UpdateParticipantRequest)
      com.google.cloud.dialogflow.v2.UpdateParticipantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.UpdateParticipantRequest.class, com.google.cloud.dialogflow.v2.UpdateParticipantRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.UpdateParticipantRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (participantBuilder_ == null) {
        participant_ = null;
      } else {
        participant_ = null;
        participantBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ParticipantProto.internal_static_google_cloud_dialogflow_v2_UpdateParticipantRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateParticipantRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.UpdateParticipantRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateParticipantRequest build() {
      com.google.cloud.dialogflow.v2.UpdateParticipantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateParticipantRequest buildPartial() {
      com.google.cloud.dialogflow.v2.UpdateParticipantRequest result = new com.google.cloud.dialogflow.v2.UpdateParticipantRequest(this);
      if (participantBuilder_ == null) {
        result.participant_ = participant_;
      } else {
        result.participant_ = participantBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2.UpdateParticipantRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.UpdateParticipantRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.UpdateParticipantRequest other) {
      if (other == com.google.cloud.dialogflow.v2.UpdateParticipantRequest.getDefaultInstance()) return this;
      if (other.hasParticipant()) {
        mergeParticipant(other.getParticipant());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getParticipantFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.cloud.dialogflow.v2.Participant participant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Participant, com.google.cloud.dialogflow.v2.Participant.Builder, com.google.cloud.dialogflow.v2.ParticipantOrBuilder> participantBuilder_;
    /**
     * <pre>
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the participant field is set.
     */
    public boolean hasParticipant() {
      return participantBuilder_ != null || participant_ != null;
    }
    /**
     * <pre>
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.Participant.Builder getParticipantBuilder() {
      
      onChanged();
      return getParticipantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The participant to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant participant = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. The mask to specify which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.UpdateParticipantRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.UpdateParticipantRequest)
  private static final com.google.cloud.dialogflow.v2.UpdateParticipantRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.UpdateParticipantRequest();
  }

  public static com.google.cloud.dialogflow.v2.UpdateParticipantRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateParticipantRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateParticipantRequest>() {
    @java.lang.Override
    public UpdateParticipantRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateParticipantRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateParticipantRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.UpdateParticipantRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

