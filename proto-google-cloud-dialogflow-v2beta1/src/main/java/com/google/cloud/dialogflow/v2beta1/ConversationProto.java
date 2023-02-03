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
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_TextSectionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_TextSectionsEntry_fieldAccessorTable;

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
          + "\0321google/cloud/dialogflow/v2beta1/partic"
          + "ipant.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\317\006\n\014Conversation\022\021\n\004name\030\001 \001(\tB\003\340A\003"
          + "\022Z\n\017lifecycle_state\030\002 \001(\0162<.google.cloud"
          + ".dialogflow.v2beta1.Conversation.Lifecyc"
          + "leStateB\003\340A\003\022S\n\024conversation_profile\030\003 \001"
          + "(\tB5\340A\002\372A/\n-dialogflow.googleapis.com/Co"
          + "nversationProfile\022S\n\014phone_number\030\004 \001(\0132"
          + "8.google.cloud.dialogflow.v2beta1.Conver"
          + "sationPhoneNumberB\003\340A\003\022[\n\022conversation_s"
          + "tage\030\007 \001(\0162?.google.cloud.dialogflow.v2b"
          + "eta1.Conversation.ConversationStage\0223\n\ns"
          + "tart_time\030\005 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\0221\n\010end_time\030\006 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\"Q\n\016LifecycleState\022\037\n"
          + "\033LIFECYCLE_STATE_UNSPECIFIED\020\000\022\017\n\013IN_PRO"
          + "GRESS\020\001\022\r\n\tCOMPLETED\020\002\"h\n\021ConversationSt"
          + "age\022\"\n\036CONVERSATION_STAGE_UNSPECIFIED\020\000\022"
          + "\027\n\023VIRTUAL_AGENT_STAGE\020\001\022\026\n\022HUMAN_ASSIST"
          + "_STAGE\020\002:\243\001\352A\237\001\n&dialogflow.googleapis.c"
          + "om/Conversation\022/projects/{project}/conv"
          + "ersations/{conversation}\022Dprojects/{proj"
          + "ect}/locations/{location}/conversations/"
          + "{conversation}\"4\n\027ConversationPhoneNumbe"
          + "r\022\031\n\014phone_number\030\003 \001(\tB\003\340A\003\"\303\001\n\031CreateC"
          + "onversationRequest\022>\n\006parent\030\001 \001(\tB.\340A\002\372"
          + "A(\022&dialogflow.googleapis.com/Conversati"
          + "on\022H\n\014conversation\030\002 \001(\0132-.google.cloud."
          + "dialogflow.v2beta1.ConversationB\003\340A\002\022\034\n\017"
          + "conversation_id\030\003 \001(\tB\003\340A\001\"\221\001\n\030ListConve"
          + "rsationsRequest\022>\n\006parent\030\001 \001(\tB.\340A\002\372A(\022"
          + "&dialogflow.googleapis.com/Conversation\022"
          + "\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016"
          + "\n\006filter\030\004 \001(\t\"z\n\031ListConversationsRespo"
          + "nse\022D\n\rconversations\030\001 \003(\0132-.google.clou"
          + "d.dialogflow.v2beta1.Conversation\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\"V\n\026GetConversationReq"
          + "uest\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n&dialogflow.g"
          + "oogleapis.com/Conversation\"[\n\033CompleteCo"
          + "nversationRequest\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n"
          + "&dialogflow.googleapis.com/Conversation\""
          + "\226\001\n\024CreateMessageRequest\022>\n\006parent\030\001 \001(\t"
          + "B.\340A\002\372A(\n&dialogflow.googleapis.com/Conv"
          + "ersation\022>\n\007message\030\002 \001(\0132(.google.cloud"
          + ".dialogflow.v2beta1.MessageB\003\340A\002\"\252\001\n\032Bat"
          + "chCreateMessagesRequest\022>\n\006parent\030\001 \001(\tB"
          + ".\340A\002\372A(\n&dialogflow.googleapis.com/Conve"
          + "rsation\022L\n\010requests\030\002 \003(\01325.google.cloud"
          + ".dialogflow.v2beta1.CreateMessageRequest"
          + "B\003\340A\002\"Y\n\033BatchCreateMessagesResponse\022:\n\010"
          + "messages\030\001 \003(\0132(.google.cloud.dialogflow"
          + ".v2beta1.Message\"\207\001\n\023ListMessagesRequest"
          + "\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!dialogflow.goo"
          + "gleapis.com/Message\022\016\n\006filter\030\004 \001(\t\022\021\n\tp"
          + "age_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"k\n\024Li"
          + "stMessagesResponse\022:\n\010messages\030\001 \003(\0132(.g"
          + "oogle.cloud.dialogflow.v2beta1.Message\022\027"
          + "\n\017next_page_token\030\002 \001(\t\"\277\001\n!SuggestConve"
          + "rsationSummaryRequest\022D\n\014conversation\030\001 "
          + "\001(\tB.\340A\002\372A(\n&dialogflow.googleapis.com/C"
          + "onversation\022>\n\016latest_message\030\003 \001(\tB&\372A#"
          + "\n!dialogflow.googleapis.com/Message\022\024\n\014c"
          + "ontext_size\030\004 \001(\005\"\341\003\n\"SuggestConversatio"
          + "nSummaryResponse\022\\\n\007summary\030\001 \001(\0132K.goog"
          + "le.cloud.dialogflow.v2beta1.SuggestConve"
          + "rsationSummaryResponse.Summary\022>\n\016latest"
          + "_message\030\002 \001(\tB&\372A#\n!dialogflow.googleap"
          + "is.com/Message\022\024\n\014context_size\030\003 \001(\005\032\206\002\n"
          + "\007Summary\022\014\n\004text\030\001 \001(\t\022t\n\rtext_sections\030"
          + "\004 \003(\0132].google.cloud.dialogflow.v2beta1."
          + "SuggestConversationSummaryResponse.Summa"
          + "ry.TextSectionsEntry\022B\n\ranswer_record\030\003 "
          + "\001(\tB+\372A(\n&dialogflow.googleapis.com/Answ"
          + "erRecord\0323\n\021TextSectionsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\0012\215\021\n\rConversations\022"
          + "\241\002\n\022CreateConversation\022:.google.cloud.di"
          + "alogflow.v2beta1.CreateConversationReque"
          + "st\032-.google.cloud.dialogflow.v2beta1.Con"
          + "versation\"\237\001\202\323\344\223\002\202\001\"*/v2beta1/{parent=pr"
          + "ojects/*}/conversations:\014conversationZF\""
          + "6/v2beta1/{parent=projects/*/locations/*"
          + "}/conversations:\014conversation\332A\023parent,c"
          + "onversation\022\201\002\n\021ListConversations\0229.goog"
          + "le.cloud.dialogflow.v2beta1.ListConversa"
          + "tionsRequest\032:.google.cloud.dialogflow.v"
          + "2beta1.ListConversationsResponse\"u\202\323\344\223\002f"
          + "\022*/v2beta1/{parent=projects/*}/conversat"
          + "ionsZ8\0226/v2beta1/{parent=projects/*/loca"
          + "tions/*}/conversations\332A\006parent\022\356\001\n\017GetC"
          + "onversation\0227.google.cloud.dialogflow.v2"
          + "beta1.GetConversationRequest\032-.google.cl"
          + "oud.dialogflow.v2beta1.Conversation\"s\202\323\344"
          + "\223\002f\022*/v2beta1/{name=projects/*/conversat"
          + "ions/*}Z8\0226/v2beta1/{name=projects/*/loc"
          + "ations/*/conversations/*}\332A\004name\022\221\002\n\024Com"
          + "pleteConversation\022<.google.cloud.dialogf"
          + "low.v2beta1.CompleteConversationRequest\032"
          + "-.google.cloud.dialogflow.v2beta1.Conver"
          + "sation\"\213\001\202\323\344\223\002~\"3/v2beta1/{name=projects"
          + "/*/conversations/*}:complete:\001*ZD\"?/v2be"
          + "ta1/{name=projects/*/locations/*/convers"
          + "ations/*}:complete:\001*\332A\004name\022\275\002\n\023BatchCr"
          + "eateMessages\022;.google.cloud.dialogflow.v"
          + "2beta1.BatchCreateMessagesRequest\032<.goog"
          + "le.cloud.dialogflow.v2beta1.BatchCreateM"
          + "essagesResponse\"\252\001\202\323\344\223\002\232\001\"A/v2beta1/{par"
          + "ent=projects/*/conversations/*}/messages"
          + ":batchCreate:\001*ZR\"M/v2beta1/{parent=proj"
          + "ects/*/locations/*/conversations/*}/mess"
          + "ages:batchCreate:\001*\332A\006parent\022\211\002\n\014ListMes"
          + "sages\0224.google.cloud.dialogflow.v2beta1."
          + "ListMessagesRequest\0325.google.cloud.dialo"
          + "gflow.v2beta1.ListMessagesResponse\"\213\001\202\323\344"
          + "\223\002|\0225/v2beta1/{parent=projects/*/convers"
          + "ations/*}/messagesZC\022A/v2beta1/{parent=p"
          + "rojects/*/locations/*/conversations/*}/m"
          + "essages\332A\006parent\022\210\003\n\032SuggestConversation"
          + "Summary\022B.google.cloud.dialogflow.v2beta"
          + "1.SuggestConversationSummaryRequest\032C.go"
          + "ogle.cloud.dialogflow.v2beta1.SuggestCon"
          + "versationSummaryResponse\"\340\001\202\323\344\223\002\312\001\"Y/v2b"
          + "eta1/{conversation=projects/*/conversati"
          + "ons/*}/suggestions:suggestConversationSu"
          + "mmary:\001*Zj\"e/v2beta1/{conversation=proje"
          + "cts/*/locations/*/conversations/*}/sugge"
          + "stions:suggestConversationSummary:\001*\332A\014c"
          + "onversation\032x\312A\031dialogflow.googleapis.co"
          + "m\322AYhttps://www.googleapis.com/auth/clou"
          + "d-platform,https://www.googleapis.com/au"
          + "th/dialogflowB\251\001\n#com.google.cloud.dialo"
          + "gflow.v2beta1B\021ConversationProtoP\001ZCclou"
          + "d.google.com/go/dialogflow/apiv2beta1/di"
          + "alogflowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\037Google"
          + ".Cloud.Dialogflow.V2beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.ParticipantProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
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
    internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_descriptor,
            new java.lang.String[] {
              "Conversation", "LatestMessage", "ContextSize",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_descriptor,
            new java.lang.String[] {
              "Summary", "LatestMessage", "ContextSize",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_descriptor,
            new java.lang.String[] {
              "Text", "TextSections", "AnswerRecord",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_TextSectionsEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_TextSectionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryResponse_Summary_TextSectionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.cloud.dialogflow.v2beta1.ParticipantProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
