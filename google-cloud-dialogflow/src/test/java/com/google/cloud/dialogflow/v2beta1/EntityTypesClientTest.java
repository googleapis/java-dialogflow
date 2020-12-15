/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.dialogflow.v2beta1;

import static com.google.cloud.dialogflow.v2beta1.EntityTypesClient.ListEntityTypesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class EntityTypesClientTest {
  private static MockEntityTypes mockEntityTypes;
  private static MockServiceHelper mockServiceHelper;
  private EntityTypesClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockEntityTypes = new MockEntityTypes();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockEntityTypes));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    EntityTypesSettings settings =
        EntityTypesSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = EntityTypesClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listEntityTypesTest() throws Exception {
    EntityType responsesElement = EntityType.newBuilder().build();
    ListEntityTypesResponse expectedResponse =
        ListEntityTypesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEntityTypes(Arrays.asList(responsesElement))
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    AgentName parent = AgentName.ofProjectName("[PROJECT]");

    ListEntityTypesPagedResponse pagedListResponse = client.listEntityTypes(parent);

    List<EntityType> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEntityTypesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEntityTypesRequest actualRequest = ((ListEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEntityTypesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      client.listEntityTypes(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEntityTypesTest2() throws Exception {
    EntityType responsesElement = EntityType.newBuilder().build();
    ListEntityTypesResponse expectedResponse =
        ListEntityTypesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEntityTypes(Arrays.asList(responsesElement))
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListEntityTypesPagedResponse pagedListResponse = client.listEntityTypes(parent);

    List<EntityType> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEntityTypesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEntityTypesRequest actualRequest = ((ListEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEntityTypesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listEntityTypes(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEntityTypesTest3() throws Exception {
    EntityType responsesElement = EntityType.newBuilder().build();
    ListEntityTypesResponse expectedResponse =
        ListEntityTypesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEntityTypes(Arrays.asList(responsesElement))
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    AgentName parent = AgentName.ofProjectName("[PROJECT]");
    String languageCode = "languageCode-2092349083";

    ListEntityTypesPagedResponse pagedListResponse = client.listEntityTypes(parent, languageCode);

    List<EntityType> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEntityTypesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEntityTypesRequest actualRequest = ((ListEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEntityTypesExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      String languageCode = "languageCode-2092349083";
      client.listEntityTypes(parent, languageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEntityTypesTest4() throws Exception {
    EntityType responsesElement = EntityType.newBuilder().build();
    ListEntityTypesResponse expectedResponse =
        ListEntityTypesResponse.newBuilder()
            .setNextPageToken("")
            .addAllEntityTypes(Arrays.asList(responsesElement))
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    String parent = "parent-995424086";
    String languageCode = "languageCode-2092349083";

    ListEntityTypesPagedResponse pagedListResponse = client.listEntityTypes(parent, languageCode);

    List<EntityType> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEntityTypesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEntityTypesRequest actualRequest = ((ListEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEntityTypesExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      String languageCode = "languageCode-2092349083";
      client.listEntityTypes(parent, languageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEntityTypeTest() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    EntityTypeName name = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");

    EntityType actualResponse = client.getEntityType(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEntityTypeRequest actualRequest = ((GetEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEntityTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName name = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      client.getEntityType(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEntityTypeTest2() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    String name = "name3373707";

    EntityType actualResponse = client.getEntityType(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEntityTypeRequest actualRequest = ((GetEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEntityTypeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String name = "name3373707";
      client.getEntityType(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEntityTypeTest3() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    EntityTypeName name = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
    String languageCode = "languageCode-2092349083";

    EntityType actualResponse = client.getEntityType(name, languageCode);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEntityTypeRequest actualRequest = ((GetEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEntityTypeExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName name = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      String languageCode = "languageCode-2092349083";
      client.getEntityType(name, languageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEntityTypeTest4() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    String name = "name3373707";
    String languageCode = "languageCode-2092349083";

    EntityType actualResponse = client.getEntityType(name, languageCode);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEntityTypeRequest actualRequest = ((GetEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEntityTypeExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String name = "name3373707";
      String languageCode = "languageCode-2092349083";
      client.getEntityType(name, languageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEntityTypeTest() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    AgentName parent = AgentName.ofProjectName("[PROJECT]");
    EntityType entityType = EntityType.newBuilder().build();

    EntityType actualResponse = client.createEntityType(parent, entityType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEntityTypeRequest actualRequest = ((CreateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEntityTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      EntityType entityType = EntityType.newBuilder().build();
      client.createEntityType(parent, entityType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEntityTypeTest2() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    String parent = "parent-995424086";
    EntityType entityType = EntityType.newBuilder().build();

    EntityType actualResponse = client.createEntityType(parent, entityType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEntityTypeRequest actualRequest = ((CreateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEntityTypeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      EntityType entityType = EntityType.newBuilder().build();
      client.createEntityType(parent, entityType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEntityTypeTest3() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    AgentName parent = AgentName.ofProjectName("[PROJECT]");
    EntityType entityType = EntityType.newBuilder().build();
    String languageCode = "languageCode-2092349083";

    EntityType actualResponse = client.createEntityType(parent, entityType, languageCode);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEntityTypeRequest actualRequest = ((CreateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEntityTypeExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      EntityType entityType = EntityType.newBuilder().build();
      String languageCode = "languageCode-2092349083";
      client.createEntityType(parent, entityType, languageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEntityTypeTest4() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    String parent = "parent-995424086";
    EntityType entityType = EntityType.newBuilder().build();
    String languageCode = "languageCode-2092349083";

    EntityType actualResponse = client.createEntityType(parent, entityType, languageCode);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEntityTypeRequest actualRequest = ((CreateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEntityTypeExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      EntityType entityType = EntityType.newBuilder().build();
      String languageCode = "languageCode-2092349083";
      client.createEntityType(parent, entityType, languageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateEntityTypeTest() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    EntityType entityType = EntityType.newBuilder().build();

    EntityType actualResponse = client.updateEntityType(entityType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateEntityTypeRequest actualRequest = ((UpdateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateEntityTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityType entityType = EntityType.newBuilder().build();
      client.updateEntityType(entityType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateEntityTypeTest2() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    EntityType entityType = EntityType.newBuilder().build();
    String languageCode = "languageCode-2092349083";

    EntityType actualResponse = client.updateEntityType(entityType, languageCode);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateEntityTypeRequest actualRequest = ((UpdateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateEntityTypeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityType entityType = EntityType.newBuilder().build();
      String languageCode = "languageCode-2092349083";
      client.updateEntityType(entityType, languageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateEntityTypeTest3() throws Exception {
    EntityType expectedResponse =
        EntityType.newBuilder()
            .setName(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setDisplayName("displayName1714148973")
            .addAllEntities(new ArrayList<EntityType.Entity>())
            .setEnableFuzzyExtraction(true)
            .build();
    mockEntityTypes.addResponse(expectedResponse);

    EntityType entityType = EntityType.newBuilder().build();
    String languageCode = "languageCode-2092349083";
    FieldMask updateMask = FieldMask.newBuilder().build();

    EntityType actualResponse = client.updateEntityType(entityType, languageCode, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateEntityTypeRequest actualRequest = ((UpdateEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateEntityTypeExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityType entityType = EntityType.newBuilder().build();
      String languageCode = "languageCode-2092349083";
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateEntityType(entityType, languageCode, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteEntityTypeTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockEntityTypes.addResponse(expectedResponse);

    EntityTypeName name = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");

    client.deleteEntityType(name);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteEntityTypeRequest actualRequest = ((DeleteEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteEntityTypeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName name = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      client.deleteEntityType(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteEntityTypeTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockEntityTypes.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteEntityType(name);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteEntityTypeRequest actualRequest = ((DeleteEntityTypeRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteEntityTypeExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String name = "name3373707";
      client.deleteEntityType(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchUpdateEntityTypesTest() throws Exception {
    BatchUpdateEntityTypesResponse expectedResponse =
        BatchUpdateEntityTypesResponse.newBuilder()
            .addAllEntityTypes(new ArrayList<EntityType>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchUpdateEntityTypesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    BatchUpdateEntityTypesRequest request =
        BatchUpdateEntityTypesRequest.newBuilder()
            .setParent(
                EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
            .setLanguageCode("languageCode-2092349083")
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    BatchUpdateEntityTypesResponse actualResponse =
        client.batchUpdateEntityTypesAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchUpdateEntityTypesRequest actualRequest =
        ((BatchUpdateEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getEntityTypeBatchUri(), actualRequest.getEntityTypeBatchUri());
    Assert.assertEquals(
        request.getEntityTypeBatchInline(), actualRequest.getEntityTypeBatchInline());
    Assert.assertEquals(request.getLanguageCode(), actualRequest.getLanguageCode());
    Assert.assertEquals(request.getUpdateMask(), actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchUpdateEntityTypesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      BatchUpdateEntityTypesRequest request =
          BatchUpdateEntityTypesRequest.newBuilder()
              .setParent(
                  EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]").toString())
              .setLanguageCode("languageCode-2092349083")
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.batchUpdateEntityTypesAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchDeleteEntityTypesTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchDeleteEntityTypesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    AgentName parent = AgentName.ofProjectName("[PROJECT]");
    List<String> entityTypeNames = new ArrayList<>();

    client.batchDeleteEntityTypesAsync(parent, entityTypeNames).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeleteEntityTypesRequest actualRequest =
        ((BatchDeleteEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entityTypeNames, actualRequest.getEntityTypeNamesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchDeleteEntityTypesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      List<String> entityTypeNames = new ArrayList<>();
      client.batchDeleteEntityTypesAsync(parent, entityTypeNames).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchDeleteEntityTypesTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchDeleteEntityTypesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    String parent = "parent-995424086";
    List<String> entityTypeNames = new ArrayList<>();

    client.batchDeleteEntityTypesAsync(parent, entityTypeNames).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeleteEntityTypesRequest actualRequest =
        ((BatchDeleteEntityTypesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entityTypeNames, actualRequest.getEntityTypeNamesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchDeleteEntityTypesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      List<String> entityTypeNames = new ArrayList<>();
      client.batchDeleteEntityTypesAsync(parent, entityTypeNames).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchCreateEntitiesTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
    List<EntityType.Entity> entities = new ArrayList<>();

    client.batchCreateEntitiesAsync(parent, entities).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchCreateEntitiesRequest actualRequest = ((BatchCreateEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entities, actualRequest.getEntitiesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchCreateEntitiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      List<EntityType.Entity> entities = new ArrayList<>();
      client.batchCreateEntitiesAsync(parent, entities).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchCreateEntitiesTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    String parent = "parent-995424086";
    List<EntityType.Entity> entities = new ArrayList<>();

    client.batchCreateEntitiesAsync(parent, entities).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchCreateEntitiesRequest actualRequest = ((BatchCreateEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entities, actualRequest.getEntitiesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchCreateEntitiesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      List<EntityType.Entity> entities = new ArrayList<>();
      client.batchCreateEntitiesAsync(parent, entities).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchCreateEntitiesTest3() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
    List<EntityType.Entity> entities = new ArrayList<>();
    String languageCode = "languageCode-2092349083";

    client.batchCreateEntitiesAsync(parent, entities, languageCode).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchCreateEntitiesRequest actualRequest = ((BatchCreateEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entities, actualRequest.getEntitiesList());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchCreateEntitiesExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      List<EntityType.Entity> entities = new ArrayList<>();
      String languageCode = "languageCode-2092349083";
      client.batchCreateEntitiesAsync(parent, entities, languageCode).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchCreateEntitiesTest4() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    String parent = "parent-995424086";
    List<EntityType.Entity> entities = new ArrayList<>();
    String languageCode = "languageCode-2092349083";

    client.batchCreateEntitiesAsync(parent, entities, languageCode).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchCreateEntitiesRequest actualRequest = ((BatchCreateEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entities, actualRequest.getEntitiesList());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchCreateEntitiesExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      List<EntityType.Entity> entities = new ArrayList<>();
      String languageCode = "languageCode-2092349083";
      client.batchCreateEntitiesAsync(parent, entities, languageCode).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchUpdateEntitiesTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchUpdateEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
    List<EntityType.Entity> entities = new ArrayList<>();

    client.batchUpdateEntitiesAsync(parent, entities).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchUpdateEntitiesRequest actualRequest = ((BatchUpdateEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entities, actualRequest.getEntitiesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchUpdateEntitiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      List<EntityType.Entity> entities = new ArrayList<>();
      client.batchUpdateEntitiesAsync(parent, entities).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchUpdateEntitiesTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchUpdateEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    String parent = "parent-995424086";
    List<EntityType.Entity> entities = new ArrayList<>();

    client.batchUpdateEntitiesAsync(parent, entities).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchUpdateEntitiesRequest actualRequest = ((BatchUpdateEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entities, actualRequest.getEntitiesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchUpdateEntitiesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      List<EntityType.Entity> entities = new ArrayList<>();
      client.batchUpdateEntitiesAsync(parent, entities).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchUpdateEntitiesTest3() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchUpdateEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
    List<EntityType.Entity> entities = new ArrayList<>();
    String languageCode = "languageCode-2092349083";

    client.batchUpdateEntitiesAsync(parent, entities, languageCode).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchUpdateEntitiesRequest actualRequest = ((BatchUpdateEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entities, actualRequest.getEntitiesList());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchUpdateEntitiesExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      List<EntityType.Entity> entities = new ArrayList<>();
      String languageCode = "languageCode-2092349083";
      client.batchUpdateEntitiesAsync(parent, entities, languageCode).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchUpdateEntitiesTest4() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchUpdateEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    String parent = "parent-995424086";
    List<EntityType.Entity> entities = new ArrayList<>();
    String languageCode = "languageCode-2092349083";

    client.batchUpdateEntitiesAsync(parent, entities, languageCode).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchUpdateEntitiesRequest actualRequest = ((BatchUpdateEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entities, actualRequest.getEntitiesList());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchUpdateEntitiesExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      List<EntityType.Entity> entities = new ArrayList<>();
      String languageCode = "languageCode-2092349083";
      client.batchUpdateEntitiesAsync(parent, entities, languageCode).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchDeleteEntitiesTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchDeleteEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
    List<String> entityValues = new ArrayList<>();

    client.batchDeleteEntitiesAsync(parent, entityValues).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeleteEntitiesRequest actualRequest = ((BatchDeleteEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entityValues, actualRequest.getEntityValuesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchDeleteEntitiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      List<String> entityValues = new ArrayList<>();
      client.batchDeleteEntitiesAsync(parent, entityValues).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchDeleteEntitiesTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchDeleteEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    String parent = "parent-995424086";
    List<String> entityValues = new ArrayList<>();

    client.batchDeleteEntitiesAsync(parent, entityValues).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeleteEntitiesRequest actualRequest = ((BatchDeleteEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entityValues, actualRequest.getEntityValuesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchDeleteEntitiesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      List<String> entityValues = new ArrayList<>();
      client.batchDeleteEntitiesAsync(parent, entityValues).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchDeleteEntitiesTest3() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchDeleteEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
    List<String> entityValues = new ArrayList<>();
    String languageCode = "languageCode-2092349083";

    client.batchDeleteEntitiesAsync(parent, entityValues, languageCode).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeleteEntitiesRequest actualRequest = ((BatchDeleteEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(entityValues, actualRequest.getEntityValuesList());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchDeleteEntitiesExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      EntityTypeName parent = EntityTypeName.ofProjectEntityTypeName("[PROJECT]", "[ENTITY_TYPE]");
      List<String> entityValues = new ArrayList<>();
      String languageCode = "languageCode-2092349083";
      client.batchDeleteEntitiesAsync(parent, entityValues, languageCode).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchDeleteEntitiesTest4() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchDeleteEntitiesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockEntityTypes.addResponse(resultOperation);

    String parent = "parent-995424086";
    List<String> entityValues = new ArrayList<>();
    String languageCode = "languageCode-2092349083";

    client.batchDeleteEntitiesAsync(parent, entityValues, languageCode).get();

    List<AbstractMessage> actualRequests = mockEntityTypes.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeleteEntitiesRequest actualRequest = ((BatchDeleteEntitiesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(entityValues, actualRequest.getEntityValuesList());
    Assert.assertEquals(languageCode, actualRequest.getLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchDeleteEntitiesExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEntityTypes.addException(exception);

    try {
      String parent = "parent-995424086";
      List<String> entityValues = new ArrayList<>();
      String languageCode = "languageCode-2092349083";
      client.batchDeleteEntitiesAsync(parent, entityValues, languageCode).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
