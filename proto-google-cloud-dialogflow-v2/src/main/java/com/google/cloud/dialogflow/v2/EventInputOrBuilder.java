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
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface EventInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.EventInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the event.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the event.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The collection of parameters associated with the event.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: string or number, depending on parameter value type
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 2;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The collection of parameters associated with the event.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: string or number, depending on parameter value type
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 2;</code>
   *
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();
  /**
   *
   *
   * <pre>
   * The collection of parameters associated with the event.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: string or number, depending on parameter value type
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The language of this query. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The language of this query. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
