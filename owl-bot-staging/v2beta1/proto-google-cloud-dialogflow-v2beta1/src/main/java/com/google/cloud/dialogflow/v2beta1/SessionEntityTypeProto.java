// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session_entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public final class SessionEntityTypeProto {
  private SessionEntityTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_SessionEntityType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SessionEntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetSessionEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_CreateSessionEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_UpdateSessionEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteSessionEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteSessionEntityTypeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/dialogflow/v2beta1/sessio" +
      "n_entity_type.proto\022\037google.cloud.dialog" +
      "flow.v2beta1\032\034google/api/annotations.pro" +
      "to\032\027google/api/client.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\0321google/cloud/dialogflow/v2beta1" +
      "/entity_type.proto\032\033google/protobuf/empt" +
      "y.proto\032 google/protobuf/field_mask.prot" +
      "o\"\234\006\n\021SessionEntityType\022\014\n\004name\030\001 \001(\t\022c\n" +
      "\024entity_override_mode\030\002 \001(\0162E.google.clo" +
      "ud.dialogflow.v2beta1.SessionEntityType." +
      "EntityOverrideMode\022D\n\010entities\030\003 \003(\01322.g" +
      "oogle.cloud.dialogflow.v2beta1.EntityTyp" +
      "e.Entity\"\202\001\n\022EntityOverrideMode\022$\n ENTIT" +
      "Y_OVERRIDE_MODE_UNSPECIFIED\020\000\022!\n\035ENTITY_" +
      "OVERRIDE_MODE_OVERRIDE\020\001\022#\n\037ENTITY_OVERR" +
      "IDE_MODE_SUPPLEMENT\020\002:\310\003\352A\304\003\n+dialogflow" +
      ".googleapis.com/SessionEntityType\022Eproje" +
      "cts/{project}/agent/sessions/{session}/e" +
      "ntityTypes/{entity_type}\022Zprojects/{proj" +
      "ect}/locations/{location}/agent/sessions" +
      "/{session}/entityTypes/{entity_type}\022mpr" +
      "ojects/{project}/agent/environments/{env" +
      "ironment}/users/{user}/sessions/{session" +
      "}/entityTypes/{entity_type}\022\202\001projects/{" +
      "project}/locations/{location}/agent/envi" +
      "ronments/{environment}/users/{user}/sess" +
      "ions/{session}/entityTypes/{entity_type}" +
      "\"\213\001\n\035ListSessionEntityTypesRequest\022C\n\006pa" +
      "rent\030\001 \001(\tB3\340A\002\372A-\022+dialogflow.googleapi" +
      "s.com/SessionEntityType\022\021\n\tpage_size\030\002 \001" +
      "(\005\022\022\n\npage_token\030\003 \001(\t\"\213\001\n\036ListSessionEn" +
      "tityTypesResponse\022P\n\024session_entity_type" +
      "s\030\001 \003(\01322.google.cloud.dialogflow.v2beta" +
      "1.SessionEntityType\022\027\n\017next_page_token\030\002" +
      " \001(\t\"`\n\033GetSessionEntityTypeRequest\022A\n\004n" +
      "ame\030\001 \001(\tB3\340A\002\372A-\n+dialogflow.googleapis" +
      ".com/SessionEntityType\"\273\001\n\036CreateSession" +
      "EntityTypeRequest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A" +
      "-\022+dialogflow.googleapis.com/SessionEnti" +
      "tyType\022T\n\023session_entity_type\030\002 \001(\01322.go" +
      "ogle.cloud.dialogflow.v2beta1.SessionEnt" +
      "ityTypeB\003\340A\002\"\247\001\n\036UpdateSessionEntityType" +
      "Request\022T\n\023session_entity_type\030\001 \001(\01322.g" +
      "oogle.cloud.dialogflow.v2beta1.SessionEn" +
      "tityTypeB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.goo" +
      "gle.protobuf.FieldMask\"c\n\036DeleteSessionE" +
      "ntityTypeRequest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+" +
      "dialogflow.googleapis.com/SessionEntityT" +
      "ype2\373\025\n\022SessionEntityTypes\022\344\003\n\026ListSessi" +
      "onEntityTypes\022>.google.cloud.dialogflow." +
      "v2beta1.ListSessionEntityTypesRequest\032?." +
      "google.cloud.dialogflow.v2beta1.ListSess" +
      "ionEntityTypesResponse\"\310\002\202\323\344\223\002\270\002\0229/v2bet" +
      "a1/{parent=projects/*/agent/sessions/*}/" +
      "entityTypesZR\022P/v2beta1/{parent=projects" +
      "/*/agent/environments/*/users/*/sessions" +
      "/*}/entityTypesZG\022E/v2beta1/{parent=proj" +
      "ects/*/locations/*/agent/sessions/*}/ent" +
      "ityTypesZ^\022\\/v2beta1/{parent=projects/*/" +
      "locations/*/agent/environments/*/users/*" +
      "/sessions/*}/entityTypes\332A\006parent\022\321\003\n\024Ge" +
      "tSessionEntityType\022<.google.cloud.dialog" +
      "flow.v2beta1.GetSessionEntityTypeRequest" +
      "\0322.google.cloud.dialogflow.v2beta1.Sessi" +
      "onEntityType\"\306\002\202\323\344\223\002\270\002\0229/v2beta1/{name=p" +
      "rojects/*/agent/sessions/*/entityTypes/*" +
      "}ZR\022P/v2beta1/{name=projects/*/agent/env" +
      "ironments/*/users/*/sessions/*/entityTyp" +
      "es/*}ZG\022E/v2beta1/{name=projects/*/locat" +
      "ions/*/agent/sessions/*/entityTypes/*}Z^" +
      "\022\\/v2beta1/{name=projects/*/locations/*/" +
      "agent/environments/*/users/*/sessions/*/" +
      "entityTypes/*}\332A\004name\022\301\004\n\027CreateSessionE" +
      "ntityType\022?.google.cloud.dialogflow.v2be" +
      "ta1.CreateSessionEntityTypeRequest\0322.goo" +
      "gle.cloud.dialogflow.v2beta1.SessionEnti" +
      "tyType\"\260\003\202\323\344\223\002\214\003\"9/v2beta1/{parent=proje" +
      "cts/*/agent/sessions/*}/entityTypes:\023ses" +
      "sion_entity_typeZg\"P/v2beta1/{parent=pro" +
      "jects/*/agent/environments/*/users/*/ses" +
      "sions/*}/entityTypes:\023session_entity_typ" +
      "eZ\\\"E/v2beta1/{parent=projects/*/locatio" +
      "ns/*/agent/sessions/*}/entityTypes:\023sess" +
      "ion_entity_typeZs\"\\/v2beta1/{parent=proj" +
      "ects/*/locations/*/agent/environments/*/" +
      "users/*/sessions/*}/entityTypes:\023session" +
      "_entity_type\332A\032parent,session_entity_typ" +
      "e\022\255\005\n\027UpdateSessionEntityType\022?.google.c" +
      "loud.dialogflow.v2beta1.UpdateSessionEnt" +
      "ityTypeRequest\0322.google.cloud.dialogflow" +
      ".v2beta1.SessionEntityType\"\234\004\202\323\344\223\002\335\0032M/v" +
      "2beta1/{session_entity_type.name=project" +
      "s/*/agent/sessions/*/entityTypes/*}:\023ses" +
      "sion_entity_typeZ{2d/v2beta1/{session_en" +
      "tity_type.name=projects/*/agent/environm" +
      "ents/*/users/*/sessions/*/entityTypes/*}" +
      ":\023session_entity_typeZp2Y/v2beta1/{sessi" +
      "on_entity_type.name=projects/*/locations" +
      "/*/agent/sessions/*/entityTypes/*}:\023sess" +
      "ion_entity_typeZ\207\0012p/v2beta1/{session_en" +
      "tity_type.name=projects/*/locations/*/ag" +
      "ent/environments/*/users/*/sessions/*/en" +
      "tityTypes/*}:\023session_entity_type\332A\023sess" +
      "ion_entity_type\332A\037session_entity_type,up" +
      "date_mask\022\273\003\n\027DeleteSessionEntityType\022?." +
      "google.cloud.dialogflow.v2beta1.DeleteSe" +
      "ssionEntityTypeRequest\032\026.google.protobuf" +
      ".Empty\"\306\002\202\323\344\223\002\270\002*9/v2beta1/{name=project" +
      "s/*/agent/sessions/*/entityTypes/*}ZR*P/" +
      "v2beta1/{name=projects/*/agent/environme" +
      "nts/*/users/*/sessions/*/entityTypes/*}Z" +
      "G*E/v2beta1/{name=projects/*/locations/*" +
      "/agent/sessions/*/entityTypes/*}Z^*\\/v2b" +
      "eta1/{name=projects/*/locations/*/agent/" +
      "environments/*/users/*/sessions/*/entity" +
      "Types/*}\332A\004name\032x\312A\031dialogflow.googleapi" +
      "s.com\322AYhttps://www.googleapis.com/auth/" +
      "cloud-platform,https://www.googleapis.co" +
      "m/auth/dialogflowB\264\001\n#com.google.cloud.d" +
      "ialogflow.v2beta1B\026SessionEntityTypeProt" +
      "oP\001ZIgoogle.golang.org/genproto/googleap" +
      "is/cloud/dialogflow/v2beta1;dialogflow\370\001" +
      "\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.EntityTypeProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_dialogflow_v2beta1_SessionEntityType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_SessionEntityType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_SessionEntityType_descriptor,
        new java.lang.String[] { "Name", "EntityOverrideMode", "Entities", });
    internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListSessionEntityTypesResponse_descriptor,
        new java.lang.String[] { "SessionEntityTypes", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_GetSessionEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetSessionEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetSessionEntityTypeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_CreateSessionEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateSessionEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_CreateSessionEntityTypeRequest_descriptor,
        new java.lang.String[] { "Parent", "SessionEntityType", });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateSessionEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateSessionEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_UpdateSessionEntityTypeRequest_descriptor,
        new java.lang.String[] { "SessionEntityType", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteSessionEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteSessionEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteSessionEntityTypeRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.EntityTypeProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
