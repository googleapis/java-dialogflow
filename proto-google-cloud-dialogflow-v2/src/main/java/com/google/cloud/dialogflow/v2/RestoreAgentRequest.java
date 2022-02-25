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
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for [Agents.RestoreAgent][google.cloud.dialogflow.v2.Agents.RestoreAgent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.RestoreAgentRequest}
 */
public final class RestoreAgentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.RestoreAgentRequest)
    RestoreAgentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RestoreAgentRequest.newBuilder() to construct.
  private RestoreAgentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RestoreAgentRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RestoreAgentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RestoreAgentRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              agentCase_ = 2;
              agent_ = s;
              break;
            }
          case 26:
            {
              agentCase_ = 3;
              agent_ = input.readBytes();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.AgentProto
        .internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.AgentProto
        .internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.RestoreAgentRequest.class,
            com.google.cloud.dialogflow.v2.RestoreAgentRequest.Builder.class);
  }

  private int agentCase_ = 0;
  private java.lang.Object agent_;

  public enum AgentCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    AGENT_URI(2),
    AGENT_CONTENT(3),
    AGENT_NOT_SET(0);
    private final int value;

    private AgentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AgentCase valueOf(int value) {
      return forNumber(value);
    }

    public static AgentCase forNumber(int value) {
      switch (value) {
        case 2:
          return AGENT_URI;
        case 3:
          return AGENT_CONTENT;
        case 0:
          return AGENT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public AgentCase getAgentCase() {
    return AgentCase.forNumber(agentCase_);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The project that the agent to restore is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project that the agent to restore is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENT_URI_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to restore.
   * Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return Whether the agentUri field is set.
   */
  public boolean hasAgentUri() {
    return agentCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to restore.
   * Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return The agentUri.
   */
  public java.lang.String getAgentUri() {
    java.lang.Object ref = "";
    if (agentCase_ == 2) {
      ref = agent_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (agentCase_ == 2) {
        agent_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to restore.
   * Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return The bytes for agentUri.
   */
  public com.google.protobuf.ByteString getAgentUriBytes() {
    java.lang.Object ref = "";
    if (agentCase_ == 2) {
      ref = agent_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (agentCase_ == 2) {
        agent_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENT_CONTENT_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   *
   * @return Whether the agentContent field is set.
   */
  @java.lang.Override
  public boolean hasAgentContent() {
    return agentCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   *
   * @return The agentContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAgentContent() {
    if (agentCase_ == 3) {
      return (com.google.protobuf.ByteString) agent_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (agentCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, agent_);
    }
    if (agentCase_ == 3) {
      output.writeBytes(3, (com.google.protobuf.ByteString) agent_);
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
    if (agentCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agent_);
    }
    if (agentCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              3, (com.google.protobuf.ByteString) agent_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.RestoreAgentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.RestoreAgentRequest other =
        (com.google.cloud.dialogflow.v2.RestoreAgentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getAgentCase().equals(other.getAgentCase())) return false;
    switch (agentCase_) {
      case 2:
        if (!getAgentUri().equals(other.getAgentUri())) return false;
        break;
      case 3:
        if (!getAgentContent().equals(other.getAgentContent())) return false;
        break;
      case 0:
      default:
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
    switch (agentCase_) {
      case 2:
        hash = (37 * hash) + AGENT_URI_FIELD_NUMBER;
        hash = (53 * hash) + getAgentUri().hashCode();
        break;
      case 3:
        hash = (37 * hash) + AGENT_CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getAgentContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.RestoreAgentRequest prototype) {
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
   * The request message for [Agents.RestoreAgent][google.cloud.dialogflow.v2.Agents.RestoreAgent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.RestoreAgentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.RestoreAgentRequest)
      com.google.cloud.dialogflow.v2.RestoreAgentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.AgentProto
          .internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.AgentProto
          .internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.RestoreAgentRequest.class,
              com.google.cloud.dialogflow.v2.RestoreAgentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.RestoreAgentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      agentCase_ = 0;
      agent_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.AgentProto
          .internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.RestoreAgentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.RestoreAgentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.RestoreAgentRequest build() {
      com.google.cloud.dialogflow.v2.RestoreAgentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.RestoreAgentRequest buildPartial() {
      com.google.cloud.dialogflow.v2.RestoreAgentRequest result =
          new com.google.cloud.dialogflow.v2.RestoreAgentRequest(this);
      result.parent_ = parent_;
      if (agentCase_ == 2) {
        result.agent_ = agent_;
      }
      if (agentCase_ == 3) {
        result.agent_ = agent_;
      }
      result.agentCase_ = agentCase_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.RestoreAgentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.RestoreAgentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.RestoreAgentRequest other) {
      if (other == com.google.cloud.dialogflow.v2.RestoreAgentRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      switch (other.getAgentCase()) {
        case AGENT_URI:
          {
            agentCase_ = 2;
            agent_ = other.agent_;
            onChanged();
            break;
          }
        case AGENT_CONTENT:
          {
            setAgentContent(other.getAgentContent());
            break;
          }
        case AGENT_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.dialogflow.v2.RestoreAgentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.RestoreAgentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int agentCase_ = 0;
    private java.lang.Object agent_;

    public AgentCase getAgentCase() {
      return AgentCase.forNumber(agentCase_);
    }

    public Builder clearAgent() {
      agentCase_ = 0;
      agent_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project that the agent to restore is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project that the agent to restore is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project that the agent to restore is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project that the agent to restore is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project that the agent to restore is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to restore.
     * Note: The URI must start with "gs://".
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @return Whether the agentUri field is set.
     */
    @java.lang.Override
    public boolean hasAgentUri() {
      return agentCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to restore.
     * Note: The URI must start with "gs://".
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @return The agentUri.
     */
    @java.lang.Override
    public java.lang.String getAgentUri() {
      java.lang.Object ref = "";
      if (agentCase_ == 2) {
        ref = agent_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (agentCase_ == 2) {
          agent_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to restore.
     * Note: The URI must start with "gs://".
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @return The bytes for agentUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAgentUriBytes() {
      java.lang.Object ref = "";
      if (agentCase_ == 2) {
        ref = agent_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (agentCase_ == 2) {
          agent_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to restore.
     * Note: The URI must start with "gs://".
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @param value The agentUri to set.
     * @return This builder for chaining.
     */
    public Builder setAgentUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      agentCase_ = 2;
      agent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to restore.
     * Note: The URI must start with "gs://".
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAgentUri() {
      if (agentCase_ == 2) {
        agentCase_ = 0;
        agent_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to restore.
     * Note: The URI must start with "gs://".
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @param value The bytes for agentUri to set.
     * @return This builder for chaining.
     */
    public Builder setAgentUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      agentCase_ = 2;
      agent_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Zip compressed raw byte content for agent.
     * </pre>
     *
     * <code>bytes agent_content = 3;</code>
     *
     * @return Whether the agentContent field is set.
     */
    public boolean hasAgentContent() {
      return agentCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Zip compressed raw byte content for agent.
     * </pre>
     *
     * <code>bytes agent_content = 3;</code>
     *
     * @return The agentContent.
     */
    public com.google.protobuf.ByteString getAgentContent() {
      if (agentCase_ == 3) {
        return (com.google.protobuf.ByteString) agent_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Zip compressed raw byte content for agent.
     * </pre>
     *
     * <code>bytes agent_content = 3;</code>
     *
     * @param value The agentContent to set.
     * @return This builder for chaining.
     */
    public Builder setAgentContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      agentCase_ = 3;
      agent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Zip compressed raw byte content for agent.
     * </pre>
     *
     * <code>bytes agent_content = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAgentContent() {
      if (agentCase_ == 3) {
        agentCase_ = 0;
        agent_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.RestoreAgentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.RestoreAgentRequest)
  private static final com.google.cloud.dialogflow.v2.RestoreAgentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.RestoreAgentRequest();
  }

  public static com.google.cloud.dialogflow.v2.RestoreAgentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestoreAgentRequest> PARSER =
      new com.google.protobuf.AbstractParser<RestoreAgentRequest>() {
        @java.lang.Override
        public RestoreAgentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RestoreAgentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RestoreAgentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestoreAgentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.RestoreAgentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
