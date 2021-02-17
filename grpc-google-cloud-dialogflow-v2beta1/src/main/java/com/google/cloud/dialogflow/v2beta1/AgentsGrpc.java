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

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/dialogflow/v2beta1/agent.proto")
public final class AgentsGrpc {

  private AgentsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Agents";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getGetAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgent",
      requestType = com.google.cloud.dialogflow.v2beta1.GetAgentRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getGetAgentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgent"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getSetAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAgent",
      requestType = com.google.cloud.dialogflow.v2beta1.SetAgentRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
          com.google.cloud.dialogflow.v2beta1.Agent>
      getSetAgentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAgent"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest, com.google.protobuf.Empty>
      getDeleteAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgent",
      requestType = com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest, com.google.protobuf.Empty>
      getDeleteAgentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgent"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
          com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
      getSearchAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchAgents",
      requestType = com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
          com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
      getSearchAgentsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchAgents"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.TrainAgentRequest, com.google.longrunning.Operation>
      getTrainAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrainAgent",
      requestType = com.google.cloud.dialogflow.v2beta1.TrainAgentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.TrainAgentRequest, com.google.longrunning.Operation>
      getTrainAgentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrainAgent"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ExportAgentRequest, com.google.longrunning.Operation>
      getExportAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportAgent",
      requestType = com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ExportAgentRequest, com.google.longrunning.Operation>
      getExportAgentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportAgent"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ImportAgentRequest, com.google.longrunning.Operation>
      getImportAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportAgent",
      requestType = com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ImportAgentRequest, com.google.longrunning.Operation>
      getImportAgentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportAgent"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest, com.google.longrunning.Operation>
      getRestoreAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestoreAgent",
      requestType = com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest, com.google.longrunning.Operation>
      getRestoreAgentMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestoreAgent"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
          com.google.cloud.dialogflow.v2beta1.ValidationResult>
      getGetValidationResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetValidationResult",
      requestType = com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.ValidationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
          com.google.cloud.dialogflow.v2beta1.ValidationResult>
      getGetValidationResultMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "GetValidationResult"))
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
    io.grpc.stub.AbstractStub.StubFactory<AgentsStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AgentsStub>() {
          @java.lang.Override
          public AgentsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AgentsStub(channel, callOptions);
          }
        };
    return AgentsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentsBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentsBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AgentsBlockingStub>() {
          @java.lang.Override
          public AgentsBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AgentsBlockingStub(channel, callOptions);
          }
        };
    return AgentsBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AgentsFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentsFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AgentsFutureStub>() {
          @java.lang.Override
          public AgentsFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AgentsFutureStub(channel, callOptions);
          }
        };
    return AgentsFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class AgentsImplBase implements io.grpc.BindableService {

    /** */
    public void getAgent(
        com.google.cloud.dialogflow.v2beta1.GetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentMethod(), responseObserver);
    }

    /** */
    public void setAgent(
        com.google.cloud.dialogflow.v2beta1.SetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAgentMethod(), responseObserver);
    }

    /** */
    public void deleteAgent(
        com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAgentMethod(), responseObserver);
    }

    /** */
    public void searchAgents(
        com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchAgentsMethod(), responseObserver);
    }

    /** */
    public void trainAgent(
        com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getTrainAgentMethod(), responseObserver);
    }

    /** */
    public void exportAgent(
        com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportAgentMethod(), responseObserver);
    }

    /** */
    public void importAgent(
        com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getImportAgentMethod(), responseObserver);
    }

    /** */
    public void restoreAgent(
        com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRestoreAgentMethod(), responseObserver);
    }

    /** */
    public void getValidationResult(
        com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ValidationResult>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetValidationResultMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getGetAgentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
                      com.google.cloud.dialogflow.v2beta1.Agent>(this, METHODID_GET_AGENT)))
          .addMethod(
              getSetAgentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.SetAgentRequest,
                      com.google.cloud.dialogflow.v2beta1.Agent>(this, METHODID_SET_AGENT)))
          .addMethod(
              getDeleteAgentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_AGENT)))
          .addMethod(
              getSearchAgentsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
                      com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>(
                      this, METHODID_SEARCH_AGENTS)))
          .addMethod(
              getTrainAgentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,
                      com.google.longrunning.Operation>(this, METHODID_TRAIN_AGENT)))
          .addMethod(
              getExportAgentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_AGENT)))
          .addMethod(
              getImportAgentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,
                      com.google.longrunning.Operation>(this, METHODID_IMPORT_AGENT)))
          .addMethod(
              getRestoreAgentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,
                      com.google.longrunning.Operation>(this, METHODID_RESTORE_AGENT)))
          .addMethod(
              getGetValidationResultMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest,
                      com.google.cloud.dialogflow.v2beta1.ValidationResult>(
                      this, METHODID_GET_VALIDATION_RESULT)))
          .build();
    }
  }

  /** */
  public static final class AgentsStub extends io.grpc.stub.AbstractAsyncStub<AgentsStub> {
    private AgentsStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsStub(channel, callOptions);
    }

    /** */
    public void getAgent(
        com.google.cloud.dialogflow.v2beta1.GetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void setAgent(
        com.google.cloud.dialogflow.v2beta1.SetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void deleteAgent(
        com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAgentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void searchAgents(
        com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchAgentsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void trainAgent(
        com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrainAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void exportAgent(
        com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportAgentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void importAgent(
        com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportAgentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void restoreAgent(
        com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestoreAgentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getValidationResult(
        com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ValidationResult>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetValidationResultMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class AgentsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentsBlockingStub> {
    private AgentsBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.dialogflow.v2beta1.Agent getAgent(
        com.google.cloud.dialogflow.v2beta1.GetAgentRequest request) {
      return blockingUnaryCall(getChannel(), getGetAgentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.dialogflow.v2beta1.Agent setAgent(
        com.google.cloud.dialogflow.v2beta1.SetAgentRequest request) {
      return blockingUnaryCall(getChannel(), getSetAgentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteAgent(
        com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteAgentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse searchAgents(
        com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request) {
      return blockingUnaryCall(getChannel(), getSearchAgentsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation trainAgent(
        com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request) {
      return blockingUnaryCall(getChannel(), getTrainAgentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation exportAgent(
        com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request) {
      return blockingUnaryCall(getChannel(), getExportAgentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation importAgent(
        com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request) {
      return blockingUnaryCall(getChannel(), getImportAgentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation restoreAgent(
        com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request) {
      return blockingUnaryCall(getChannel(), getRestoreAgentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.dialogflow.v2beta1.ValidationResult getValidationResult(
        com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetValidationResultMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class AgentsFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentsFutureStub> {
    private AgentsFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentsFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.Agent>
        getAgent(com.google.cloud.dialogflow.v2beta1.GetAgentRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetAgentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.Agent>
        setAgent(com.google.cloud.dialogflow.v2beta1.SetAgentRequest request) {
      return futureUnaryCall(getChannel().newCall(getSetAgentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteAgent(com.google.cloud.dialogflow.v2beta1.DeleteAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAgentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>
        searchAgents(com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchAgentsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        trainAgent(com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTrainAgentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportAgent(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportAgentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        importAgent(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportAgentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        restoreAgent(com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestoreAgentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.ValidationResult>
        getValidationResult(
            com.google.cloud.dialogflow.v2beta1.GetValidationResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetValidationResultMethod(), getCallOptions()), request);
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
                      .addMethod(getGetAgentMethod())
                      .addMethod(getSetAgentMethod())
                      .addMethod(getDeleteAgentMethod())
                      .addMethod(getSearchAgentsMethod())
                      .addMethod(getTrainAgentMethod())
                      .addMethod(getExportAgentMethod())
                      .addMethod(getImportAgentMethod())
                      .addMethod(getRestoreAgentMethod())
                      .addMethod(getGetValidationResultMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
