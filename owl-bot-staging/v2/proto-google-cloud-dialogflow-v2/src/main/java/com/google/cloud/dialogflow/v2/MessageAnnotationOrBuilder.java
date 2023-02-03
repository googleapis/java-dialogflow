// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public interface MessageAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.MessageAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnnotatedMessagePart parts = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.AnnotatedMessagePart> 
      getPartsList();
  /**
   * <pre>
   * The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnnotatedMessagePart parts = 1;</code>
   */
  com.google.cloud.dialogflow.v2.AnnotatedMessagePart getParts(int index);
  /**
   * <pre>
   * The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnnotatedMessagePart parts = 1;</code>
   */
  int getPartsCount();
  /**
   * <pre>
   * The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnnotatedMessagePart parts = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.AnnotatedMessagePartOrBuilder> 
      getPartsOrBuilderList();
  /**
   * <pre>
   * The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnnotatedMessagePart parts = 1;</code>
   */
  com.google.cloud.dialogflow.v2.AnnotatedMessagePartOrBuilder getPartsOrBuilder(
      int index);

  /**
   * <pre>
   * Indicates whether the text message contains entities.
   * </pre>
   *
   * <code>bool contain_entities = 2;</code>
   * @return The containEntities.
   */
  boolean getContainEntities();
}