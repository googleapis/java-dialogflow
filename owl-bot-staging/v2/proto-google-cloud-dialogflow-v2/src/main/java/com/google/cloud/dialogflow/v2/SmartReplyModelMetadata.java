// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * Metadata for smart reply models.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.SmartReplyModelMetadata}
 */
public final class SmartReplyModelMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.SmartReplyModelMetadata)
    SmartReplyModelMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmartReplyModelMetadata.newBuilder() to construct.
  private SmartReplyModelMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmartReplyModelMetadata() {
    trainingModelType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmartReplyModelMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.SmartReplyModelMetadata.class, com.google.cloud.dialogflow.v2.SmartReplyModelMetadata.Builder.class);
  }

  public static final int TRAINING_MODEL_TYPE_FIELD_NUMBER = 6;
  private int trainingModelType_;
  /**
   * <pre>
   * Optional. Type of the smart reply model. If not provided, model_type is used.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for trainingModelType.
   */
  @java.lang.Override public int getTrainingModelTypeValue() {
    return trainingModelType_;
  }
  /**
   * <pre>
   * Optional. Type of the smart reply model. If not provided, model_type is used.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The trainingModelType.
   */
  @java.lang.Override public com.google.cloud.dialogflow.v2.ConversationModel.ModelType getTrainingModelType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2.ConversationModel.ModelType result = com.google.cloud.dialogflow.v2.ConversationModel.ModelType.valueOf(trainingModelType_);
    return result == null ? com.google.cloud.dialogflow.v2.ConversationModel.ModelType.UNRECOGNIZED : result;
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
    if (trainingModelType_ != com.google.cloud.dialogflow.v2.ConversationModel.ModelType.MODEL_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(6, trainingModelType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trainingModelType_ != com.google.cloud.dialogflow.v2.ConversationModel.ModelType.MODEL_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, trainingModelType_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.SmartReplyModelMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.SmartReplyModelMetadata other = (com.google.cloud.dialogflow.v2.SmartReplyModelMetadata) obj;

    if (trainingModelType_ != other.trainingModelType_) return false;
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
    hash = (37 * hash) + TRAINING_MODEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + trainingModelType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.SmartReplyModelMetadata prototype) {
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
   * Metadata for smart reply models.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.SmartReplyModelMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.SmartReplyModelMetadata)
      com.google.cloud.dialogflow.v2.SmartReplyModelMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.SmartReplyModelMetadata.class, com.google.cloud.dialogflow.v2.SmartReplyModelMetadata.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.SmartReplyModelMetadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      trainingModelType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_SmartReplyModelMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SmartReplyModelMetadata getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.SmartReplyModelMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SmartReplyModelMetadata build() {
      com.google.cloud.dialogflow.v2.SmartReplyModelMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SmartReplyModelMetadata buildPartial() {
      com.google.cloud.dialogflow.v2.SmartReplyModelMetadata result = new com.google.cloud.dialogflow.v2.SmartReplyModelMetadata(this);
      result.trainingModelType_ = trainingModelType_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.SmartReplyModelMetadata) {
        return mergeFrom((com.google.cloud.dialogflow.v2.SmartReplyModelMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.SmartReplyModelMetadata other) {
      if (other == com.google.cloud.dialogflow.v2.SmartReplyModelMetadata.getDefaultInstance()) return this;
      if (other.trainingModelType_ != 0) {
        setTrainingModelTypeValue(other.getTrainingModelTypeValue());
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
            case 48: {
              trainingModelType_ = input.readEnum();

              break;
            } // case 48
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

    private int trainingModelType_ = 0;
    /**
     * <pre>
     * Optional. Type of the smart reply model. If not provided, model_type is used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The enum numeric value on the wire for trainingModelType.
     */
    @java.lang.Override public int getTrainingModelTypeValue() {
      return trainingModelType_;
    }
    /**
     * <pre>
     * Optional. Type of the smart reply model. If not provided, model_type is used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The enum numeric value on the wire for trainingModelType to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingModelTypeValue(int value) {
      
      trainingModelType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Type of the smart reply model. If not provided, model_type is used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The trainingModelType.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ConversationModel.ModelType getTrainingModelType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2.ConversationModel.ModelType result = com.google.cloud.dialogflow.v2.ConversationModel.ModelType.valueOf(trainingModelType_);
      return result == null ? com.google.cloud.dialogflow.v2.ConversationModel.ModelType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional. Type of the smart reply model. If not provided, model_type is used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The trainingModelType to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingModelType(com.google.cloud.dialogflow.v2.ConversationModel.ModelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      trainingModelType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Type of the smart reply model. If not provided, model_type is used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel.ModelType training_model_type = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainingModelType() {
      
      trainingModelType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.SmartReplyModelMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.SmartReplyModelMetadata)
  private static final com.google.cloud.dialogflow.v2.SmartReplyModelMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.SmartReplyModelMetadata();
  }

  public static com.google.cloud.dialogflow.v2.SmartReplyModelMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmartReplyModelMetadata>
      PARSER = new com.google.protobuf.AbstractParser<SmartReplyModelMetadata>() {
    @java.lang.Override
    public SmartReplyModelMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmartReplyModelMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmartReplyModelMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SmartReplyModelMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

