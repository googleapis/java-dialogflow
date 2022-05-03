// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/webhook.proto

package com.google.cloud.dialogflow.v2;

public interface WebhookResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.WebhookResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The text response message intended for the end-user.
   * It is recommended to use `fulfillment_messages.text.text[0]` instead.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.fulfillment_text][google.cloud.dialogflow.v2.QueryResult.fulfillment_text] sent to the integration or API caller.
   * </pre>
   *
   * <code>string fulfillment_text = 1;</code>
   * @return The fulfillmentText.
   */
  java.lang.String getFulfillmentText();
  /**
   * <pre>
   * Optional. The text response message intended for the end-user.
   * It is recommended to use `fulfillment_messages.text.text[0]` instead.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.fulfillment_text][google.cloud.dialogflow.v2.QueryResult.fulfillment_text] sent to the integration or API caller.
   * </pre>
   *
   * <code>string fulfillment_text = 1;</code>
   * @return The bytes for fulfillmentText.
   */
  com.google.protobuf.ByteString
      getFulfillmentTextBytes();

  /**
   * <pre>
   * Optional. The rich response messages intended for the end-user.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.fulfillment_messages][google.cloud.dialogflow.v2.QueryResult.fulfillment_messages] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.Message fulfillment_messages = 2;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Intent.Message> 
      getFulfillmentMessagesList();
  /**
   * <pre>
   * Optional. The rich response messages intended for the end-user.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.fulfillment_messages][google.cloud.dialogflow.v2.QueryResult.fulfillment_messages] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.Message fulfillment_messages = 2;</code>
   */
  com.google.cloud.dialogflow.v2.Intent.Message getFulfillmentMessages(int index);
  /**
   * <pre>
   * Optional. The rich response messages intended for the end-user.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.fulfillment_messages][google.cloud.dialogflow.v2.QueryResult.fulfillment_messages] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.Message fulfillment_messages = 2;</code>
   */
  int getFulfillmentMessagesCount();
  /**
   * <pre>
   * Optional. The rich response messages intended for the end-user.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.fulfillment_messages][google.cloud.dialogflow.v2.QueryResult.fulfillment_messages] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.Message fulfillment_messages = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.Intent.MessageOrBuilder> 
      getFulfillmentMessagesOrBuilderList();
  /**
   * <pre>
   * Optional. The rich response messages intended for the end-user.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.fulfillment_messages][google.cloud.dialogflow.v2.QueryResult.fulfillment_messages] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.Message fulfillment_messages = 2;</code>
   */
  com.google.cloud.dialogflow.v2.Intent.MessageOrBuilder getFulfillmentMessagesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. A custom field used to identify the webhook source.
   * Arbitrary strings are supported.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.webhook_source][google.cloud.dialogflow.v2.QueryResult.webhook_source] sent to the integration or API caller.
   * </pre>
   *
   * <code>string source = 3;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <pre>
   * Optional. A custom field used to identify the webhook source.
   * Arbitrary strings are supported.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.webhook_source][google.cloud.dialogflow.v2.QueryResult.webhook_source] sent to the integration or API caller.
   * </pre>
   *
   * <code>string source = 3;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <pre>
   * Optional. This field can be used to pass custom data from your webhook to the
   * integration or API caller. Arbitrary JSON objects are supported.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.webhook_payload][google.cloud.dialogflow.v2.QueryResult.webhook_payload] sent to the integration or API caller.
   * This field is also used by the
   * [Google Assistant
   * integration](https://cloud.google.com/dialogflow/docs/integrations/aog)
   * for rich response messages.
   * See the format definition at [Google Assistant Dialogflow webhook
   * format](https://developers.google.com/assistant/actions/build/json/dialogflow-webhook-json)
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * Optional. This field can be used to pass custom data from your webhook to the
   * integration or API caller. Arbitrary JSON objects are supported.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.webhook_payload][google.cloud.dialogflow.v2.QueryResult.webhook_payload] sent to the integration or API caller.
   * This field is also used by the
   * [Google Assistant
   * integration](https://cloud.google.com/dialogflow/docs/integrations/aog)
   * for rich response messages.
   * See the format definition at [Google Assistant Dialogflow webhook
   * format](https://developers.google.com/assistant/actions/build/json/dialogflow-webhook-json)
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   * <pre>
   * Optional. This field can be used to pass custom data from your webhook to the
   * integration or API caller. Arbitrary JSON objects are supported.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.webhook_payload][google.cloud.dialogflow.v2.QueryResult.webhook_payload] sent to the integration or API caller.
   * This field is also used by the
   * [Google Assistant
   * integration](https://cloud.google.com/dialogflow/docs/integrations/aog)
   * for rich response messages.
   * See the format definition at [Google Assistant Dialogflow webhook
   * format](https://developers.google.com/assistant/actions/build/json/dialogflow-webhook-json)
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * Optional. The collection of output contexts that will overwrite currently
   * active contexts for the session and reset their lifespans.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.output_contexts][google.cloud.dialogflow.v2.QueryResult.output_contexts] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context output_contexts = 5;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Context> 
      getOutputContextsList();
  /**
   * <pre>
   * Optional. The collection of output contexts that will overwrite currently
   * active contexts for the session and reset their lifespans.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.output_contexts][google.cloud.dialogflow.v2.QueryResult.output_contexts] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context output_contexts = 5;</code>
   */
  com.google.cloud.dialogflow.v2.Context getOutputContexts(int index);
  /**
   * <pre>
   * Optional. The collection of output contexts that will overwrite currently
   * active contexts for the session and reset their lifespans.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.output_contexts][google.cloud.dialogflow.v2.QueryResult.output_contexts] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context output_contexts = 5;</code>
   */
  int getOutputContextsCount();
  /**
   * <pre>
   * Optional. The collection of output contexts that will overwrite currently
   * active contexts for the session and reset their lifespans.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.output_contexts][google.cloud.dialogflow.v2.QueryResult.output_contexts] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context output_contexts = 5;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.ContextOrBuilder> 
      getOutputContextsOrBuilderList();
  /**
   * <pre>
   * Optional. The collection of output contexts that will overwrite currently
   * active contexts for the session and reset their lifespans.
   * When provided, Dialogflow uses this field to populate
   * [QueryResult.output_contexts][google.cloud.dialogflow.v2.QueryResult.output_contexts] sent to the integration or API caller.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context output_contexts = 5;</code>
   */
  com.google.cloud.dialogflow.v2.ContextOrBuilder getOutputContextsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Invokes the supplied events.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput followup_event_input = 6;</code>
   * @return Whether the followupEventInput field is set.
   */
  boolean hasFollowupEventInput();
  /**
   * <pre>
   * Optional. Invokes the supplied events.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput followup_event_input = 6;</code>
   * @return The followupEventInput.
   */
  com.google.cloud.dialogflow.v2.EventInput getFollowupEventInput();
  /**
   * <pre>
   * Optional. Invokes the supplied events.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EventInput followup_event_input = 6;</code>
   */
  com.google.cloud.dialogflow.v2.EventInputOrBuilder getFollowupEventInputOrBuilder();

  /**
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session. Setting this data from a webhook overwrites
   * the session entity types that have been set using `detectIntent`,
   * `streamingDetectIntent` or [SessionEntityType][google.cloud.dialogflow.v2.SessionEntityType] management methods.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 10;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.SessionEntityType> 
      getSessionEntityTypesList();
  /**
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session. Setting this data from a webhook overwrites
   * the session entity types that have been set using `detectIntent`,
   * `streamingDetectIntent` or [SessionEntityType][google.cloud.dialogflow.v2.SessionEntityType] management methods.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 10;</code>
   */
  com.google.cloud.dialogflow.v2.SessionEntityType getSessionEntityTypes(int index);
  /**
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session. Setting this data from a webhook overwrites
   * the session entity types that have been set using `detectIntent`,
   * `streamingDetectIntent` or [SessionEntityType][google.cloud.dialogflow.v2.SessionEntityType] management methods.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 10;</code>
   */
  int getSessionEntityTypesCount();
  /**
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session. Setting this data from a webhook overwrites
   * the session entity types that have been set using `detectIntent`,
   * `streamingDetectIntent` or [SessionEntityType][google.cloud.dialogflow.v2.SessionEntityType] management methods.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 10;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder> 
      getSessionEntityTypesOrBuilderList();
  /**
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session. Setting this data from a webhook overwrites
   * the session entity types that have been set using `detectIntent`,
   * `streamingDetectIntent` or [SessionEntityType][google.cloud.dialogflow.v2.SessionEntityType] management methods.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 10;</code>
   */
  com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder getSessionEntityTypesOrBuilder(
      int index);
}
