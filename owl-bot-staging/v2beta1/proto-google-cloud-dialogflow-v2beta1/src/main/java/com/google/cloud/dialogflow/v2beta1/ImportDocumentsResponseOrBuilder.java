// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ImportDocumentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ImportDocumentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  java.util.List<com.google.rpc.Status> 
      getWarningsList();
  /**
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  com.google.rpc.Status getWarnings(int index);
  /**
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  int getWarningsCount();
  /**
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getWarningsOrBuilderList();
  /**
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getWarningsOrBuilder(
      int index);
}
