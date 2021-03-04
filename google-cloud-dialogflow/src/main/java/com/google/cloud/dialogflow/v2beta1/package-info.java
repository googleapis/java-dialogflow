/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= AgentsClient =======================
 *
 * <p>Service Description: Service for managing [Agents][google.cloud.dialogflow.v2beta1.Agent].
 *
 * <p>Sample for AgentsClient:
 *
 * <pre>{@code
 * try (AgentsClient agentsClient = AgentsClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Agent response = agentsClient.getAgent(parent);
 * }
 * }</pre>
 *
 * <p>======================= AnswerRecordsClient =======================
 *
 * <p>Service Description: Service for managing
 * [AnswerRecords][google.cloud.dialogflow.v2beta1.AnswerRecord].
 *
 * <p>Sample for AnswerRecordsClient:
 *
 * <pre>{@code
 * try (AnswerRecordsClient answerRecordsClient = AnswerRecordsClient.create()) {
 *   GetAnswerRecordRequest request =
 *       GetAnswerRecordRequest.newBuilder().setName("name3373707").build();
 *   AnswerRecord response = answerRecordsClient.getAnswerRecord(request);
 * }
 * }</pre>
 *
 * <p>======================= ContextsClient =======================
 *
 * <p>Service Description: Service for managing [Contexts][google.cloud.dialogflow.v2beta1.Context].
 *
 * <p>Sample for ContextsClient:
 *
 * <pre>{@code
 * try (ContextsClient contextsClient = ContextsClient.create()) {
 *   ContextName name =
 *       ContextName.ofProjectSessionContextName("[PROJECT]", "[SESSION]", "[CONTEXT]");
 *   Context response = contextsClient.getContext(name);
 * }
 * }</pre>
 *
 * <p>======================= ConversationsClient =======================
 *
 * <p>Service Description: Service for managing
 * [Conversations][google.cloud.dialogflow.v2beta1.Conversation].
 *
 * <p>Sample for ConversationsClient:
 *
 * <pre>{@code
 * try (ConversationsClient conversationsClient = ConversationsClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Conversation conversation = Conversation.newBuilder().build();
 *   Conversation response = conversationsClient.createConversation(parent, conversation);
 * }
 * }</pre>
 *
 * <p>======================= ConversationProfilesClient =======================
 *
 * <p>Service Description: Service for managing
 * [ConversationProfiles][google.cloud.dialogflow.v2beta1.ConversationProfile].
 *
 * <p>Sample for ConversationProfilesClient:
 *
 * <pre>{@code
 * try (ConversationProfilesClient conversationProfilesClient =
 *     ConversationProfilesClient.create()) {
 *   ConversationProfileName name =
 *       ConversationProfileName.ofProjectConversationProfileName(
 *           "[PROJECT]", "[CONVERSATION_PROFILE]");
 *   ConversationProfile response = conversationProfilesClient.getConversationProfile(name);
 * }
 * }</pre>
 *
 * <p>======================= DocumentsClient =======================
 *
 * <p>Service Description: Service for managing knowledge
 * [Documents][google.cloud.dialogflow.v2beta1.Document].
 *
 * <p>Sample for DocumentsClient:
 *
 * <pre>{@code
 * try (DocumentsClient documentsClient = DocumentsClient.create()) {
 *   DocumentName name =
 *       DocumentName.ofProjectKnowledgeBaseDocumentName(
 *           "[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");
 *   Document response = documentsClient.getDocument(name);
 * }
 * }</pre>
 *
 * <p>======================= EntityTypesClient =======================
 *
 * <p>Service Description: Service for managing
 * [EntityTypes][google.cloud.dialogflow.v2beta1.EntityType].
 *
 * <p>Sample for EntityTypesClient:
 *
 * <pre>{@code
 * try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
 *   EntityTypeName name = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
 *   EntityType response = entityTypesClient.getEntityType(name);
 * }
 * }</pre>
 *
 * <p>======================= EnvironmentsClient =======================
 *
 * <p>Service Description: Service for managing
 * [Environments][google.cloud.dialogflow.v2beta1.Environment].
 *
 * <p>Sample for EnvironmentsClient:
 *
 * <pre>{@code
 * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
 *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
 *   for (Environment element : environmentsClient.listEnvironments(parent).iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * }</pre>
 *
 * <p>======================= IntentsClient =======================
 *
 * <p>Service Description: Service for managing [Intents][google.cloud.dialogflow.v2beta1.Intent].
 *
 * <p>Sample for IntentsClient:
 *
 * <pre>{@code
 * try (IntentsClient intentsClient = IntentsClient.create()) {
 *   IntentName name = IntentName.ofProjectIntentName("[PROJECT]", "[INTENT]");
 *   Intent response = intentsClient.getIntent(name);
 * }
 * }</pre>
 *
 * <p>======================= KnowledgeBasesClient =======================
 *
 * <p>Service Description: Service for managing
 * [KnowledgeBases][google.cloud.dialogflow.v2beta1.KnowledgeBase].
 *
 * <p>Sample for KnowledgeBasesClient:
 *
 * <pre>{@code
 * try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
 *   KnowledgeBaseName name =
 *       KnowledgeBaseName.ofProjectKnowledgeBaseName("[PROJECT]", "[KNOWLEDGE_BASE]");
 *   KnowledgeBase response = knowledgeBasesClient.getKnowledgeBase(name);
 * }
 * }</pre>
 *
 * <p>======================= ParticipantsClient =======================
 *
 * <p>Service Description: Service for managing
 * [Participants][google.cloud.dialogflow.v2beta1.Participant].
 *
 * <p>Sample for ParticipantsClient:
 *
 * <pre>{@code
 * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
 *   ConversationName parent =
 *       ConversationName.ofProjectConversationName("[PROJECT]", "[CONVERSATION]");
 *   Participant participant = Participant.newBuilder().build();
 *   Participant response = participantsClient.createParticipant(parent, participant);
 * }
 * }</pre>
 *
 * <p>======================= SessionsClient =======================
 *
 * <p>Service Description: A service used for session interactions.
 *
 * <p>For more information, see the [API interactions
 * guide](https://cloud.google.com/dialogflow/docs/api-overview).
 *
 * <p>Sample for SessionsClient:
 *
 * <pre>{@code
 * try (SessionsClient sessionsClient = SessionsClient.create()) {
 *   SessionName session = SessionName.ofProjectSessionName("[PROJECT]", "[SESSION]");
 *   QueryInput queryInput = QueryInput.newBuilder().build();
 *   DetectIntentResponse response = sessionsClient.detectIntent(session, queryInput);
 * }
 * }</pre>
 *
 * <p>======================= SessionEntityTypesClient =======================
 *
 * <p>Service Description: Service for managing
 * [SessionEntityTypes][google.cloud.dialogflow.v2beta1.SessionEntityType].
 *
 * <p>Sample for SessionEntityTypesClient:
 *
 * <pre>{@code
 * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
 *   SessionEntityTypeName name =
 *       SessionEntityTypeName.ofProjectSessionEntityTypeName(
 *           "[PROJECT]", "[SESSION]", "[ENTITY_TYPE]");
 *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.dialogflow.v2beta1;

import javax.annotation.Generated;
