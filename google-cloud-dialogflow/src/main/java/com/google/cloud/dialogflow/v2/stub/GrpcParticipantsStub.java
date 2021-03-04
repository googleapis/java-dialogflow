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

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
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
 * gRPC stub implementation for the Participants service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcParticipantsStub extends ParticipantsStub {
  private static final MethodDescriptor<CreateParticipantRequest, Participant>
      createParticipantMethodDescriptor =
          MethodDescriptor.<CreateParticipantRequest, Participant>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Participants/CreateParticipant")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateParticipantRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Participant.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetParticipantRequest, Participant>
      getParticipantMethodDescriptor =
          MethodDescriptor.<GetParticipantRequest, Participant>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Participants/GetParticipant")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetParticipantRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Participant.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListParticipantsRequest, ListParticipantsResponse>
      listParticipantsMethodDescriptor =
          MethodDescriptor.<ListParticipantsRequest, ListParticipantsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Participants/ListParticipants")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListParticipantsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListParticipantsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateParticipantRequest, Participant>
      updateParticipantMethodDescriptor =
          MethodDescriptor.<UpdateParticipantRequest, Participant>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Participants/UpdateParticipant")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateParticipantRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Participant.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<AnalyzeContentRequest, AnalyzeContentResponse>
      analyzeContentMethodDescriptor =
          MethodDescriptor.<AnalyzeContentRequest, AnalyzeContentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Participants/AnalyzeContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AnalyzeContentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AnalyzeContentResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
      streamingAnalyzeContentMethodDescriptor =
          MethodDescriptor
              .<StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName("google.cloud.dialogflow.v2.Participants/StreamingAnalyzeContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(StreamingAnalyzeContentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(StreamingAnalyzeContentResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SuggestArticlesRequest, SuggestArticlesResponse>
      suggestArticlesMethodDescriptor =
          MethodDescriptor.<SuggestArticlesRequest, SuggestArticlesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Participants/SuggestArticles")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SuggestArticlesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SuggestArticlesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
      suggestFaqAnswersMethodDescriptor =
          MethodDescriptor.<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2.Participants/SuggestFaqAnswers")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SuggestFaqAnswersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SuggestFaqAnswersResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<CreateParticipantRequest, Participant> createParticipantCallable;
  private final UnaryCallable<GetParticipantRequest, Participant> getParticipantCallable;
  private final UnaryCallable<ListParticipantsRequest, ListParticipantsResponse>
      listParticipantsCallable;
  private final UnaryCallable<ListParticipantsRequest, ListParticipantsPagedResponse>
      listParticipantsPagedCallable;
  private final UnaryCallable<UpdateParticipantRequest, Participant> updateParticipantCallable;
  private final UnaryCallable<AnalyzeContentRequest, AnalyzeContentResponse> analyzeContentCallable;
  private final BidiStreamingCallable<
          StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
      streamingAnalyzeContentCallable;
  private final UnaryCallable<SuggestArticlesRequest, SuggestArticlesResponse>
      suggestArticlesCallable;
  private final UnaryCallable<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
      suggestFaqAnswersCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcParticipantsStub create(ParticipantsStubSettings settings)
      throws IOException {
    return new GrpcParticipantsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcParticipantsStub create(ClientContext clientContext) throws IOException {
    return new GrpcParticipantsStub(ParticipantsStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcParticipantsStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcParticipantsStub(
        ParticipantsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcParticipantsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcParticipantsStub(ParticipantsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcParticipantsCallableFactory());
  }

  /**
   * Constructs an instance of GrpcParticipantsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcParticipantsStub(
      ParticipantsStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateParticipantRequest, Participant> createParticipantTransportSettings =
        GrpcCallSettings.<CreateParticipantRequest, Participant>newBuilder()
            .setMethodDescriptor(createParticipantMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateParticipantRequest>() {
                  @Override
                  public Map<String, String> extract(CreateParticipantRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetParticipantRequest, Participant> getParticipantTransportSettings =
        GrpcCallSettings.<GetParticipantRequest, Participant>newBuilder()
            .setMethodDescriptor(getParticipantMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetParticipantRequest>() {
                  @Override
                  public Map<String, String> extract(GetParticipantRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListParticipantsRequest, ListParticipantsResponse>
        listParticipantsTransportSettings =
            GrpcCallSettings.<ListParticipantsRequest, ListParticipantsResponse>newBuilder()
                .setMethodDescriptor(listParticipantsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListParticipantsRequest>() {
                      @Override
                      public Map<String, String> extract(ListParticipantsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpdateParticipantRequest, Participant> updateParticipantTransportSettings =
        GrpcCallSettings.<UpdateParticipantRequest, Participant>newBuilder()
            .setMethodDescriptor(updateParticipantMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateParticipantRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateParticipantRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put(
                        "participant.name", String.valueOf(request.getParticipant().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<AnalyzeContentRequest, AnalyzeContentResponse>
        analyzeContentTransportSettings =
            GrpcCallSettings.<AnalyzeContentRequest, AnalyzeContentResponse>newBuilder()
                .setMethodDescriptor(analyzeContentMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<AnalyzeContentRequest>() {
                      @Override
                      public Map<String, String> extract(AnalyzeContentRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("participant", String.valueOf(request.getParticipant()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
        streamingAnalyzeContentTransportSettings =
            GrpcCallSettings
                .<StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>newBuilder()
                .setMethodDescriptor(streamingAnalyzeContentMethodDescriptor)
                .build();
    GrpcCallSettings<SuggestArticlesRequest, SuggestArticlesResponse>
        suggestArticlesTransportSettings =
            GrpcCallSettings.<SuggestArticlesRequest, SuggestArticlesResponse>newBuilder()
                .setMethodDescriptor(suggestArticlesMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<SuggestArticlesRequest>() {
                      @Override
                      public Map<String, String> extract(SuggestArticlesRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
        suggestFaqAnswersTransportSettings =
            GrpcCallSettings.<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>newBuilder()
                .setMethodDescriptor(suggestFaqAnswersMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<SuggestFaqAnswersRequest>() {
                      @Override
                      public Map<String, String> extract(SuggestFaqAnswersRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();

    this.createParticipantCallable =
        callableFactory.createUnaryCallable(
            createParticipantTransportSettings,
            settings.createParticipantSettings(),
            clientContext);
    this.getParticipantCallable =
        callableFactory.createUnaryCallable(
            getParticipantTransportSettings, settings.getParticipantSettings(), clientContext);
    this.listParticipantsCallable =
        callableFactory.createUnaryCallable(
            listParticipantsTransportSettings, settings.listParticipantsSettings(), clientContext);
    this.listParticipantsPagedCallable =
        callableFactory.createPagedCallable(
            listParticipantsTransportSettings, settings.listParticipantsSettings(), clientContext);
    this.updateParticipantCallable =
        callableFactory.createUnaryCallable(
            updateParticipantTransportSettings,
            settings.updateParticipantSettings(),
            clientContext);
    this.analyzeContentCallable =
        callableFactory.createUnaryCallable(
            analyzeContentTransportSettings, settings.analyzeContentSettings(), clientContext);
    this.streamingAnalyzeContentCallable =
        callableFactory.createBidiStreamingCallable(
            streamingAnalyzeContentTransportSettings,
            settings.streamingAnalyzeContentSettings(),
            clientContext);
    this.suggestArticlesCallable =
        callableFactory.createUnaryCallable(
            suggestArticlesTransportSettings, settings.suggestArticlesSettings(), clientContext);
    this.suggestFaqAnswersCallable =
        callableFactory.createUnaryCallable(
            suggestFaqAnswersTransportSettings,
            settings.suggestFaqAnswersSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateParticipantRequest, Participant> createParticipantCallable() {
    return createParticipantCallable;
  }

  @Override
  public UnaryCallable<GetParticipantRequest, Participant> getParticipantCallable() {
    return getParticipantCallable;
  }

  @Override
  public UnaryCallable<ListParticipantsRequest, ListParticipantsResponse>
      listParticipantsCallable() {
    return listParticipantsCallable;
  }

  @Override
  public UnaryCallable<ListParticipantsRequest, ListParticipantsPagedResponse>
      listParticipantsPagedCallable() {
    return listParticipantsPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateParticipantRequest, Participant> updateParticipantCallable() {
    return updateParticipantCallable;
  }

  @Override
  public UnaryCallable<AnalyzeContentRequest, AnalyzeContentResponse> analyzeContentCallable() {
    return analyzeContentCallable;
  }

  @Override
  public BidiStreamingCallable<StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse>
      streamingAnalyzeContentCallable() {
    return streamingAnalyzeContentCallable;
  }

  @Override
  public UnaryCallable<SuggestArticlesRequest, SuggestArticlesResponse> suggestArticlesCallable() {
    return suggestArticlesCallable;
  }

  @Override
  public UnaryCallable<SuggestFaqAnswersRequest, SuggestFaqAnswersResponse>
      suggestFaqAnswersCallable() {
    return suggestFaqAnswersCallable;
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
