// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/intent.proto

package com.google.cloud.dialogflow.v2;

public interface BatchUpdateIntentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.BatchUpdateIntentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The collection of updated or created intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent intents = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Intent> 
      getIntentsList();
  /**
   * <pre>
   * The collection of updated or created intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent intents = 1;</code>
   */
  com.google.cloud.dialogflow.v2.Intent getIntents(int index);
  /**
   * <pre>
   * The collection of updated or created intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent intents = 1;</code>
   */
  int getIntentsCount();
  /**
   * <pre>
   * The collection of updated or created intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent intents = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.IntentOrBuilder> 
      getIntentsOrBuilderList();
  /**
   * <pre>
   * The collection of updated or created intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent intents = 1;</code>
   */
  com.google.cloud.dialogflow.v2.IntentOrBuilder getIntentsOrBuilder(
      int index);
}
