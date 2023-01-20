// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/environment.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for [Environments.UpdateEnvironment][google.cloud.dialogflow.v2beta1.Environments.UpdateEnvironment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest}
 */
public final class UpdateEnvironmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest)
    UpdateEnvironmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEnvironmentRequest.newBuilder() to construct.
  private UpdateEnvironmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEnvironmentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEnvironmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest.class, com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest.Builder.class);
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2beta1.Environment environment_;
  /**
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the environment field is set.
   */
  @java.lang.Override
  public boolean hasEnvironment() {
    return environment_ != null;
  }
  /**
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The environment.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Environment getEnvironment() {
    return environment_ == null ? com.google.cloud.dialogflow.v2beta1.Environment.getDefaultInstance() : environment_;
  }
  /**
   * <pre>
   * Required. The environment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.EnvironmentOrBuilder getEnvironmentOrBuilder() {
    return environment_ == null ? com.google.cloud.dialogflow.v2beta1.Environment.getDefaultInstance() : environment_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The mask to control which fields get updated.
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
   * Required. The mask to control which fields get updated.
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
   * Required. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int ALLOW_LOAD_TO_DRAFT_AND_DISCARD_CHANGES_FIELD_NUMBER = 3;
  private boolean allowLoadToDraftAndDiscardChanges_ = false;
  /**
   * <pre>
   * Optional. This field is used to prevent accidental overwrite of the draft
   * environment, which is an operation that cannot be undone. To confirm that
   * the caller desires this overwrite, this field must be explicitly set to
   * true when updating the draft environment (environment ID = `-`).
   * </pre>
   *
   * <code>bool allow_load_to_draft_and_discard_changes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The allowLoadToDraftAndDiscardChanges.
   */
  @java.lang.Override
  public boolean getAllowLoadToDraftAndDiscardChanges() {
    return allowLoadToDraftAndDiscardChanges_;
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
    if (environment_ != null) {
      output.writeMessage(1, getEnvironment());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (allowLoadToDraftAndDiscardChanges_ != false) {
      output.writeBool(3, allowLoadToDraftAndDiscardChanges_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (environment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvironment());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    if (allowLoadToDraftAndDiscardChanges_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowLoadToDraftAndDiscardChanges_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest other = (com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest) obj;

    if (hasEnvironment() != other.hasEnvironment()) return false;
    if (hasEnvironment()) {
      if (!getEnvironment()
          .equals(other.getEnvironment())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (getAllowLoadToDraftAndDiscardChanges()
        != other.getAllowLoadToDraftAndDiscardChanges()) return false;
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
    if (hasEnvironment()) {
      hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + ALLOW_LOAD_TO_DRAFT_AND_DISCARD_CHANGES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowLoadToDraftAndDiscardChanges());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest prototype) {
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
   * The request message for [Environments.UpdateEnvironment][google.cloud.dialogflow.v2beta1.Environments.UpdateEnvironment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest)
      com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest.class, com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      allowLoadToDraftAndDiscardChanges_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest build() {
      com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest result = new com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.environment_ = environmentBuilder_ == null
            ? environment_
            : environmentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.allowLoadToDraftAndDiscardChanges_ = allowLoadToDraftAndDiscardChanges_;
      }
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest.getDefaultInstance()) return this;
      if (other.hasEnvironment()) {
        mergeEnvironment(other.getEnvironment());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getAllowLoadToDraftAndDiscardChanges() != false) {
        setAllowLoadToDraftAndDiscardChanges(other.getAllowLoadToDraftAndDiscardChanges());
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
                  getEnvironmentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              allowLoadToDraftAndDiscardChanges_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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
    private int bitField0_;

    private com.google.cloud.dialogflow.v2beta1.Environment environment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Environment, com.google.cloud.dialogflow.v2beta1.Environment.Builder, com.google.cloud.dialogflow.v2beta1.EnvironmentOrBuilder> environmentBuilder_;
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the environment field is set.
     */
    public boolean hasEnvironment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The environment.
     */
    public com.google.cloud.dialogflow.v2beta1.Environment getEnvironment() {
      if (environmentBuilder_ == null) {
        return environment_ == null ? com.google.cloud.dialogflow.v2beta1.Environment.getDefaultInstance() : environment_;
      } else {
        return environmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEnvironment(com.google.cloud.dialogflow.v2beta1.Environment value) {
      if (environmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
      } else {
        environmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEnvironment(
        com.google.cloud.dialogflow.v2beta1.Environment.Builder builderForValue) {
      if (environmentBuilder_ == null) {
        environment_ = builderForValue.build();
      } else {
        environmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeEnvironment(com.google.cloud.dialogflow.v2beta1.Environment value) {
      if (environmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          environment_ != null &&
          environment_ != com.google.cloud.dialogflow.v2beta1.Environment.getDefaultInstance()) {
          getEnvironmentBuilder().mergeFrom(value);
        } else {
          environment_ = value;
        }
      } else {
        environmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEnvironment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Environment.Builder getEnvironmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEnvironmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2beta1.EnvironmentOrBuilder getEnvironmentOrBuilder() {
      if (environmentBuilder_ != null) {
        return environmentBuilder_.getMessageOrBuilder();
      } else {
        return environment_ == null ?
            com.google.cloud.dialogflow.v2beta1.Environment.getDefaultInstance() : environment_;
      }
    }
    /**
     * <pre>
     * Required. The environment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Environment environment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Environment, com.google.cloud.dialogflow.v2beta1.Environment.Builder, com.google.cloud.dialogflow.v2beta1.EnvironmentOrBuilder> 
        getEnvironmentFieldBuilder() {
      if (environmentBuilder_ == null) {
        environmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Environment, com.google.cloud.dialogflow.v2beta1.Environment.Builder, com.google.cloud.dialogflow.v2beta1.EnvironmentOrBuilder>(
                getEnvironment(),
                getParentForChildren(),
                isClean());
        environment_ = null;
      }
      return environmentBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
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
     * Required. The mask to control which fields get updated.
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
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The mask to control which fields get updated.
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
     * Required. The mask to control which fields get updated.
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

    private boolean allowLoadToDraftAndDiscardChanges_ ;
    /**
     * <pre>
     * Optional. This field is used to prevent accidental overwrite of the draft
     * environment, which is an operation that cannot be undone. To confirm that
     * the caller desires this overwrite, this field must be explicitly set to
     * true when updating the draft environment (environment ID = `-`).
     * </pre>
     *
     * <code>bool allow_load_to_draft_and_discard_changes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The allowLoadToDraftAndDiscardChanges.
     */
    @java.lang.Override
    public boolean getAllowLoadToDraftAndDiscardChanges() {
      return allowLoadToDraftAndDiscardChanges_;
    }
    /**
     * <pre>
     * Optional. This field is used to prevent accidental overwrite of the draft
     * environment, which is an operation that cannot be undone. To confirm that
     * the caller desires this overwrite, this field must be explicitly set to
     * true when updating the draft environment (environment ID = `-`).
     * </pre>
     *
     * <code>bool allow_load_to_draft_and_discard_changes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The allowLoadToDraftAndDiscardChanges to set.
     * @return This builder for chaining.
     */
    public Builder setAllowLoadToDraftAndDiscardChanges(boolean value) {
      
      allowLoadToDraftAndDiscardChanges_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. This field is used to prevent accidental overwrite of the draft
     * environment, which is an operation that cannot be undone. To confirm that
     * the caller desires this overwrite, this field must be explicitly set to
     * true when updating the draft environment (environment ID = `-`).
     * </pre>
     *
     * <code>bool allow_load_to_draft_and_discard_changes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowLoadToDraftAndDiscardChanges() {
      bitField0_ = (bitField0_ & ~0x00000004);
      allowLoadToDraftAndDiscardChanges_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest)
  private static final com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEnvironmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEnvironmentRequest>() {
    @java.lang.Override
    public UpdateEnvironmentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEnvironmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEnvironmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.UpdateEnvironmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

