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

package com.google.cloud.dialogflow.v2beta1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.Fulfillment;
import com.google.cloud.dialogflow.v2beta1.GetFulfillmentRequest;
import com.google.cloud.dialogflow.v2beta1.UpdateFulfillmentRequest;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the Fulfillments service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcFulfillmentsStub extends FulfillmentsStub {
  private static final MethodDescriptor<GetFulfillmentRequest, Fulfillment>
      getFulfillmentMethodDescriptor =
          MethodDescriptor.<GetFulfillmentRequest, Fulfillment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Fulfillments/GetFulfillment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetFulfillmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Fulfillment.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateFulfillmentRequest, Fulfillment>
      updateFulfillmentMethodDescriptor =
          MethodDescriptor.<UpdateFulfillmentRequest, Fulfillment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Fulfillments/UpdateFulfillment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateFulfillmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Fulfillment.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetFulfillmentRequest, Fulfillment> getFulfillmentCallable;
  private final UnaryCallable<UpdateFulfillmentRequest, Fulfillment> updateFulfillmentCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFulfillmentsStub create(FulfillmentsStubSettings settings)
      throws IOException {
    return new GrpcFulfillmentsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFulfillmentsStub create(ClientContext clientContext) throws IOException {
    return new GrpcFulfillmentsStub(FulfillmentsStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFulfillmentsStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFulfillmentsStub(
        FulfillmentsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcFulfillmentsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcFulfillmentsStub(FulfillmentsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcFulfillmentsCallableFactory());
  }

  /**
   * Constructs an instance of GrpcFulfillmentsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcFulfillmentsStub(
      FulfillmentsStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetFulfillmentRequest, Fulfillment> getFulfillmentTransportSettings =
        GrpcCallSettings.<GetFulfillmentRequest, Fulfillment>newBuilder()
            .setMethodDescriptor(getFulfillmentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetFulfillmentRequest>() {
                  @Override
                  public Map<String, String> extract(GetFulfillmentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpdateFulfillmentRequest, Fulfillment> updateFulfillmentTransportSettings =
        GrpcCallSettings.<UpdateFulfillmentRequest, Fulfillment>newBuilder()
            .setMethodDescriptor(updateFulfillmentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateFulfillmentRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateFulfillmentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put(
                        "fulfillment.name", String.valueOf(request.getFulfillment().getName()));
                    return params.build();
                  }
                })
            .build();

    this.getFulfillmentCallable =
        callableFactory.createUnaryCallable(
            getFulfillmentTransportSettings, settings.getFulfillmentSettings(), clientContext);
    this.updateFulfillmentCallable =
        callableFactory.createUnaryCallable(
            updateFulfillmentTransportSettings,
            settings.updateFulfillmentSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetFulfillmentRequest, Fulfillment> getFulfillmentCallable() {
    return getFulfillmentCallable;
  }

  @Override
  public UnaryCallable<UpdateFulfillmentRequest, Fulfillment> updateFulfillmentCallable() {
    return updateFulfillmentCallable;
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
