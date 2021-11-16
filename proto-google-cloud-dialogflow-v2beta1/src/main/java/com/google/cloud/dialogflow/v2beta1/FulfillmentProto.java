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
// source: google/cloud/dialogflow/v2beta1/fulfillment.proto

package com.google.cloud.dialogflow.v2beta1;

public final class FulfillmentProto {
  private FulfillmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_RequestHeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_RequestHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_Feature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetFulfillmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetFulfillmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateFulfillmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateFulfillmentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/dialogflow/v2beta1/fulfil"
          + "lment.proto\022\037google.cloud.dialogflow.v2b"
          + "eta1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + " google/protobuf/field_mask.proto\"\237\006\n\013Fu"
          + "lfillment\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\024\n\014display_"
          + "name\030\002 \001(\t\022]\n\023generic_web_service\030\003 \001(\0132"
          + ">.google.cloud.dialogflow.v2beta1.Fulfil"
          + "lment.GenericWebServiceH\000\022\017\n\007enabled\030\004 \001"
          + "(\010\022F\n\010features\030\005 \003(\01324.google.cloud.dial"
          + "ogflow.v2beta1.Fulfillment.Feature\032\217\002\n\021G"
          + "enericWebService\022\020\n\003uri\030\001 \001(\tB\003\340A\002\022\020\n\010us"
          + "ername\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022k\n\017reques"
          + "t_headers\030\004 \003(\0132R.google.cloud.dialogflo"
          + "w.v2beta1.Fulfillment.GenericWebService."
          + "RequestHeadersEntry\022 \n\021is_cloud_function"
          + "\030\005 \001(\010B\005\030\001\340A\001\0325\n\023RequestHeadersEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032\177\n\007Feature\022"
          + "G\n\004type\030\001 \001(\01629.google.cloud.dialogflow."
          + "v2beta1.Fulfillment.Feature.Type\"+\n\004Type"
          + "\022\024\n\020TYPE_UNSPECIFIED\020\000\022\r\n\tSMALLTALK\020\001:\214\001"
          + "\352A\210\001\n%dialogflow.googleapis.com/Fulfillm"
          + "ent\022$projects/{project}/agent/fulfillmen"
          + "t\0229projects/{project}/locations/{locatio"
          + "n}/agent/fulfillmentB\r\n\013fulfillment\"T\n\025G"
          + "etFulfillmentRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372"
          + "A\'\n%dialogflow.googleapis.com/Fulfillmen"
          + "t\"\230\001\n\030UpdateFulfillmentRequest\022F\n\013fulfil"
          + "lment\030\001 \001(\0132,.google.cloud.dialogflow.v2"
          + "beta1.FulfillmentB\003\340A\002\0224\n\013update_mask\030\002 "
          + "\001(\0132\032.google.protobuf.FieldMaskB\003\340A\0022\271\005\n"
          + "\014Fulfillments\022\357\001\n\016GetFulfillment\0226.googl"
          + "e.cloud.dialogflow.v2beta1.GetFulfillmen"
          + "tRequest\032,.google.cloud.dialogflow.v2bet"
          + "a1.Fulfillment\"w\202\323\344\223\002j\022,/v2beta1/{name=p"
          + "rojects/*/agent/fulfillment}Z:\0228/v2beta1"
          + "/{name=projects/*/locations/*/agent/fulf"
          + "illment}\332A\004name\022\274\002\n\021UpdateFulfillment\0229."
          + "google.cloud.dialogflow.v2beta1.UpdateFu"
          + "lfillmentRequest\032,.google.cloud.dialogfl"
          + "ow.v2beta1.Fulfillment\"\275\001\202\323\344\223\002\234\00128/v2bet"
          + "a1/{fulfillment.name=projects/*/agent/fu"
          + "lfillment}:\013fulfillmentZS2D/v2beta1/{ful"
          + "fillment.name=projects/*/locations/*/age"
          + "nt/fulfillment}:\013fulfillment\332A\027fulfillme"
          + "nt,update_mask\032x\312A\031dialogflow.googleapis"
          + ".com\322AYhttps://www.googleapis.com/auth/c"
          + "loud-platform,https://www.googleapis.com"
          + "/auth/dialogflowB\256\001\n#com.google.cloud.di"
          + "alogflow.v2beta1B\020FulfillmentProtoP\001ZIgo"
          + "ogle.golang.org/genproto/googleapis/clou"
          + "d/dialogflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252"
          + "\002\037Google.Cloud.Dialogflow.V2beta1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "GenericWebService", "Enabled", "Features", "Fulfillment",
            });
    internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_descriptor,
            new java.lang.String[] {
              "Uri", "Username", "Password", "RequestHeaders", "IsCloudFunction",
            });
    internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_RequestHeadersEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_RequestHeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_GenericWebService_RequestHeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_Feature_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_Feature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Fulfillment_Feature_descriptor,
            new java.lang.String[] {
              "Type",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetFulfillmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_GetFulfillmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetFulfillmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateFulfillmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateFulfillmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateFulfillmentRequest_descriptor,
            new java.lang.String[] {
              "Fulfillment", "UpdateMask",
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
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
