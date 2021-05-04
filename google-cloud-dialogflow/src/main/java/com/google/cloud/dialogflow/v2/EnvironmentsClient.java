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
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.stub.EnvironmentsStub;
import com.google.cloud.dialogflow.v2.stub.EnvironmentsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing [Environments][google.cloud.dialogflow.v2.Environment].
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
 *   GetEnvironmentRequest request =
 *       GetEnvironmentRequest.newBuilder()
 *           .setName(
 *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
 *           .build();
 *   Environment response = environmentsClient.getEnvironment(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the EnvironmentsClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of EnvironmentsSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * EnvironmentsSettings environmentsSettings =
 *     EnvironmentsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * EnvironmentsClient environmentsClient = EnvironmentsClient.create(environmentsSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * EnvironmentsSettings environmentsSettings =
 *     EnvironmentsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * EnvironmentsClient environmentsClient = EnvironmentsClient.create(environmentsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class EnvironmentsClient implements BackgroundResource {
  private final EnvironmentsSettings settings;
  private final EnvironmentsStub stub;

  /** Constructs an instance of EnvironmentsClient with default settings. */
  public static final EnvironmentsClient create() throws IOException {
    return create(EnvironmentsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of EnvironmentsClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final EnvironmentsClient create(EnvironmentsSettings settings) throws IOException {
    return new EnvironmentsClient(settings);
  }

  /**
   * Constructs an instance of EnvironmentsClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(EnvironmentsSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final EnvironmentsClient create(EnvironmentsStub stub) {
    return new EnvironmentsClient(stub);
  }

  /**
   * Constructs an instance of EnvironmentsClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected EnvironmentsClient(EnvironmentsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((EnvironmentsStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected EnvironmentsClient(EnvironmentsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final EnvironmentsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public EnvironmentsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all non-draft environments of the specified agent.
   *
   * <p>Sample code:
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
   * @param parent Required. The agent to list all environments from. Format: -
   *     `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *     ID&gt;/agent`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEnvironmentsPagedResponse listEnvironments(AgentName parent) {
    ListEnvironmentsRequest request =
        ListEnvironmentsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listEnvironments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all non-draft environments of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   String parent =
   *       EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString();
   *   for (Environment element : environmentsClient.listEnvironments(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all environments from. Format: -
   *     `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *     ID&gt;/agent`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEnvironmentsPagedResponse listEnvironments(String parent) {
    ListEnvironmentsRequest request =
        ListEnvironmentsRequest.newBuilder().setParent(parent).build();
    return listEnvironments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all non-draft environments of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   ListEnvironmentsRequest request =
   *       ListEnvironmentsRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Environment element : environmentsClient.listEnvironments(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEnvironmentsPagedResponse listEnvironments(ListEnvironmentsRequest request) {
    return listEnvironmentsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all non-draft environments of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   ListEnvironmentsRequest request =
   *       ListEnvironmentsRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Environment> future =
   *       environmentsClient.listEnvironmentsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Environment element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsPagedResponse>
      listEnvironmentsPagedCallable() {
    return stub.listEnvironmentsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all non-draft environments of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   ListEnvironmentsRequest request =
   *       ListEnvironmentsRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListEnvironmentsResponse response =
   *         environmentsClient.listEnvironmentsCallable().call(request);
   *     for (Environment element : response.getResponsesList()) {
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
  public final UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsCallable() {
    return stub.listEnvironmentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified agent environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   GetEnvironmentRequest request =
   *       GetEnvironmentRequest.newBuilder()
   *           .setName(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .build();
   *   Environment response = environmentsClient.getEnvironment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Environment getEnvironment(GetEnvironmentRequest request) {
    return getEnvironmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified agent environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   GetEnvironmentRequest request =
   *       GetEnvironmentRequest.newBuilder()
   *           .setName(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .build();
   *   ApiFuture<Environment> future =
   *       environmentsClient.getEnvironmentCallable().futureCall(request);
   *   // Do something.
   *   Environment response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetEnvironmentRequest, Environment> getEnvironmentCallable() {
    return stub.getEnvironmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an agent environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   CreateEnvironmentRequest request =
   *       CreateEnvironmentRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .setEnvironment(Environment.newBuilder().build())
   *           .setEnvironmentId("environmentId-950205810")
   *           .build();
   *   Environment response = environmentsClient.createEnvironment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Environment createEnvironment(CreateEnvironmentRequest request) {
    return createEnvironmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an agent environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   CreateEnvironmentRequest request =
   *       CreateEnvironmentRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .setEnvironment(Environment.newBuilder().build())
   *           .setEnvironmentId("environmentId-950205810")
   *           .build();
   *   ApiFuture<Environment> future =
   *       environmentsClient.createEnvironmentCallable().futureCall(request);
   *   // Do something.
   *   Environment response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateEnvironmentRequest, Environment> createEnvironmentCallable() {
    return stub.createEnvironmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified agent environment.
   *
   * <p>This method allows you to deploy new agent versions into the environment. When an
   * environment is pointed to a new agent version by setting `environment.agent_version`, the
   * environment is temporarily set to the `LOADING` state. During that time, the environment keeps
   * on serving the previous version of the agent. After the new agent version is done loading, the
   * environment is set back to the `RUNNING` state. You can use "-" as Environment ID in
   * environment name to update version in "draft" environment. WARNING: this will negate all recent
   * changes to draft and can't be undone. You may want to save the draft to a version before
   * calling this function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   UpdateEnvironmentRequest request =
   *       UpdateEnvironmentRequest.newBuilder()
   *           .setEnvironment(Environment.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setAllowLoadToDraftAndDiscardChanges(true)
   *           .build();
   *   Environment response = environmentsClient.updateEnvironment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Environment updateEnvironment(UpdateEnvironmentRequest request) {
    return updateEnvironmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified agent environment.
   *
   * <p>This method allows you to deploy new agent versions into the environment. When an
   * environment is pointed to a new agent version by setting `environment.agent_version`, the
   * environment is temporarily set to the `LOADING` state. During that time, the environment keeps
   * on serving the previous version of the agent. After the new agent version is done loading, the
   * environment is set back to the `RUNNING` state. You can use "-" as Environment ID in
   * environment name to update version in "draft" environment. WARNING: this will negate all recent
   * changes to draft and can't be undone. You may want to save the draft to a version before
   * calling this function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   UpdateEnvironmentRequest request =
   *       UpdateEnvironmentRequest.newBuilder()
   *           .setEnvironment(Environment.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setAllowLoadToDraftAndDiscardChanges(true)
   *           .build();
   *   ApiFuture<Environment> future =
   *       environmentsClient.updateEnvironmentCallable().futureCall(request);
   *   // Do something.
   *   Environment response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateEnvironmentRequest, Environment> updateEnvironmentCallable() {
    return stub.updateEnvironmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified agent environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   DeleteEnvironmentRequest request =
   *       DeleteEnvironmentRequest.newBuilder()
   *           .setName(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .build();
   *   environmentsClient.deleteEnvironment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEnvironment(DeleteEnvironmentRequest request) {
    deleteEnvironmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified agent environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   DeleteEnvironmentRequest request =
   *       DeleteEnvironmentRequest.newBuilder()
   *           .setName(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .build();
   *   ApiFuture<Empty> future = environmentsClient.deleteEnvironmentCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteEnvironmentRequest, Empty> deleteEnvironmentCallable() {
    return stub.deleteEnvironmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the history of the specified environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   GetEnvironmentHistoryRequest request =
   *       GetEnvironmentHistoryRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (EnvironmentHistory.Entry element :
   *       environmentsClient.getEnvironmentHistory(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetEnvironmentHistoryPagedResponse getEnvironmentHistory(
      GetEnvironmentHistoryRequest request) {
    return getEnvironmentHistoryPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the history of the specified environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   GetEnvironmentHistoryRequest request =
   *       GetEnvironmentHistoryRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<EnvironmentHistory.Entry> future =
   *       environmentsClient.getEnvironmentHistoryPagedCallable().futureCall(request);
   *   // Do something.
   *   for (EnvironmentHistory.Entry element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<GetEnvironmentHistoryRequest, GetEnvironmentHistoryPagedResponse>
      getEnvironmentHistoryPagedCallable() {
    return stub.getEnvironmentHistoryPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the history of the specified environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
   *   GetEnvironmentHistoryRequest request =
   *       GetEnvironmentHistoryRequest.newBuilder()
   *           .setParent(
   *               EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     EnvironmentHistory response =
   *         environmentsClient.getEnvironmentHistoryCallable().call(request);
   *     for (EnvironmentHistory.Entry element : response.getResponsesList()) {
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
  public final UnaryCallable<GetEnvironmentHistoryRequest, EnvironmentHistory>
      getEnvironmentHistoryCallable() {
    return stub.getEnvironmentHistoryCallable();
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

  public static class ListEnvironmentsPagedResponse
      extends AbstractPagedListResponse<
          ListEnvironmentsRequest,
          ListEnvironmentsResponse,
          Environment,
          ListEnvironmentsPage,
          ListEnvironmentsFixedSizeCollection> {

    public static ApiFuture<ListEnvironmentsPagedResponse> createAsync(
        PageContext<ListEnvironmentsRequest, ListEnvironmentsResponse, Environment> context,
        ApiFuture<ListEnvironmentsResponse> futureResponse) {
      ApiFuture<ListEnvironmentsPage> futurePage =
          ListEnvironmentsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListEnvironmentsPage, ListEnvironmentsPagedResponse>() {
            @Override
            public ListEnvironmentsPagedResponse apply(ListEnvironmentsPage input) {
              return new ListEnvironmentsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListEnvironmentsPagedResponse(ListEnvironmentsPage page) {
      super(page, ListEnvironmentsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListEnvironmentsPage
      extends AbstractPage<
          ListEnvironmentsRequest, ListEnvironmentsResponse, Environment, ListEnvironmentsPage> {

    private ListEnvironmentsPage(
        PageContext<ListEnvironmentsRequest, ListEnvironmentsResponse, Environment> context,
        ListEnvironmentsResponse response) {
      super(context, response);
    }

    private static ListEnvironmentsPage createEmptyPage() {
      return new ListEnvironmentsPage(null, null);
    }

    @Override
    protected ListEnvironmentsPage createPage(
        PageContext<ListEnvironmentsRequest, ListEnvironmentsResponse, Environment> context,
        ListEnvironmentsResponse response) {
      return new ListEnvironmentsPage(context, response);
    }

    @Override
    public ApiFuture<ListEnvironmentsPage> createPageAsync(
        PageContext<ListEnvironmentsRequest, ListEnvironmentsResponse, Environment> context,
        ApiFuture<ListEnvironmentsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListEnvironmentsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListEnvironmentsRequest,
          ListEnvironmentsResponse,
          Environment,
          ListEnvironmentsPage,
          ListEnvironmentsFixedSizeCollection> {

    private ListEnvironmentsFixedSizeCollection(
        List<ListEnvironmentsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListEnvironmentsFixedSizeCollection createEmptyCollection() {
      return new ListEnvironmentsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListEnvironmentsFixedSizeCollection createCollection(
        List<ListEnvironmentsPage> pages, int collectionSize) {
      return new ListEnvironmentsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class GetEnvironmentHistoryPagedResponse
      extends AbstractPagedListResponse<
          GetEnvironmentHistoryRequest,
          EnvironmentHistory,
          EnvironmentHistory.Entry,
          GetEnvironmentHistoryPage,
          GetEnvironmentHistoryFixedSizeCollection> {

    public static ApiFuture<GetEnvironmentHistoryPagedResponse> createAsync(
        PageContext<GetEnvironmentHistoryRequest, EnvironmentHistory, EnvironmentHistory.Entry>
            context,
        ApiFuture<EnvironmentHistory> futureResponse) {
      ApiFuture<GetEnvironmentHistoryPage> futurePage =
          GetEnvironmentHistoryPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<GetEnvironmentHistoryPage, GetEnvironmentHistoryPagedResponse>() {
            @Override
            public GetEnvironmentHistoryPagedResponse apply(GetEnvironmentHistoryPage input) {
              return new GetEnvironmentHistoryPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private GetEnvironmentHistoryPagedResponse(GetEnvironmentHistoryPage page) {
      super(page, GetEnvironmentHistoryFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class GetEnvironmentHistoryPage
      extends AbstractPage<
          GetEnvironmentHistoryRequest,
          EnvironmentHistory,
          EnvironmentHistory.Entry,
          GetEnvironmentHistoryPage> {

    private GetEnvironmentHistoryPage(
        PageContext<GetEnvironmentHistoryRequest, EnvironmentHistory, EnvironmentHistory.Entry>
            context,
        EnvironmentHistory response) {
      super(context, response);
    }

    private static GetEnvironmentHistoryPage createEmptyPage() {
      return new GetEnvironmentHistoryPage(null, null);
    }

    @Override
    protected GetEnvironmentHistoryPage createPage(
        PageContext<GetEnvironmentHistoryRequest, EnvironmentHistory, EnvironmentHistory.Entry>
            context,
        EnvironmentHistory response) {
      return new GetEnvironmentHistoryPage(context, response);
    }

    @Override
    public ApiFuture<GetEnvironmentHistoryPage> createPageAsync(
        PageContext<GetEnvironmentHistoryRequest, EnvironmentHistory, EnvironmentHistory.Entry>
            context,
        ApiFuture<EnvironmentHistory> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class GetEnvironmentHistoryFixedSizeCollection
      extends AbstractFixedSizeCollection<
          GetEnvironmentHistoryRequest,
          EnvironmentHistory,
          EnvironmentHistory.Entry,
          GetEnvironmentHistoryPage,
          GetEnvironmentHistoryFixedSizeCollection> {

    private GetEnvironmentHistoryFixedSizeCollection(
        List<GetEnvironmentHistoryPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static GetEnvironmentHistoryFixedSizeCollection createEmptyCollection() {
      return new GetEnvironmentHistoryFixedSizeCollection(null, 0);
    }

    @Override
    protected GetEnvironmentHistoryFixedSizeCollection createCollection(
        List<GetEnvironmentHistoryPage> pages, int collectionSize) {
      return new GetEnvironmentHistoryFixedSizeCollection(pages, collectionSize);
    }
  }
}
