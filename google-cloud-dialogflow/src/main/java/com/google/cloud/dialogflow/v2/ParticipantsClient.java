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

package com.google.cloud.dialogflow.v2;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.stub.ParticipantsStub;
import com.google.cloud.dialogflow.v2.stub.ParticipantsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing [Participants][google.cloud.dialogflow.v2.Participant].
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
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
 * <p>Note: close() needs to be called on the ParticipantsClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of ParticipantsSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * ParticipantsSettings participantsSettings =
 *     ParticipantsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ParticipantsClient participantsClient = ParticipantsClient.create(participantsSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ParticipantsSettings participantsSettings =
 *     ParticipantsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ParticipantsClient participantsClient = ParticipantsClient.create(participantsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ParticipantsClient implements BackgroundResource {
  private final ParticipantsSettings settings;
  private final ParticipantsStub stub;

  /** Constructs an instance of ParticipantsClient with default settings. */
  public static final ParticipantsClient create() throws IOException {
    return create(ParticipantsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ParticipantsClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ParticipantsClient create(ParticipantsSettings settings) throws IOException {
    return new ParticipantsClient(settings);
  }

  /**
   * Constructs an instance of ParticipantsClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(ParticipantsSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ParticipantsClient create(ParticipantsStub stub) {
    return new ParticipantsClient(stub);
  }

  /**
   * Constructs an instance of ParticipantsClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ParticipantsClient(ParticipantsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ParticipantsStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ParticipantsClient(ParticipantsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ParticipantsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ParticipantsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new participant in a conversation.
   *
   * <p>Sample code:
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
   * @param parent Required. Resource identifier of the conversation adding the participant. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;`.
   * @param participant Required. The participant to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Participant createParticipant(ConversationName parent, Participant participant) {
    CreateParticipantRequest request =
        CreateParticipantRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setParticipant(participant)
            .build();
    return createParticipant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new participant in a conversation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   String parent =
   *       ParticipantName.ofProjectConversationParticipantName(
   *               "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *           .toString();
   *   Participant participant = Participant.newBuilder().build();
   *   Participant response = participantsClient.createParticipant(parent, participant);
   * }
   * }</pre>
   *
   * @param parent Required. Resource identifier of the conversation adding the participant. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;`.
   * @param participant Required. The participant to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Participant createParticipant(String parent, Participant participant) {
    CreateParticipantRequest request =
        CreateParticipantRequest.newBuilder().setParent(parent).setParticipant(participant).build();
    return createParticipant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new participant in a conversation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   CreateParticipantRequest request =
   *       CreateParticipantRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setParticipant(Participant.newBuilder().build())
   *           .build();
   *   Participant response = participantsClient.createParticipant(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Participant createParticipant(CreateParticipantRequest request) {
    return createParticipantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new participant in a conversation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   CreateParticipantRequest request =
   *       CreateParticipantRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setParticipant(Participant.newBuilder().build())
   *           .build();
   *   ApiFuture<Participant> future =
   *       participantsClient.createParticipantCallable().futureCall(request);
   *   // Do something.
   *   Participant response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateParticipantRequest, Participant> createParticipantCallable() {
    return stub.createParticipantCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a conversation participant.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ParticipantName name =
   *       ParticipantName.ofProjectConversationParticipantName(
   *           "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]");
   *   Participant response = participantsClient.getParticipant(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the participant. Format: `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Participant getParticipant(ParticipantName name) {
    GetParticipantRequest request =
        GetParticipantRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getParticipant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a conversation participant.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   String name =
   *       ParticipantName.ofProjectConversationParticipantName(
   *               "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *           .toString();
   *   Participant response = participantsClient.getParticipant(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the participant. Format: `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Participant getParticipant(String name) {
    GetParticipantRequest request = GetParticipantRequest.newBuilder().setName(name).build();
    return getParticipant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a conversation participant.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   GetParticipantRequest request =
   *       GetParticipantRequest.newBuilder()
   *           .setName(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .build();
   *   Participant response = participantsClient.getParticipant(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Participant getParticipant(GetParticipantRequest request) {
    return getParticipantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a conversation participant.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   GetParticipantRequest request =
   *       GetParticipantRequest.newBuilder()
   *           .setName(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Participant> future =
   *       participantsClient.getParticipantCallable().futureCall(request);
   *   // Do something.
   *   Participant response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetParticipantRequest, Participant> getParticipantCallable() {
    return stub.getParticipantCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all participants in the specified conversation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ConversationName parent =
   *       ConversationName.ofProjectConversationName("[PROJECT]", "[CONVERSATION]");
   *   for (Participant element : participantsClient.listParticipants(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The conversation to list all participants from. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListParticipantsPagedResponse listParticipants(ConversationName parent) {
    ListParticipantsRequest request =
        ListParticipantsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listParticipants(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all participants in the specified conversation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   String parent =
   *       ParticipantName.ofProjectConversationParticipantName(
   *               "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *           .toString();
   *   for (Participant element : participantsClient.listParticipants(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The conversation to list all participants from. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListParticipantsPagedResponse listParticipants(String parent) {
    ListParticipantsRequest request =
        ListParticipantsRequest.newBuilder().setParent(parent).build();
    return listParticipants(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all participants in the specified conversation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ListParticipantsRequest request =
   *       ListParticipantsRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Participant element : participantsClient.listParticipants(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListParticipantsPagedResponse listParticipants(ListParticipantsRequest request) {
    return listParticipantsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all participants in the specified conversation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ListParticipantsRequest request =
   *       ListParticipantsRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Participant> future =
   *       participantsClient.listParticipantsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Participant element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListParticipantsRequest, ListParticipantsPagedResponse>
      listParticipantsPagedCallable() {
    return stub.listParticipantsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all participants in the specified conversation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ListParticipantsRequest request =
   *       ListParticipantsRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListParticipantsResponse response =
   *         participantsClient.listParticipantsCallable().call(request);
   *     for (Participant element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListParticipantsRequest, ListParticipantsResponse>
      listParticipantsCallable() {
    return stub.listParticipantsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified participant.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   Participant participant = Participant.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Participant response = participantsClient.updateParticipant(participant, updateMask);
   * }
   * }</pre>
   *
   * @param participant Required. The participant to update.
   * @param updateMask Required. The mask to specify which fields to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Participant updateParticipant(Participant participant, FieldMask updateMask) {
    UpdateParticipantRequest request =
        UpdateParticipantRequest.newBuilder()
            .setParticipant(participant)
            .setUpdateMask(updateMask)
            .build();
    return updateParticipant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified participant.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   UpdateParticipantRequest request =
   *       UpdateParticipantRequest.newBuilder()
   *           .setParticipant(Participant.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Participant response = participantsClient.updateParticipant(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Participant updateParticipant(UpdateParticipantRequest request) {
    return updateParticipantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified participant.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   UpdateParticipantRequest request =
   *       UpdateParticipantRequest.newBuilder()
   *           .setParticipant(Participant.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Participant> future =
   *       participantsClient.updateParticipantCallable().futureCall(request);
   *   // Do something.
   *   Participant response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateParticipantRequest, Participant> updateParticipantCallable() {
    return stub.updateParticipantCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ParticipantName participant =
   *       ParticipantName.ofProjectConversationParticipantName(
   *           "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]");
   *   AudioInput audioInput = AudioInput.newBuilder().build();
   *   AnalyzeContentResponse response = participantsClient.analyzeContent(participant, audioInput);
   * }
   * }</pre>
   *
   * @param participant Required. The name of the participant this text comes from. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @param audioInput The natural language speech audio to be processed.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnalyzeContentResponse analyzeContent(
      ParticipantName participant, AudioInput audioInput) {
    AnalyzeContentRequest request =
        AnalyzeContentRequest.newBuilder()
            .setParticipant(participant == null ? null : participant.toString())
            .setAudioInput(audioInput)
            .build();
    return analyzeContent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ParticipantName participant =
   *       ParticipantName.ofProjectConversationParticipantName(
   *           "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]");
   *   EventInput eventInput = EventInput.newBuilder().build();
   *   AnalyzeContentResponse response = participantsClient.analyzeContent(participant, eventInput);
   * }
   * }</pre>
   *
   * @param participant Required. The name of the participant this text comes from. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @param eventInput An input event to send to Dialogflow.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnalyzeContentResponse analyzeContent(
      ParticipantName participant, EventInput eventInput) {
    AnalyzeContentRequest request =
        AnalyzeContentRequest.newBuilder()
            .setParticipant(participant == null ? null : participant.toString())
            .setEventInput(eventInput)
            .build();
    return analyzeContent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ParticipantName participant =
   *       ParticipantName.ofProjectConversationParticipantName(
   *           "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]");
   *   TextInput textInput = TextInput.newBuilder().build();
   *   AnalyzeContentResponse response = participantsClient.analyzeContent(participant, textInput);
   * }
   * }</pre>
   *
   * @param participant Required. The name of the participant this text comes from. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @param textInput The natural language text to be processed.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnalyzeContentResponse analyzeContent(
      ParticipantName participant, TextInput textInput) {
    AnalyzeContentRequest request =
        AnalyzeContentRequest.newBuilder()
            .setParticipant(participant == null ? null : participant.toString())
            .setTextInput(textInput)
            .build();
    return analyzeContent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   String participant =
   *       ParticipantName.ofProjectConversationParticipantName(
   *               "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *           .toString();
   *   AudioInput audioInput = AudioInput.newBuilder().build();
   *   AnalyzeContentResponse response = participantsClient.analyzeContent(participant, audioInput);
   * }
   * }</pre>
   *
   * @param participant Required. The name of the participant this text comes from. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @param audioInput The natural language speech audio to be processed.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnalyzeContentResponse analyzeContent(String participant, AudioInput audioInput) {
    AnalyzeContentRequest request =
        AnalyzeContentRequest.newBuilder()
            .setParticipant(participant)
            .setAudioInput(audioInput)
            .build();
    return analyzeContent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   String participant =
   *       ParticipantName.ofProjectConversationParticipantName(
   *               "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *           .toString();
   *   EventInput eventInput = EventInput.newBuilder().build();
   *   AnalyzeContentResponse response = participantsClient.analyzeContent(participant, eventInput);
   * }
   * }</pre>
   *
   * @param participant Required. The name of the participant this text comes from. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @param eventInput An input event to send to Dialogflow.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnalyzeContentResponse analyzeContent(String participant, EventInput eventInput) {
    AnalyzeContentRequest request =
        AnalyzeContentRequest.newBuilder()
            .setParticipant(participant)
            .setEventInput(eventInput)
            .build();
    return analyzeContent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   String participant =
   *       ParticipantName.ofProjectConversationParticipantName(
   *               "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *           .toString();
   *   TextInput textInput = TextInput.newBuilder().build();
   *   AnalyzeContentResponse response = participantsClient.analyzeContent(participant, textInput);
   * }
   * }</pre>
   *
   * @param participant Required. The name of the participant this text comes from. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @param textInput The natural language text to be processed.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnalyzeContentResponse analyzeContent(String participant, TextInput textInput) {
    AnalyzeContentRequest request =
        AnalyzeContentRequest.newBuilder()
            .setParticipant(participant)
            .setTextInput(textInput)
            .build();
    return analyzeContent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   AnalyzeContentRequest request =
   *       AnalyzeContentRequest.newBuilder()
   *           .setParticipant(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setReplyAudioConfig(OutputAudioConfig.newBuilder().build())
   *           .setQueryParams(QueryParameters.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   AnalyzeContentResponse response = participantsClient.analyzeContent(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnalyzeContentResponse analyzeContent(AnalyzeContentRequest request) {
    return analyzeContentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   AnalyzeContentRequest request =
   *       AnalyzeContentRequest.newBuilder()
   *           .setParticipant(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setReplyAudioConfig(OutputAudioConfig.newBuilder().build())
   *           .setQueryParams(QueryParameters.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<AnalyzeContentResponse> future =
   *       participantsClient.analyzeContentCallable().futureCall(request);
   *   // Do something.
   *   AnalyzeContentResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<AnalyzeContentRequest, AnalyzeContentResponse>
      analyzeContentCallable() {
    return stub.analyzeContentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds a text (chat, for example), or audio (phone recording, for example) message from a
   * participant into the conversation. Note: This method is only available through the gRPC API
   * (not REST).
   *
   * <p>The top-level message sent to the client by the server is `StreamingAnalyzeContentResponse`.
   * Multiple response messages can be returned in order. The first one or more messages contain the
   * `recognition_result` field. Each result represents a more complete transcript of what the user
   * said. The next message contains the `reply_text` field and potentially the `reply_audio` field.
   * The message can also contain the `automated_agent_reply` field.
   *
   * <p>Note: Always use agent versions for production traffic sent to virtual agents. See [Versions
   * and environments(https://cloud.google.com/dialogflow/es/docs/agents-versions).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   BidiStream<StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse> bidiStream =
   *       participantsClient.streamingAnalyzeContentCallable().call();
   *   StreamingAnalyzeContentRequest request =
   *       StreamingAnalyzeContentRequest.newBuilder()
   *           .setParticipant(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setReplyAudioConfig(OutputAudioConfig.newBuilder().build())
   *           .setQueryParams(QueryParameters.newBuilder().build())
   *           .build();
   *   bidiStream.send(request);
   *   for (StreamingAnalyzeContentResponse response : bidiStream) {
   *     // Do something when a response is received.
   *   }
   * }
   * }</pre>
   */
  public final BidiStreamingCallable<
          StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
      streamingAnalyzeContentCallable() {
    return stub.streamingAnalyzeContentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets suggested articles for a participant based on specific historical messages.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ParticipantName parent =
   *       ParticipantName.ofProjectConversationParticipantName(
   *           "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]");
   *   SuggestArticlesResponse response = participantsClient.suggestArticles(parent);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the participant to fetch suggestion for. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestArticlesResponse suggestArticles(ParticipantName parent) {
    SuggestArticlesRequest request =
        SuggestArticlesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return suggestArticles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets suggested articles for a participant based on specific historical messages.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   String parent =
   *       ParticipantName.ofProjectConversationParticipantName(
   *               "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *           .toString();
   *   SuggestArticlesResponse response = participantsClient.suggestArticles(parent);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the participant to fetch suggestion for. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestArticlesResponse suggestArticles(String parent) {
    SuggestArticlesRequest request = SuggestArticlesRequest.newBuilder().setParent(parent).build();
    return suggestArticles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets suggested articles for a participant based on specific historical messages.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   SuggestArticlesRequest request =
   *       SuggestArticlesRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setLatestMessage(
   *               MessageName.ofProjectConversationMessageName(
   *                       "[PROJECT]", "[CONVERSATION]", "[MESSAGE]")
   *                   .toString())
   *           .setContextSize(1116903569)
   *           .build();
   *   SuggestArticlesResponse response = participantsClient.suggestArticles(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestArticlesResponse suggestArticles(SuggestArticlesRequest request) {
    return suggestArticlesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets suggested articles for a participant based on specific historical messages.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   SuggestArticlesRequest request =
   *       SuggestArticlesRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setLatestMessage(
   *               MessageName.ofProjectConversationMessageName(
   *                       "[PROJECT]", "[CONVERSATION]", "[MESSAGE]")
   *                   .toString())
   *           .setContextSize(1116903569)
   *           .build();
   *   ApiFuture<SuggestArticlesResponse> future =
   *       participantsClient.suggestArticlesCallable().futureCall(request);
   *   // Do something.
   *   SuggestArticlesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SuggestArticlesRequest, SuggestArticlesResponse>
      suggestArticlesCallable() {
    return stub.suggestArticlesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets suggested faq answers for a participant based on specific historical messages.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   ParticipantName parent =
   *       ParticipantName.ofProjectConversationParticipantName(
   *           "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]");
   *   SuggestFaqAnswersResponse response = participantsClient.suggestFaqAnswers(parent);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the participant to fetch suggestion for. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestFaqAnswersResponse suggestFaqAnswers(ParticipantName parent) {
    SuggestFaqAnswersRequest request =
        SuggestFaqAnswersRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return suggestFaqAnswers(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets suggested faq answers for a participant based on specific historical messages.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   String parent =
   *       ParticipantName.ofProjectConversationParticipantName(
   *               "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *           .toString();
   *   SuggestFaqAnswersResponse response = participantsClient.suggestFaqAnswers(parent);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the participant to fetch suggestion for. Format:
   *     `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/conversations/&lt;Conversation
   *     ID&gt;/participants/&lt;Participant ID&gt;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestFaqAnswersResponse suggestFaqAnswers(String parent) {
    SuggestFaqAnswersRequest request =
        SuggestFaqAnswersRequest.newBuilder().setParent(parent).build();
    return suggestFaqAnswers(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets suggested faq answers for a participant based on specific historical messages.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   SuggestFaqAnswersRequest request =
   *       SuggestFaqAnswersRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setLatestMessage(
   *               MessageName.ofProjectConversationMessageName(
   *                       "[PROJECT]", "[CONVERSATION]", "[MESSAGE]")
   *                   .toString())
   *           .setContextSize(1116903569)
   *           .build();
   *   SuggestFaqAnswersResponse response = participantsClient.suggestFaqAnswers(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestFaqAnswersResponse suggestFaqAnswers(SuggestFaqAnswersRequest request) {
    return suggestFaqAnswersCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets suggested faq answers for a participant based on specific historical messages.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
   *   SuggestFaqAnswersRequest request =
   *       SuggestFaqAnswersRequest.newBuilder()
   *           .setParent(
   *               ParticipantName.ofProjectConversationParticipantName(
   *                       "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
   *                   .toString())
   *           .setLatestMessage(
   *               MessageName.ofProjectConversationMessageName(
   *                       "[PROJECT]", "[CONVERSATION]", "[MESSAGE]")
   *                   .toString())
   *           .setContextSize(1116903569)
   *           .build();
   *   ApiFuture<SuggestFaqAnswersResponse> future =
   *       participantsClient.suggestFaqAnswersCallable().futureCall(request);
   *   // Do something.
   *   SuggestFaqAnswersResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
      suggestFaqAnswersCallable() {
    return stub.suggestFaqAnswersCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListParticipantsPagedResponse
      extends AbstractPagedListResponse<
          ListParticipantsRequest,
          ListParticipantsResponse,
          Participant,
          ListParticipantsPage,
          ListParticipantsFixedSizeCollection> {

    public static ApiFuture<ListParticipantsPagedResponse> createAsync(
        PageContext<ListParticipantsRequest, ListParticipantsResponse, Participant> context,
        ApiFuture<ListParticipantsResponse> futureResponse) {
      ApiFuture<ListParticipantsPage> futurePage =
          ListParticipantsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListParticipantsPage, ListParticipantsPagedResponse>() {
            @Override
            public ListParticipantsPagedResponse apply(ListParticipantsPage input) {
              return new ListParticipantsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListParticipantsPagedResponse(ListParticipantsPage page) {
      super(page, ListParticipantsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListParticipantsPage
      extends AbstractPage<
          ListParticipantsRequest, ListParticipantsResponse, Participant, ListParticipantsPage> {

    private ListParticipantsPage(
        PageContext<ListParticipantsRequest, ListParticipantsResponse, Participant> context,
        ListParticipantsResponse response) {
      super(context, response);
    }

    private static ListParticipantsPage createEmptyPage() {
      return new ListParticipantsPage(null, null);
    }

    @Override
    protected ListParticipantsPage createPage(
        PageContext<ListParticipantsRequest, ListParticipantsResponse, Participant> context,
        ListParticipantsResponse response) {
      return new ListParticipantsPage(context, response);
    }

    @Override
    public ApiFuture<ListParticipantsPage> createPageAsync(
        PageContext<ListParticipantsRequest, ListParticipantsResponse, Participant> context,
        ApiFuture<ListParticipantsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListParticipantsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListParticipantsRequest,
          ListParticipantsResponse,
          Participant,
          ListParticipantsPage,
          ListParticipantsFixedSizeCollection> {

    private ListParticipantsFixedSizeCollection(
        List<ListParticipantsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListParticipantsFixedSizeCollection createEmptyCollection() {
      return new ListParticipantsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListParticipantsFixedSizeCollection createCollection(
        List<ListParticipantsPage> pages, int collectionSize) {
      return new ListParticipantsFixedSizeCollection(pages, collectionSize);
    }
  }
}
