// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session_entity_type.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * The request message for [SessionEntityTypes.UpdateSessionEntityType][google.cloud.dialogflow.v2.SessionEntityTypes.UpdateSessionEntityType].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest}
 */
public final class UpdateSessionEntityTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest)
    UpdateSessionEntityTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSessionEntityTypeRequest.newBuilder() to construct.
  private UpdateSessionEntityTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSessionEntityTypeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSessionEntityTypeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateSessionEntityTypeRequest(
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
            com.google.cloud.dialogflow.v2.SessionEntityType.Builder subBuilder = null;
            if (sessionEntityType_ != null) {
              subBuilder = sessionEntityType_.toBuilder();
            }
            sessionEntityType_ = input.readMessage(com.google.cloud.dialogflow.v2.SessionEntityType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sessionEntityType_);
              sessionEntityType_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.cloud.dialogflow.v2.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.class, com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.Builder.class);
  }

  public static final int SESSION_ENTITY_TYPE_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2.SessionEntityType sessionEntityType_;
  /**
   * <pre>
   * Required. The session entity type to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the sessionEntityType field is set.
   */
  @java.lang.Override
  public boolean hasSessionEntityType() {
    return sessionEntityType_ != null;
  }
  /**
   * <pre>
   * Required. The session entity type to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sessionEntityType.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SessionEntityType getSessionEntityType() {
    return sessionEntityType_ == null ? com.google.cloud.dialogflow.v2.SessionEntityType.getDefaultInstance() : sessionEntityType_;
  }
  /**
   * <pre>
   * Required. The session entity type to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder getSessionEntityTypeOrBuilder() {
    return getSessionEntityType();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
    if (sessionEntityType_ != null) {
      output.writeMessage(1, getSessionEntityType());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionEntityType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSessionEntityType());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest other = (com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest) obj;

    if (hasSessionEntityType() != other.hasSessionEntityType()) return false;
    if (hasSessionEntityType()) {
      if (!getSessionEntityType()
          .equals(other.getSessionEntityType())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasSessionEntityType()) {
      hash = (37 * hash) + SESSION_ENTITY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getSessionEntityType().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest prototype) {
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
   * The request message for [SessionEntityTypes.UpdateSessionEntityType][google.cloud.dialogflow.v2.SessionEntityTypes.UpdateSessionEntityType].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest)
      com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.class, com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.newBuilder()
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
      if (sessionEntityTypeBuilder_ == null) {
        sessionEntityType_ = null;
      } else {
        sessionEntityType_ = null;
        sessionEntityTypeBuilder_ = null;
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
      return com.google.cloud.dialogflow.v2.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest build() {
      com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest buildPartial() {
      com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest result = new com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest(this);
      if (sessionEntityTypeBuilder_ == null) {
        result.sessionEntityType_ = sessionEntityType_;
      } else {
        result.sessionEntityType_ = sessionEntityTypeBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest other) {
      if (other == com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest.getDefaultInstance()) return this;
      if (other.hasSessionEntityType()) {
        mergeSessionEntityType(other.getSessionEntityType());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dialogflow.v2.SessionEntityType sessionEntityType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.SessionEntityType, com.google.cloud.dialogflow.v2.SessionEntityType.Builder, com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder> sessionEntityTypeBuilder_;
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the sessionEntityType field is set.
     */
    public boolean hasSessionEntityType() {
      return sessionEntityTypeBuilder_ != null || sessionEntityType_ != null;
    }
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The sessionEntityType.
     */
    public com.google.cloud.dialogflow.v2.SessionEntityType getSessionEntityType() {
      if (sessionEntityTypeBuilder_ == null) {
        return sessionEntityType_ == null ? com.google.cloud.dialogflow.v2.SessionEntityType.getDefaultInstance() : sessionEntityType_;
      } else {
        return sessionEntityTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSessionEntityType(com.google.cloud.dialogflow.v2.SessionEntityType value) {
      if (sessionEntityTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sessionEntityType_ = value;
        onChanged();
      } else {
        sessionEntityTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSessionEntityType(
        com.google.cloud.dialogflow.v2.SessionEntityType.Builder builderForValue) {
      if (sessionEntityTypeBuilder_ == null) {
        sessionEntityType_ = builderForValue.build();
        onChanged();
      } else {
        sessionEntityTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSessionEntityType(com.google.cloud.dialogflow.v2.SessionEntityType value) {
      if (sessionEntityTypeBuilder_ == null) {
        if (sessionEntityType_ != null) {
          sessionEntityType_ =
            com.google.cloud.dialogflow.v2.SessionEntityType.newBuilder(sessionEntityType_).mergeFrom(value).buildPartial();
        } else {
          sessionEntityType_ = value;
        }
        onChanged();
      } else {
        sessionEntityTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSessionEntityType() {
      if (sessionEntityTypeBuilder_ == null) {
        sessionEntityType_ = null;
        onChanged();
      } else {
        sessionEntityType_ = null;
        sessionEntityTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.SessionEntityType.Builder getSessionEntityTypeBuilder() {
      
      onChanged();
      return getSessionEntityTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder getSessionEntityTypeOrBuilder() {
      if (sessionEntityTypeBuilder_ != null) {
        return sessionEntityTypeBuilder_.getMessageOrBuilder();
      } else {
        return sessionEntityType_ == null ?
            com.google.cloud.dialogflow.v2.SessionEntityType.getDefaultInstance() : sessionEntityType_;
      }
    }
    /**
     * <pre>
     * Required. The session entity type to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.SessionEntityType, com.google.cloud.dialogflow.v2.SessionEntityType.Builder, com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder> 
        getSessionEntityTypeFieldBuilder() {
      if (sessionEntityTypeBuilder_ == null) {
        sessionEntityTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.SessionEntityType, com.google.cloud.dialogflow.v2.SessionEntityType.Builder, com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder>(
                getSessionEntityType(),
                getParentForChildren(),
                isClean());
        sessionEntityType_ = null;
      }
      return sessionEntityTypeBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest)
  private static final com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest();
  }

  public static com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSessionEntityTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSessionEntityTypeRequest>() {
    @java.lang.Override
    public UpdateSessionEntityTypeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateSessionEntityTypeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateSessionEntityTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSessionEntityTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

