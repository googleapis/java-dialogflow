// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ListIntentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ListIntentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> 
      getIntentsList();
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent getIntents(int index);
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  int getIntentsCount();
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> 
      getIntentsOrBuilderList();
  /**
   * <pre>
   * The list of agent intents. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentsOrBuilder(
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
