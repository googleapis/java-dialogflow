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

import static com.google.cloud.dialogflow.v2.ConversationProfilesClient.ListConversationProfilesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dialogflow.v2.stub.ConversationProfilesStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ConversationProfilesClient}.
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
 * ConversationProfilesSettings.Builder conversationProfilesSettingsBuilder =
 *     ConversationProfilesSettings.newBuilder();
 * conversationProfilesSettingsBuilder
 *     .getConversationProfileSettings()
 *     .setRetrySettings(
 *         conversationProfilesSettingsBuilder
 *             .getConversationProfileSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ConversationProfilesSettings conversationProfilesSettings =
 *     conversationProfilesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ConversationProfilesSettings extends ClientSettings<ConversationProfilesSettings> {

  /** Returns the object with the settings used for calls to listConversationProfiles. */
  public PagedCallSettings<
          ListConversationProfilesRequest, ListConversationProfilesResponse,
          ListConversationProfilesPagedResponse>
      listConversationProfilesSettings() {
    return ((ConversationProfilesStubSettings) getStubSettings())
        .listConversationProfilesSettings();
  }

  /** Returns the object with the settings used for calls to getConversationProfile. */
  public UnaryCallSettings<GetConversationProfileRequest, ConversationProfile>
      getConversationProfileSettings() {
    return ((ConversationProfilesStubSettings) getStubSettings()).getConversationProfileSettings();
  }

  /** Returns the object with the settings used for calls to createConversationProfile. */
  public UnaryCallSettings<CreateConversationProfileRequest, ConversationProfile>
      createConversationProfileSettings() {
    return ((ConversationProfilesStubSettings) getStubSettings())
        .createConversationProfileSettings();
  }

  /** Returns the object with the settings used for calls to updateConversationProfile. */
  public UnaryCallSettings<UpdateConversationProfileRequest, ConversationProfile>
      updateConversationProfileSettings() {
    return ((ConversationProfilesStubSettings) getStubSettings())
        .updateConversationProfileSettings();
  }

  /** Returns the object with the settings used for calls to deleteConversationProfile. */
  public UnaryCallSettings<DeleteConversationProfileRequest, Empty>
      deleteConversationProfileSettings() {
    return ((ConversationProfilesStubSettings) getStubSettings())
        .deleteConversationProfileSettings();
  }

  public static final ConversationProfilesSettings create(ConversationProfilesStubSettings stub)
      throws IOException {
    return new ConversationProfilesSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ConversationProfilesStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ConversationProfilesStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ConversationProfilesStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ConversationProfilesStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ConversationProfilesStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ConversationProfilesStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ConversationProfilesStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ConversationProfilesSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ConversationProfilesSettings. */
  public static class Builder
      extends ClientSettings.Builder<ConversationProfilesSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ConversationProfilesStubSettings.newBuilder(clientContext));
    }

    protected Builder(ConversationProfilesSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ConversationProfilesStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ConversationProfilesStubSettings.newBuilder());
    }

    public ConversationProfilesStubSettings.Builder getStubSettingsBuilder() {
      return ((ConversationProfilesStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listConversationProfiles. */
    public PagedCallSettings.Builder<
            ListConversationProfilesRequest, ListConversationProfilesResponse,
            ListConversationProfilesPagedResponse>
        listConversationProfilesSettings() {
      return getStubSettingsBuilder().listConversationProfilesSettings();
    }

    /** Returns the builder for the settings used for calls to getConversationProfile. */
    public UnaryCallSettings.Builder<GetConversationProfileRequest, ConversationProfile>
        getConversationProfileSettings() {
      return getStubSettingsBuilder().getConversationProfileSettings();
    }

    /** Returns the builder for the settings used for calls to createConversationProfile. */
    public UnaryCallSettings.Builder<CreateConversationProfileRequest, ConversationProfile>
        createConversationProfileSettings() {
      return getStubSettingsBuilder().createConversationProfileSettings();
    }

    /** Returns the builder for the settings used for calls to updateConversationProfile. */
    public UnaryCallSettings.Builder<UpdateConversationProfileRequest, ConversationProfile>
        updateConversationProfileSettings() {
      return getStubSettingsBuilder().updateConversationProfileSettings();
    }

    /** Returns the builder for the settings used for calls to deleteConversationProfile. */
    public UnaryCallSettings.Builder<DeleteConversationProfileRequest, Empty>
        deleteConversationProfileSettings() {
      return getStubSettingsBuilder().deleteConversationProfileSettings();
    }

    @Override
    public ConversationProfilesSettings build() throws IOException {
      return new ConversationProfilesSettings(this);
    }
  }
}
