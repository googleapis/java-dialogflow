/*
 * Copyright 2020 Google LLC
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
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStub;
import com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing
 * [SessionEntityTypes][google.cloud.dialogflow.v2.SessionEntityType].
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the SessionEntityTypesClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of SessionEntityTypesSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * SessionEntityTypesSettings sessionEntityTypesSettings =
 *     SessionEntityTypesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SessionEntityTypesClient sessionEntityTypesClient =
 *     SessionEntityTypesClient.create(sessionEntityTypesSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * SessionEntityTypesSettings sessionEntityTypesSettings =
 *     SessionEntityTypesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SessionEntityTypesClient sessionEntityTypesClient =
 *     SessionEntityTypesClient.create(sessionEntityTypesSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class SessionEntityTypesClient implements BackgroundResource {
  private final SessionEntityTypesSettings settings;
  private final SessionEntityTypesStub stub;

  /** Constructs an instance of SessionEntityTypesClient with default settings. */
  public static final SessionEntityTypesClient create() throws IOException {
    return create(SessionEntityTypesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SessionEntityTypesClient create(SessionEntityTypesSettings settings)
      throws IOException {
    return new SessionEntityTypesClient(settings);
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(SessionEntityTypesSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SessionEntityTypesClient create(SessionEntityTypesStub stub) {
    return new SessionEntityTypesClient(stub);
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected SessionEntityTypesClient(SessionEntityTypesSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SessionEntityTypesStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SessionEntityTypesClient(SessionEntityTypesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SessionEntityTypesSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SessionEntityTypesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param parent Required. The session to list all session entity types from. Format:
   *     `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or `projects/&lt;Project
   *     ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/
   *     sessions/&lt;Session ID&gt;`. If `Environment ID` is not specified, we assume default
   *     'draft' environment. If `User ID` is not specified, we assume default '-' user.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionEntityTypesPagedResponse listSessionEntityTypes(SessionName parent) {
    ListSessionEntityTypesRequest request =
        ListSessionEntityTypesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSessionEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param parent Required. The session to list all session entity types from. Format:
   *     `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or `projects/&lt;Project
   *     ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/
   *     sessions/&lt;Session ID&gt;`. If `Environment ID` is not specified, we assume default
   *     'draft' environment. If `User ID` is not specified, we assume default '-' user.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionEntityTypesPagedResponse listSessionEntityTypes(String parent) {
    ListSessionEntityTypesRequest request =
        ListSessionEntityTypesRequest.newBuilder().setParent(parent).build();
    return listSessionEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionEntityTypesPagedResponse listSessionEntityTypes(
      ListSessionEntityTypesRequest request) {
    return listSessionEntityTypesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesPagedResponse>
      listSessionEntityTypesPagedCallable() {
    return stub.listSessionEntityTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>
      listSessionEntityTypesCallable() {
    return stub.listSessionEntityTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param name Required. The name of the session entity type. Format: `projects/&lt;Project
   *     ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;` or
   *     `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *     ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`. If
   *     `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is
   *     not specified, we assume default '-' user.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType getSessionEntityType(SessionEntityTypeName name) {
    GetSessionEntityTypeRequest request =
        GetSessionEntityTypeRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param name Required. The name of the session entity type. Format: `projects/&lt;Project
   *     ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;` or
   *     `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *     ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`. If
   *     `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is
   *     not specified, we assume default '-' user.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType getSessionEntityType(String name) {
    GetSessionEntityTypeRequest request =
        GetSessionEntityTypeRequest.newBuilder().setName(name).build();
    return getSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType getSessionEntityType(GetSessionEntityTypeRequest request) {
    return getSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetSessionEntityTypeRequest, SessionEntityType>
      getSessionEntityTypeCallable() {
    return stub.getSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a session entity type.
   *
   * <p>If the specified session entity type already exists, overrides the session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param parent Required. The session to create a session entity type for. Format:
   *     `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or `projects/&lt;Project
   *     ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/
   *     sessions/&lt;Session ID&gt;`. If `Environment ID` is not specified, we assume default
   *     'draft' environment. If `User ID` is not specified, we assume default '-' user.
   * @param sessionEntityType Required. The session entity type to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType createSessionEntityType(
      SessionName parent, SessionEntityType sessionEntityType) {
    CreateSessionEntityTypeRequest request =
        CreateSessionEntityTypeRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setSessionEntityType(sessionEntityType)
            .build();
    return createSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a session entity type.
   *
   * <p>If the specified session entity type already exists, overrides the session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param parent Required. The session to create a session entity type for. Format:
   *     `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or `projects/&lt;Project
   *     ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/
   *     sessions/&lt;Session ID&gt;`. If `Environment ID` is not specified, we assume default
   *     'draft' environment. If `User ID` is not specified, we assume default '-' user.
   * @param sessionEntityType Required. The session entity type to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType createSessionEntityType(
      String parent, SessionEntityType sessionEntityType) {
    CreateSessionEntityTypeRequest request =
        CreateSessionEntityTypeRequest.newBuilder()
            .setParent(parent)
            .setSessionEntityType(sessionEntityType)
            .build();
    return createSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a session entity type.
   *
   * <p>If the specified session entity type already exists, overrides the session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType createSessionEntityType(CreateSessionEntityTypeRequest request) {
    return createSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a session entity type.
   *
   * <p>If the specified session entity type already exists, overrides the session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateSessionEntityTypeRequest, SessionEntityType>
      createSessionEntityTypeCallable() {
    return stub.createSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param sessionEntityType Required. The session entity type to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType updateSessionEntityType(SessionEntityType sessionEntityType) {
    UpdateSessionEntityTypeRequest request =
        UpdateSessionEntityTypeRequest.newBuilder().setSessionEntityType(sessionEntityType).build();
    return updateSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param sessionEntityType Required. The session entity type to update.
   * @param updateMask Optional. The mask to control which fields get updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType updateSessionEntityType(
      SessionEntityType sessionEntityType, FieldMask updateMask) {
    UpdateSessionEntityTypeRequest request =
        UpdateSessionEntityTypeRequest.newBuilder()
            .setSessionEntityType(sessionEntityType)
            .setUpdateMask(updateMask)
            .build();
    return updateSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType updateSessionEntityType(UpdateSessionEntityTypeRequest request) {
    return updateSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<UpdateSessionEntityTypeRequest, SessionEntityType>
      updateSessionEntityTypeCallable() {
    return stub.updateSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param name Required. The name of the entity type to delete. Format: `projects/&lt;Project
   *     ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;` or
   *     `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *     ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`. If
   *     `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is
   *     not specified, we assume default '-' user.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSessionEntityType(SessionEntityTypeName name) {
    DeleteSessionEntityTypeRequest request =
        DeleteSessionEntityTypeRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param name Required. The name of the entity type to delete. Format: `projects/&lt;Project
   *     ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;` or
   *     `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *     ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`. If
   *     `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is
   *     not specified, we assume default '-' user.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSessionEntityType(String name) {
    DeleteSessionEntityTypeRequest request =
        DeleteSessionEntityTypeRequest.newBuilder().setName(name).build();
    deleteSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSessionEntityType(DeleteSessionEntityTypeRequest request) {
    deleteSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified session entity type.
   *
   * <p>This method doesn't work with Google Assistant integration. Contact Dialogflow support if
   * you need to use session entities with Google Assistant integration.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<DeleteSessionEntityTypeRequest, Empty>
      deleteSessionEntityTypeCallable() {
    return stub.deleteSessionEntityTypeCallable();
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

  public static class ListSessionEntityTypesPagedResponse
      extends AbstractPagedListResponse<
          ListSessionEntityTypesRequest,
          ListSessionEntityTypesResponse,
          SessionEntityType,
          ListSessionEntityTypesPage,
          ListSessionEntityTypesFixedSizeCollection> {

    public static ApiFuture<ListSessionEntityTypesPagedResponse> createAsync(
        PageContext<
                ListSessionEntityTypesRequest, ListSessionEntityTypesResponse, SessionEntityType>
            context,
        ApiFuture<ListSessionEntityTypesResponse> futureResponse) {
      ApiFuture<ListSessionEntityTypesPage> futurePage =
          ListSessionEntityTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSessionEntityTypesPage, ListSessionEntityTypesPagedResponse>() {
            @Override
            public ListSessionEntityTypesPagedResponse apply(ListSessionEntityTypesPage input) {
              return new ListSessionEntityTypesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListSessionEntityTypesPagedResponse(ListSessionEntityTypesPage page) {
      super(page, ListSessionEntityTypesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSessionEntityTypesPage
      extends AbstractPage<
          ListSessionEntityTypesRequest,
          ListSessionEntityTypesResponse,
          SessionEntityType,
          ListSessionEntityTypesPage> {

    private ListSessionEntityTypesPage(
        PageContext<
                ListSessionEntityTypesRequest, ListSessionEntityTypesResponse, SessionEntityType>
            context,
        ListSessionEntityTypesResponse response) {
      super(context, response);
    }

    private static ListSessionEntityTypesPage createEmptyPage() {
      return new ListSessionEntityTypesPage(null, null);
    }

    @Override
    protected ListSessionEntityTypesPage createPage(
        PageContext<
                ListSessionEntityTypesRequest, ListSessionEntityTypesResponse, SessionEntityType>
            context,
        ListSessionEntityTypesResponse response) {
      return new ListSessionEntityTypesPage(context, response);
    }

    @Override
    public ApiFuture<ListSessionEntityTypesPage> createPageAsync(
        PageContext<
                ListSessionEntityTypesRequest, ListSessionEntityTypesResponse, SessionEntityType>
            context,
        ApiFuture<ListSessionEntityTypesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSessionEntityTypesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSessionEntityTypesRequest,
          ListSessionEntityTypesResponse,
          SessionEntityType,
          ListSessionEntityTypesPage,
          ListSessionEntityTypesFixedSizeCollection> {

    private ListSessionEntityTypesFixedSizeCollection(
        List<ListSessionEntityTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSessionEntityTypesFixedSizeCollection createEmptyCollection() {
      return new ListSessionEntityTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSessionEntityTypesFixedSizeCollection createCollection(
        List<ListSessionEntityTypesPage> pages, int collectionSize) {
      return new ListSessionEntityTypesFixedSizeCollection(pages, collectionSize);
    }
  }
}
