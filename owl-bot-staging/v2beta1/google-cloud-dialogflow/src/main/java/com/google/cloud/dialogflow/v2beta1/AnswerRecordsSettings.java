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

package com.google.cloud.dialogflow.v2beta1;

import static com.google.cloud.dialogflow.v2beta1.AnswerRecordsClient.ListAnswerRecordsPagedResponse;

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
import com.google.cloud.dialogflow.v2beta1.stub.AnswerRecordsStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link AnswerRecordsClient}.
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
 * <p>For example, to set the total timeout of getAnswerRecord to 30 seconds:
 *
 * <pre>{@code
 * AnswerRecordsSettings.Builder answerRecordsSettingsBuilder = AnswerRecordsSettings.newBuilder();
 * answerRecordsSettingsBuilder
 *     .getAnswerRecordSettings()
 *     .setRetrySettings(
 *         answerRecordsSettingsBuilder
 *             .getAnswerRecordSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AnswerRecordsSettings answerRecordsSettings = answerRecordsSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class AnswerRecordsSettings extends ClientSettings<AnswerRecordsSettings> {

  /**
   * Returns the object with the settings used for calls to getAnswerRecord.
   *
   * @deprecated This method is deprecated and will be removed in the next major version update.
   */
  @Deprecated
  public UnaryCallSettings<GetAnswerRecordRequest, AnswerRecord> getAnswerRecordSettings() {
    return ((AnswerRecordsStubSettings) getStubSettings()).getAnswerRecordSettings();
  }

  /** Returns the object with the settings used for calls to listAnswerRecords. */
  public PagedCallSettings<
          ListAnswerRecordsRequest, ListAnswerRecordsResponse, ListAnswerRecordsPagedResponse>
      listAnswerRecordsSettings() {
    return ((AnswerRecordsStubSettings) getStubSettings()).listAnswerRecordsSettings();
  }

  /** Returns the object with the settings used for calls to updateAnswerRecord. */
  public UnaryCallSettings<UpdateAnswerRecordRequest, AnswerRecord> updateAnswerRecordSettings() {
    return ((AnswerRecordsStubSettings) getStubSettings()).updateAnswerRecordSettings();
  }

  public static final AnswerRecordsSettings create(AnswerRecordsStubSettings stub)
      throws IOException {
    return new AnswerRecordsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return AnswerRecordsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return AnswerRecordsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return AnswerRecordsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return AnswerRecordsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return AnswerRecordsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return AnswerRecordsStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AnswerRecordsStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected AnswerRecordsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for AnswerRecordsSettings. */
  public static class Builder extends ClientSettings.Builder<AnswerRecordsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(AnswerRecordsStubSettings.newBuilder(clientContext));
    }

    protected Builder(AnswerRecordsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(AnswerRecordsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(AnswerRecordsStubSettings.newBuilder());
    }

    public AnswerRecordsStubSettings.Builder getStubSettingsBuilder() {
      return ((AnswerRecordsStubSettings.Builder) getStubSettings());
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

    /**
     * Returns the builder for the settings used for calls to getAnswerRecord.
     *
     * @deprecated This method is deprecated and will be removed in the next major version update.
     */
    @Deprecated
    public UnaryCallSettings.Builder<GetAnswerRecordRequest, AnswerRecord>
        getAnswerRecordSettings() {
      return getStubSettingsBuilder().getAnswerRecordSettings();
    }

    /** Returns the builder for the settings used for calls to listAnswerRecords. */
    public PagedCallSettings.Builder<
            ListAnswerRecordsRequest, ListAnswerRecordsResponse, ListAnswerRecordsPagedResponse>
        listAnswerRecordsSettings() {
      return getStubSettingsBuilder().listAnswerRecordsSettings();
    }

    /** Returns the builder for the settings used for calls to updateAnswerRecord. */
    public UnaryCallSettings.Builder<UpdateAnswerRecordRequest, AnswerRecord>
        updateAnswerRecordSettings() {
      return getStubSettingsBuilder().updateAnswerRecordSettings();
    }

    @Override
    public AnswerRecordsSettings build() throws IOException {
      return new AnswerRecordsSettings(this);
    }
  }
}
