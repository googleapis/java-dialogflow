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
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

public interface ConversationModelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ConversationModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ConversationModel resource name. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * ConversationModel resource name. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the model. At most 64 bytes long.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the model. At most 64 bytes long.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation time of this model.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of this model.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of this model.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Datasets used to create model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.InputDataset> getDatasetsList();
  /**
   *
   *
   * <pre>
   * Required. Datasets used to create model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.InputDataset getDatasets(int index);
  /**
   *
   *
   * <pre>
   * Required. Datasets used to create model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getDatasetsCount();
  /**
   *
   *
   * <pre>
   * Required. Datasets used to create model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.InputDatasetOrBuilder>
      getDatasetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Datasets used to create model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.InputDatasetOrBuilder getDatasetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. State of the model. A model can only serve prediction requests
   * after it gets deployed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModel.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the model. A model can only serve prediction requests
   * after it gets deployed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModel.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dialogflow.v2.ConversationModel.State getState();

  /**
   *
   *
   * <pre>
   * Language code for the conversation model. If not specified, the language
   * is en-US. Language at ConversationModel should be set for all non en-us
   * languages.
   * This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag. Example: "en-US".
   * </pre>
   *
   * <code>string language_code = 19;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Language code for the conversation model. If not specified, the language
   * is en-US. Language at ConversationModel should be set for all non en-us
   * languages.
   * This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
   * language tag. Example: "en-US".
   * </pre>
   *
   * <code>string language_code = 19;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Metadata for article suggestion models.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata article_suggestion_model_metadata = 8;
   * </code>
   *
   * @return Whether the articleSuggestionModelMetadata field is set.
   */
  boolean hasArticleSuggestionModelMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for article suggestion models.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata article_suggestion_model_metadata = 8;
   * </code>
   *
   * @return The articleSuggestionModelMetadata.
   */
  com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata getArticleSuggestionModelMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for article suggestion models.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleSuggestionModelMetadata article_suggestion_model_metadata = 8;
   * </code>
   */
  com.google.cloud.dialogflow.v2.ArticleSuggestionModelMetadataOrBuilder
      getArticleSuggestionModelMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for smart reply models.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SmartReplyModelMetadata smart_reply_model_metadata = 9;
   * </code>
   *
   * @return Whether the smartReplyModelMetadata field is set.
   */
  boolean hasSmartReplyModelMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for smart reply models.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SmartReplyModelMetadata smart_reply_model_metadata = 9;
   * </code>
   *
   * @return The smartReplyModelMetadata.
   */
  com.google.cloud.dialogflow.v2.SmartReplyModelMetadata getSmartReplyModelMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for smart reply models.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SmartReplyModelMetadata smart_reply_model_metadata = 9;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SmartReplyModelMetadataOrBuilder
      getSmartReplyModelMetadataOrBuilder();

  public com.google.cloud.dialogflow.v2.ConversationModel.ModelMetadataCase getModelMetadataCase();
}
