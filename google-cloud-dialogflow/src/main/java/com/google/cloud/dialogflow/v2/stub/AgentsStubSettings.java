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

package com.google.cloud.dialogflow.v2.stub;

import static com.google.cloud.dialogflow.v2.AgentsClient.SearchAgentsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.Agent;
import com.google.cloud.dialogflow.v2.DeleteAgentRequest;
import com.google.cloud.dialogflow.v2.ExportAgentRequest;
import com.google.cloud.dialogflow.v2.ExportAgentResponse;
import com.google.cloud.dialogflow.v2.GetAgentRequest;
import com.google.cloud.dialogflow.v2.GetValidationResultRequest;
import com.google.cloud.dialogflow.v2.ImportAgentRequest;
import com.google.cloud.dialogflow.v2.RestoreAgentRequest;
import com.google.cloud.dialogflow.v2.SearchAgentsRequest;
import com.google.cloud.dialogflow.v2.SearchAgentsResponse;
import com.google.cloud.dialogflow.v2.SetAgentRequest;
import com.google.cloud.dialogflow.v2.TrainAgentRequest;
import com.google.cloud.dialogflow.v2.ValidationResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link AgentsStub}.
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
 * <p>For example, to set the total timeout of getAgent to 30 seconds:
 *
 * <pre>{@code
 * AgentsStubSettings.Builder agentsSettingsBuilder = AgentsStubSettings.newBuilder();
 * agentsSettingsBuilder
 *     .getAgentSettings()
 *     .setRetrySettings(
 *         agentsSettingsBuilder
 *             .getAgentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AgentsStubSettings agentsSettings = agentsSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class AgentsStubSettings extends StubSettings<AgentsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final UnaryCallSettings<GetAgentRequest, Agent> getAgentSettings;
  private final UnaryCallSettings<SetAgentRequest, Agent> setAgentSettings;
  private final UnaryCallSettings<DeleteAgentRequest, Empty> deleteAgentSettings;
  private final PagedCallSettings<
          SearchAgentsRequest, SearchAgentsResponse, SearchAgentsPagedResponse>
      searchAgentsSettings;
  private final UnaryCallSettings<TrainAgentRequest, Operation> trainAgentSettings;
  private final OperationCallSettings<TrainAgentRequest, Empty, Struct> trainAgentOperationSettings;
  private final UnaryCallSettings<ExportAgentRequest, Operation> exportAgentSettings;
  private final OperationCallSettings<ExportAgentRequest, ExportAgentResponse, Struct>
      exportAgentOperationSettings;
  private final UnaryCallSettings<ImportAgentRequest, Operation> importAgentSettings;
  private final OperationCallSettings<ImportAgentRequest, Empty, Struct>
      importAgentOperationSettings;
  private final UnaryCallSettings<RestoreAgentRequest, Operation> restoreAgentSettings;
  private final OperationCallSettings<RestoreAgentRequest, Empty, Struct>
      restoreAgentOperationSettings;
  private final UnaryCallSettings<GetValidationResultRequest, ValidationResult>
      getValidationResultSettings;

  private static final PagedListDescriptor<SearchAgentsRequest, SearchAgentsResponse, Agent>
      SEARCH_AGENTS_PAGE_STR_DESC =
          new PagedListDescriptor<SearchAgentsRequest, SearchAgentsResponse, Agent>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchAgentsRequest injectToken(SearchAgentsRequest payload, String token) {
              return SearchAgentsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public SearchAgentsRequest injectPageSize(SearchAgentsRequest payload, int pageSize) {
              return SearchAgentsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(SearchAgentsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SearchAgentsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Agent> extractResources(SearchAgentsResponse payload) {
              return Objects.isNull(payload.getAgentsList())
                  ? ImmutableList.<Agent>of()
                  : payload.getAgentsList();
            }
          };

  private static final PagedListResponseFactory<
          SearchAgentsRequest, SearchAgentsResponse, SearchAgentsPagedResponse>
      SEARCH_AGENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchAgentsRequest, SearchAgentsResponse, SearchAgentsPagedResponse>() {
            @Override
            public ApiFuture<SearchAgentsPagedResponse> getFuturePagedResponse(
                UnaryCallable<SearchAgentsRequest, SearchAgentsResponse> callable,
                SearchAgentsRequest request,
                ApiCallContext context,
                ApiFuture<SearchAgentsResponse> futureResponse) {
              PageContext<SearchAgentsRequest, SearchAgentsResponse, Agent> pageContext =
                  PageContext.create(callable, SEARCH_AGENTS_PAGE_STR_DESC, request, context);
              return SearchAgentsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to getAgent. */
  public UnaryCallSettings<GetAgentRequest, Agent> getAgentSettings() {
    return getAgentSettings;
  }

  /** Returns the object with the settings used for calls to setAgent. */
  public UnaryCallSettings<SetAgentRequest, Agent> setAgentSettings() {
    return setAgentSettings;
  }

  /** Returns the object with the settings used for calls to deleteAgent. */
  public UnaryCallSettings<DeleteAgentRequest, Empty> deleteAgentSettings() {
    return deleteAgentSettings;
  }

  /** Returns the object with the settings used for calls to searchAgents. */
  public PagedCallSettings<SearchAgentsRequest, SearchAgentsResponse, SearchAgentsPagedResponse>
      searchAgentsSettings() {
    return searchAgentsSettings;
  }

  /** Returns the object with the settings used for calls to trainAgent. */
  public UnaryCallSettings<TrainAgentRequest, Operation> trainAgentSettings() {
    return trainAgentSettings;
  }

  /** Returns the object with the settings used for calls to trainAgent. */
  public OperationCallSettings<TrainAgentRequest, Empty, Struct> trainAgentOperationSettings() {
    return trainAgentOperationSettings;
  }

  /** Returns the object with the settings used for calls to exportAgent. */
  public UnaryCallSettings<ExportAgentRequest, Operation> exportAgentSettings() {
    return exportAgentSettings;
  }

  /** Returns the object with the settings used for calls to exportAgent. */
  public OperationCallSettings<ExportAgentRequest, ExportAgentResponse, Struct>
      exportAgentOperationSettings() {
    return exportAgentOperationSettings;
  }

  /** Returns the object with the settings used for calls to importAgent. */
  public UnaryCallSettings<ImportAgentRequest, Operation> importAgentSettings() {
    return importAgentSettings;
  }

  /** Returns the object with the settings used for calls to importAgent. */
  public OperationCallSettings<ImportAgentRequest, Empty, Struct> importAgentOperationSettings() {
    return importAgentOperationSettings;
  }

  /** Returns the object with the settings used for calls to restoreAgent. */
  public UnaryCallSettings<RestoreAgentRequest, Operation> restoreAgentSettings() {
    return restoreAgentSettings;
  }

  /** Returns the object with the settings used for calls to restoreAgent. */
  public OperationCallSettings<RestoreAgentRequest, Empty, Struct> restoreAgentOperationSettings() {
    return restoreAgentOperationSettings;
  }

  /** Returns the object with the settings used for calls to getValidationResult. */
  public UnaryCallSettings<GetValidationResultRequest, ValidationResult>
      getValidationResultSettings() {
    return getValidationResultSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AgentsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcAgentsStub.create(this);
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
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(AgentsStubSettings.class))
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

  protected AgentsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getAgentSettings = settingsBuilder.getAgentSettings().build();
    setAgentSettings = settingsBuilder.setAgentSettings().build();
    deleteAgentSettings = settingsBuilder.deleteAgentSettings().build();
    searchAgentsSettings = settingsBuilder.searchAgentsSettings().build();
    trainAgentSettings = settingsBuilder.trainAgentSettings().build();
    trainAgentOperationSettings = settingsBuilder.trainAgentOperationSettings().build();
    exportAgentSettings = settingsBuilder.exportAgentSettings().build();
    exportAgentOperationSettings = settingsBuilder.exportAgentOperationSettings().build();
    importAgentSettings = settingsBuilder.importAgentSettings().build();
    importAgentOperationSettings = settingsBuilder.importAgentOperationSettings().build();
    restoreAgentSettings = settingsBuilder.restoreAgentSettings().build();
    restoreAgentOperationSettings = settingsBuilder.restoreAgentOperationSettings().build();
    getValidationResultSettings = settingsBuilder.getValidationResultSettings().build();
  }

  /** Builder for AgentsStubSettings. */
  public static class Builder extends StubSettings.Builder<AgentsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<GetAgentRequest, Agent> getAgentSettings;
    private final UnaryCallSettings.Builder<SetAgentRequest, Agent> setAgentSettings;
    private final UnaryCallSettings.Builder<DeleteAgentRequest, Empty> deleteAgentSettings;
    private final PagedCallSettings.Builder<
            SearchAgentsRequest, SearchAgentsResponse, SearchAgentsPagedResponse>
        searchAgentsSettings;
    private final UnaryCallSettings.Builder<TrainAgentRequest, Operation> trainAgentSettings;
    private final OperationCallSettings.Builder<TrainAgentRequest, Empty, Struct>
        trainAgentOperationSettings;
    private final UnaryCallSettings.Builder<ExportAgentRequest, Operation> exportAgentSettings;
    private final OperationCallSettings.Builder<ExportAgentRequest, ExportAgentResponse, Struct>
        exportAgentOperationSettings;
    private final UnaryCallSettings.Builder<ImportAgentRequest, Operation> importAgentSettings;
    private final OperationCallSettings.Builder<ImportAgentRequest, Empty, Struct>
        importAgentOperationSettings;
    private final UnaryCallSettings.Builder<RestoreAgentRequest, Operation> restoreAgentSettings;
    private final OperationCallSettings.Builder<RestoreAgentRequest, Empty, Struct>
        restoreAgentOperationSettings;
    private final UnaryCallSettings.Builder<GetValidationResultRequest, ValidationResult>
        getValidationResultSettings;
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

      getAgentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setAgentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteAgentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      searchAgentsSettings = PagedCallSettings.newBuilder(SEARCH_AGENTS_PAGE_STR_FACT);
      trainAgentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      trainAgentOperationSettings = OperationCallSettings.newBuilder();
      exportAgentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      exportAgentOperationSettings = OperationCallSettings.newBuilder();
      importAgentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      importAgentOperationSettings = OperationCallSettings.newBuilder();
      restoreAgentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      restoreAgentOperationSettings = OperationCallSettings.newBuilder();
      getValidationResultSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getAgentSettings,
              setAgentSettings,
              deleteAgentSettings,
              searchAgentsSettings,
              trainAgentSettings,
              exportAgentSettings,
              importAgentSettings,
              restoreAgentSettings,
              getValidationResultSettings);
      initDefaults(this);
    }

    protected Builder(AgentsStubSettings settings) {
      super(settings);

      getAgentSettings = settings.getAgentSettings.toBuilder();
      setAgentSettings = settings.setAgentSettings.toBuilder();
      deleteAgentSettings = settings.deleteAgentSettings.toBuilder();
      searchAgentsSettings = settings.searchAgentsSettings.toBuilder();
      trainAgentSettings = settings.trainAgentSettings.toBuilder();
      trainAgentOperationSettings = settings.trainAgentOperationSettings.toBuilder();
      exportAgentSettings = settings.exportAgentSettings.toBuilder();
      exportAgentOperationSettings = settings.exportAgentOperationSettings.toBuilder();
      importAgentSettings = settings.importAgentSettings.toBuilder();
      importAgentOperationSettings = settings.importAgentOperationSettings.toBuilder();
      restoreAgentSettings = settings.restoreAgentSettings.toBuilder();
      restoreAgentOperationSettings = settings.restoreAgentOperationSettings.toBuilder();
      getValidationResultSettings = settings.getValidationResultSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getAgentSettings,
              setAgentSettings,
              deleteAgentSettings,
              searchAgentsSettings,
              trainAgentSettings,
              exportAgentSettings,
              importAgentSettings,
              restoreAgentSettings,
              getValidationResultSettings);
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
          .getAgentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .setAgentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteAgentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .searchAgentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .trainAgentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .exportAgentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .importAgentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .restoreAgentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getValidationResultSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .trainAgentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<TrainAgentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Struct.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .exportAgentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<ExportAgentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ExportAgentResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Struct.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .importAgentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<ImportAgentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Struct.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .restoreAgentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RestoreAgentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Struct.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

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

    /** Returns the builder for the settings used for calls to getAgent. */
    public UnaryCallSettings.Builder<GetAgentRequest, Agent> getAgentSettings() {
      return getAgentSettings;
    }

    /** Returns the builder for the settings used for calls to setAgent. */
    public UnaryCallSettings.Builder<SetAgentRequest, Agent> setAgentSettings() {
      return setAgentSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAgent. */
    public UnaryCallSettings.Builder<DeleteAgentRequest, Empty> deleteAgentSettings() {
      return deleteAgentSettings;
    }

    /** Returns the builder for the settings used for calls to searchAgents. */
    public PagedCallSettings.Builder<
            SearchAgentsRequest, SearchAgentsResponse, SearchAgentsPagedResponse>
        searchAgentsSettings() {
      return searchAgentsSettings;
    }

    /** Returns the builder for the settings used for calls to trainAgent. */
    public UnaryCallSettings.Builder<TrainAgentRequest, Operation> trainAgentSettings() {
      return trainAgentSettings;
    }

    /** Returns the builder for the settings used for calls to trainAgent. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<TrainAgentRequest, Empty, Struct>
        trainAgentOperationSettings() {
      return trainAgentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to exportAgent. */
    public UnaryCallSettings.Builder<ExportAgentRequest, Operation> exportAgentSettings() {
      return exportAgentSettings;
    }

    /** Returns the builder for the settings used for calls to exportAgent. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<ExportAgentRequest, ExportAgentResponse, Struct>
        exportAgentOperationSettings() {
      return exportAgentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to importAgent. */
    public UnaryCallSettings.Builder<ImportAgentRequest, Operation> importAgentSettings() {
      return importAgentSettings;
    }

    /** Returns the builder for the settings used for calls to importAgent. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<ImportAgentRequest, Empty, Struct>
        importAgentOperationSettings() {
      return importAgentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to restoreAgent. */
    public UnaryCallSettings.Builder<RestoreAgentRequest, Operation> restoreAgentSettings() {
      return restoreAgentSettings;
    }

    /** Returns the builder for the settings used for calls to restoreAgent. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<RestoreAgentRequest, Empty, Struct>
        restoreAgentOperationSettings() {
      return restoreAgentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getValidationResult. */
    public UnaryCallSettings.Builder<GetValidationResultRequest, ValidationResult>
        getValidationResultSettings() {
      return getValidationResultSettings;
    }

    @Override
    public AgentsStubSettings build() throws IOException {
      return new AgentsStubSettings(this);
    }
  }
}
