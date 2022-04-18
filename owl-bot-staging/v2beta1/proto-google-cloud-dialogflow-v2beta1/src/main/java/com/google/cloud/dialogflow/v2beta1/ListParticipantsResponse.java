// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The response message for [Participants.ListParticipants][google.cloud.dialogflow.v2beta1.Participants.ListParticipants].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListParticipantsResponse}
 */
public final class ListParticipantsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ListParticipantsResponse)
    ListParticipantsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListParticipantsResponse.newBuilder() to construct.
  private ListParticipantsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListParticipantsResponse() {
    participants_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListParticipantsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListParticipantsResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              participants_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Participant>();
              mutable_bitField0_ |= 0x00000001;
            }
            participants_.add(
                input.readMessage(com.google.cloud.dialogflow.v2beta1.Participant.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        participants_ = java.util.Collections.unmodifiableList(participants_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_ListParticipantsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_ListParticipantsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse.class, com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse.Builder.class);
  }

  public static final int PARTICIPANTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dialogflow.v2beta1.Participant> participants_;
  /**
   * <pre>
   * The list of participants. There is a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2beta1.Participant> getParticipantsList() {
    return participants_;
  }
  /**
   * <pre>
   * The list of participants. There is a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ParticipantOrBuilder> 
      getParticipantsOrBuilderList() {
    return participants_;
  }
  /**
   * <pre>
   * The list of participants. There is a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
   */
  @java.lang.Override
  public int getParticipantsCount() {
    return participants_.size();
  }
  /**
   * <pre>
   * The list of participants. There is a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Participant getParticipants(int index) {
    return participants_.get(index);
  }
  /**
   * <pre>
   * The list of participants. There is a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ParticipantOrBuilder getParticipantsOrBuilder(
      int index) {
    return participants_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Token to retrieve the next page of results or empty if there are no
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
   * Token to retrieve the next page of results or empty if there are no
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
    for (int i = 0; i < participants_.size(); i++) {
      output.writeMessage(1, participants_.get(i));
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
    for (int i = 0; i < participants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, participants_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse other = (com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse) obj;

    if (!getParticipantsList()
        .equals(other.getParticipantsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getParticipantsCount() > 0) {
      hash = (37 * hash) + PARTICIPANTS_FIELD_NUMBER;
      hash = (53 * hash) + getParticipantsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse prototype) {
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
   * The response message for [Participants.ListParticipants][google.cloud.dialogflow.v2beta1.Participants.ListParticipants].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ListParticipantsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ListParticipantsResponse)
      com.google.cloud.dialogflow.v2beta1.ListParticipantsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_ListParticipantsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_ListParticipantsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse.class, com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse.newBuilder()
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
        getParticipantsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (participantsBuilder_ == null) {
        participants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        participantsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_ListParticipantsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse build() {
      com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse result = new com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse(this);
      int from_bitField0_ = bitField0_;
      if (participantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          participants_ = java.util.Collections.unmodifiableList(participants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.participants_ = participants_;
      } else {
        result.participants_ = participantsBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse.getDefaultInstance()) return this;
      if (participantsBuilder_ == null) {
        if (!other.participants_.isEmpty()) {
          if (participants_.isEmpty()) {
            participants_ = other.participants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParticipantsIsMutable();
            participants_.addAll(other.participants_);
          }
          onChanged();
        }
      } else {
        if (!other.participants_.isEmpty()) {
          if (participantsBuilder_.isEmpty()) {
            participantsBuilder_.dispose();
            participantsBuilder_ = null;
            participants_ = other.participants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            participantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParticipantsFieldBuilder() : null;
          } else {
            participantsBuilder_.addAllMessages(other.participants_);
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
      com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.dialogflow.v2beta1.Participant> participants_ =
      java.util.Collections.emptyList();
    private void ensureParticipantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        participants_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Participant>(participants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Participant, com.google.cloud.dialogflow.v2beta1.Participant.Builder, com.google.cloud.dialogflow.v2beta1.ParticipantOrBuilder> participantsBuilder_;

    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Participant> getParticipantsList() {
      if (participantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(participants_);
      } else {
        return participantsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public int getParticipantsCount() {
      if (participantsBuilder_ == null) {
        return participants_.size();
      } else {
        return participantsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Participant getParticipants(int index) {
      if (participantsBuilder_ == null) {
        return participants_.get(index);
      } else {
        return participantsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder setParticipants(
        int index, com.google.cloud.dialogflow.v2beta1.Participant value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.set(index, value);
        onChanged();
      } else {
        participantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder setParticipants(
        int index, com.google.cloud.dialogflow.v2beta1.Participant.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.set(index, builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder addParticipants(com.google.cloud.dialogflow.v2beta1.Participant value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.add(value);
        onChanged();
      } else {
        participantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder addParticipants(
        int index, com.google.cloud.dialogflow.v2beta1.Participant value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.add(index, value);
        onChanged();
      } else {
        participantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder addParticipants(
        com.google.cloud.dialogflow.v2beta1.Participant.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.add(builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder addParticipants(
        int index, com.google.cloud.dialogflow.v2beta1.Participant.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.add(index, builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder addAllParticipants(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.Participant> values) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, participants_);
        onChanged();
      } else {
        participantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder clearParticipants() {
      if (participantsBuilder_ == null) {
        participants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        participantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public Builder removeParticipants(int index) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.remove(index);
        onChanged();
      } else {
        participantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Participant.Builder getParticipantsBuilder(
        int index) {
      return getParticipantsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.ParticipantOrBuilder getParticipantsOrBuilder(
        int index) {
      if (participantsBuilder_ == null) {
        return participants_.get(index);  } else {
        return participantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ParticipantOrBuilder> 
         getParticipantsOrBuilderList() {
      if (participantsBuilder_ != null) {
        return participantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(participants_);
      }
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Participant.Builder addParticipantsBuilder() {
      return getParticipantsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2beta1.Participant.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Participant.Builder addParticipantsBuilder(
        int index) {
      return getParticipantsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2beta1.Participant.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of participants. There is a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Participant participants = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Participant.Builder> 
         getParticipantsBuilderList() {
      return getParticipantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Participant, com.google.cloud.dialogflow.v2beta1.Participant.Builder, com.google.cloud.dialogflow.v2beta1.ParticipantOrBuilder> 
        getParticipantsFieldBuilder() {
      if (participantsBuilder_ == null) {
        participantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Participant, com.google.cloud.dialogflow.v2beta1.Participant.Builder, com.google.cloud.dialogflow.v2beta1.ParticipantOrBuilder>(
                participants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        participants_ = null;
      }
      return participantsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results or empty if there are no
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
     * Token to retrieve the next page of results or empty if there are no
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
     * Token to retrieve the next page of results or empty if there are no
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
     * Token to retrieve the next page of results or empty if there are no
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
     * Token to retrieve the next page of results or empty if there are no
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ListParticipantsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ListParticipantsResponse)
  private static final com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListParticipantsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListParticipantsResponse>() {
    @java.lang.Override
    public ListParticipantsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListParticipantsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListParticipantsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListParticipantsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ListParticipantsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

