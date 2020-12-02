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

import static com.google.cloud.dialogflow.v2.ContextsClient.ListContextsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.Context;
import com.google.cloud.dialogflow.v2.CreateContextRequest;
import com.google.cloud.dialogflow.v2.DeleteAllContextsRequest;
import com.google.cloud.dialogflow.v2.DeleteContextRequest;
import com.google.cloud.dialogflow.v2.GetContextRequest;
import com.google.cloud.dialogflow.v2.ListContextsRequest;
import com.google.cloud.dialogflow.v2.ListContextsResponse;
import com.google.cloud.dialogflow.v2.UpdateContextRequest;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the Contexts service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcContextsStub extends ContextsStub {
  private static final MethodDescriptor<ListContextsRequest, ListContextsResponse>
      listContextsMethodDescriptor =
          MethodDescriptor.<ListContextsRequest, ListContextsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Contexts/ListContexts")
              .setRequestMarshaller(ProtoUtils.marshaller(ListContextsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListContextsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetContextRequest, Context> getContextMethodDescriptor =
      MethodDescriptor.<GetContextRequest, Context>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2.Contexts/GetContext")
          .setRequestMarshaller(ProtoUtils.marshaller(GetContextRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Context.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateContextRequest, Context>
      createContextMethodDescriptor =
          MethodDescriptor.<CreateContextRequest, Context>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Contexts/CreateContext")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateContextRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Context.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateContextRequest, Context>
      updateContextMethodDescriptor =
          MethodDescriptor.<UpdateContextRequest, Context>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Contexts/UpdateContext")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateContextRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Context.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteContextRequest, Empty> deleteContextMethodDescriptor =
      MethodDescriptor.<DeleteContextRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2.Contexts/DeleteContext")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteContextRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<DeleteAllContextsRequest, Empty>
      deleteAllContextsMethodDescriptor =
          MethodDescriptor.<DeleteAllContextsRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Contexts/DeleteAllContexts")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteAllContextsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListContextsRequest, ListContextsResponse> listContextsCallable;
  private final UnaryCallable<ListContextsRequest, ListContextsPagedResponse>
      listContextsPagedCallable;
  private final UnaryCallable<GetContextRequest, Context> getContextCallable;
  private final UnaryCallable<CreateContextRequest, Context> createContextCallable;
  private final UnaryCallable<UpdateContextRequest, Context> updateContextCallable;
  private final UnaryCallable<DeleteContextRequest, Empty> deleteContextCallable;
  private final UnaryCallable<DeleteAllContextsRequest, Empty> deleteAllContextsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcContextsStub create(ContextsStubSettings settings) throws IOException {
    return new GrpcContextsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcContextsStub create(ClientContext clientContext) throws IOException {
    return new GrpcContextsStub(ContextsStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcContextsStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcContextsStub(
        ContextsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcContextsStub(ContextsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcContextsCallableFactory());
  }

  protected GrpcContextsStub(
      ContextsStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListContextsRequest, ListContextsResponse> listContextsTransportSettings =
        GrpcCallSettings.<ListContextsRequest, ListContextsResponse>newBuilder()
            .setMethodDescriptor(listContextsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ListContextsRequest>() {
                  @Override
                  public Map<String, String> extract(ListContextsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetContextRequest, Context> getContextTransportSettings =
        GrpcCallSettings.<GetContextRequest, Context>newBuilder()
            .setMethodDescriptor(getContextMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetContextRequest>() {
                  @Override
                  public Map<String, String> extract(GetContextRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateContextRequest, Context> createContextTransportSettings =
        GrpcCallSettings.<CreateContextRequest, Context>newBuilder()
            .setMethodDescriptor(createContextMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateContextRequest>() {
                  @Override
                  public Map<String, String> extract(CreateContextRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpdateContextRequest, Context> updateContextTransportSettings =
        GrpcCallSettings.<UpdateContextRequest, Context>newBuilder()
            .setMethodDescriptor(updateContextMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateContextRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateContextRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("context.name", String.valueOf(request.getContext().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteContextRequest, Empty> deleteContextTransportSettings =
        GrpcCallSettings.<DeleteContextRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteContextMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteContextRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteContextRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteAllContextsRequest, Empty> deleteAllContextsTransportSettings =
        GrpcCallSettings.<DeleteAllContextsRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteAllContextsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteAllContextsRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteAllContextsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();

    this.listContextsCallable =
        callableFactory.createUnaryCallable(
            listContextsTransportSettings, settings.listContextsSettings(), clientContext);
    this.listContextsPagedCallable =
        callableFactory.createPagedCallable(
            listContextsTransportSettings, settings.listContextsSettings(), clientContext);
    this.getContextCallable =
        callableFactory.createUnaryCallable(
            getContextTransportSettings, settings.getContextSettings(), clientContext);
    this.createContextCallable =
        callableFactory.createUnaryCallable(
            createContextTransportSettings, settings.createContextSettings(), clientContext);
    this.updateContextCallable =
        callableFactory.createUnaryCallable(
            updateContextTransportSettings, settings.updateContextSettings(), clientContext);
    this.deleteContextCallable =
        callableFactory.createUnaryCallable(
            deleteContextTransportSettings, settings.deleteContextSettings(), clientContext);
    this.deleteAllContextsCallable =
        callableFactory.createUnaryCallable(
            deleteAllContextsTransportSettings,
            settings.deleteAllContextsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<ListContextsRequest, ListContextsResponse> listContextsCallable() {
    return listContextsCallable;
  }

  public UnaryCallable<ListContextsRequest, ListContextsPagedResponse> listContextsPagedCallable() {
    return listContextsPagedCallable;
  }

  public UnaryCallable<GetContextRequest, Context> getContextCallable() {
    return getContextCallable;
  }

  public UnaryCallable<CreateContextRequest, Context> createContextCallable() {
    return createContextCallable;
  }

  public UnaryCallable<UpdateContextRequest, Context> updateContextCallable() {
    return updateContextCallable;
  }

  public UnaryCallable<DeleteContextRequest, Empty> deleteContextCallable() {
    return deleteContextCallable;
  }

  public UnaryCallable<DeleteAllContextsRequest, Empty> deleteAllContextsCallable() {
    return deleteAllContextsCallable;
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
