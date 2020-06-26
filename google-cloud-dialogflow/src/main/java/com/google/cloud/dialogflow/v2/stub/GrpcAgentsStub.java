/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dialogflow.v2.stub;

import static com.google.cloud.dialogflow.v2.AgentsClient.SearchAgentsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsExtractor;
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
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Dialogflow API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcAgentsStub extends AgentsStub {

  private static final MethodDescriptor<GetAgentRequest, Agent> getAgentMethodDescriptor =
      MethodDescriptor.<GetAgentRequest, Agent>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2.Agents/GetAgent")
          .setRequestMarshaller(ProtoUtils.marshaller(GetAgentRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Agent.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<SetAgentRequest, Agent> setAgentMethodDescriptor =
      MethodDescriptor.<SetAgentRequest, Agent>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2.Agents/SetAgent")
          .setRequestMarshaller(ProtoUtils.marshaller(SetAgentRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Agent.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<DeleteAgentRequest, Empty> deleteAgentMethodDescriptor =
      MethodDescriptor.<DeleteAgentRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2.Agents/DeleteAgent")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteAgentRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<SearchAgentsRequest, SearchAgentsResponse>
      searchAgentsMethodDescriptor =
          MethodDescriptor.<SearchAgentsRequest, SearchAgentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Agents/SearchAgents")
              .setRequestMarshaller(ProtoUtils.marshaller(SearchAgentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchAgentsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<TrainAgentRequest, Operation> trainAgentMethodDescriptor =
      MethodDescriptor.<TrainAgentRequest, Operation>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2.Agents/TrainAgent")
          .setRequestMarshaller(ProtoUtils.marshaller(TrainAgentRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ExportAgentRequest, Operation> exportAgentMethodDescriptor =
      MethodDescriptor.<ExportAgentRequest, Operation>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2.Agents/ExportAgent")
          .setRequestMarshaller(ProtoUtils.marshaller(ExportAgentRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ImportAgentRequest, Operation> importAgentMethodDescriptor =
      MethodDescriptor.<ImportAgentRequest, Operation>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2.Agents/ImportAgent")
          .setRequestMarshaller(ProtoUtils.marshaller(ImportAgentRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<RestoreAgentRequest, Operation>
      restoreAgentMethodDescriptor =
          MethodDescriptor.<RestoreAgentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Agents/RestoreAgent")
              .setRequestMarshaller(ProtoUtils.marshaller(RestoreAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetValidationResultRequest, ValidationResult>
      getValidationResultMethodDescriptor =
          MethodDescriptor.<GetValidationResultRequest, ValidationResult>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Agents/GetValidationResult")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetValidationResultRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ValidationResult.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<GetAgentRequest, Agent> getAgentCallable;
  private final UnaryCallable<SetAgentRequest, Agent> setAgentCallable;
  private final UnaryCallable<DeleteAgentRequest, Empty> deleteAgentCallable;
  private final UnaryCallable<SearchAgentsRequest, SearchAgentsResponse> searchAgentsCallable;
  private final UnaryCallable<SearchAgentsRequest, SearchAgentsPagedResponse>
      searchAgentsPagedCallable;
  private final UnaryCallable<TrainAgentRequest, Operation> trainAgentCallable;
  private final OperationCallable<TrainAgentRequest, Empty, Struct> trainAgentOperationCallable;
  private final UnaryCallable<ExportAgentRequest, Operation> exportAgentCallable;
  private final OperationCallable<ExportAgentRequest, ExportAgentResponse, Struct>
      exportAgentOperationCallable;
  private final UnaryCallable<ImportAgentRequest, Operation> importAgentCallable;
  private final OperationCallable<ImportAgentRequest, Empty, Struct> importAgentOperationCallable;
  private final UnaryCallable<RestoreAgentRequest, Operation> restoreAgentCallable;
  private final OperationCallable<RestoreAgentRequest, Empty, Struct> restoreAgentOperationCallable;
  private final UnaryCallable<GetValidationResultRequest, ValidationResult>
      getValidationResultCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAgentsStub create(AgentsStubSettings settings) throws IOException {
    return new GrpcAgentsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAgentsStub create(ClientContext clientContext) throws IOException {
    return new GrpcAgentsStub(AgentsStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAgentsStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAgentsStub(
        AgentsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAgentsStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcAgentsStub(AgentsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAgentsCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAgentsStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcAgentsStub(
      AgentsStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAgentRequest, Agent> getAgentTransportSettings =
        GrpcCallSettings.<GetAgentRequest, Agent>newBuilder()
            .setMethodDescriptor(getAgentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAgentRequest>() {
                  @Override
                  public Map<String, String> extract(GetAgentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SetAgentRequest, Agent> setAgentTransportSettings =
        GrpcCallSettings.<SetAgentRequest, Agent>newBuilder()
            .setMethodDescriptor(setAgentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<SetAgentRequest>() {
                  @Override
                  public Map<String, String> extract(SetAgentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("agent.parent", String.valueOf(request.getAgent().getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteAgentRequest, Empty> deleteAgentTransportSettings =
        GrpcCallSettings.<DeleteAgentRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteAgentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteAgentRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteAgentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SearchAgentsRequest, SearchAgentsResponse> searchAgentsTransportSettings =
        GrpcCallSettings.<SearchAgentsRequest, SearchAgentsResponse>newBuilder()
            .setMethodDescriptor(searchAgentsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<SearchAgentsRequest>() {
                  @Override
                  public Map<String, String> extract(SearchAgentsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<TrainAgentRequest, Operation> trainAgentTransportSettings =
        GrpcCallSettings.<TrainAgentRequest, Operation>newBuilder()
            .setMethodDescriptor(trainAgentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<TrainAgentRequest>() {
                  @Override
                  public Map<String, String> extract(TrainAgentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ExportAgentRequest, Operation> exportAgentTransportSettings =
        GrpcCallSettings.<ExportAgentRequest, Operation>newBuilder()
            .setMethodDescriptor(exportAgentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ExportAgentRequest>() {
                  @Override
                  public Map<String, String> extract(ExportAgentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ImportAgentRequest, Operation> importAgentTransportSettings =
        GrpcCallSettings.<ImportAgentRequest, Operation>newBuilder()
            .setMethodDescriptor(importAgentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ImportAgentRequest>() {
                  @Override
                  public Map<String, String> extract(ImportAgentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<RestoreAgentRequest, Operation> restoreAgentTransportSettings =
        GrpcCallSettings.<RestoreAgentRequest, Operation>newBuilder()
            .setMethodDescriptor(restoreAgentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<RestoreAgentRequest>() {
                  @Override
                  public Map<String, String> extract(RestoreAgentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetValidationResultRequest, ValidationResult>
        getValidationResultTransportSettings =
            GrpcCallSettings.<GetValidationResultRequest, ValidationResult>newBuilder()
                .setMethodDescriptor(getValidationResultMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetValidationResultRequest>() {
                      @Override
                      public Map<String, String> extract(GetValidationResultRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();

    this.getAgentCallable =
        callableFactory.createUnaryCallable(
            getAgentTransportSettings, settings.getAgentSettings(), clientContext);
    this.setAgentCallable =
        callableFactory.createUnaryCallable(
            setAgentTransportSettings, settings.setAgentSettings(), clientContext);
    this.deleteAgentCallable =
        callableFactory.createUnaryCallable(
            deleteAgentTransportSettings, settings.deleteAgentSettings(), clientContext);
    this.searchAgentsCallable =
        callableFactory.createUnaryCallable(
            searchAgentsTransportSettings, settings.searchAgentsSettings(), clientContext);
    this.searchAgentsPagedCallable =
        callableFactory.createPagedCallable(
            searchAgentsTransportSettings, settings.searchAgentsSettings(), clientContext);
    this.trainAgentCallable =
        callableFactory.createUnaryCallable(
            trainAgentTransportSettings, settings.trainAgentSettings(), clientContext);
    this.trainAgentOperationCallable =
        callableFactory.createOperationCallable(
            trainAgentTransportSettings,
            settings.trainAgentOperationSettings(),
            clientContext,
            this.operationsStub);
    this.exportAgentCallable =
        callableFactory.createUnaryCallable(
            exportAgentTransportSettings, settings.exportAgentSettings(), clientContext);
    this.exportAgentOperationCallable =
        callableFactory.createOperationCallable(
            exportAgentTransportSettings,
            settings.exportAgentOperationSettings(),
            clientContext,
            this.operationsStub);
    this.importAgentCallable =
        callableFactory.createUnaryCallable(
            importAgentTransportSettings, settings.importAgentSettings(), clientContext);
    this.importAgentOperationCallable =
        callableFactory.createOperationCallable(
            importAgentTransportSettings,
            settings.importAgentOperationSettings(),
            clientContext,
            this.operationsStub);
    this.restoreAgentCallable =
        callableFactory.createUnaryCallable(
            restoreAgentTransportSettings, settings.restoreAgentSettings(), clientContext);
    this.restoreAgentOperationCallable =
        callableFactory.createOperationCallable(
            restoreAgentTransportSettings,
            settings.restoreAgentOperationSettings(),
            clientContext,
            this.operationsStub);
    this.getValidationResultCallable =
        callableFactory.createUnaryCallable(
            getValidationResultTransportSettings,
            settings.getValidationResultSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetAgentRequest, Agent> getAgentCallable() {
    return getAgentCallable;
  }

  public UnaryCallable<SetAgentRequest, Agent> setAgentCallable() {
    return setAgentCallable;
  }

  public UnaryCallable<DeleteAgentRequest, Empty> deleteAgentCallable() {
    return deleteAgentCallable;
  }

  public UnaryCallable<SearchAgentsRequest, SearchAgentsPagedResponse> searchAgentsPagedCallable() {
    return searchAgentsPagedCallable;
  }

  public UnaryCallable<SearchAgentsRequest, SearchAgentsResponse> searchAgentsCallable() {
    return searchAgentsCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<TrainAgentRequest, Empty, Struct> trainAgentOperationCallable() {
    return trainAgentOperationCallable;
  }

  public UnaryCallable<TrainAgentRequest, Operation> trainAgentCallable() {
    return trainAgentCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ExportAgentRequest, ExportAgentResponse, Struct>
      exportAgentOperationCallable() {
    return exportAgentOperationCallable;
  }

  public UnaryCallable<ExportAgentRequest, Operation> exportAgentCallable() {
    return exportAgentCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<ImportAgentRequest, Empty, Struct> importAgentOperationCallable() {
    return importAgentOperationCallable;
  }

  public UnaryCallable<ImportAgentRequest, Operation> importAgentCallable() {
    return importAgentCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<RestoreAgentRequest, Empty, Struct> restoreAgentOperationCallable() {
    return restoreAgentOperationCallable;
  }

  public UnaryCallable<RestoreAgentRequest, Operation> restoreAgentCallable() {
    return restoreAgentCallable;
  }

  public UnaryCallable<GetValidationResultRequest, ValidationResult> getValidationResultCallable() {
    return getValidationResultCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
