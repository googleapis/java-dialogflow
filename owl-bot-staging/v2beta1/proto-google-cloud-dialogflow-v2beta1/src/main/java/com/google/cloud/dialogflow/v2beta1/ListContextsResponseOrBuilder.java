// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/context.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ListContextsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ListContextsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of contexts. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Context> 
      getContextsList();
  /**
   * <pre>
   * The list of contexts. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Context getContexts(int index);
  /**
   * <pre>
   * The list of contexts. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 1;</code>
   */
  int getContextsCount();
  /**
   * <pre>
   * The list of contexts. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ContextOrBuilder> 
      getContextsOrBuilderList();
  /**
   * <pre>
   * The list of contexts. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context contexts = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getContextsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}