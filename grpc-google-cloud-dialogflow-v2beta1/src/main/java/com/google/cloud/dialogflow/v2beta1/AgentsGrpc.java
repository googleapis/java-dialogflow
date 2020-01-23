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
package com.google.cloud.dialogflow.v2beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Agents are best described as Natural Language Understanding (NLU) modules
 * that transform user requests into actionable data. You can include agents
 * in your app, product, or service to determine user intent and respond to the
 * user in a natural way.
 * After you create an agent, you can add [Intents][google.cloud.dialogflow.v2beta1.Intents], [Contexts][google.cloud.dialogflow.v2beta1.Contexts],
 * [Entity Types][google.cloud.dialogflow.v2beta1.EntityTypes], [Webhooks][google.cloud.dialogflow.v2beta1.WebhookRequest], and so on to
 * manage the flow of a conversation and match user input to predefined intents
 * and actions.
 * You can create an agent using both Dialogflow Standard Edition and
 * Dialogflow Enterprise Edition. For details, see
 * [Dialogflow
 * Editions](https://cloud.google.com/dialogflow/docs/editions).
 * You can save your agent for backup or versioning by exporting the agent by
 * using the [ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent] method. You can import a saved
 * agent by using the [ImportAgent][google.cloud.dialogflow.v2beta1.Agents.ImportAgent] method.
 * Dialogflow provides several
 * [prebuilt
 * agents](https://cloud.google.com/dialogflow/docs/agents-prebuilt)
 * for common conversation scenarios such as determining a date and time,
 * converting currency, and so on.
 * For more information about agents, see the
 * [Dialogflow
 * documentation](https://cloud.google.com/dialogflow/docs/agents-overview).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/agent.proto")
public final class AgentsGrpc {

  private AgentsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Agents";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAgentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      METHOD_GET_AGENT = getGetAgentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getGetAgentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getGetAgentMethod() {
    return getGetAgentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getGetAgentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
            com.google.cloud.dialogflow.v2beta1.Agent>
        getGetAgentMethod;
    if ((getGetAgentMethod = AgentsGrpc.getGetAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetAgentMethod = AgentsGrpc.getGetAgentMethod) == null) {
          AgentsGrpc.getGetAgentMethod =
              getGetAgentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
                          com.google.cloud.dialogflow.v2beta1.Agent>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "GetAgent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.GetAgentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.Agent.getDefaultInstance()))
                      .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("GetAgent"))
                      .build();
        }
      }
    }
    return getGetAgentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetAgentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      METHOD_SET_AGENT = getSetAgentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getSetAgentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getSetAgentMethod() {
    return getSetAgentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getSetAgentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
            com.google.cloud.dialogflow.v2beta1.Agent>
        getSetAgentMethod;
    if ((getSetAgentMethod = AgentsGrpc.getSetAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getSetAgentMethod = AgentsGrpc.getSetAgentMethod) == null) {
          AgentsGrpc.getSetAgentMethod =
              getSetAgentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
                          com.google.cloud.dialogflow.v2beta1.Agent>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "SetAgent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.SetAgentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.Agent.getDefaultInstance()))
                      .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("SetAgent"))
                      .build();
        }
      }
    }
    return getSetAgentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteAgentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest, com.google.protobuf.Empty>
      METHOD_DELETE_AGENT = getDeleteAgentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest, com.google.protobuf.Empty>
      getDeleteAgentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest, com.google.protobuf.Empty>
      getDeleteAgentMethod() {
    return getDeleteAgentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest, com.google.protobuf.Empty>
      getDeleteAgentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest, com.google.protobuf.Empty>
        getDeleteAgentMethod;
    if ((getDeleteAgentMethod = AgentsGrpc.getDeleteAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getDeleteAgentMethod = AgentsGrpc.getDeleteAgentMethod) == null) {
          AgentsGrpc.getDeleteAgentMethod =
              getDeleteAgentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "DeleteAgent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("DeleteAgent"))
                      .build();
        }
      }
    }
    return getDeleteAgentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchAgentsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
          com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
      METHOD_SEARCH_AGENTS = getSearchAgentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
          com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
      getSearchAgentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
          com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
      getSearchAgentsMethod() {
    return getSearchAgentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
          com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
      getSearchAgentsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
            com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
        getSearchAgentsMethod;
    if ((getSearchAgentsMethod = AgentsGrpc.getSearchAgentsMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getSearchAgentsMethod = AgentsGrpc.getSearchAgentsMethod) == null) {
          AgentsGrpc.getSearchAgentsMethod =
              getSearchAgentsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
                          com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "SearchAgents"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("SearchAgents"))
                      .build();
        }
      }
    }
    return getSearchAgentsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTrainAgentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.TrainAgentRequest, com.google.longrunning.Operation>
      METHOD_TRAIN_AGENT = getTrainAgentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.TrainAgentRequest, com.google.longrunning.Operation>
      getTrainAgentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.TrainAgentRequest, com.google.longrunning.Operation>
      getTrainAgentMethod() {
    return getTrainAgentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.TrainAgentRequest, com.google.longrunning.Operation>
      getTrainAgentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.TrainAgentRequest, com.google.longrunning.Operation>
        getTrainAgentMethod;
    if ((getTrainAgentMethod = AgentsGrpc.getTrainAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getTrainAgentMethod = AgentsGrpc.getTrainAgentMethod) == null) {
          AgentsGrpc.getTrainAgentMethod =
              getTrainAgentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "TrainAgent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.TrainAgentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("TrainAgent"))
                      .build();
        }
      }
    }
    return getTrainAgentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getExportAgentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ExportAgentRequest, com.google.longrunning.Operation>
      METHOD_EXPORT_AGENT = getExportAgentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ExportAgentRequest, com.google.longrunning.Operation>
      getExportAgentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ExportAgentRequest, com.google.longrunning.Operation>
      getExportAgentMethod() {
    return getExportAgentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ExportAgentRequest, com.google.longrunning.Operation>
      getExportAgentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,
            com.google.longrunning.Operation>
        getExportAgentMethod;
    if ((getExportAgentMethod = AgentsGrpc.getExportAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getExportAgentMethod = AgentsGrpc.getExportAgentMethod) == null) {
          AgentsGrpc.getExportAgentMethod =
              getExportAgentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "ExportAgent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ExportAgentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ExportAgent"))
                      .build();
        }
      }
    }
    return getExportAgentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getImportAgentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ImportAgentRequest, com.google.longrunning.Operation>
      METHOD_IMPORT_AGENT = getImportAgentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ImportAgentRequest, com.google.longrunning.Operation>
      getImportAgentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ImportAgentRequest, com.google.longrunning.Operation>
      getImportAgentMethod() {
    return getImportAgentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ImportAgentRequest, com.google.longrunning.Operation>
      getImportAgentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,
            com.google.longrunning.Operation>
        getImportAgentMethod;
    if ((getImportAgentMethod = AgentsGrpc.getImportAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getImportAgentMethod = AgentsGrpc.getImportAgentMethod) == null) {
          AgentsGrpc.getImportAgentMethod =
              getImportAgentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "ImportAgent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ImportAgentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("ImportAgent"))
                      .build();
        }
      }
    }
    return getImportAgentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRestoreAgentMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest, com.google.longrunning.Operation>
      METHOD_RESTORE_AGENT = getRestoreAgentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest, com.google.longrunning.Operation>
      getRestoreAgentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest, com.google.longrunning.Operation>
      getRestoreAgentMethod() {
    return getRestoreAgentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest, com.google.longrunning.Operation>
      getRestoreAgentMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,
            com.google.longrunning.Operation>
        getRestoreAgentMethod;
    if ((getRestoreAgentMethod = AgentsGrpc.getRestoreAgentMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getRestoreAgentMethod = AgentsGrpc.getRestoreAgentMethod) == null) {
          AgentsGrpc.getRestoreAgentMethod =
              getRestoreAgentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "RestoreAgent"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AgentsMethodDescriptorSupplier("RestoreAgent"))
                      .build();
        }
      }
    }
    return getRestoreAgentMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetValidationResultMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
          com.google.cloud.dialogflow.v2beta1.ValidationResult>
      METHOD_GET_VALIDATION_RESULT = getGetValidationResultMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
          com.google.cloud.dialogflow.v2beta1.ValidationResult>
      getGetValidationResultMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
          com.google.cloud.dialogflow.v2beta1.ValidationResult>
      getGetValidationResultMethod() {
    return getGetValidationResultMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
          com.google.cloud.dialogflow.v2beta1.ValidationResult>
      getGetValidationResultMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
            com.google.cloud.dialogflow.v2beta1.ValidationResult>
        getGetValidationResultMethod;
    if ((getGetValidationResultMethod = AgentsGrpc.getGetValidationResultMethod) == null) {
      synchronized (AgentsGrpc.class) {
        if ((getGetValidationResultMethod = AgentsGrpc.getGetValidationResultMethod) == null) {
          AgentsGrpc.getGetValidationResultMethod =
              getGetValidationResultMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
                          com.google.cloud.dialogflow.v2beta1.ValidationResult>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.dialogflow.v2beta1.Agents", "GetValidationResult"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ValidationResult
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AgentsMethodDescriptorSupplier("GetValidationResult"))
                      .build();
        }
      }
    }
    return getGetValidationResultMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static AgentsStub newStub(io.grpc.Channel channel) {
    return new AgentsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentsBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new AgentsBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AgentsFutureStub newFutureStub(io.grpc.Channel channel) {
    return new AgentsFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules
   * that transform user requests into actionable data. You can include agents
   * in your app, product, or service to determine user intent and respond to the
   * user in a natural way.
   * After you create an agent, you can add [Intents][google.cloud.dialogflow.v2beta1.Intents], [Contexts][google.cloud.dialogflow.v2beta1.Contexts],
   * [Entity Types][google.cloud.dialogflow.v2beta1.EntityTypes], [Webhooks][google.cloud.dialogflow.v2beta1.WebhookRequest], and so on to
   * manage the flow of a conversation and match user input to predefined intents
   * and actions.
   * You can create an agent using both Dialogflow Standard Edition and
   * Dialogflow Enterprise Edition. For details, see
   * [Dialogflow
   * Editions](https://cloud.google.com/dialogflow/docs/editions).
   * You can save your agent for backup or versioning by exporting the agent by
   * using the [ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent] method. You can import a saved
   * agent by using the [ImportAgent][google.cloud.dialogflow.v2beta1.Agents.ImportAgent] method.
   * Dialogflow provides several
   * [prebuilt
   * agents](https://cloud.google.com/dialogflow/docs/agents-prebuilt)
   * for common conversation scenarios such as determining a date and time,
   * converting currency, and so on.
   * For more information about agents, see the
   * [Dialogflow
   * documentation](https://cloud.google.com/dialogflow/docs/agents-overview).
   * </pre>
   */
  public abstract static class AgentsImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Retrieves the specified agent.
     * </pre>
     */
    public void getAgent(
        com.google.cloud.dialogflow.v2beta1.GetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates/updates the specified agent.
     * </pre>
     */
    public void setAgent(
        com.google.cloud.dialogflow.v2beta1.SetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAgentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes the specified agent.
     * </pre>
     */
    public void deleteAgent(
        com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAgentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of agents.
     * Since there is at most one conversational agent per project, this method is
     * useful primarily for listing all agents across projects the caller has
     * access to. One can achieve that with a wildcard project collection id "-".
     * Refer to [List
     * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
     * </pre>
     */
    public void searchAgents(
        com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchAgentsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Trains the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void trainAgent(
        com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getTrainAgentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports the specified agent to a ZIP file.
     * Operation &lt;response: [ExportAgentResponse][google.cloud.dialogflow.v2beta1.ExportAgentResponse]&gt;
     * </pre>
     */
    public void exportAgent(
        com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportAgentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Imports the specified agent from a ZIP file.
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void importAgent(
        com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getImportAgentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Restores the specified agent from a ZIP file.
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void restoreAgent(
        com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRestoreAgentMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets agent validation result. Agent validation is performed during
     * training time and is updated automatically when training is completed.
     * </pre>
     */
    public void getValidationResult(
        com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ValidationResult>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetValidationResultMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getGetAgentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
                      com.google.cloud.dialogflow.v2beta1.Agent>(this, METHODID_GET_AGENT)))
          .addMethod(
              getSetAgentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
                      com.google.cloud.dialogflow.v2beta1.Agent>(this, METHODID_SET_AGENT)))
          .addMethod(
              getDeleteAgentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_AGENT)))
          .addMethod(
              getSearchAgentsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
                      com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>(
                      this, METHODID_SEARCH_AGENTS)))
          .addMethod(
              getTrainAgentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,
                      com.google.longrunning.Operation>(this, METHODID_TRAIN_AGENT)))
          .addMethod(
              getExportAgentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_AGENT)))
          .addMethod(
              getImportAgentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,
                      com.google.longrunning.Operation>(this, METHODID_IMPORT_AGENT)))
          .addMethod(
              getRestoreAgentMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,
                      com.google.longrunning.Operation>(this, METHODID_RESTORE_AGENT)))
          .addMethod(
              getGetValidationResultMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
                      com.google.cloud.dialogflow.v2beta1.ValidationResult>(
                      this, METHODID_GET_VALIDATION_RESULT)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules
   * that transform user requests into actionable data. You can include agents
   * in your app, product, or service to determine user intent and respond to the
   * user in a natural way.
   * After you create an agent, you can add [Intents][google.cloud.dialogflow.v2beta1.Intents], [Contexts][google.cloud.dialogflow.v2beta1.Contexts],
   * [Entity Types][google.cloud.dialogflow.v2beta1.EntityTypes], [Webhooks][google.cloud.dialogflow.v2beta1.WebhookRequest], and so on to
   * manage the flow of a conversation and match user input to predefined intents
   * and actions.
   * You can create an agent using both Dialogflow Standard Edition and
   * Dialogflow Enterprise Edition. For details, see
   * [Dialogflow
   * Editions](https://cloud.google.com/dialogflow/docs/editions).
   * You can save your agent for backup or versioning by exporting the agent by
   * using the [ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent] method. You can import a saved
   * agent by using the [ImportAgent][google.cloud.dialogflow.v2beta1.Agents.ImportAgent] method.
   * Dialogflow provides several
   * [prebuilt
   * agents](https://cloud.google.com/dialogflow/docs/agents-prebuilt)
   * for common conversation scenarios such as determining a date and time,
   * converting currency, and so on.
   * For more information about agents, see the
   * [Dialogflow
   * documentation](https://cloud.google.com/dialogflow/docs/agents-overview).
   * </pre>
   */
  public static final class AgentsStub extends io.grpc.stub.AbstractStub<AgentsStub> {
    private AgentsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentsStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Retrieves the specified agent.
     * </pre>
     */
    public void getAgent(
        com.google.cloud.dialogflow.v2beta1.GetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates/updates the specified agent.
     * </pre>
     */
    public void setAgent(
        com.google.cloud.dialogflow.v2beta1.SetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAgentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes the specified agent.
     * </pre>
     */
    public void deleteAgent(
        com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAgentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of agents.
     * Since there is at most one conversational agent per project, this method is
     * useful primarily for listing all agents across projects the caller has
     * access to. One can achieve that with a wildcard project collection id "-".
     * Refer to [List
     * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
     * </pre>
     */
    public void searchAgents(
        com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchAgentsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Trains the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void trainAgent(
        com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrainAgentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports the specified agent to a ZIP file.
     * Operation &lt;response: [ExportAgentResponse][google.cloud.dialogflow.v2beta1.ExportAgentResponse]&gt;
     * </pre>
     */
    public void exportAgent(
        com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportAgentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Imports the specified agent from a ZIP file.
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void importAgent(
        com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportAgentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Restores the specified agent from a ZIP file.
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void restoreAgent(
        com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestoreAgentMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets agent validation result. Agent validation is performed during
     * training time and is updated automatically when training is completed.
     * </pre>
     */
    public void getValidationResult(
        com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ValidationResult>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetValidationResultMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules
   * that transform user requests into actionable data. You can include agents
   * in your app, product, or service to determine user intent and respond to the
   * user in a natural way.
   * After you create an agent, you can add [Intents][google.cloud.dialogflow.v2beta1.Intents], [Contexts][google.cloud.dialogflow.v2beta1.Contexts],
   * [Entity Types][google.cloud.dialogflow.v2beta1.EntityTypes], [Webhooks][google.cloud.dialogflow.v2beta1.WebhookRequest], and so on to
   * manage the flow of a conversation and match user input to predefined intents
   * and actions.
   * You can create an agent using both Dialogflow Standard Edition and
   * Dialogflow Enterprise Edition. For details, see
   * [Dialogflow
   * Editions](https://cloud.google.com/dialogflow/docs/editions).
   * You can save your agent for backup or versioning by exporting the agent by
   * using the [ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent] method. You can import a saved
   * agent by using the [ImportAgent][google.cloud.dialogflow.v2beta1.Agents.ImportAgent] method.
   * Dialogflow provides several
   * [prebuilt
   * agents](https://cloud.google.com/dialogflow/docs/agents-prebuilt)
   * for common conversation scenarios such as determining a date and time,
   * converting currency, and so on.
   * For more information about agents, see the
   * [Dialogflow
   * documentation](https://cloud.google.com/dialogflow/docs/agents-overview).
   * </pre>
   */
  public static final class AgentsBlockingStub
      extends io.grpc.stub.AbstractStub<AgentsBlockingStub> {
    private AgentsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentsBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Retrieves the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Agent getAgent(
        com.google.cloud.dialogflow.v2beta1.GetAgentRequest request) {
      return blockingUnaryCall(getChannel(), getGetAgentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates/updates the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Agent setAgent(
        com.google.cloud.dialogflow.v2beta1.SetAgentRequest request) {
      return blockingUnaryCall(getChannel(), getSetAgentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes the specified agent.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAgent(
        com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAgentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of agents.
     * Since there is at most one conversational agent per project, this method is
     * useful primarily for listing all agents across projects the caller has
     * access to. One can achieve that with a wildcard project collection id "-".
     * Refer to [List
     * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse searchAgents(
        com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchAgentsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Trains the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation trainAgent(
        com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), getTrainAgentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Exports the specified agent to a ZIP file.
     * Operation &lt;response: [ExportAgentResponse][google.cloud.dialogflow.v2beta1.ExportAgentResponse]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation exportAgent(
        com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), getExportAgentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Imports the specified agent from a ZIP file.
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation importAgent(
        com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), getImportAgentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Restores the specified agent from a ZIP file.
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation restoreAgent(
        com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), getRestoreAgentMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets agent validation result. Agent validation is performed during
     * training time and is updated automatically when training is completed.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ValidationResult getValidationResult(
        com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetValidationResultMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Agents are best described as Natural Language Understanding (NLU) modules
   * that transform user requests into actionable data. You can include agents
   * in your app, product, or service to determine user intent and respond to the
   * user in a natural way.
   * After you create an agent, you can add [Intents][google.cloud.dialogflow.v2beta1.Intents], [Contexts][google.cloud.dialogflow.v2beta1.Contexts],
   * [Entity Types][google.cloud.dialogflow.v2beta1.EntityTypes], [Webhooks][google.cloud.dialogflow.v2beta1.WebhookRequest], and so on to
   * manage the flow of a conversation and match user input to predefined intents
   * and actions.
   * You can create an agent using both Dialogflow Standard Edition and
   * Dialogflow Enterprise Edition. For details, see
   * [Dialogflow
   * Editions](https://cloud.google.com/dialogflow/docs/editions).
   * You can save your agent for backup or versioning by exporting the agent by
   * using the [ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent] method. You can import a saved
   * agent by using the [ImportAgent][google.cloud.dialogflow.v2beta1.Agents.ImportAgent] method.
   * Dialogflow provides several
   * [prebuilt
   * agents](https://cloud.google.com/dialogflow/docs/agents-prebuilt)
   * for common conversation scenarios such as determining a date and time,
   * converting currency, and so on.
   * For more information about agents, see the
   * [Dialogflow
   * documentation](https://cloud.google.com/dialogflow/docs/agents-overview).
   * </pre>
   */
  public static final class AgentsFutureStub extends io.grpc.stub.AbstractStub<AgentsFutureStub> {
    private AgentsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentsFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Retrieves the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.Agent>
        getAgent(com.google.cloud.dialogflow.v2beta1.GetAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates/updates the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.Agent>
        setAgent(com.google.cloud.dialogflow.v2beta1.SetAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAgentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteAgent(com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAgentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of agents.
     * Since there is at most one conversational agent per project, this method is
     * useful primarily for listing all agents across projects the caller has
     * access to. One can achieve that with a wildcard project collection id "-".
     * Refer to [List
     * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
        searchAgents(com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchAgentsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Trains the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        trainAgent(com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTrainAgentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Exports the specified agent to a ZIP file.
     * Operation &lt;response: [ExportAgentResponse][google.cloud.dialogflow.v2beta1.ExportAgentResponse]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportAgent(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportAgentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Imports the specified agent from a ZIP file.
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        importAgent(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportAgentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Restores the specified agent from a ZIP file.
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        restoreAgent(com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestoreAgentMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets agent validation result. Agent validation is performed during
     * training time and is updated automatically when training is completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.ValidationResult>
        getValidationResult(
            com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetValidationResultMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT = 0;
  private static final int METHODID_SET_AGENT = 1;
  private static final int METHODID_DELETE_AGENT = 2;
  private static final int METHODID_SEARCH_AGENTS = 3;
  private static final int METHODID_TRAIN_AGENT = 4;
  private static final int METHODID_EXPORT_AGENT = 5;
  private static final int METHODID_IMPORT_AGENT = 6;
  private static final int METHODID_RESTORE_AGENT = 7;
  private static final int METHODID_GET_VALIDATION_RESULT = 8;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGENT:
          serviceImpl.getAgent(
              (com.google.cloud.dialogflow.v2beta1.GetAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent>)
                  responseObserver);
          break;
        case METHODID_SET_AGENT:
          serviceImpl.setAgent(
              (com.google.cloud.dialogflow.v2beta1.SetAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent>)
                  responseObserver);
          break;
        case METHODID_DELETE_AGENT:
          serviceImpl.deleteAgent(
              (com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEARCH_AGENTS:
          serviceImpl.searchAgents(
              (com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>)
                  responseObserver);
          break;
        case METHODID_TRAIN_AGENT:
          serviceImpl.trainAgent(
              (com.google.cloud.dialogflow.v2beta1.TrainAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_AGENT:
          serviceImpl.exportAgent(
              (com.google.cloud.dialogflow.v2beta1.ExportAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_IMPORT_AGENT:
          serviceImpl.importAgent(
              (com.google.cloud.dialogflow.v2beta1.ImportAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_RESTORE_AGENT:
          serviceImpl.restoreAgent(
              (com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_VALIDATION_RESULT:
          serviceImpl.getValidationResult(
              (com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ValidationResult>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class AgentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Agents");
    }
  }

  private static final class AgentsFileDescriptorSupplier extends AgentsBaseDescriptorSupplier {
    AgentsFileDescriptorSupplier() {}
  }

  private static final class AgentsMethodDescriptorSupplier extends AgentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AgentsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AgentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new AgentsFileDescriptorSupplier())
                      .addMethod(getGetAgentMethodHelper())
                      .addMethod(getSetAgentMethodHelper())
                      .addMethod(getDeleteAgentMethodHelper())
                      .addMethod(getSearchAgentsMethodHelper())
                      .addMethod(getTrainAgentMethodHelper())
                      .addMethod(getExportAgentMethodHelper())
                      .addMethod(getImportAgentMethodHelper())
                      .addMethod(getRestoreAgentMethodHelper())
                      .addMethod(getGetValidationResultMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
