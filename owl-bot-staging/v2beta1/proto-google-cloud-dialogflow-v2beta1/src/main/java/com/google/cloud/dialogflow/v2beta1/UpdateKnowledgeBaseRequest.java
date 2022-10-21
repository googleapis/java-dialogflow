// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * Request message for [KnowledgeBases.UpdateKnowledgeBase][google.cloud.dialogflow.v2beta1.KnowledgeBases.UpdateKnowledgeBase].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest}
 */
public final class UpdateKnowledgeBaseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest)
    UpdateKnowledgeBaseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateKnowledgeBaseRequest.newBuilder() to construct.
  private UpdateKnowledgeBaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateKnowledgeBaseRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateKnowledgeBaseRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.class, com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.Builder.class);
  }

  public static final int KNOWLEDGE_BASE_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledgeBase_;
  /**
   * <pre>
   * Required. The knowledge base to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the knowledgeBase field is set.
   */
  @java.lang.Override
  public boolean hasKnowledgeBase() {
    return knowledgeBase_ != null;
  }
  /**
   * <pre>
   * Required. The knowledge base to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The knowledgeBase.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBase() {
    return knowledgeBase_ == null ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance() : knowledgeBase_;
  }
  /**
   * <pre>
   * Required. The knowledge base to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBaseOrBuilder() {
    return getKnowledgeBase();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Optional. Not specified means `update all`.
   * Currently, only `display_name` can be updated, an InvalidArgument will be
   * returned for attempting to update other fields.
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
   * Optional. Not specified means `update all`.
   * Currently, only `display_name` can be updated, an InvalidArgument will be
   * returned for attempting to update other fields.
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
   * Optional. Not specified means `update all`.
   * Currently, only `display_name` can be updated, an InvalidArgument will be
   * returned for attempting to update other fields.
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
    if (knowledgeBase_ != null) {
      output.writeMessage(1, getKnowledgeBase());
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
    if (knowledgeBase_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKnowledgeBase());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest other = (com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest) obj;

    if (hasKnowledgeBase() != other.hasKnowledgeBase()) return false;
    if (hasKnowledgeBase()) {
      if (!getKnowledgeBase()
          .equals(other.getKnowledgeBase())) return false;
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
    if (hasKnowledgeBase()) {
      hash = (37 * hash) + KNOWLEDGE_BASE_FIELD_NUMBER;
      hash = (53 * hash) + getKnowledgeBase().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest prototype) {
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
   * Request message for [KnowledgeBases.UpdateKnowledgeBase][google.cloud.dialogflow.v2beta1.KnowledgeBases.UpdateKnowledgeBase].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest)
      com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.class, com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBase_ = null;
      } else {
        knowledgeBase_ = null;
        knowledgeBaseBuilder_ = null;
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
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest build() {
      com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest result = new com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest(this);
      if (knowledgeBaseBuilder_ == null) {
        result.knowledgeBase_ = knowledgeBase_;
      } else {
        result.knowledgeBase_ = knowledgeBaseBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest.getDefaultInstance()) return this;
      if (other.hasKnowledgeBase()) {
        mergeKnowledgeBase(other.getKnowledgeBase());
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
                  getKnowledgeBaseFieldBuilder().getBuilder(),
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

    private com.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledgeBase_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.KnowledgeBase, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder, com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder> knowledgeBaseBuilder_;
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the knowledgeBase field is set.
     */
    public boolean hasKnowledgeBase() {
      return knowledgeBaseBuilder_ != null || knowledgeBase_ != null;
    }
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The knowledgeBase.
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBase() {
      if (knowledgeBaseBuilder_ == null) {
        return knowledgeBase_ == null ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance() : knowledgeBase_;
      } else {
        return knowledgeBaseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setKnowledgeBase(com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        knowledgeBase_ = value;
        onChanged();
      } else {
        knowledgeBaseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setKnowledgeBase(
        com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder builderForValue) {
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBase_ = builderForValue.build();
        onChanged();
      } else {
        knowledgeBaseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeKnowledgeBase(com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBaseBuilder_ == null) {
        if (knowledgeBase_ != null) {
          knowledgeBase_ =
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase.newBuilder(knowledgeBase_).mergeFrom(value).buildPartial();
        } else {
          knowledgeBase_ = value;
        }
        onChanged();
      } else {
        knowledgeBaseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearKnowledgeBase() {
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBase_ = null;
        onChanged();
      } else {
        knowledgeBase_ = null;
        knowledgeBaseBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder getKnowledgeBaseBuilder() {
      
      onChanged();
      return getKnowledgeBaseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBaseOrBuilder() {
      if (knowledgeBaseBuilder_ != null) {
        return knowledgeBaseBuilder_.getMessageOrBuilder();
      } else {
        return knowledgeBase_ == null ?
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance() : knowledgeBase_;
      }
    }
    /**
     * <pre>
     * Required. The knowledge base to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.KnowledgeBase, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder, com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder> 
        getKnowledgeBaseFieldBuilder() {
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBaseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase, com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder, com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>(
                getKnowledgeBase(),
                getParentForChildren(),
                isClean());
        knowledgeBase_ = null;
      }
      return knowledgeBaseBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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
     * Optional. Not specified means `update all`.
     * Currently, only `display_name` can be updated, an InvalidArgument will be
     * returned for attempting to update other fields.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest)
  private static final com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateKnowledgeBaseRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateKnowledgeBaseRequest>() {
    @java.lang.Override
    public UpdateKnowledgeBaseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateKnowledgeBaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateKnowledgeBaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
