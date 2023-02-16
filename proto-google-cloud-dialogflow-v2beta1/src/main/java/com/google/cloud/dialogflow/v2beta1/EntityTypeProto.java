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
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/dialogflow/v2beta1/entity"
          + "_type.proto\022\037google.cloud.dialogflow.v2b"
          + "eta1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + "#google/longrunning/operations.proto\032\033go"
          + "ogle/protobuf/empty.proto\032 google/protob"
          + "uf/field_mask.proto\"\315\005\n\nEntityType\022\014\n\004na"
          + "me\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022C\n\004k"
          + "ind\030\003 \001(\01620.google.cloud.dialogflow.v2be"
          + "ta1.EntityType.KindB\003\340A\002\022_\n\023auto_expansi"
          + "on_mode\030\004 \001(\0162=.google.cloud.dialogflow."
          + "v2beta1.EntityType.AutoExpansionModeB\003\340A"
          + "\001\022I\n\010entities\030\006 \003(\01322.google.cloud.dialo"
          + "gflow.v2beta1.EntityType.EntityB\003\340A\001\022$\n\027"
          + "enable_fuzzy_extraction\030\007 \001(\010B\003\340A\001\032.\n\006En"
          + "tity\022\022\n\005value\030\001 \001(\tB\003\340A\002\022\020\n\010synonyms\030\002 \003"
          + "(\t\"J\n\004Kind\022\024\n\020KIND_UNSPECIFIED\020\000\022\014\n\010KIND"
          + "_MAP\020\001\022\r\n\tKIND_LIST\020\002\022\017\n\013KIND_REGEXP\020\003\"Y"
          + "\n\021AutoExpansionMode\022#\n\037AUTO_EXPANSION_MO"
          + "DE_UNSPECIFIED\020\000\022\037\n\033AUTO_EXPANSION_MODE_"
          + "DEFAULT\020\001:\247\001\352A\243\001\n$dialogflow.googleapis."
          + "com/EntityType\0222projects/{project}/agent"
          + "/entityTypes/{entity_type}\022Gprojects/{pr"
          + "oject}/locations/{location}/agent/entity"
          + "Types/{entity_type}\"\243\001\n\026ListEntityTypesR"
          + "equest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$dialogfl"
          + "ow.googleapis.com/EntityType\022\032\n\rlanguage"
          + "_code\030\002 \001(\tB\003\340A\001\022\026\n\tpage_size\030\003 \001(\005B\003\340A\001"
          + "\022\027\n\npage_token\030\004 \001(\tB\003\340A\001\"u\n\027ListEntityT"
          + "ypesResponse\022A\n\014entity_types\030\001 \003(\0132+.goo"
          + "gle.cloud.dialogflow.v2beta1.EntityType\022"
          + "\027\n\017next_page_token\030\002 \001(\t\"n\n\024GetEntityTyp"
          + "eRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$dialogfl"
          + "ow.googleapis.com/EntityType\022\032\n\rlanguage"
          + "_code\030\002 \001(\tB\003\340A\001\"\272\001\n\027CreateEntityTypeReq"
          + "uest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$dialogflow"
          + ".googleapis.com/EntityType\022E\n\013entity_typ"
          + "e\030\002 \001(\0132+.google.cloud.dialogflow.v2beta"
          + "1.EntityTypeB\003\340A\002\022\032\n\rlanguage_code\030\003 \001(\t"
          + "B\003\340A\001\"\262\001\n\027UpdateEntityTypeRequest\022E\n\013ent"
          + "ity_type\030\001 \001(\0132+.google.cloud.dialogflow"
          + ".v2beta1.EntityTypeB\003\340A\002\022\032\n\rlanguage_cod"
          + "e\030\002 \001(\tB\003\340A\001\0224\n\013update_mask\030\003 \001(\0132\032.goog"
          + "le.protobuf.FieldMaskB\003\340A\001\"U\n\027DeleteEnti"
          + "tyTypeRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$dia"
          + "logflow.googleapis.com/EntityType\"\273\002\n\035Ba"
          + "tchUpdateEntityTypesRequest\022<\n\006parent\030\001 "
          + "\001(\tB,\340A\002\372A&\022$dialogflow.googleapis.com/E"
          + "ntityType\022\037\n\025entity_type_batch_uri\030\002 \001(\t"
          + "H\000\022T\n\030entity_type_batch_inline\030\003 \001(\01320.g"
          + "oogle.cloud.dialogflow.v2beta1.EntityTyp"
          + "eBatchH\000\022\032\n\rlanguage_code\030\004 \001(\tB\003\340A\001\0224\n\013"
          + "update_mask\030\005 \001(\0132\032.google.protobuf.Fiel"
          + "dMaskB\003\340A\001B\023\n\021entity_type_batch\"c\n\036Batch"
          + "UpdateEntityTypesResponse\022A\n\014entity_type"
          + "s\030\001 \003(\0132+.google.cloud.dialogflow.v2beta"
          + "1.EntityType\"}\n\035BatchDeleteEntityTypesRe"
          + "quest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$dialogflo"
          + "w.googleapis.com/EntityType\022\036\n\021entity_ty"
          + "pe_names\030\002 \003(\tB\003\340A\002\"\301\001\n\032BatchCreateEntit"
          + "iesRequest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\n$dial"
          + "ogflow.googleapis.com/EntityType\022I\n\010enti"
          + "ties\030\002 \003(\01322.google.cloud.dialogflow.v2b"
          + "eta1.EntityType.EntityB\003\340A\002\022\032\n\rlanguage_"
          + "code\030\003 \001(\tB\003\340A\001\"\362\001\n\032BatchUpdateEntitiesR"
          + "equest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\n$dialogfl"
          + "ow.googleapis.com/EntityType\022I\n\010entities"
          + "\030\002 \003(\01322.google.cloud.dialogflow.v2beta1"
          + ".EntityType.EntityB\003\340A\002\022\032\n\rlanguage_code"
          + "\030\003 \001(\tB\003\340A\001\022/\n\013update_mask\030\004 \001(\0132\032.googl"
          + "e.protobuf.FieldMask\"\222\001\n\032BatchDeleteEnti"
          + "tiesRequest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\n$dia"
          + "logflow.googleapis.com/EntityType\022\032\n\rent"
          + "ity_values\030\002 \003(\tB\003\340A\002\022\032\n\rlanguage_code\030\003"
          + " \001(\tB\003\340A\001\"T\n\017EntityTypeBatch\022A\n\014entity_t"
          + "ypes\030\001 \003(\0132+.google.cloud.dialogflow.v2b"
          + "eta1.EntityType2\256\033\n\013EntityTypes\022\233\002\n\017List"
          + "EntityTypes\0227.google.cloud.dialogflow.v2"
          + "beta1.ListEntityTypesRequest\0328.google.cl"
          + "oud.dialogflow.v2beta1.ListEntityTypesRe"
          + "sponse\"\224\001\202\323\344\223\002n\022./v2beta1/{parent=projec"
          + "ts/*/agent}/entityTypesZ<\022:/v2beta1/{par"
          + "ent=projects/*/locations/*/agent}/entity"
          + "Types\332A\006parent\332A\024parent,language_code\022\206\002"
          + "\n\rGetEntityType\0225.google.cloud.dialogflo"
          + "w.v2beta1.GetEntityTypeRequest\032+.google."
          + "cloud.dialogflow.v2beta1.EntityType\"\220\001\202\323"
          + "\344\223\002n\022./v2beta1/{name=projects/*/agent/en"
          + "tityTypes/*}Z<\022:/v2beta1/{name=projects/"
          + "*/locations/*/agent/entityTypes/*}\332A\004nam"
          + "e\332A\022name,language_code\022\303\002\n\020CreateEntityT"
          + "ype\0228.google.cloud.dialogflow.v2beta1.Cr"
          + "eateEntityTypeRequest\032+.google.cloud.dia"
          + "logflow.v2beta1.EntityType\"\307\001\202\323\344\223\002\210\001\"./v"
          + "2beta1/{parent=projects/*/agent}/entityT"
          + "ypes:\013entity_typeZI\":/v2beta1/{parent=pr"
          + "ojects/*/locations/*/agent}/entityTypes:"
          + "\013entity_type\332A\022parent,entity_type\332A pare"
          + "nt,entity_type,language_code\022\365\002\n\020UpdateE"
          + "ntityType\0228.google.cloud.dialogflow.v2be"
          + "ta1.UpdateEntityTypeRequest\032+.google.clo"
          + "ud.dialogflow.v2beta1.EntityType\"\371\001\202\323\344\223\002"
          + "\240\0012:/v2beta1/{entity_type.name=projects/"
          + "*/agent/entityTypes/*}:\013entity_typeZU2F/"
          + "v2beta1/{entity_type.name=projects/*/loc"
          + "ations/*/agent/entityTypes/*}:\013entity_ty"
          + "pe\332A\013entity_type\332A\031entity_type,language_"
          + "code\332A%entity_type,language_code,update_"
          + "mask\022\341\001\n\020DeleteEntityType\0228.google.cloud"
          + ".dialogflow.v2beta1.DeleteEntityTypeRequ"
          + "est\032\026.google.protobuf.Empty\"{\202\323\344\223\002n*./v2"
          + "beta1/{name=projects/*/agent/entityTypes"
          + "/*}Z<*:/v2beta1/{name=projects/*/locatio"
          + "ns/*/agent/entityTypes/*}\332A\004name\022\350\002\n\026Bat"
          + "chUpdateEntityTypes\022>.google.cloud.dialo"
          + "gflow.v2beta1.BatchUpdateEntityTypesRequ"
          + "est\032\035.google.longrunning.Operation\"\356\001\202\323\344"
          + "\223\002\214\001\":/v2beta1/{parent=projects/*/agent}"
          + "/entityTypes:batchUpdate:\001*ZK\"F/v2beta1/"
          + "{parent=projects/*/locations/*/agent}/en"
          + "tityTypes:batchUpdate:\001*\312AX\n>google.clou"
          + "d.dialogflow.v2beta1.BatchUpdateEntityTy"
          + "pesResponse\022\026google.protobuf.Struct\022\332\002\n\026"
          + "BatchDeleteEntityTypes\022>.google.cloud.di"
          + "alogflow.v2beta1.BatchDeleteEntityTypesR"
          + "equest\032\035.google.longrunning.Operation\"\340\001"
          + "\202\323\344\223\002\214\001\":/v2beta1/{parent=projects/*/age"
          + "nt}/entityTypes:batchDelete:\001*ZK\"F/v2bet"
          + "a1/{parent=projects/*/locations/*/agent}"
          + "/entityTypes:batchDelete:\001*\332A\030parent,ent"
          + "ity_type_names\312A/\n\025google.protobuf.Empty"
          + "\022\026google.protobuf.Struct\022\201\003\n\023BatchCreate"
          + "Entities\022;.google.cloud.dialogflow.v2bet"
          + "a1.BatchCreateEntitiesRequest\032\035.google.l"
          + "ongrunning.Operation\"\215\002\202\323\344\223\002\242\001\"E/v2beta1"
          + "/{parent=projects/*/agent/entityTypes/*}"
          + "/entities:batchCreate:\001*ZV\"Q/v2beta1/{pa"
          + "rent=projects/*/locations/*/agent/entity"
          + "Types/*}/entities:batchCreate:\001*\332A\017paren"
          + "t,entities\332A\035parent,entities,language_co"
          + "de\312A/\n\025google.protobuf.Empty\022\026google.pro"
          + "tobuf.Struct\022\201\003\n\023BatchUpdateEntities\022;.g"
          + "oogle.cloud.dialogflow.v2beta1.BatchUpda"
          + "teEntitiesRequest\032\035.google.longrunning.O"
          + "peration\"\215\002\202\323\344\223\002\242\001\"E/v2beta1/{parent=pro"
          + "jects/*/agent/entityTypes/*}/entities:ba"
          + "tchUpdate:\001*ZV\"Q/v2beta1/{parent=project"
          + "s/*/locations/*/agent/entityTypes/*}/ent"
          + "ities:batchUpdate:\001*\332A\017parent,entities\332A"
          + "\035parent,entities,language_code\312A/\n\025googl"
          + "e.protobuf.Empty\022\026google.protobuf.Struct"
          + "\022\213\003\n\023BatchDeleteEntities\022;.google.cloud."
          + "dialogflow.v2beta1.BatchDeleteEntitiesRe"
          + "quest\032\035.google.longrunning.Operation\"\227\002\202"
          + "\323\344\223\002\242\001\"E/v2beta1/{parent=projects/*/agen"
          + "t/entityTypes/*}/entities:batchDelete:\001*"
          + "ZV\"Q/v2beta1/{parent=projects/*/location"
          + "s/*/agent/entityTypes/*}/entities:batchD"
          + "elete:\001*\332A\024parent,entity_values\332A\"parent"
          + ",entity_values,language_code\312A/\n\025google."
          + "protobuf.Empty\022\026google.protobuf.Struct\032x"
          + "\312A\031dialogflow.googleapis.com\322AYhttps://w"
          + "ww.googleapis.com/auth/cloud-platform,ht"
          + "tps://www.googleapis.com/auth/dialogflow"
          + "B\247\001\n#com.google.cloud.dialogflow.v2beta1"
          + "B\017EntityTypeProtoP\001ZCcloud.google.com/go"
          + "/dialogflow/apiv2beta1/dialogflowpb;dial"
          + "ogflowpb\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogfl"
          + "ow.V2beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Kind",
              "AutoExpansionMode",
              "Entities",
              "EnableFuzzyExtraction",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor,
            new java.lang.String[] {
              "Value", "Synonyms",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityType", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "EntityTypeBatchUri",
              "EntityTypeBatchInline",
              "LanguageCode",
              "UpdateMask",
              "EntityTypeBatch",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityTypeNames",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityValues", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor,
            new java.lang.String[] {
              "EntityTypes",
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
