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

package com.google.cloud.dialogflow.v2.stub;

import static com.google.cloud.dialogflow.v2.VersionsClient.ListVersionsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.CreateVersionRequest;
import com.google.cloud.dialogflow.v2.DeleteVersionRequest;
import com.google.cloud.dialogflow.v2.GetVersionRequest;
import com.google.cloud.dialogflow.v2.ListVersionsRequest;
import com.google.cloud.dialogflow.v2.ListVersionsResponse;
import com.google.cloud.dialogflow.v2.UpdateVersionRequest;
import com.google.cloud.dialogflow.v2.Version;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link VersionsStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getVersion to 30 seconds:
 *
 * <pre>{@code
 * VersionsStubSettings.Builder versionsSettingsBuilder = VersionsStubSettings.newBuilder();
 * versionsSettingsBuilder
 *     .getVersionSettings()
 *     .setRetrySettings(
 *         versionsSettingsBuilder
 *             .getVersionSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * VersionsStubSettings versionsSettings = versionsSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class VersionsStubSettings extends StubSettings<VersionsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final PagedCallSettings<
          ListVersionsRequest, ListVersionsResponse, ListVersionsPagedResponse>
      listVersionsSettings;
  private final UnaryCallSettings<GetVersionRequest, Version> getVersionSettings;
  private final UnaryCallSettings<CreateVersionRequest, Version> createVersionSettings;
  private final UnaryCallSettings<UpdateVersionRequest, Version> updateVersionSettings;
  private final UnaryCallSettings<DeleteVersionRequest, Empty> deleteVersionSettings;

  private static final PagedListDescriptor<ListVersionsRequest, ListVersionsResponse, Version>
      LIST_VERSIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListVersionsRequest, ListVersionsResponse, Version>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListVersionsRequest injectToken(ListVersionsRequest payload, String token) {
              return ListVersionsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListVersionsRequest injectPageSize(ListVersionsRequest payload, int pageSize) {
              return ListVersionsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListVersionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListVersionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Version> extractResources(ListVersionsResponse payload) {
              return payload.getVersionsList() == null
                  ? ImmutableList.<Version>of()
                  : payload.getVersionsList();
            }
          };

  private static final PagedListResponseFactory<
          ListVersionsRequest, ListVersionsResponse, ListVersionsPagedResponse>
      LIST_VERSIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListVersionsRequest, ListVersionsResponse, ListVersionsPagedResponse>() {
            @Override
            public ApiFuture<ListVersionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListVersionsRequest, ListVersionsResponse> callable,
                ListVersionsRequest request,
                ApiCallContext context,
                ApiFuture<ListVersionsResponse> futureResponse) {
              PageContext<ListVersionsRequest, ListVersionsResponse, Version> pageContext =
                  PageContext.create(callable, LIST_VERSIONS_PAGE_STR_DESC, request, context);
              return ListVersionsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listVersions. */
  public PagedCallSettings<ListVersionsRequest, ListVersionsResponse, ListVersionsPagedResponse>
      listVersionsSettings() {
    return listVersionsSettings;
  }

  /** Returns the object with the settings used for calls to getVersion. */
  public UnaryCallSettings<GetVersionRequest, Version> getVersionSettings() {
    return getVersionSettings;
  }

  /** Returns the object with the settings used for calls to createVersion. */
  public UnaryCallSettings<CreateVersionRequest, Version> createVersionSettings() {
    return createVersionSettings;
  }

  /** Returns the object with the settings used for calls to updateVersion. */
  public UnaryCallSettings<UpdateVersionRequest, Version> updateVersionSettings() {
    return updateVersionSettings;
  }

  /** Returns the object with the settings used for calls to deleteVersion. */
  public UnaryCallSettings<DeleteVersionRequest, Empty> deleteVersionSettings() {
    return deleteVersionSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public VersionsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcVersionsStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "dialogflow.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(VersionsStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected VersionsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listVersionsSettings = settingsBuilder.listVersionsSettings().build();
    getVersionSettings = settingsBuilder.getVersionSettings().build();
    createVersionSettings = settingsBuilder.createVersionSettings().build();
    updateVersionSettings = settingsBuilder.updateVersionSettings().build();
    deleteVersionSettings = settingsBuilder.deleteVersionSettings().build();
  }

  /** Builder for VersionsStubSettings. */
  public static class Builder extends StubSettings.Builder<VersionsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListVersionsRequest, ListVersionsResponse, ListVersionsPagedResponse>
        listVersionsSettings;
    private final UnaryCallSettings.Builder<GetVersionRequest, Version> getVersionSettings;
    private final UnaryCallSettings.Builder<CreateVersionRequest, Version> createVersionSettings;
    private final UnaryCallSettings.Builder<UpdateVersionRequest, Version> updateVersionSettings;
    private final UnaryCallSettings.Builder<DeleteVersionRequest, Empty> deleteVersionSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listVersionsSettings = PagedCallSettings.newBuilder(LIST_VERSIONS_PAGE_STR_FACT);
      getVersionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createVersionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateVersionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteVersionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listVersionsSettings,
              getVersionSettings,
              createVersionSettings,
              updateVersionSettings,
              deleteVersionSettings);
      initDefaults(this);
    }

    protected Builder(VersionsStubSettings settings) {
      super(settings);

      listVersionsSettings = settings.listVersionsSettings.toBuilder();
      getVersionSettings = settings.getVersionSettings.toBuilder();
      createVersionSettings = settings.createVersionSettings.toBuilder();
      updateVersionSettings = settings.updateVersionSettings.toBuilder();
      deleteVersionSettings = settings.deleteVersionSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listVersionsSettings,
              getVersionSettings,
              createVersionSettings,
              updateVersionSettings,
              deleteVersionSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listVersionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getVersionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createVersionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateVersionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteVersionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listVersions. */
    public PagedCallSettings.Builder<
            ListVersionsRequest, ListVersionsResponse, ListVersionsPagedResponse>
        listVersionsSettings() {
      return listVersionsSettings;
    }

    /** Returns the builder for the settings used for calls to getVersion. */
    public UnaryCallSettings.Builder<GetVersionRequest, Version> getVersionSettings() {
      return getVersionSettings;
    }

    /** Returns the builder for the settings used for calls to createVersion. */
    public UnaryCallSettings.Builder<CreateVersionRequest, Version> createVersionSettings() {
      return createVersionSettings;
    }

    /** Returns the builder for the settings used for calls to updateVersion. */
    public UnaryCallSettings.Builder<UpdateVersionRequest, Version> updateVersionSettings() {
      return updateVersionSettings;
    }

    /** Returns the builder for the settings used for calls to deleteVersion. */
    public UnaryCallSettings.Builder<DeleteVersionRequest, Empty> deleteVersionSettings() {
      return deleteVersionSettings;
    }

    @Override
    public VersionsStubSettings build() throws IOException {
      return new VersionsStubSettings(this);
    }
  }
}
