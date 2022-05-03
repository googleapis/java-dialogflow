/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.ConversationProfilesClient.ListConversationProfilesPagedResponse;

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
import com.google.cloud.dialogflow.v2beta1.ClearSuggestionFeatureConfigOperationMetadata;
import com.google.cloud.dialogflow.v2beta1.ClearSuggestionFeatureConfigRequest;
import com.google.cloud.dialogflow.v2beta1.ConversationProfile;
import com.google.cloud.dialogflow.v2beta1.CreateConversationProfileRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteConversationProfileRequest;
import com.google.cloud.dialogflow.v2beta1.GetConversationProfileRequest;
import com.google.cloud.dialogflow.v2beta1.ListConversationProfilesRequest;
import com.google.cloud.dialogflow.v2beta1.ListConversationProfilesResponse;
import com.google.cloud.dialogflow.v2beta1.SetSuggestionFeatureConfigOperationMetadata;
import com.google.cloud.dialogflow.v2beta1.SetSuggestionFeatureConfigRequest;
import com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ConversationProfilesStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getConversationProfile to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * ConversationProfilesStubSettings.Builder conversationProfilesSettingsBuilder =
 *     ConversationProfilesStubSettings.newBuilder();
 * conversationProfilesSettingsBuilder
 *     .getConversationProfileSettings()
 *     .setRetrySettings(
 *         conversationProfilesSettingsBuilder
 *             .getConversationProfileSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ConversationProfilesStubSettings conversationProfilesSettings =
 *     conversationProfilesSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ConversationProfilesStubSettings
    extends StubSettings<ConversationProfilesStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final PagedCallSettings<
          ListConversationProfilesRequest, ListConversationProfilesResponse,
          ListConversationProfilesPagedResponse>
      listConversationProfilesSettings;
  private final UnaryCallSettings<GetConversationProfileRequest, ConversationProfile>
      getConversationProfileSettings;
  private final UnaryCallSettings<CreateConversationProfileRequest, ConversationProfile>
      createConversationProfileSettings;
  private final UnaryCallSettings<UpdateConversationProfileRequest, ConversationProfile>
      updateConversationProfileSettings;
  private final UnaryCallSettings<DeleteConversationProfileRequest, Empty>
      deleteConversationProfileSettings;
  private final UnaryCallSettings<SetSuggestionFeatureConfigRequest, Operation>
      setSuggestionFeatureConfigSettings;
  private final OperationCallSettings<
          SetSuggestionFeatureConfigRequest, ConversationProfile,
          SetSuggestionFeatureConfigOperationMetadata>
      setSuggestionFeatureConfigOperationSettings;
  private final UnaryCallSettings<ClearSuggestionFeatureConfigRequest, Operation>
      clearSuggestionFeatureConfigSettings;
  private final OperationCallSettings<
          ClearSuggestionFeatureConfigRequest, ConversationProfile,
          ClearSuggestionFeatureConfigOperationMetadata>
      clearSuggestionFeatureConfigOperationSettings;

  private static final PagedListDescriptor<
          ListConversationProfilesRequest, ListConversationProfilesResponse, ConversationProfile>
      LIST_CONVERSATION_PROFILES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListConversationProfilesRequest, ListConversationProfilesResponse,
              ConversationProfile>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListConversationProfilesRequest injectToken(
                ListConversationProfilesRequest payload, String token) {
              return ListConversationProfilesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListConversationProfilesRequest injectPageSize(
                ListConversationProfilesRequest payload, int pageSize) {
              return ListConversationProfilesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListConversationProfilesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListConversationProfilesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ConversationProfile> extractResources(
                ListConversationProfilesResponse payload) {
              return payload.getConversationProfilesList() == null
                  ? ImmutableList.<ConversationProfile>of()
                  : payload.getConversationProfilesList();
            }
          };

  private static final PagedListResponseFactory<
          ListConversationProfilesRequest, ListConversationProfilesResponse,
          ListConversationProfilesPagedResponse>
      LIST_CONVERSATION_PROFILES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListConversationProfilesRequest, ListConversationProfilesResponse,
              ListConversationProfilesPagedResponse>() {
            @Override
            public ApiFuture<ListConversationProfilesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListConversationProfilesRequest, ListConversationProfilesResponse>
                    callable,
                ListConversationProfilesRequest request,
                ApiCallContext context,
                ApiFuture<ListConversationProfilesResponse> futureResponse) {
              PageContext<
                      ListConversationProfilesRequest, ListConversationProfilesResponse,
                      ConversationProfile>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CONVERSATION_PROFILES_PAGE_STR_DESC, request, context);
              return ListConversationProfilesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listConversationProfiles. */
  public PagedCallSettings<
          ListConversationProfilesRequest, ListConversationProfilesResponse,
          ListConversationProfilesPagedResponse>
      listConversationProfilesSettings() {
    return listConversationProfilesSettings;
  }

  /** Returns the object with the settings used for calls to getConversationProfile. */
  public UnaryCallSettings<GetConversationProfileRequest, ConversationProfile>
      getConversationProfileSettings() {
    return getConversationProfileSettings;
  }

  /** Returns the object with the settings used for calls to createConversationProfile. */
  public UnaryCallSettings<CreateConversationProfileRequest, ConversationProfile>
      createConversationProfileSettings() {
    return createConversationProfileSettings;
  }

  /** Returns the object with the settings used for calls to updateConversationProfile. */
  public UnaryCallSettings<UpdateConversationProfileRequest, ConversationProfile>
      updateConversationProfileSettings() {
    return updateConversationProfileSettings;
  }

  /** Returns the object with the settings used for calls to deleteConversationProfile. */
  public UnaryCallSettings<DeleteConversationProfileRequest, Empty>
      deleteConversationProfileSettings() {
    return deleteConversationProfileSettings;
  }

  /** Returns the object with the settings used for calls to setSuggestionFeatureConfig. */
  public UnaryCallSettings<SetSuggestionFeatureConfigRequest, Operation>
      setSuggestionFeatureConfigSettings() {
    return setSuggestionFeatureConfigSettings;
  }

  /** Returns the object with the settings used for calls to setSuggestionFeatureConfig. */
  public OperationCallSettings<
          SetSuggestionFeatureConfigRequest, ConversationProfile,
          SetSuggestionFeatureConfigOperationMetadata>
      setSuggestionFeatureConfigOperationSettings() {
    return setSuggestionFeatureConfigOperationSettings;
  }

  /** Returns the object with the settings used for calls to clearSuggestionFeatureConfig. */
  public UnaryCallSettings<ClearSuggestionFeatureConfigRequest, Operation>
      clearSuggestionFeatureConfigSettings() {
    return clearSuggestionFeatureConfigSettings;
  }

  /** Returns the object with the settings used for calls to clearSuggestionFeatureConfig. */
  public OperationCallSettings<
          ClearSuggestionFeatureConfigRequest, ConversationProfile,
          ClearSuggestionFeatureConfigOperationMetadata>
      clearSuggestionFeatureConfigOperationSettings() {
    return clearSuggestionFeatureConfigOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ConversationProfilesStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcConversationProfilesStub.create(this);
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

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "dialogflow.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
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
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ConversationProfilesStubSettings.class))
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

  protected ConversationProfilesStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listConversationProfilesSettings = settingsBuilder.listConversationProfilesSettings().build();
    getConversationProfileSettings = settingsBuilder.getConversationProfileSettings().build();
    createConversationProfileSettings = settingsBuilder.createConversationProfileSettings().build();
    updateConversationProfileSettings = settingsBuilder.updateConversationProfileSettings().build();
    deleteConversationProfileSettings = settingsBuilder.deleteConversationProfileSettings().build();
    setSuggestionFeatureConfigSettings =
        settingsBuilder.setSuggestionFeatureConfigSettings().build();
    setSuggestionFeatureConfigOperationSettings =
        settingsBuilder.setSuggestionFeatureConfigOperationSettings().build();
    clearSuggestionFeatureConfigSettings =
        settingsBuilder.clearSuggestionFeatureConfigSettings().build();
    clearSuggestionFeatureConfigOperationSettings =
        settingsBuilder.clearSuggestionFeatureConfigOperationSettings().build();
  }

  /** Builder for ConversationProfilesStubSettings. */
  public static class Builder
      extends StubSettings.Builder<ConversationProfilesStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListConversationProfilesRequest, ListConversationProfilesResponse,
            ListConversationProfilesPagedResponse>
        listConversationProfilesSettings;
    private final UnaryCallSettings.Builder<GetConversationProfileRequest, ConversationProfile>
        getConversationProfileSettings;
    private final UnaryCallSettings.Builder<CreateConversationProfileRequest, ConversationProfile>
        createConversationProfileSettings;
    private final UnaryCallSettings.Builder<UpdateConversationProfileRequest, ConversationProfile>
        updateConversationProfileSettings;
    private final UnaryCallSettings.Builder<DeleteConversationProfileRequest, Empty>
        deleteConversationProfileSettings;
    private final UnaryCallSettings.Builder<SetSuggestionFeatureConfigRequest, Operation>
        setSuggestionFeatureConfigSettings;
    private final OperationCallSettings.Builder<
            SetSuggestionFeatureConfigRequest, ConversationProfile,
            SetSuggestionFeatureConfigOperationMetadata>
        setSuggestionFeatureConfigOperationSettings;
    private final UnaryCallSettings.Builder<ClearSuggestionFeatureConfigRequest, Operation>
        clearSuggestionFeatureConfigSettings;
    private final OperationCallSettings.Builder<
            ClearSuggestionFeatureConfigRequest, ConversationProfile,
            ClearSuggestionFeatureConfigOperationMetadata>
        clearSuggestionFeatureConfigOperationSettings;
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

      listConversationProfilesSettings =
          PagedCallSettings.newBuilder(LIST_CONVERSATION_PROFILES_PAGE_STR_FACT);
      getConversationProfileSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createConversationProfileSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateConversationProfileSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteConversationProfileSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setSuggestionFeatureConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setSuggestionFeatureConfigOperationSettings = OperationCallSettings.newBuilder();
      clearSuggestionFeatureConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      clearSuggestionFeatureConfigOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listConversationProfilesSettings,
              getConversationProfileSettings,
              createConversationProfileSettings,
              updateConversationProfileSettings,
              deleteConversationProfileSettings,
              setSuggestionFeatureConfigSettings,
              clearSuggestionFeatureConfigSettings);
      initDefaults(this);
    }

    protected Builder(ConversationProfilesStubSettings settings) {
      super(settings);

      listConversationProfilesSettings = settings.listConversationProfilesSettings.toBuilder();
      getConversationProfileSettings = settings.getConversationProfileSettings.toBuilder();
      createConversationProfileSettings = settings.createConversationProfileSettings.toBuilder();
      updateConversationProfileSettings = settings.updateConversationProfileSettings.toBuilder();
      deleteConversationProfileSettings = settings.deleteConversationProfileSettings.toBuilder();
      setSuggestionFeatureConfigSettings = settings.setSuggestionFeatureConfigSettings.toBuilder();
      setSuggestionFeatureConfigOperationSettings =
          settings.setSuggestionFeatureConfigOperationSettings.toBuilder();
      clearSuggestionFeatureConfigSettings =
          settings.clearSuggestionFeatureConfigSettings.toBuilder();
      clearSuggestionFeatureConfigOperationSettings =
          settings.clearSuggestionFeatureConfigOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listConversationProfilesSettings,
              getConversationProfileSettings,
              createConversationProfileSettings,
              updateConversationProfileSettings,
              deleteConversationProfileSettings,
              setSuggestionFeatureConfigSettings,
              clearSuggestionFeatureConfigSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listConversationProfilesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getConversationProfileSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createConversationProfileSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateConversationProfileSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteConversationProfileSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .setSuggestionFeatureConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .clearSuggestionFeatureConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .setSuggestionFeatureConfigOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetSuggestionFeatureConfigRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ConversationProfile.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  SetSuggestionFeatureConfigOperationMetadata.class))
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
          .clearSuggestionFeatureConfigOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ClearSuggestionFeatureConfigRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ConversationProfile.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  ClearSuggestionFeatureConfigOperationMetadata.class))
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

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listConversationProfiles. */
    public PagedCallSettings.Builder<
            ListConversationProfilesRequest, ListConversationProfilesResponse,
            ListConversationProfilesPagedResponse>
        listConversationProfilesSettings() {
      return listConversationProfilesSettings;
    }

    /** Returns the builder for the settings used for calls to getConversationProfile. */
    public UnaryCallSettings.Builder<GetConversationProfileRequest, ConversationProfile>
        getConversationProfileSettings() {
      return getConversationProfileSettings;
    }

    /** Returns the builder for the settings used for calls to createConversationProfile. */
    public UnaryCallSettings.Builder<CreateConversationProfileRequest, ConversationProfile>
        createConversationProfileSettings() {
      return createConversationProfileSettings;
    }

    /** Returns the builder for the settings used for calls to updateConversationProfile. */
    public UnaryCallSettings.Builder<UpdateConversationProfileRequest, ConversationProfile>
        updateConversationProfileSettings() {
      return updateConversationProfileSettings;
    }

    /** Returns the builder for the settings used for calls to deleteConversationProfile. */
    public UnaryCallSettings.Builder<DeleteConversationProfileRequest, Empty>
        deleteConversationProfileSettings() {
      return deleteConversationProfileSettings;
    }

    /** Returns the builder for the settings used for calls to setSuggestionFeatureConfig. */
    public UnaryCallSettings.Builder<SetSuggestionFeatureConfigRequest, Operation>
        setSuggestionFeatureConfigSettings() {
      return setSuggestionFeatureConfigSettings;
    }

    /** Returns the builder for the settings used for calls to setSuggestionFeatureConfig. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            SetSuggestionFeatureConfigRequest, ConversationProfile,
            SetSuggestionFeatureConfigOperationMetadata>
        setSuggestionFeatureConfigOperationSettings() {
      return setSuggestionFeatureConfigOperationSettings;
    }

    /** Returns the builder for the settings used for calls to clearSuggestionFeatureConfig. */
    public UnaryCallSettings.Builder<ClearSuggestionFeatureConfigRequest, Operation>
        clearSuggestionFeatureConfigSettings() {
      return clearSuggestionFeatureConfigSettings;
    }

    /** Returns the builder for the settings used for calls to clearSuggestionFeatureConfig. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            ClearSuggestionFeatureConfigRequest, ConversationProfile,
            ClearSuggestionFeatureConfigOperationMetadata>
        clearSuggestionFeatureConfigOperationSettings() {
      return clearSuggestionFeatureConfigOperationSettings;
    }

    @Override
    public ConversationProfilesStubSettings build() throws IOException {
      return new ConversationProfilesStubSettings(this);
    }
  }
}
