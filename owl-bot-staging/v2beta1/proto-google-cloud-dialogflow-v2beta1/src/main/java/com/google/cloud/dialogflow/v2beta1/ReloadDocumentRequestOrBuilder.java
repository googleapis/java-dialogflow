// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ReloadDocumentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ReloadDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the document to reload.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the document to reload.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The path for a Cloud Storage source file for reloading document content.
   * If not provided, the Document's existing source will be reloaded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   * <pre>
   * The path for a Cloud Storage source file for reloading document content.
   * If not provided, the Document's existing source will be reloaded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
   * @return The gcsSource.
   */
  com.google.cloud.dialogflow.v2beta1.GcsSource getGcsSource();
  /**
   * <pre>
   * The path for a Cloud Storage source file for reloading document content.
   * If not provided, the Document's existing source will be reloaded.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.GcsSource gcs_source = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   * <pre>
   * Whether to import custom metadata from Google Cloud Storage.
   * Only valid when the document source is Google Cloud Storage URI.
   * </pre>
   *
   * <code>bool import_gcs_custom_metadata = 4;</code>
   * @return The importGcsCustomMetadata.
   */
  boolean getImportGcsCustomMetadata();

  public com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest.SourceCase getSourceCase();
}
