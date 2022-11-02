// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * Metadata for a [ConversationModels.UndeployConversationModel][google.cloud.dialogflow.v2.ConversationModels.UndeployConversationModel] operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata}
 */
public final class UndeployConversationModelOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata)
    UndeployConversationModelOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UndeployConversationModelOperationMetadata.newBuilder() to construct.
  private UndeployConversationModelOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UndeployConversationModelOperationMetadata() {
    conversationModel_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UndeployConversationModelOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata.class, com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata.Builder.class);
  }

  public static final int CONVERSATION_MODEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object conversationModel_;
  /**
   * <pre>
   * The resource name of the conversation model. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
   * </pre>
   *
   * <code>string conversation_model = 1;</code>
   * @return The conversationModel.
   */
  @java.lang.Override
  public java.lang.String getConversationModel() {
    java.lang.Object ref = conversationModel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversationModel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the conversation model. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
   * </pre>
   *
   * <code>string conversation_model = 1;</code>
   * @return The bytes for conversationModel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConversationModelBytes() {
    java.lang.Object ref = conversationModel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      conversationModel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Timestamp when the request to undeploy conversation model was submitted.
   * The time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Timestamp when the request to undeploy conversation model was submitted.
   * The time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Timestamp when the request to undeploy conversation model was submitted.
   * The time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationModel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conversationModel_);
    }
    if (createTime_ != null) {
      output.writeMessage(3, getCreateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationModel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conversationModel_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCreateTime());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata other = (com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata) obj;

    if (!getConversationModel()
        .equals(other.getConversationModel())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
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
    hash = (37 * hash) + CONVERSATION_MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getConversationModel().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata prototype) {
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
   * Metadata for a [ConversationModels.UndeployConversationModel][google.cloud.dialogflow.v2.ConversationModels.UndeployConversationModel] operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata)
      com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata.class, com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      conversationModel_ = "";

      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_UndeployConversationModelOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata build() {
      com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata buildPartial() {
      com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata result = new com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata(this);
      result.conversationModel_ = conversationModel_;
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata) {
        return mergeFrom((com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata other) {
      if (other == com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata.getDefaultInstance()) return this;
      if (!other.getConversationModel().isEmpty()) {
        conversationModel_ = other.conversationModel_;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
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
              conversationModel_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 26: {
              input.readMessage(
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private java.lang.Object conversationModel_ = "";
    /**
     * <pre>
     * The resource name of the conversation model. Format:
     * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
     * </pre>
     *
     * <code>string conversation_model = 1;</code>
     * @return The conversationModel.
     */
    public java.lang.String getConversationModel() {
      java.lang.Object ref = conversationModel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversationModel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the conversation model. Format:
     * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
     * </pre>
     *
     * <code>string conversation_model = 1;</code>
     * @return The bytes for conversationModel.
     */
    public com.google.protobuf.ByteString
        getConversationModelBytes() {
      java.lang.Object ref = conversationModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        conversationModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the conversation model. Format:
     * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
     * </pre>
     *
     * <code>string conversation_model = 1;</code>
     * @param value The conversationModel to set.
     * @return This builder for chaining.
     */
    public Builder setConversationModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      conversationModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the conversation model. Format:
     * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
     * </pre>
     *
     * <code>string conversation_model = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConversationModel() {
      
      conversationModel_ = getDefaultInstance().getConversationModel();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the conversation model. Format:
     * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
     * </pre>
     *
     * <code>string conversation_model = 1;</code>
     * @param value The bytes for conversationModel to set.
     * @return This builder for chaining.
     */
    public Builder setConversationModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      conversationModel_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
            com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Timestamp when the request to undeploy conversation model was submitted.
     * The time is measured on server side.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata)
  private static final com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata();
  }

  public static com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UndeployConversationModelOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<UndeployConversationModelOperationMetadata>() {
    @java.lang.Override
    public UndeployConversationModelOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<UndeployConversationModelOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UndeployConversationModelOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.UndeployConversationModelOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

