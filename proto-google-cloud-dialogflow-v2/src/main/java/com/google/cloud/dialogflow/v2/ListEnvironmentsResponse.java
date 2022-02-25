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
// source: google/cloud/dialogflow/v2/environment.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The response message for [Environments.ListEnvironments][google.cloud.dialogflow.v2.Environments.ListEnvironments].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ListEnvironmentsResponse}
 */
public final class ListEnvironmentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ListEnvironmentsResponse)
    ListEnvironmentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListEnvironmentsResponse.newBuilder() to construct.
  private ListEnvironmentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEnvironmentsResponse() {
    environments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEnvironmentsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListEnvironmentsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                environments_ =
                    new java.util.ArrayList<com.google.cloud.dialogflow.v2.Environment>();
                mutable_bitField0_ |= 0x00000001;
              }
              environments_.add(
                  input.readMessage(
                      com.google.cloud.dialogflow.v2.Environment.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        environments_ = java.util.Collections.unmodifiableList(environments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.EnvironmentProto
        .internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.EnvironmentProto
        .internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ListEnvironmentsResponse.class,
            com.google.cloud.dialogflow.v2.ListEnvironmentsResponse.Builder.class);
  }

  public static final int ENVIRONMENTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dialogflow.v2.Environment> environments_;
  /**
   *
   *
   * <pre>
   * The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2.Environment> getEnvironmentsList() {
    return environments_;
  }
  /**
   *
   *
   * <pre>
   * The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2.EnvironmentOrBuilder>
      getEnvironmentsOrBuilderList() {
    return environments_;
  }
  /**
   *
   *
   * <pre>
   * The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
   */
  @java.lang.Override
  public int getEnvironmentsCount() {
    return environments_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Environment getEnvironments(int index) {
    return environments_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of agent environments. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.EnvironmentOrBuilder getEnvironmentsOrBuilder(int index) {
    return environments_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < environments_.size(); i++) {
      output.writeMessage(1, environments_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < environments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, environments_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ListEnvironmentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ListEnvironmentsResponse other =
        (com.google.cloud.dialogflow.v2.ListEnvironmentsResponse) obj;

    if (!getEnvironmentsList().equals(other.getEnvironmentsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getEnvironmentsCount() > 0) {
      hash = (37 * hash) + ENVIRONMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironmentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.dialogflow.v2.ListEnvironmentsResponse prototype) {
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
   * The response message for [Environments.ListEnvironments][google.cloud.dialogflow.v2.Environments.ListEnvironments].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ListEnvironmentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ListEnvironmentsResponse)
      com.google.cloud.dialogflow.v2.ListEnvironmentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.EnvironmentProto
          .internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.EnvironmentProto
          .internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ListEnvironmentsResponse.class,
              com.google.cloud.dialogflow.v2.ListEnvironmentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ListEnvironmentsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEnvironmentsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (environmentsBuilder_ == null) {
        environments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        environmentsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.EnvironmentProto
          .internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListEnvironmentsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ListEnvironmentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListEnvironmentsResponse build() {
      com.google.cloud.dialogflow.v2.ListEnvironmentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListEnvironmentsResponse buildPartial() {
      com.google.cloud.dialogflow.v2.ListEnvironmentsResponse result =
          new com.google.cloud.dialogflow.v2.ListEnvironmentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (environmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          environments_ = java.util.Collections.unmodifiableList(environments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.environments_ = environments_;
      } else {
        result.environments_ = environmentsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.ListEnvironmentsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ListEnvironmentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ListEnvironmentsResponse other) {
      if (other == com.google.cloud.dialogflow.v2.ListEnvironmentsResponse.getDefaultInstance())
        return this;
      if (environmentsBuilder_ == null) {
        if (!other.environments_.isEmpty()) {
          if (environments_.isEmpty()) {
            environments_ = other.environments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEnvironmentsIsMutable();
            environments_.addAll(other.environments_);
          }
          onChanged();
        }
      } else {
        if (!other.environments_.isEmpty()) {
          if (environmentsBuilder_.isEmpty()) {
            environmentsBuilder_.dispose();
            environmentsBuilder_ = null;
            environments_ = other.environments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            environmentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEnvironmentsFieldBuilder()
                    : null;
          } else {
            environmentsBuilder_.addAllMessages(other.environments_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.dialogflow.v2.ListEnvironmentsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.ListEnvironmentsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.dialogflow.v2.Environment> environments_ =
        java.util.Collections.emptyList();

    private void ensureEnvironmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        environments_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.v2.Environment>(environments_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Environment,
            com.google.cloud.dialogflow.v2.Environment.Builder,
            com.google.cloud.dialogflow.v2.EnvironmentOrBuilder>
        environmentsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.Environment> getEnvironmentsList() {
      if (environmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(environments_);
      } else {
        return environmentsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public int getEnvironmentsCount() {
      if (environmentsBuilder_ == null) {
        return environments_.size();
      } else {
        return environmentsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Environment getEnvironments(int index) {
      if (environmentsBuilder_ == null) {
        return environments_.get(index);
      } else {
        return environmentsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder setEnvironments(int index, com.google.cloud.dialogflow.v2.Environment value) {
      if (environmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnvironmentsIsMutable();
        environments_.set(index, value);
        onChanged();
      } else {
        environmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder setEnvironments(
        int index, com.google.cloud.dialogflow.v2.Environment.Builder builderForValue) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        environments_.set(index, builderForValue.build());
        onChanged();
      } else {
        environmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder addEnvironments(com.google.cloud.dialogflow.v2.Environment value) {
      if (environmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnvironmentsIsMutable();
        environments_.add(value);
        onChanged();
      } else {
        environmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder addEnvironments(int index, com.google.cloud.dialogflow.v2.Environment value) {
      if (environmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnvironmentsIsMutable();
        environments_.add(index, value);
        onChanged();
      } else {
        environmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder addEnvironments(
        com.google.cloud.dialogflow.v2.Environment.Builder builderForValue) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        environments_.add(builderForValue.build());
        onChanged();
      } else {
        environmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder addEnvironments(
        int index, com.google.cloud.dialogflow.v2.Environment.Builder builderForValue) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        environments_.add(index, builderForValue.build());
        onChanged();
      } else {
        environmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder addAllEnvironments(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2.Environment> values) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, environments_);
        onChanged();
      } else {
        environmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder clearEnvironments() {
      if (environmentsBuilder_ == null) {
        environments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        environmentsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public Builder removeEnvironments(int index) {
      if (environmentsBuilder_ == null) {
        ensureEnvironmentsIsMutable();
        environments_.remove(index);
        onChanged();
      } else {
        environmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Environment.Builder getEnvironmentsBuilder(int index) {
      return getEnvironmentsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EnvironmentOrBuilder getEnvironmentsOrBuilder(int index) {
      if (environmentsBuilder_ == null) {
        return environments_.get(index);
      } else {
        return environmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2.EnvironmentOrBuilder>
        getEnvironmentsOrBuilderList() {
      if (environmentsBuilder_ != null) {
        return environmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(environments_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Environment.Builder addEnvironmentsBuilder() {
      return getEnvironmentsFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.v2.Environment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Environment.Builder addEnvironmentsBuilder(int index) {
      return getEnvironmentsFieldBuilder()
          .addBuilder(index, com.google.cloud.dialogflow.v2.Environment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of agent environments. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.Environment environments = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.Environment.Builder>
        getEnvironmentsBuilderList() {
      return getEnvironmentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Environment,
            com.google.cloud.dialogflow.v2.Environment.Builder,
            com.google.cloud.dialogflow.v2.EnvironmentOrBuilder>
        getEnvironmentsFieldBuilder() {
      if (environmentsBuilder_ == null) {
        environmentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.v2.Environment,
                com.google.cloud.dialogflow.v2.Environment.Builder,
                com.google.cloud.dialogflow.v2.EnvironmentOrBuilder>(
                environments_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        environments_ = null;
      }
      return environmentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ListEnvironmentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ListEnvironmentsResponse)
  private static final com.google.cloud.dialogflow.v2.ListEnvironmentsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ListEnvironmentsResponse();
  }

  public static com.google.cloud.dialogflow.v2.ListEnvironmentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEnvironmentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListEnvironmentsResponse>() {
        @java.lang.Override
        public ListEnvironmentsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListEnvironmentsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListEnvironmentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEnvironmentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ListEnvironmentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
