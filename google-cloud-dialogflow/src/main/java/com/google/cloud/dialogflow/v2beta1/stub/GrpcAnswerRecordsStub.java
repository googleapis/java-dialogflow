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

import static com.google.cloud.dialogflow.v2beta1.AnswerRecordsClient.ListAnswerRecordsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.AnswerRecord;
import com.google.cloud.dialogflow.v2beta1.GetAnswerRecordRequest;
import com.google.cloud.dialogflow.v2beta1.ListAnswerRecordsRequest;
import com.google.cloud.dialogflow.v2beta1.ListAnswerRecordsResponse;
import com.google.cloud.dialogflow.v2beta1.UpdateAnswerRecordRequest;
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
 * gRPC stub implementation for the AnswerRecords service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcAnswerRecordsStub extends AnswerRecordsStub {
  private static final MethodDescriptor<GetAnswerRecordRequest, AnswerRecord>
      getAnswerRecordMethodDescriptor =
          MethodDescriptor.<GetAnswerRecordRequest, AnswerRecord>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.AnswerRecords/GetAnswerRecord")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAnswerRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AnswerRecord.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListAnswerRecordsRequest, ListAnswerRecordsResponse>
      listAnswerRecordsMethodDescriptor =
          MethodDescriptor.<ListAnswerRecordsRequest, ListAnswerRecordsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.AnswerRecords/ListAnswerRecords")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAnswerRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAnswerRecordsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateAnswerRecordRequest, AnswerRecord>
      updateAnswerRecordMethodDescriptor =
          MethodDescriptor.<UpdateAnswerRecordRequest, AnswerRecord>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.AnswerRecords/UpdateAnswerRecord")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateAnswerRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AnswerRecord.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAnswerRecordRequest, AnswerRecord> getAnswerRecordCallable;
  private final UnaryCallable<ListAnswerRecordsRequest, ListAnswerRecordsResponse>
      listAnswerRecordsCallable;
  private final UnaryCallable<ListAnswerRecordsRequest, ListAnswerRecordsPagedResponse>
      listAnswerRecordsPagedCallable;
  private final UnaryCallable<UpdateAnswerRecordRequest, AnswerRecord> updateAnswerRecordCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAnswerRecordsStub create(AnswerRecordsStubSettings settings)
      throws IOException {
    return new GrpcAnswerRecordsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAnswerRecordsStub create(ClientContext clientContext) throws IOException {
    return new GrpcAnswerRecordsStub(AnswerRecordsStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAnswerRecordsStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAnswerRecordsStub(
        AnswerRecordsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAnswerRecordsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAnswerRecordsStub(AnswerRecordsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAnswerRecordsCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAnswerRecordsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAnswerRecordsStub(
      AnswerRecordsStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAnswerRecordRequest, AnswerRecord> getAnswerRecordTransportSettings =
        GrpcCallSettings.<GetAnswerRecordRequest, AnswerRecord>newBuilder()
            .setMethodDescriptor(getAnswerRecordMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetAnswerRecordRequest>() {
                  @Override
                  public Map<String, String> extract(GetAnswerRecordRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListAnswerRecordsRequest, ListAnswerRecordsResponse>
        listAnswerRecordsTransportSettings =
            GrpcCallSettings.<ListAnswerRecordsRequest, ListAnswerRecordsResponse>newBuilder()
                .setMethodDescriptor(listAnswerRecordsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListAnswerRecordsRequest>() {
                      @Override
                      public Map<String, String> extract(ListAnswerRecordsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpdateAnswerRecordRequest, AnswerRecord> updateAnswerRecordTransportSettings =
        GrpcCallSettings.<UpdateAnswerRecordRequest, AnswerRecord>newBuilder()
            .setMethodDescriptor(updateAnswerRecordMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateAnswerRecordRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateAnswerRecordRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put(
                        "answer_record.name", String.valueOf(request.getAnswerRecord().getName()));
                    return params.build();
                  }
                })
            .build();

    this.getAnswerRecordCallable =
        callableFactory.createUnaryCallable(
            getAnswerRecordTransportSettings, settings.getAnswerRecordSettings(), clientContext);
    this.listAnswerRecordsCallable =
        callableFactory.createUnaryCallable(
            listAnswerRecordsTransportSettings,
            settings.listAnswerRecordsSettings(),
            clientContext);
    this.listAnswerRecordsPagedCallable =
        callableFactory.createPagedCallable(
            listAnswerRecordsTransportSettings,
            settings.listAnswerRecordsSettings(),
            clientContext);
    this.updateAnswerRecordCallable =
        callableFactory.createUnaryCallable(
            updateAnswerRecordTransportSettings,
            settings.updateAnswerRecordSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetAnswerRecordRequest, AnswerRecord> getAnswerRecordCallable() {
    return getAnswerRecordCallable;
  }

  @Override
  public UnaryCallable<ListAnswerRecordsRequest, ListAnswerRecordsResponse>
      listAnswerRecordsCallable() {
    return listAnswerRecordsCallable;
  }

  @Override
  public UnaryCallable<ListAnswerRecordsRequest, ListAnswerRecordsPagedResponse>
      listAnswerRecordsPagedCallable() {
    return listAnswerRecordsPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateAnswerRecordRequest, AnswerRecord> updateAnswerRecordCallable() {
    return updateAnswerRecordCallable;
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
