// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/version.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The response message for [Versions.ListVersions][google.cloud.dialogflow.v2beta1.Versions.ListVersions].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListVersionsResponse}
 */
public final class ListVersionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ListVersionsResponse)
    ListVersionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListVersionsResponse.newBuilder() to construct.
  private ListVersionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListVersionsResponse() {
    versions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListVersionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.VersionProto.internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.VersionProto.internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ListVersionsResponse.class, com.google.cloud.dialogflow.v2beta1.ListVersionsResponse.Builder.class);
  }

  public static final int VERSIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dialogflow.v2beta1.Version> versions_;
  /**
   * <pre>
   * The list of agent versions. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2beta1.Version> getVersionsList() {
    return versions_;
  }
  /**
   * <pre>
   * The list of agent versions. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.VersionOrBuilder> 
      getVersionsOrBuilderList() {
    return versions_;
  }
  /**
   * <pre>
   * The list of agent versions. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
   */
  @java.lang.Override
  public int getVersionsCount() {
    return versions_.size();
  }
  /**
   * <pre>
   * The list of agent versions. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Version getVersions(int index) {
    return versions_.get(index);
  }
  /**
   * <pre>
   * The list of agent versions. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.VersionOrBuilder getVersionsOrBuilder(
      int index) {
    return versions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < versions_.size(); i++) {
      output.writeMessage(1, versions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < versions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, versions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ListVersionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ListVersionsResponse other = (com.google.cloud.dialogflow.v2beta1.ListVersionsResponse) obj;

    if (!getVersionsList()
        .equals(other.getVersionsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getVersionsCount() > 0) {
      hash = (37 * hash) + VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getVersionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.ListVersionsResponse prototype) {
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
   * The response message for [Versions.ListVersions][google.cloud.dialogflow.v2beta1.Versions.ListVersions].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListVersionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ListVersionsResponse)
      com.google.cloud.dialogflow.v2beta1.ListVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.VersionProto.internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.VersionProto.internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ListVersionsResponse.class, com.google.cloud.dialogflow.v2beta1.ListVersionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ListVersionsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (versionsBuilder_ == null) {
        versions_ = java.util.Collections.emptyList();
      } else {
        versions_ = null;
        versionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.VersionProto.internal_static_google_cloud_dialogflow_v2beta1_ListVersionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListVersionsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ListVersionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListVersionsResponse build() {
      com.google.cloud.dialogflow.v2beta1.ListVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListVersionsResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ListVersionsResponse result = new com.google.cloud.dialogflow.v2beta1.ListVersionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (versionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          versions_ = java.util.Collections.unmodifiableList(versions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.versions_ = versions_;
      } else {
        result.versions_ = versionsBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ListVersionsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ListVersionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ListVersionsResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ListVersionsResponse.getDefaultInstance()) return this;
      if (versionsBuilder_ == null) {
        if (!other.versions_.isEmpty()) {
          if (versions_.isEmpty()) {
            versions_ = other.versions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVersionsIsMutable();
            versions_.addAll(other.versions_);
          }
          onChanged();
        }
      } else {
        if (!other.versions_.isEmpty()) {
          if (versionsBuilder_.isEmpty()) {
            versionsBuilder_.dispose();
            versionsBuilder_ = null;
            versions_ = other.versions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            versionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVersionsFieldBuilder() : null;
          } else {
            versionsBuilder_.addAllMessages(other.versions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
              com.google.cloud.dialogflow.v2beta1.Version m =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2beta1.Version.parser(),
                      extensionRegistry);
              if (versionsBuilder_ == null) {
                ensureVersionsIsMutable();
                versions_.add(m);
              } else {
                versionsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

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
    private int bitField0_;

    private java.util.List<com.google.cloud.dialogflow.v2beta1.Version> versions_ =
      java.util.Collections.emptyList();
    private void ensureVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        versions_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Version>(versions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Version, com.google.cloud.dialogflow.v2beta1.Version.Builder, com.google.cloud.dialogflow.v2beta1.VersionOrBuilder> versionsBuilder_;

    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Version> getVersionsList() {
      if (versionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(versions_);
      } else {
        return versionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public int getVersionsCount() {
      if (versionsBuilder_ == null) {
        return versions_.size();
      } else {
        return versionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Version getVersions(int index) {
      if (versionsBuilder_ == null) {
        return versions_.get(index);
      } else {
        return versionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder setVersions(
        int index, com.google.cloud.dialogflow.v2beta1.Version value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.set(index, value);
        onChanged();
      } else {
        versionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder setVersions(
        int index, com.google.cloud.dialogflow.v2beta1.Version.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.set(index, builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder addVersions(com.google.cloud.dialogflow.v2beta1.Version value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.add(value);
        onChanged();
      } else {
        versionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder addVersions(
        int index, com.google.cloud.dialogflow.v2beta1.Version value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.add(index, value);
        onChanged();
      } else {
        versionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder addVersions(
        com.google.cloud.dialogflow.v2beta1.Version.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.add(builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder addVersions(
        int index, com.google.cloud.dialogflow.v2beta1.Version.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.add(index, builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder addAllVersions(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.Version> values) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, versions_);
        onChanged();
      } else {
        versionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder clearVersions() {
      if (versionsBuilder_ == null) {
        versions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        versionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public Builder removeVersions(int index) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.remove(index);
        onChanged();
      } else {
        versionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Version.Builder getVersionsBuilder(
        int index) {
      return getVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.VersionOrBuilder getVersionsOrBuilder(
        int index) {
      if (versionsBuilder_ == null) {
        return versions_.get(index);  } else {
        return versionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.VersionOrBuilder> 
         getVersionsOrBuilderList() {
      if (versionsBuilder_ != null) {
        return versionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(versions_);
      }
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Version.Builder addVersionsBuilder() {
      return getVersionsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2beta1.Version.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Version.Builder addVersionsBuilder(
        int index) {
      return getVersionsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2beta1.Version.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of agent versions. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Version versions = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Version.Builder> 
         getVersionsBuilderList() {
      return getVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Version, com.google.cloud.dialogflow.v2beta1.Version.Builder, com.google.cloud.dialogflow.v2beta1.VersionOrBuilder> 
        getVersionsFieldBuilder() {
      if (versionsBuilder_ == null) {
        versionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Version, com.google.cloud.dialogflow.v2beta1.Version.Builder, com.google.cloud.dialogflow.v2beta1.VersionOrBuilder>(
                versions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        versions_ = null;
      }
      return versionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ListVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ListVersionsResponse)
  private static final com.google.cloud.dialogflow.v2beta1.ListVersionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ListVersionsResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.ListVersionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVersionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListVersionsResponse>() {
    @java.lang.Override
    public ListVersionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVersionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ListVersionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

