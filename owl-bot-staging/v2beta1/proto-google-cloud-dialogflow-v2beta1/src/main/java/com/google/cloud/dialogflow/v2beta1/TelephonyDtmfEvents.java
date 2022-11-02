// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * A wrapper of repeated TelephonyDtmf digits.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents}
 */
public final class TelephonyDtmfEvents extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents)
    TelephonyDtmfEventsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TelephonyDtmfEvents.newBuilder() to construct.
  private TelephonyDtmfEvents(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TelephonyDtmfEvents() {
    dtmfEvents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TelephonyDtmfEvents();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents.class, com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents.Builder.class);
  }

  public static final int DTMF_EVENTS_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> dtmfEvents_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.cloud.dialogflow.v2beta1.TelephonyDtmf> dtmfEvents_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.cloud.dialogflow.v2beta1.TelephonyDtmf>() {
            public com.google.cloud.dialogflow.v2beta1.TelephonyDtmf convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.google.cloud.dialogflow.v2beta1.TelephonyDtmf result = com.google.cloud.dialogflow.v2beta1.TelephonyDtmf.valueOf(from);
              return result == null ? com.google.cloud.dialogflow.v2beta1.TelephonyDtmf.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
   * @return A list containing the dtmfEvents.
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2beta1.TelephonyDtmf> getDtmfEventsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.cloud.dialogflow.v2beta1.TelephonyDtmf>(dtmfEvents_, dtmfEvents_converter_);
  }
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
   * @return The count of dtmfEvents.
   */
  @java.lang.Override
  public int getDtmfEventsCount() {
    return dtmfEvents_.size();
  }
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
   * @param index The index of the element to return.
   * @return The dtmfEvents at the given index.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.TelephonyDtmf getDtmfEvents(int index) {
    return dtmfEvents_converter_.convert(dtmfEvents_.get(index));
  }
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
   * @return A list containing the enum numeric values on the wire for dtmfEvents.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getDtmfEventsValueList() {
    return dtmfEvents_;
  }
  /**
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of dtmfEvents at the given index.
   */
  @java.lang.Override
  public int getDtmfEventsValue(int index) {
    return dtmfEvents_.get(index);
  }
  private int dtmfEventsMemoizedSerializedSize;

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
    getSerializedSize();
    if (getDtmfEventsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(dtmfEventsMemoizedSerializedSize);
    }
    for (int i = 0; i < dtmfEvents_.size(); i++) {
      output.writeEnumNoTag(dtmfEvents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < dtmfEvents_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(dtmfEvents_.get(i));
      }
      size += dataSize;
      if (!getDtmfEventsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }dtmfEventsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents other = (com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents) obj;

    if (!dtmfEvents_.equals(other.dtmfEvents_)) return false;
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
    if (getDtmfEventsCount() > 0) {
      hash = (37 * hash) + DTMF_EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + dtmfEvents_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents prototype) {
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
   * A wrapper of repeated TelephonyDtmf digits.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents)
      com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEventsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents.class, com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dtmfEvents_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto.internal_static_google_cloud_dialogflow_v2beta1_TelephonyDtmfEvents_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents build() {
      com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents buildPartial() {
      com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents result = new com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        dtmfEvents_ = java.util.Collections.unmodifiableList(dtmfEvents_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dtmfEvents_ = dtmfEvents_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents other) {
      if (other == com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents.getDefaultInstance()) return this;
      if (!other.dtmfEvents_.isEmpty()) {
        if (dtmfEvents_.isEmpty()) {
          dtmfEvents_ = other.dtmfEvents_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDtmfEventsIsMutable();
          dtmfEvents_.addAll(other.dtmfEvents_);
        }
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
            case 8: {
              int tmpRaw = input.readEnum();
              ensureDtmfEventsIsMutable();
              dtmfEvents_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureDtmfEventsIsMutable();
                dtmfEvents_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 10
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

    private java.util.List<java.lang.Integer> dtmfEvents_ =
      java.util.Collections.emptyList();
    private void ensureDtmfEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dtmfEvents_ = new java.util.ArrayList<java.lang.Integer>(dtmfEvents_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @return A list containing the dtmfEvents.
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.TelephonyDtmf> getDtmfEventsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.cloud.dialogflow.v2beta1.TelephonyDtmf>(dtmfEvents_, dtmfEvents_converter_);
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @return The count of dtmfEvents.
     */
    public int getDtmfEventsCount() {
      return dtmfEvents_.size();
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @param index The index of the element to return.
     * @return The dtmfEvents at the given index.
     */
    public com.google.cloud.dialogflow.v2beta1.TelephonyDtmf getDtmfEvents(int index) {
      return dtmfEvents_converter_.convert(dtmfEvents_.get(index));
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @param index The index to set the value at.
     * @param value The dtmfEvents to set.
     * @return This builder for chaining.
     */
    public Builder setDtmfEvents(
        int index, com.google.cloud.dialogflow.v2beta1.TelephonyDtmf value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDtmfEventsIsMutable();
      dtmfEvents_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @param value The dtmfEvents to add.
     * @return This builder for chaining.
     */
    public Builder addDtmfEvents(com.google.cloud.dialogflow.v2beta1.TelephonyDtmf value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDtmfEventsIsMutable();
      dtmfEvents_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @param values The dtmfEvents to add.
     * @return This builder for chaining.
     */
    public Builder addAllDtmfEvents(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.TelephonyDtmf> values) {
      ensureDtmfEventsIsMutable();
      for (com.google.cloud.dialogflow.v2beta1.TelephonyDtmf value : values) {
        dtmfEvents_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDtmfEvents() {
      dtmfEvents_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @return A list containing the enum numeric values on the wire for dtmfEvents.
     */
    public java.util.List<java.lang.Integer>
    getDtmfEventsValueList() {
      return java.util.Collections.unmodifiableList(dtmfEvents_);
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of dtmfEvents at the given index.
     */
    public int getDtmfEventsValue(int index) {
      return dtmfEvents_.get(index);
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for dtmfEvents to set.
     * @return This builder for chaining.
     */
    public Builder setDtmfEventsValue(
        int index, int value) {
      ensureDtmfEventsIsMutable();
      dtmfEvents_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @param value The enum numeric value on the wire for dtmfEvents to add.
     * @return This builder for chaining.
     */
    public Builder addDtmfEventsValue(int value) {
      ensureDtmfEventsIsMutable();
      dtmfEvents_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A sequence of TelephonyDtmf digits.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.TelephonyDtmf dtmf_events = 1;</code>
     * @param values The enum numeric values on the wire for dtmfEvents to add.
     * @return This builder for chaining.
     */
    public Builder addAllDtmfEventsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureDtmfEventsIsMutable();
      for (int value : values) {
        dtmfEvents_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents)
  private static final com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents();
  }

  public static com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TelephonyDtmfEvents>
      PARSER = new com.google.protobuf.AbstractParser<TelephonyDtmfEvents>() {
    @java.lang.Override
    public TelephonyDtmfEvents parsePartialFrom(
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

  public static com.google.protobuf.Parser<TelephonyDtmfEvents> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TelephonyDtmfEvents> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.TelephonyDtmfEvents getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

