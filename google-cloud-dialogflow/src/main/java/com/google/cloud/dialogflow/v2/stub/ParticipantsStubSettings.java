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

import static com.google.cloud.dialogflow.v2.ParticipantsClient.ListParticipantsPagedResponse;

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
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.AnalyzeContentRequest;
import com.google.cloud.dialogflow.v2.AnalyzeContentResponse;
import com.google.cloud.dialogflow.v2.CreateParticipantRequest;
import com.google.cloud.dialogflow.v2.GetParticipantRequest;
import com.google.cloud.dialogflow.v2.ListParticipantsRequest;
import com.google.cloud.dialogflow.v2.ListParticipantsResponse;
import com.google.cloud.dialogflow.v2.Participant;
import com.google.cloud.dialogflow.v2.StreamingAnalyzeContentRequest;
import com.google.cloud.dialogflow.v2.StreamingAnalyzeContentResponse;
import com.google.cloud.dialogflow.v2.SuggestArticlesRequest;
import com.google.cloud.dialogflow.v2.SuggestArticlesResponse;
import com.google.cloud.dialogflow.v2.SuggestFaqAnswersRequest;
import com.google.cloud.dialogflow.v2.SuggestFaqAnswersResponse;
import com.google.cloud.dialogflow.v2.UpdateParticipantRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ParticipantsStub}.
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
 * <p>For example, to set the total timeout of createParticipant to 30 seconds:
 *
 * <pre>{@code
 * ParticipantsStubSettings.Builder participantsSettingsBuilder =
 *     ParticipantsStubSettings.newBuilder();
 * participantsSettingsBuilder
 *     .createParticipantSettings()
 *     .setRetrySettings(
 *         participantsSettingsBuilder
 *             .createParticipantSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ParticipantsStubSettings participantsSettings = participantsSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ParticipantsStubSettings extends StubSettings<ParticipantsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final UnaryCallSettings<CreateParticipantRequest, Participant> createParticipantSettings;
  private final UnaryCallSettings<GetParticipantRequest, Participant> getParticipantSettings;
  private final PagedCallSettings<
          ListParticipantsRequest, ListParticipantsResponse, ListParticipantsPagedResponse>
      listParticipantsSettings;
  private final UnaryCallSettings<UpdateParticipantRequest, Participant> updateParticipantSettings;
  private final UnaryCallSettings<AnalyzeContentRequest, AnalyzeContentResponse>
      analyzeContentSettings;
  private final StreamingCallSettings<
          StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
      streamingAnalyzeContentSettings;
  private final UnaryCallSettings<SuggestArticlesRequest, SuggestArticlesResponse>
      suggestArticlesSettings;
  private final UnaryCallSettings<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
      suggestFaqAnswersSettings;

  private static final PagedListDescriptor<
          ListParticipantsRequest, ListParticipantsResponse, Participant>
      LIST_PARTICIPANTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListParticipantsRequest, ListParticipantsResponse, Participant>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListParticipantsRequest injectToken(
                ListParticipantsRequest payload, String token) {
              return ListParticipantsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListParticipantsRequest injectPageSize(
                ListParticipantsRequest payload, int pageSize) {
              return ListParticipantsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListParticipantsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListParticipantsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Participant> extractResources(ListParticipantsResponse payload) {
              return payload.getParticipantsList() == null
                  ? ImmutableList.<Participant>of()
                  : payload.getParticipantsList();
            }
          };

  private static final PagedListResponseFactory<
          ListParticipantsRequest, ListParticipantsResponse, ListParticipantsPagedResponse>
      LIST_PARTICIPANTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListParticipantsRequest, ListParticipantsResponse, ListParticipantsPagedResponse>() {
            @Override
            public ApiFuture<ListParticipantsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListParticipantsRequest, ListParticipantsResponse> callable,
                ListParticipantsRequest request,
                ApiCallContext context,
                ApiFuture<ListParticipantsResponse> futureResponse) {
              PageContext<ListParticipantsRequest, ListParticipantsResponse, Participant>
                  pageContext =
                      PageContext.create(
                          callable, LIST_PARTICIPANTS_PAGE_STR_DESC, request, context);
              return ListParticipantsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createParticipant. */
  public UnaryCallSettings<CreateParticipantRequest, Participant> createParticipantSettings() {
    return createParticipantSettings;
  }

  /** Returns the object with the settings used for calls to getParticipant. */
  public UnaryCallSettings<GetParticipantRequest, Participant> getParticipantSettings() {
    return getParticipantSettings;
  }

  /** Returns the object with the settings used for calls to listParticipants. */
  public PagedCallSettings<
          ListParticipantsRequest, ListParticipantsResponse, ListParticipantsPagedResponse>
      listParticipantsSettings() {
    return listParticipantsSettings;
  }

  /** Returns the object with the settings used for calls to updateParticipant. */
  public UnaryCallSettings<UpdateParticipantRequest, Participant> updateParticipantSettings() {
    return updateParticipantSettings;
  }

  /** Returns the object with the settings used for calls to analyzeContent. */
  public UnaryCallSettings<AnalyzeContentRequest, AnalyzeContentResponse> analyzeContentSettings() {
    return analyzeContentSettings;
  }

  /** Returns the object with the settings used for calls to streamingAnalyzeContent. */
  public StreamingCallSettings<StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
      streamingAnalyzeContentSettings() {
    return streamingAnalyzeContentSettings;
  }

  /** Returns the object with the settings used for calls to suggestArticles. */
  public UnaryCallSettings<SuggestArticlesRequest, SuggestArticlesResponse>
      suggestArticlesSettings() {
    return suggestArticlesSettings;
  }

  /** Returns the object with the settings used for calls to suggestFaqAnswers. */
  public UnaryCallSettings<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
      suggestFaqAnswersSettings() {
    return suggestFaqAnswersSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ParticipantsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcParticipantsStub.create(this);
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
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ParticipantsStubSettings.class))
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

  protected ParticipantsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createParticipantSettings = settingsBuilder.createParticipantSettings().build();
    getParticipantSettings = settingsBuilder.getParticipantSettings().build();
    listParticipantsSettings = settingsBuilder.listParticipantsSettings().build();
    updateParticipantSettings = settingsBuilder.updateParticipantSettings().build();
    analyzeContentSettings = settingsBuilder.analyzeContentSettings().build();
    streamingAnalyzeContentSettings = settingsBuilder.streamingAnalyzeContentSettings().build();
    suggestArticlesSettings = settingsBuilder.suggestArticlesSettings().build();
    suggestFaqAnswersSettings = settingsBuilder.suggestFaqAnswersSettings().build();
  }

  /** Builder for ParticipantsStubSettings. */
  public static class Builder extends StubSettings.Builder<ParticipantsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateParticipantRequest, Participant>
        createParticipantSettings;
    private final UnaryCallSettings.Builder<GetParticipantRequest, Participant>
        getParticipantSettings;
    private final PagedCallSettings.Builder<
            ListParticipantsRequest, ListParticipantsResponse, ListParticipantsPagedResponse>
        listParticipantsSettings;
    private final UnaryCallSettings.Builder<UpdateParticipantRequest, Participant>
        updateParticipantSettings;
    private final UnaryCallSettings.Builder<AnalyzeContentRequest, AnalyzeContentResponse>
        analyzeContentSettings;
    private final StreamingCallSettings.Builder<
            StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
        streamingAnalyzeContentSettings;
    private final UnaryCallSettings.Builder<SuggestArticlesRequest, SuggestArticlesResponse>
        suggestArticlesSettings;
    private final UnaryCallSettings.Builder<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
        suggestFaqAnswersSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "no_retry_2_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
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
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(220000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(220000L))
              .setTotalTimeout(Duration.ofMillis(220000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(220000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(220000L))
              .setTotalTimeout(Duration.ofMillis(220000L))
              .build();
      definitions.put("no_retry_2_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createParticipantSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getParticipantSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listParticipantsSettings = PagedCallSettings.newBuilder(LIST_PARTICIPANTS_PAGE_STR_FACT);
      updateParticipantSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      analyzeContentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      streamingAnalyzeContentSettings = StreamingCallSettings.newBuilder();
      suggestArticlesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      suggestFaqAnswersSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createParticipantSettings,
              getParticipantSettings,
              listParticipantsSettings,
              updateParticipantSettings,
              analyzeContentSettings,
              suggestArticlesSettings,
              suggestFaqAnswersSettings);
      initDefaults(this);
    }

    protected Builder(ParticipantsStubSettings settings) {
      super(settings);

      createParticipantSettings = settings.createParticipantSettings.toBuilder();
      getParticipantSettings = settings.getParticipantSettings.toBuilder();
      listParticipantsSettings = settings.listParticipantsSettings.toBuilder();
      updateParticipantSettings = settings.updateParticipantSettings.toBuilder();
      analyzeContentSettings = settings.analyzeContentSettings.toBuilder();
      streamingAnalyzeContentSettings = settings.streamingAnalyzeContentSettings.toBuilder();
      suggestArticlesSettings = settings.suggestArticlesSettings.toBuilder();
      suggestFaqAnswersSettings = settings.suggestFaqAnswersSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createParticipantSettings,
              getParticipantSettings,
              listParticipantsSettings,
              updateParticipantSettings,
              analyzeContentSettings,
              suggestArticlesSettings,
              suggestFaqAnswersSettings);
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
          .createParticipantSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getParticipantSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listParticipantsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateParticipantSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .analyzeContentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .suggestArticlesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .suggestFaqAnswersSettings()
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

    /** Returns the builder for the settings used for calls to createParticipant. */
    public UnaryCallSettings.Builder<CreateParticipantRequest, Participant>
        createParticipantSettings() {
      return createParticipantSettings;
    }

    /** Returns the builder for the settings used for calls to getParticipant. */
    public UnaryCallSettings.Builder<GetParticipantRequest, Participant> getParticipantSettings() {
      return getParticipantSettings;
    }

    /** Returns the builder for the settings used for calls to listParticipants. */
    public PagedCallSettings.Builder<
            ListParticipantsRequest, ListParticipantsResponse, ListParticipantsPagedResponse>
        listParticipantsSettings() {
      return listParticipantsSettings;
    }

    /** Returns the builder for the settings used for calls to updateParticipant. */
    public UnaryCallSettings.Builder<UpdateParticipantRequest, Participant>
        updateParticipantSettings() {
      return updateParticipantSettings;
    }

    /** Returns the builder for the settings used for calls to analyzeContent. */
    public UnaryCallSettings.Builder<AnalyzeContentRequest, AnalyzeContentResponse>
        analyzeContentSettings() {
      return analyzeContentSettings;
    }

    /** Returns the builder for the settings used for calls to streamingAnalyzeContent. */
    public StreamingCallSettings.Builder<
            StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
        streamingAnalyzeContentSettings() {
      return streamingAnalyzeContentSettings;
    }

    /** Returns the builder for the settings used for calls to suggestArticles. */
    public UnaryCallSettings.Builder<SuggestArticlesRequest, SuggestArticlesResponse>
        suggestArticlesSettings() {
      return suggestArticlesSettings;
    }

    /** Returns the builder for the settings used for calls to suggestFaqAnswers. */
    public UnaryCallSettings.Builder<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
        suggestFaqAnswersSettings() {
      return suggestFaqAnswersSettings;
    }

    @Override
    public ParticipantsStubSettings build() throws IOException {
      return new ParticipantsStubSettings(this);
    }
  }
}
