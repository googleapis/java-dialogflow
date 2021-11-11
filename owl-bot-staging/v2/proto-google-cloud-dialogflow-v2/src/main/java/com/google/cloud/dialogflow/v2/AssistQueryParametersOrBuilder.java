// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

public interface AssistQueryParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.AssistQueryParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  int getDocumentsMetadataFiltersCount();
  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  boolean containsDocumentsMetadataFilters(
      java.lang.String key);
  /**
   * Use {@link #getDocumentsMetadataFiltersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDocumentsMetadataFilters();
  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDocumentsMetadataFiltersMap();
  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */

  java.lang.String getDocumentsMetadataFiltersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Key-value filters on the metadata of documents returned by article
   * suggestion. If specified, article suggestion only returns suggested
   * documents that match all filters in their
   * [Document.metadata][google.cloud.dialogflow.v2.Document.metadata]. Multiple
   * values for a metadata key should be concatenated by comma. For example,
   * filters to match all documents that have 'US' or 'CA' in their market
   * metadata values and 'agent' in their user metadata values will be
   * documents_metadata_filters {
   *   key: "market"
   *   value: "US,CA"
   * }
   * documents_metadata_filters {
   *   key: "user"
   *   value: "agent"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; documents_metadata_filters = 1;</code>
   */

  java.lang.String getDocumentsMetadataFiltersOrThrow(
      java.lang.String key);
}
