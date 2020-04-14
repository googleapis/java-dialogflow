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
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface BatchCreateEntitiesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to create entities in. Format:
   * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to create entities in. Format:
   * `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.EntityType.Entity> getEntitiesList();
  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityType.Entity getEntities(int index);
  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  int getEntitiesCount();
  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.EntityType.EntityOrBuilder>
      getEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The entities to create.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.EntityType.Entity entities = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityType.EntityOrBuilder getEntitiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
