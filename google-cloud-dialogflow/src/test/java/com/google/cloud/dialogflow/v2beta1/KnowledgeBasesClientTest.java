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

import static com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient.ListKnowledgeBasesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class KnowledgeBasesClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockKnowledgeBases mockKnowledgeBases;
  private KnowledgeBasesClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockKnowledgeBases = new MockKnowledgeBases();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockKnowledgeBases));
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
    KnowledgeBasesSettings settings =
        KnowledgeBasesSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = KnowledgeBasesClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listKnowledgeBasesTest() throws Exception {
    KnowledgeBase responsesElement = KnowledgeBase.newBuilder().build();
    ListKnowledgeBasesResponse expectedResponse =
        ListKnowledgeBasesResponse.newBuilder()
            .setNextPageToken("")
            .addAllKnowledgeBases(Arrays.asList(responsesElement))
            .build();
    mockKnowledgeBases.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");

    ListKnowledgeBasesPagedResponse pagedListResponse = client.listKnowledgeBases(parent);

    List<KnowledgeBase> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getKnowledgeBasesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListKnowledgeBasesRequest actualRequest = ((ListKnowledgeBasesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listKnowledgeBasesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      client.listKnowledgeBases(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listKnowledgeBasesTest2() throws Exception {
    KnowledgeBase responsesElement = KnowledgeBase.newBuilder().build();
    ListKnowledgeBasesResponse expectedResponse =
        ListKnowledgeBasesResponse.newBuilder()
            .setNextPageToken("")
            .addAllKnowledgeBases(Arrays.asList(responsesElement))
            .build();
    mockKnowledgeBases.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListKnowledgeBasesPagedResponse pagedListResponse = client.listKnowledgeBases(parent);

    List<KnowledgeBase> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getKnowledgeBasesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListKnowledgeBasesRequest actualRequest = ((ListKnowledgeBasesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listKnowledgeBasesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listKnowledgeBases(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKnowledgeBaseTest() throws Exception {
    KnowledgeBase expectedResponse =
        KnowledgeBase.newBuilder()
            .setName(KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]").toString())
            .setDisplayName("display_name1615086568")
            .setLanguageCode("language_code-412800396")
            .build();
    mockKnowledgeBases.addResponse(expectedResponse);

    KnowledgeBaseName name = KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]");

    KnowledgeBase actualResponse = client.getKnowledgeBase(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKnowledgeBaseRequest actualRequest = ((GetKnowledgeBaseRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKnowledgeBaseExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      KnowledgeBaseName name = KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]");
      client.getKnowledgeBase(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKnowledgeBaseTest2() throws Exception {
    KnowledgeBase expectedResponse =
        KnowledgeBase.newBuilder()
            .setName(KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]").toString())
            .setDisplayName("display_name1615086568")
            .setLanguageCode("language_code-412800396")
            .build();
    mockKnowledgeBases.addResponse(expectedResponse);

    String name = "name3373707";

    KnowledgeBase actualResponse = client.getKnowledgeBase(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetKnowledgeBaseRequest actualRequest = ((GetKnowledgeBaseRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getKnowledgeBaseExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      String name = "name3373707";
      client.getKnowledgeBase(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createKnowledgeBaseTest() throws Exception {
    KnowledgeBase expectedResponse =
        KnowledgeBase.newBuilder()
            .setName(KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]").toString())
            .setDisplayName("display_name1615086568")
            .setLanguageCode("language_code-412800396")
            .build();
    mockKnowledgeBases.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");
    KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();

    KnowledgeBase actualResponse = client.createKnowledgeBase(parent, knowledgeBase);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateKnowledgeBaseRequest actualRequest = ((CreateKnowledgeBaseRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(knowledgeBase, actualRequest.getKnowledgeBase());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createKnowledgeBaseExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
      client.createKnowledgeBase(parent, knowledgeBase);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createKnowledgeBaseTest2() throws Exception {
    KnowledgeBase expectedResponse =
        KnowledgeBase.newBuilder()
            .setName(KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]").toString())
            .setDisplayName("display_name1615086568")
            .setLanguageCode("language_code-412800396")
            .build();
    mockKnowledgeBases.addResponse(expectedResponse);

    String parent = "parent-995424086";
    KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();

    KnowledgeBase actualResponse = client.createKnowledgeBase(parent, knowledgeBase);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateKnowledgeBaseRequest actualRequest = ((CreateKnowledgeBaseRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(knowledgeBase, actualRequest.getKnowledgeBase());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createKnowledgeBaseExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      String parent = "parent-995424086";
      KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
      client.createKnowledgeBase(parent, knowledgeBase);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteKnowledgeBaseTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockKnowledgeBases.addResponse(expectedResponse);

    KnowledgeBaseName name = KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]");

    client.deleteKnowledgeBase(name);

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteKnowledgeBaseRequest actualRequest = ((DeleteKnowledgeBaseRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteKnowledgeBaseExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      KnowledgeBaseName name = KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]");
      client.deleteKnowledgeBase(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteKnowledgeBaseTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockKnowledgeBases.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteKnowledgeBase(name);

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteKnowledgeBaseRequest actualRequest = ((DeleteKnowledgeBaseRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteKnowledgeBaseExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      String name = "name3373707";
      client.deleteKnowledgeBase(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateKnowledgeBaseTest() throws Exception {
    KnowledgeBase expectedResponse =
        KnowledgeBase.newBuilder()
            .setName(KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]").toString())
            .setDisplayName("display_name1615086568")
            .setLanguageCode("language_code-412800396")
            .build();
    mockKnowledgeBases.addResponse(expectedResponse);

    KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();

    KnowledgeBase actualResponse = client.updateKnowledgeBase(knowledgeBase);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateKnowledgeBaseRequest actualRequest = ((UpdateKnowledgeBaseRequest) actualRequests.get(0));

    Assert.assertEquals(knowledgeBase, actualRequest.getKnowledgeBase());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateKnowledgeBaseExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
      client.updateKnowledgeBase(knowledgeBase);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateKnowledgeBaseTest2() throws Exception {
    KnowledgeBase expectedResponse =
        KnowledgeBase.newBuilder()
            .setName(KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]").toString())
            .setDisplayName("display_name1615086568")
            .setLanguageCode("language_code-412800396")
            .build();
    mockKnowledgeBases.addResponse(expectedResponse);

    KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    KnowledgeBase actualResponse = client.updateKnowledgeBase(knowledgeBase, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockKnowledgeBases.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateKnowledgeBaseRequest actualRequest = ((UpdateKnowledgeBaseRequest) actualRequests.get(0));

    Assert.assertEquals(knowledgeBase, actualRequest.getKnowledgeBase());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateKnowledgeBaseExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockKnowledgeBases.addException(exception);

    try {
      KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateKnowledgeBase(knowledgeBase, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
