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
import com.google.cloud.dialogflow.v2.stub.VersionsStub;
import com.google.cloud.dialogflow.v2.stub.VersionsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing [Versions][google.cloud.dialogflow.v2.Version].
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (VersionsClient versionsClient = VersionsClient.create()) {
 *   VersionName name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]");
 *   Version response = versionsClient.getVersion(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the VersionsClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of VersionsSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * VersionsSettings versionsSettings =
 *     VersionsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * VersionsClient versionsClient = VersionsClient.create(versionsSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * VersionsSettings versionsSettings =
 *     VersionsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * VersionsClient versionsClient = VersionsClient.create(versionsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class VersionsClient implements BackgroundResource {
  private final VersionsSettings settings;
  private final VersionsStub stub;

  /** Constructs an instance of VersionsClient with default settings. */
  public static final VersionsClient create() throws IOException {
    return create(VersionsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of VersionsClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final VersionsClient create(VersionsSettings settings) throws IOException {
    return new VersionsClient(settings);
  }

  /**
   * Constructs an instance of VersionsClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(VersionsSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final VersionsClient create(VersionsStub stub) {
    return new VersionsClient(stub);
  }

  /**
   * Constructs an instance of VersionsClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected VersionsClient(VersionsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((VersionsStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected VersionsClient(VersionsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final VersionsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public VersionsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   for (Version element : versionsClient.listVersions(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all versions from. Supported formats: -
   *     `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *     ID&gt;/agent`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVersionsPagedResponse listVersions(AgentName parent) {
    ListVersionsRequest request =
        ListVersionsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listVersions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String parent = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString();
   *   for (Version element : versionsClient.listVersions(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The agent to list all versions from. Supported formats: -
   *     `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *     ID&gt;/agent`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVersionsPagedResponse listVersions(String parent) {
    ListVersionsRequest request = ListVersionsRequest.newBuilder().setParent(parent).build();
    return listVersions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListVersionsRequest request =
   *       ListVersionsRequest.newBuilder()
   *           .setParent(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Version element : versionsClient.listVersions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListVersionsPagedResponse listVersions(ListVersionsRequest request) {
    return listVersionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListVersionsRequest request =
   *       ListVersionsRequest.newBuilder()
   *           .setParent(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Version> future = versionsClient.listVersionsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Version element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse>
      listVersionsPagedCallable() {
    return stub.listVersionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all versions of the specified agent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   ListVersionsRequest request =
   *       ListVersionsRequest.newBuilder()
   *           .setParent(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListVersionsResponse response = versionsClient.listVersionsCallable().call(request);
   *     for (Version element : response.getResponsesList()) {
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
  public final UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable() {
    return stub.listVersionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified agent version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   VersionName name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]");
   *   Version response = versionsClient.getVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the version. Supported formats: - `projects/&lt;Project
   *     ID&gt;/agent/versions/&lt;Version ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version ID&gt;`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version getVersion(VersionName name) {
    GetVersionRequest request =
        GetVersionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified agent version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString();
   *   Version response = versionsClient.getVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the version. Supported formats: - `projects/&lt;Project
   *     ID&gt;/agent/versions/&lt;Version ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version ID&gt;`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version getVersion(String name) {
    GetVersionRequest request = GetVersionRequest.newBuilder().setName(name).build();
    return getVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified agent version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   GetVersionRequest request =
   *       GetVersionRequest.newBuilder()
   *           .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .build();
   *   Version response = versionsClient.getVersion(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version getVersion(GetVersionRequest request) {
    return getVersionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified agent version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   GetVersionRequest request =
   *       GetVersionRequest.newBuilder()
   *           .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .build();
   *   ApiFuture<Version> future = versionsClient.getVersionCallable().futureCall(request);
   *   // Do something.
   *   Version response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetVersionRequest, Version> getVersionCallable() {
    return stub.getVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an agent version.
   *
   * <p>The new version points to the agent instance in the "default" environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   AgentName parent = AgentName.ofProjectName("[PROJECT]");
   *   Version version = Version.newBuilder().build();
   *   Version response = versionsClient.createVersion(parent, version);
   * }
   * }</pre>
   *
   * @param parent Required. The agent to create a version for. Supported formats: -
   *     `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *     ID&gt;/agent`
   * @param version Required. The version to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version createVersion(AgentName parent, Version version) {
    CreateVersionRequest request =
        CreateVersionRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setVersion(version)
            .build();
    return createVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an agent version.
   *
   * <p>The new version points to the agent instance in the "default" environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String parent = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString();
   *   Version version = Version.newBuilder().build();
   *   Version response = versionsClient.createVersion(parent, version);
   * }
   * }</pre>
   *
   * @param parent Required. The agent to create a version for. Supported formats: -
   *     `projects/&lt;Project ID&gt;/agent` - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *     ID&gt;/agent`
   * @param version Required. The version to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version createVersion(String parent, Version version) {
    CreateVersionRequest request =
        CreateVersionRequest.newBuilder().setParent(parent).setVersion(version).build();
    return createVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an agent version.
   *
   * <p>The new version points to the agent instance in the "default" environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   CreateVersionRequest request =
   *       CreateVersionRequest.newBuilder()
   *           .setParent(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .setVersion(Version.newBuilder().build())
   *           .build();
   *   Version response = versionsClient.createVersion(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version createVersion(CreateVersionRequest request) {
    return createVersionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an agent version.
   *
   * <p>The new version points to the agent instance in the "default" environment.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   CreateVersionRequest request =
   *       CreateVersionRequest.newBuilder()
   *           .setParent(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .setVersion(Version.newBuilder().build())
   *           .build();
   *   ApiFuture<Version> future = versionsClient.createVersionCallable().futureCall(request);
   *   // Do something.
   *   Version response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateVersionRequest, Version> createVersionCallable() {
    return stub.createVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified agent version.
   *
   * <p>Note that this method does not allow you to update the state of the agent the given version
   * points to. It allows you to update only mutable properties of the version resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   Version version = Version.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Version response = versionsClient.updateVersion(version, updateMask);
   * }
   * }</pre>
   *
   * @param version Required. The version to update. Supported formats: - `projects/&lt;Project
   *     ID&gt;/agent/versions/&lt;Version ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version ID&gt;`
   * @param updateMask Required. The mask to control which fields get updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version updateVersion(Version version, FieldMask updateMask) {
    UpdateVersionRequest request =
        UpdateVersionRequest.newBuilder().setVersion(version).setUpdateMask(updateMask).build();
    return updateVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified agent version.
   *
   * <p>Note that this method does not allow you to update the state of the agent the given version
   * points to. It allows you to update only mutable properties of the version resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   UpdateVersionRequest request =
   *       UpdateVersionRequest.newBuilder()
   *           .setVersion(Version.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Version response = versionsClient.updateVersion(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Version updateVersion(UpdateVersionRequest request) {
    return updateVersionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified agent version.
   *
   * <p>Note that this method does not allow you to update the state of the agent the given version
   * points to. It allows you to update only mutable properties of the version resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   UpdateVersionRequest request =
   *       UpdateVersionRequest.newBuilder()
   *           .setVersion(Version.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Version> future = versionsClient.updateVersionCallable().futureCall(request);
   *   // Do something.
   *   Version response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateVersionRequest, Version> updateVersionCallable() {
    return stub.updateVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete the specified agent version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   VersionName name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]");
   *   versionsClient.deleteVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the version to delete. Supported formats: -
   *     `projects/&lt;Project ID&gt;/agent/versions/&lt;Version ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version ID&gt;`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteVersion(VersionName name) {
    DeleteVersionRequest request =
        DeleteVersionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete the specified agent version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   String name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString();
   *   versionsClient.deleteVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the version to delete. Supported formats: -
   *     `projects/&lt;Project ID&gt;/agent/versions/&lt;Version ID&gt;` - `projects/&lt;Project
   *     ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version ID&gt;`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteVersion(String name) {
    DeleteVersionRequest request = DeleteVersionRequest.newBuilder().setName(name).build();
    deleteVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete the specified agent version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   DeleteVersionRequest request =
   *       DeleteVersionRequest.newBuilder()
   *           .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .build();
   *   versionsClient.deleteVersion(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteVersion(DeleteVersionRequest request) {
    deleteVersionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Delete the specified agent version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (VersionsClient versionsClient = VersionsClient.create()) {
   *   DeleteVersionRequest request =
   *       DeleteVersionRequest.newBuilder()
   *           .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
   *           .build();
   *   ApiFuture<Empty> future = versionsClient.deleteVersionCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteVersionRequest, Empty> deleteVersionCallable() {
    return stub.deleteVersionCallable();
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

  public static class ListVersionsPagedResponse
      extends AbstractPagedListResponse<
          ListVersionsRequest,
          ListVersionsResponse,
          Version,
          ListVersionsPage,
          ListVersionsFixedSizeCollection> {

    public static ApiFuture<ListVersionsPagedResponse> createAsync(
        PageContext<ListVersionsRequest, ListVersionsResponse, Version> context,
        ApiFuture<ListVersionsResponse> futureResponse) {
      ApiFuture<ListVersionsPage> futurePage =
          ListVersionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListVersionsPage, ListVersionsPagedResponse>() {
            @Override
            public ListVersionsPagedResponse apply(ListVersionsPage input) {
              return new ListVersionsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListVersionsPagedResponse(ListVersionsPage page) {
      super(page, ListVersionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListVersionsPage
      extends AbstractPage<ListVersionsRequest, ListVersionsResponse, Version, ListVersionsPage> {

    private ListVersionsPage(
        PageContext<ListVersionsRequest, ListVersionsResponse, Version> context,
        ListVersionsResponse response) {
      super(context, response);
    }

    private static ListVersionsPage createEmptyPage() {
      return new ListVersionsPage(null, null);
    }

    @Override
    protected ListVersionsPage createPage(
        PageContext<ListVersionsRequest, ListVersionsResponse, Version> context,
        ListVersionsResponse response) {
      return new ListVersionsPage(context, response);
    }

    @Override
    public ApiFuture<ListVersionsPage> createPageAsync(
        PageContext<ListVersionsRequest, ListVersionsResponse, Version> context,
        ApiFuture<ListVersionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListVersionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListVersionsRequest,
          ListVersionsResponse,
          Version,
          ListVersionsPage,
          ListVersionsFixedSizeCollection> {

    private ListVersionsFixedSizeCollection(List<ListVersionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListVersionsFixedSizeCollection createEmptyCollection() {
      return new ListVersionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListVersionsFixedSizeCollection createCollection(
        List<ListVersionsPage> pages, int collectionSize) {
      return new ListVersionsFixedSizeCollection(pages, collectionSize);
    }
  }
}
