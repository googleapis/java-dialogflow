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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/conversation.proto

package com.google.cloud.dialogflow.v2beta1;

public final class ConversationProto {
  private ConversationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Conversation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Conversation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ConversationPhoneNumber_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ConversationPhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListConversationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListConversationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListConversationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListConversationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CompleteConversationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CompleteConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateMessageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListMessagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListMessagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/dialogflow/v2beta1/conver"
          + "sation.proto\022\037google.cloud.dialogflow.v2"
          + "beta1\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032)google/cloud/dialogflow/v2beta1/gcs.pr"
          + "oto\0321google/cloud/dialogflow/v2beta1/par"
          + "ticipant.proto\032-google/cloud/dialogflow/"
          + "v2beta1/session.proto\032#google/longrunnin"
          + "g/operations.proto\032\033google/protobuf/empt"
          + "y.proto\032 google/protobuf/field_mask.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\027goog"
          + "le/rpc/status.proto\"\317\006\n\014Conversation\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\003\022Z\n\017lifecycle_state\030\002 \001(\016"
          + "2<.google.cloud.dialogflow.v2beta1.Conve"
          + "rsation.LifecycleStateB\003\340A\003\022S\n\024conversat"
          + "ion_profile\030\003 \001(\tB5\340A\002\372A/\n-dialogflow.go"
          + "ogleapis.com/ConversationProfile\022S\n\014phon"
          + "e_number\030\004 \001(\01328.google.cloud.dialogflow"
          + ".v2beta1.ConversationPhoneNumberB\003\340A\003\022[\n"
          + "\022conversation_stage\030\007 \001(\0162?.google.cloud"
          + ".dialogflow.v2beta1.Conversation.Convers"
          + "ationStage\0223\n\nstart_time\030\005 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\0221\n\010end_time\030\006 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\"Q\n\016Li"
          + "fecycleState\022\037\n\033LIFECYCLE_STATE_UNSPECIF"
          + "IED\020\000\022\017\n\013IN_PROGRESS\020\001\022\r\n\tCOMPLETED\020\002\"h\n"
          + "\021ConversationStage\022\"\n\036CONVERSATION_STAGE"
          + "_UNSPECIFIED\020\000\022\027\n\023VIRTUAL_AGENT_STAGE\020\001\022"
          + "\026\n\022HUMAN_ASSIST_STAGE\020\002:\243\001\352A\237\001\n&dialogfl"
          + "ow.googleapis.com/Conversation\022/projects"
          + "/{project}/conversations/{conversation}\022"
          + "Dprojects/{project}/locations/{location}"
          + "/conversations/{conversation}\"4\n\027Convers"
          + "ationPhoneNumber\022\031\n\014phone_number\030\003 \001(\tB\003"
          + "\340A\003\"\303\001\n\031CreateConversationRequest\022>\n\006par"
          + "ent\030\001 \001(\tB.\340A\002\372A(\022&dialogflow.googleapis"
          + ".com/Conversation\022H\n\014conversation\030\002 \001(\0132"
          + "-.google.cloud.dialogflow.v2beta1.Conver"
          + "sationB\003\340A\002\022\034\n\017conversation_id\030\003 \001(\tB\003\340A"
          + "\001\"\221\001\n\030ListConversationsRequest\022>\n\006parent"
          + "\030\001 \001(\tB.\340A\002\372A(\022&dialogflow.googleapis.co"
          + "m/Conversation\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npag"
          + "e_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"z\n\031ListCon"
          + "versationsResponse\022D\n\rconversations\030\001 \003("
          + "\0132-.google.cloud.dialogflow.v2beta1.Conv"
          + "ersation\022\027\n\017next_page_token\030\002 \001(\t\"V\n\026Get"
          + "ConversationRequest\022<\n\004name\030\001 \001(\tB.\340A\002\372A"
          + "(\n&dialogflow.googleapis.com/Conversatio"
          + "n\"[\n\033CompleteConversationRequest\022<\n\004name"
          + "\030\001 \001(\tB.\340A\002\372A(\n&dialogflow.googleapis.co"
          + "m/Conversation\"\226\001\n\024CreateMessageRequest\022"
          + ">\n\006parent\030\001 \001(\tB.\340A\002\372A(\n&dialogflow.goog"
          + "leapis.com/Conversation\022>\n\007message\030\002 \001(\013"
          + "2(.google.cloud.dialogflow.v2beta1.Messa"
          + "geB\003\340A\002\"\252\001\n\032BatchCreateMessagesRequest\022>"
          + "\n\006parent\030\001 \001(\tB.\340A\002\372A(\n&dialogflow.googl"
          + "eapis.com/Conversation\022L\n\010requests\030\002 \003(\013"
          + "25.google.cloud.dialogflow.v2beta1.Creat"
          + "eMessageRequestB\003\340A\002\"Y\n\033BatchCreateMessa"
          + "gesResponse\022:\n\010messages\030\001 \003(\0132(.google.c"
          + "loud.dialogflow.v2beta1.Message\"\207\001\n\023List"
          + "MessagesRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022"
          + "!dialogflow.googleapis.com/Message\022\016\n\006fi"
          + "lter\030\004 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_to"
          + "ken\030\003 \001(\t\"k\n\024ListMessagesResponse\022:\n\010mes"
          + "sages\030\001 \003(\0132(.google.cloud.dialogflow.v2"
          + "beta1.Message\022\027\n\017next_page_token\030\002 \001(\t2\202"
          + "\016\n\rConversations\022\241\002\n\022CreateConversation\022"
          + ":.google.cloud.dialogflow.v2beta1.Create"
          + "ConversationRequest\032-.google.cloud.dialo"
          + "gflow.v2beta1.Conversation\"\237\001\202\323\344\223\002\202\001\"*/v"
          + "2beta1/{parent=projects/*}/conversations"
          + ":\014conversationZF\"6/v2beta1/{parent=proje"
          + "cts/*/locations/*}/conversations:\014conver"
          + "sation\332A\023parent,conversation\022\201\002\n\021ListCon"
          + "versations\0229.google.cloud.dialogflow.v2b"
          + "eta1.ListConversationsRequest\032:.google.c"
          + "loud.dialogflow.v2beta1.ListConversation"
          + "sResponse\"u\202\323\344\223\002f\022*/v2beta1/{parent=proj"
          + "ects/*}/conversationsZ8\0226/v2beta1/{paren"
          + "t=projects/*/locations/*}/conversations\332"
          + "A\006parent\022\356\001\n\017GetConversation\0227.google.cl"
          + "oud.dialogflow.v2beta1.GetConversationRe"
          + "quest\032-.google.cloud.dialogflow.v2beta1."
          + "Conversation\"s\202\323\344\223\002f\022*/v2beta1/{name=pro"
          + "jects/*/conversations/*}Z8\0226/v2beta1/{na"
          + "me=projects/*/locations/*/conversations/"
          + "*}\332A\004name\022\221\002\n\024CompleteConversation\022<.goo"
          + "gle.cloud.dialogflow.v2beta1.CompleteCon"
          + "versationRequest\032-.google.cloud.dialogfl"
          + "ow.v2beta1.Conversation\"\213\001\202\323\344\223\002~\"3/v2bet"
          + "a1/{name=projects/*/conversations/*}:com"
          + "plete:\001*ZD\"?/v2beta1/{name=projects/*/lo"
          + "cations/*/conversations/*}:complete:\001*\332A"
          + "\004name\022\275\002\n\023BatchCreateMessages\022;.google.c"
          + "loud.dialogflow.v2beta1.BatchCreateMessa"
          + "gesRequest\032<.google.cloud.dialogflow.v2b"
          + "eta1.BatchCreateMessagesResponse\"\252\001\202\323\344\223\002"
          + "\232\001\"A/v2beta1/{parent=projects/*/conversa"
          + "tions/*}/messages:batchCreate:\001*ZR\"M/v2b"
          + "eta1/{parent=projects/*/locations/*/conv"
          + "ersations/*}/messages:batchCreate:\001*\332A\006p"
          + "arent\022\211\002\n\014ListMessages\0224.google.cloud.di"
          + "alogflow.v2beta1.ListMessagesRequest\0325.g"
          + "oogle.cloud.dialogflow.v2beta1.ListMessa"
          + "gesResponse\"\213\001\202\323\344\223\002|\0225/v2beta1/{parent=p"
          + "rojects/*/conversations/*}/messagesZC\022A/"
          + "v2beta1/{parent=projects/*/locations/*/c"
          + "onversations/*}/messages\332A\006parent\032x\312A\031di"
          + "alogflow.googleapis.com\322AYhttps://www.go"
          + "ogleapis.com/auth/cloud-platform,https:/"
          + "/www.googleapis.com/auth/dialogflowB\257\001\n#"
          + "com.google.cloud.dialogflow.v2beta1B\021Con"
          + "versationProtoP\001ZIgoogle.golang.org/genp"
          + "roto/googleapis/cloud/dialogflow/v2beta1"
          + ";dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialo"
          + "gflow.V2beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.GcsProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.ParticipantProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_Conversation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Conversation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Conversation_descriptor,
            new java.lang.String[] {
              "Name",
              "LifecycleState",
              "ConversationProfile",
              "PhoneNumber",
              "ConversationStage",
              "StartTime",
              "EndTime",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ConversationPhoneNumber_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ConversationPhoneNumber_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ConversationPhoneNumber_descriptor,
            new java.lang.String[] {
              "PhoneNumber",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_CreateConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateConversationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Conversation", "ConversationId",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListConversationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_ListConversationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListConversationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListConversationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_ListConversationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListConversationsResponse_descriptor,
            new java.lang.String[] {
              "Conversations", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_GetConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetConversationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CompleteConversationRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_CompleteConversationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CompleteConversationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateMessageRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_CreateMessageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateMessageRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Message",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Requests",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchCreateMessagesResponse_descriptor,
            new java.lang.String[] {
              "Messages",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListMessagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_ListMessagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListMessagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListMessagesResponse_descriptor,
            new java.lang.String[] {
              "Messages", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.GcsProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.ParticipantProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}