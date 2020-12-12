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

package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.DocumentsClient.ListDocumentsPagedResponse;

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
import com.google.cloud.dialogflow.v2beta1.CreateDocumentRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteDocumentRequest;
import com.google.cloud.dialogflow.v2beta1.Document;
import com.google.cloud.dialogflow.v2beta1.GetDocumentRequest;
import com.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata;
import com.google.cloud.dialogflow.v2beta1.ListDocumentsRequest;
import com.google.cloud.dialogflow.v2beta1.ListDocumentsResponse;
import com.google.cloud.dialogflow.v2beta1.ReloadDocumentRequest;
import com.google.cloud.dialogflow.v2beta1.UpdateDocumentRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link DocumentsStub}.
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
 * <p>For example, to set the total timeout of getDocument to 30 seconds:
 *
 * <pre>{@code
 * DocumentsStubSettings.Builder documentsSettingsBuilder = DocumentsStubSettings.newBuilder();
 * documentsSettingsBuilder
 *     .getDocumentSettings()
 *     .setRetrySettings(
 *         documentsSettingsBuilder
 *             .getDocumentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * DocumentsStubSettings documentsSettings = documentsSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class DocumentsStubSettings extends StubSettings<DocumentsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final PagedCallSettings<
          ListDocumentsRequest, ListDocumentsResponse, ListDocumentsPagedResponse>
      listDocumentsSettings;
  private final UnaryCallSettings<GetDocumentRequest, Document> getDocumentSettings;
  private final UnaryCallSettings<CreateDocumentRequest, Operation> createDocumentSettings;
  private final OperationCallSettings<CreateDocumentRequest, Document, KnowledgeOperationMetadata>
      createDocumentOperationSettings;
  private final UnaryCallSettings<DeleteDocumentRequest, Operation> deleteDocumentSettings;
  private final OperationCallSettings<DeleteDocumentRequest, Empty, KnowledgeOperationMetadata>
      deleteDocumentOperationSettings;
  private final UnaryCallSettings<UpdateDocumentRequest, Operation> updateDocumentSettings;
  private final OperationCallSettings<UpdateDocumentRequest, Document, KnowledgeOperationMetadata>
      updateDocumentOperationSettings;
  private final UnaryCallSettings<ReloadDocumentRequest, Operation> reloadDocumentSettings;
  private final OperationCallSettings<ReloadDocumentRequest, Document, KnowledgeOperationMetadata>
      reloadDocumentOperationSettings;

  private static final PagedListDescriptor<ListDocumentsRequest, ListDocumentsResponse, Document>
      LIST_DOCUMENTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListDocumentsRequest, ListDocumentsResponse, Document>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDocumentsRequest injectToken(ListDocumentsRequest payload, String token) {
              return ListDocumentsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListDocumentsRequest injectPageSize(ListDocumentsRequest payload, int pageSize) {
              return ListDocumentsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListDocumentsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDocumentsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Document> extractResources(ListDocumentsResponse payload) {
              return Objects.isNull(payload.getDocumentsList())
                  ? ImmutableList.<Document>of()
                  : payload.getDocumentsList();
            }
          };

  private static final PagedListResponseFactory<
          ListDocumentsRequest, ListDocumentsResponse, ListDocumentsPagedResponse>
      LIST_DOCUMENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDocumentsRequest, ListDocumentsResponse, ListDocumentsPagedResponse>() {
            @Override
            public ApiFuture<ListDocumentsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDocumentsRequest, ListDocumentsResponse> callable,
                ListDocumentsRequest request,
                ApiCallContext context,
                ApiFuture<ListDocumentsResponse> futureResponse) {
              PageContext<ListDocumentsRequest, ListDocumentsResponse, Document> pageContext =
                  PageContext.create(callable, LIST_DOCUMENTS_PAGE_STR_DESC, request, context);
              return ListDocumentsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listDocuments. */
  public PagedCallSettings<ListDocumentsRequest, ListDocumentsResponse, ListDocumentsPagedResponse>
      listDocumentsSettings() {
    return listDocumentsSettings;
  }

  /** Returns the object with the settings used for calls to getDocument. */
  public UnaryCallSettings<GetDocumentRequest, Document> getDocumentSettings() {
    return getDocumentSettings;
  }

  /** Returns the object with the settings used for calls to createDocument. */
  public UnaryCallSettings<CreateDocumentRequest, Operation> createDocumentSettings() {
    return createDocumentSettings;
  }

  /** Returns the object with the settings used for calls to createDocument. */
  public OperationCallSettings<CreateDocumentRequest, Document, KnowledgeOperationMetadata>
      createDocumentOperationSettings() {
    return createDocumentOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteDocument. */
  public UnaryCallSettings<DeleteDocumentRequest, Operation> deleteDocumentSettings() {
    return deleteDocumentSettings;
  }

  /** Returns the object with the settings used for calls to deleteDocument. */
  public OperationCallSettings<DeleteDocumentRequest, Empty, KnowledgeOperationMetadata>
      deleteDocumentOperationSettings() {
    return deleteDocumentOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateDocument. */
  public UnaryCallSettings<UpdateDocumentRequest, Operation> updateDocumentSettings() {
    return updateDocumentSettings;
  }

  /** Returns the object with the settings used for calls to updateDocument. */
  public OperationCallSettings<UpdateDocumentRequest, Document, KnowledgeOperationMetadata>
      updateDocumentOperationSettings() {
    return updateDocumentOperationSettings;
  }

  /** Returns the object with the settings used for calls to reloadDocument. */
  public UnaryCallSettings<ReloadDocumentRequest, Operation> reloadDocumentSettings() {
    return reloadDocumentSettings;
  }

  /** Returns the object with the settings used for calls to reloadDocument. */
  public OperationCallSettings<ReloadDocumentRequest, Document, KnowledgeOperationMetadata>
      reloadDocumentOperationSettings() {
    return reloadDocumentOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DocumentsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcDocumentsStub.create(this);
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
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(DocumentsStubSettings.class))
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

  protected DocumentsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listDocumentsSettings = settingsBuilder.listDocumentsSettings().build();
    getDocumentSettings = settingsBuilder.getDocumentSettings().build();
    createDocumentSettings = settingsBuilder.createDocumentSettings().build();
    createDocumentOperationSettings = settingsBuilder.createDocumentOperationSettings().build();
    deleteDocumentSettings = settingsBuilder.deleteDocumentSettings().build();
    deleteDocumentOperationSettings = settingsBuilder.deleteDocumentOperationSettings().build();
    updateDocumentSettings = settingsBuilder.updateDocumentSettings().build();
    updateDocumentOperationSettings = settingsBuilder.updateDocumentOperationSettings().build();
    reloadDocumentSettings = settingsBuilder.reloadDocumentSettings().build();
    reloadDocumentOperationSettings = settingsBuilder.reloadDocumentOperationSettings().build();
  }

  /** Builder for DocumentsStubSettings. */
  public static class Builder extends StubSettings.Builder<DocumentsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListDocumentsRequest, ListDocumentsResponse, ListDocumentsPagedResponse>
        listDocumentsSettings;
    private final UnaryCallSettings.Builder<GetDocumentRequest, Document> getDocumentSettings;
    private final UnaryCallSettings.Builder<CreateDocumentRequest, Operation>
        createDocumentSettings;
    private final OperationCallSettings.Builder<
            CreateDocumentRequest, Document, KnowledgeOperationMetadata>
        createDocumentOperationSettings;
    private final UnaryCallSettings.Builder<DeleteDocumentRequest, Operation>
        deleteDocumentSettings;
    private final OperationCallSettings.Builder<
            DeleteDocumentRequest, Empty, KnowledgeOperationMetadata>
        deleteDocumentOperationSettings;
    private final UnaryCallSettings.Builder<UpdateDocumentRequest, Operation>
        updateDocumentSettings;
    private final OperationCallSettings.Builder<
            UpdateDocumentRequest, Document, KnowledgeOperationMetadata>
        updateDocumentOperationSettings;
    private final UnaryCallSettings.Builder<ReloadDocumentRequest, Operation>
        reloadDocumentSettings;
    private final OperationCallSettings.Builder<
            ReloadDocumentRequest, Document, KnowledgeOperationMetadata>
        reloadDocumentOperationSettings;
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

      listDocumentsSettings = PagedCallSettings.newBuilder(LIST_DOCUMENTS_PAGE_STR_FACT);
      getDocumentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createDocumentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createDocumentOperationSettings = OperationCallSettings.newBuilder();
      deleteDocumentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteDocumentOperationSettings = OperationCallSettings.newBuilder();
      updateDocumentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateDocumentOperationSettings = OperationCallSettings.newBuilder();
      reloadDocumentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      reloadDocumentOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listDocumentsSettings,
              getDocumentSettings,
              createDocumentSettings,
              deleteDocumentSettings,
              updateDocumentSettings,
              reloadDocumentSettings);
      initDefaults(this);
    }

    protected Builder(DocumentsStubSettings settings) {
      super(settings);

      listDocumentsSettings = settings.listDocumentsSettings.toBuilder();
      getDocumentSettings = settings.getDocumentSettings.toBuilder();
      createDocumentSettings = settings.createDocumentSettings.toBuilder();
      createDocumentOperationSettings = settings.createDocumentOperationSettings.toBuilder();
      deleteDocumentSettings = settings.deleteDocumentSettings.toBuilder();
      deleteDocumentOperationSettings = settings.deleteDocumentOperationSettings.toBuilder();
      updateDocumentSettings = settings.updateDocumentSettings.toBuilder();
      updateDocumentOperationSettings = settings.updateDocumentOperationSettings.toBuilder();
      reloadDocumentSettings = settings.reloadDocumentSettings.toBuilder();
      reloadDocumentOperationSettings = settings.reloadDocumentOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listDocumentsSettings,
              getDocumentSettings,
              createDocumentSettings,
              deleteDocumentSettings,
              updateDocumentSettings,
              reloadDocumentSettings);
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
          .listDocumentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getDocumentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createDocumentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteDocumentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateDocumentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .reloadDocumentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createDocumentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateDocumentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Document.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  KnowledgeOperationMetadata.class))
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
          .deleteDocumentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteDocumentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  KnowledgeOperationMetadata.class))
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
          .updateDocumentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateDocumentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Document.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  KnowledgeOperationMetadata.class))
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
          .reloadDocumentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ReloadDocumentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Document.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  KnowledgeOperationMetadata.class))
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

    /** Returns the builder for the settings used for calls to listDocuments. */
    public PagedCallSettings.Builder<
            ListDocumentsRequest, ListDocumentsResponse, ListDocumentsPagedResponse>
        listDocumentsSettings() {
      return listDocumentsSettings;
    }

    /** Returns the builder for the settings used for calls to getDocument. */
    public UnaryCallSettings.Builder<GetDocumentRequest, Document> getDocumentSettings() {
      return getDocumentSettings;
    }

    /** Returns the builder for the settings used for calls to createDocument. */
    public UnaryCallSettings.Builder<CreateDocumentRequest, Operation> createDocumentSettings() {
      return createDocumentSettings;
    }

    /** Returns the builder for the settings used for calls to createDocument. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateDocumentRequest, Document, KnowledgeOperationMetadata>
        createDocumentOperationSettings() {
      return createDocumentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDocument. */
    public UnaryCallSettings.Builder<DeleteDocumentRequest, Operation> deleteDocumentSettings() {
      return deleteDocumentSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDocument. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteDocumentRequest, Empty, KnowledgeOperationMetadata>
        deleteDocumentOperationSettings() {
      return deleteDocumentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateDocument. */
    public UnaryCallSettings.Builder<UpdateDocumentRequest, Operation> updateDocumentSettings() {
      return updateDocumentSettings;
    }

    /** Returns the builder for the settings used for calls to updateDocument. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UpdateDocumentRequest, Document, KnowledgeOperationMetadata>
        updateDocumentOperationSettings() {
      return updateDocumentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to reloadDocument. */
    public UnaryCallSettings.Builder<ReloadDocumentRequest, Operation> reloadDocumentSettings() {
      return reloadDocumentSettings;
    }

    /** Returns the builder for the settings used for calls to reloadDocument. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            ReloadDocumentRequest, Document, KnowledgeOperationMetadata>
        reloadDocumentOperationSettings() {
      return reloadDocumentOperationSettings;
    }

    @Override
    public DocumentsStubSettings build() throws IOException {
      return new DocumentsStubSettings(this);
    }
  }
}
