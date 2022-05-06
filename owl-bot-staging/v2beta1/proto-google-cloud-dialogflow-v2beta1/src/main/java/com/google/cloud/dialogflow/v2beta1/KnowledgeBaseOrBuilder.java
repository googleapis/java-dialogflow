// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

public interface KnowledgeBaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.KnowledgeBase)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The knowledge base resource name.
   * The name must be empty when creating a knowledge base.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The knowledge base resource name.
   * The name must be empty when creating a knowledge base.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The display name of the knowledge base. The name must be 1024
   * bytes or less; otherwise, the creation request fails.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The display name of the knowledge base. The name must be 1024
   * bytes or less; otherwise, the creation request fails.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Language which represents the KnowledgeBase. When the KnowledgeBase is
   * created/updated, this is populated for all non en-us languages. If not
   * populated, the default language en-us applies.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Language which represents the KnowledgeBase. When the KnowledgeBase is
   * created/updated, this is populated for all non en-us languages. If not
   * populated, the default language en-us applies.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
