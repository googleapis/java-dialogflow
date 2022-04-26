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

package com.google.cloud.dialogflow.v2;

import static com.google.cloud.dialogflow.v2.ConversationDatasetsClient.ListConversationDatasetsPagedResponse;

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
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
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
public class ConversationDatasetsClientTest {
  private static MockConversationDatasets mockConversationDatasets;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ConversationDatasetsClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockConversationDatasets = new MockConversationDatasets();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockConversationDatasets));
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
    ConversationDatasetsSettings settings =
        ConversationDatasetsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ConversationDatasetsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createConversationDatasetTest() throws Exception {
    ConversationDataset expectedResponse =
        ConversationDataset.newBuilder()
            .setName(
                ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setInputConfig(InputConfig.newBuilder().build())
            .setConversationInfo(ConversationInfo.newBuilder().build())
            .setConversationCount(1994187347)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createConversationDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockConversationDatasets.addResponse(resultOperation);

    String parent = "parent-995424086";
    ConversationDataset conversationDataset = ConversationDataset.newBuilder().build();

    ConversationDataset actualResponse =
        client.createConversationDatasetAsync(parent, conversationDataset).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversationDatasets.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateConversationDatasetRequest actualRequest =
        ((CreateConversationDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(conversationDataset, actualRequest.getConversationDataset());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createConversationDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversationDatasets.addException(exception);

    try {
      String parent = "parent-995424086";
      ConversationDataset conversationDataset = ConversationDataset.newBuilder().build();
      client.createConversationDatasetAsync(parent, conversationDataset).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getConversationDatasetTest() throws Exception {
    ConversationDataset expectedResponse =
        ConversationDataset.newBuilder()
            .setName(
                ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setInputConfig(InputConfig.newBuilder().build())
            .setConversationInfo(ConversationInfo.newBuilder().build())
            .setConversationCount(1994187347)
            .build();
    mockConversationDatasets.addResponse(expectedResponse);

    ConversationDatasetName name =
        ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]");

    ConversationDataset actualResponse = client.getConversationDataset(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversationDatasets.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversationDatasetRequest actualRequest =
        ((GetConversationDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversationDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversationDatasets.addException(exception);

    try {
      ConversationDatasetName name =
          ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]");
      client.getConversationDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConversationDatasetTest2() throws Exception {
    ConversationDataset expectedResponse =
        ConversationDataset.newBuilder()
            .setName(
                ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setCreateTime(Timestamp.newBuilder().build())
            .setInputConfig(InputConfig.newBuilder().build())
            .setConversationInfo(ConversationInfo.newBuilder().build())
            .setConversationCount(1994187347)
            .build();
    mockConversationDatasets.addResponse(expectedResponse);

    String name = "name3373707";

    ConversationDataset actualResponse = client.getConversationDataset(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversationDatasets.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversationDatasetRequest actualRequest =
        ((GetConversationDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversationDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversationDatasets.addException(exception);

    try {
      String name = "name3373707";
      client.getConversationDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listConversationDatasetsTest() throws Exception {
    ConversationDataset responsesElement = ConversationDataset.newBuilder().build();
    ListConversationDatasetsResponse expectedResponse =
        ListConversationDatasetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllConversationDatasets(Arrays.asList(responsesElement))
            .build();
    mockConversationDatasets.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListConversationDatasetsPagedResponse pagedListResponse =
        client.listConversationDatasets(parent);

    List<ConversationDataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getConversationDatasetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockConversationDatasets.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListConversationDatasetsRequest actualRequest =
        ((ListConversationDatasetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listConversationDatasetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversationDatasets.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listConversationDatasets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listConversationDatasetsTest2() throws Exception {
    ConversationDataset responsesElement = ConversationDataset.newBuilder().build();
    ListConversationDatasetsResponse expectedResponse =
        ListConversationDatasetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllConversationDatasets(Arrays.asList(responsesElement))
            .build();
    mockConversationDatasets.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListConversationDatasetsPagedResponse pagedListResponse =
        client.listConversationDatasets(parent);

    List<ConversationDataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getConversationDatasetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockConversationDatasets.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListConversationDatasetsRequest actualRequest =
        ((ListConversationDatasetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listConversationDatasetsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversationDatasets.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listConversationDatasets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteConversationDatasetTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteConversationDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockConversationDatasets.addResponse(resultOperation);

    ConversationDatasetName name =
        ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]");

    client.deleteConversationDatasetAsync(name).get();

    List<AbstractMessage> actualRequests = mockConversationDatasets.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteConversationDatasetRequest actualRequest =
        ((DeleteConversationDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteConversationDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversationDatasets.addException(exception);

    try {
      ConversationDatasetName name =
          ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]");
      client.deleteConversationDatasetAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteConversationDatasetTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteConversationDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockConversationDatasets.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteConversationDatasetAsync(name).get();

    List<AbstractMessage> actualRequests = mockConversationDatasets.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteConversationDatasetRequest actualRequest =
        ((DeleteConversationDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteConversationDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversationDatasets.addException(exception);

    try {
      String name = "name3373707";
      client.deleteConversationDatasetAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void importConversationDataTest() throws Exception {
    ImportConversationDataOperationResponse expectedResponse =
        ImportConversationDataOperationResponse.newBuilder()
            .setConversationDataset(
                ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]")
                    .toString())
            .setImportCount(-1721296907)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("importConversationDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockConversationDatasets.addResponse(resultOperation);

    ImportConversationDataRequest request =
        ImportConversationDataRequest.newBuilder()
            .setName(
                ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]")
                    .toString())
            .setInputConfig(InputConfig.newBuilder().build())
            .build();

    ImportConversationDataOperationResponse actualResponse =
        client.importConversationDataAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversationDatasets.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportConversationDataRequest actualRequest =
        ((ImportConversationDataRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertEquals(request.getInputConfig(), actualRequest.getInputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importConversationDataExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversationDatasets.addException(exception);

    try {
      ImportConversationDataRequest request =
          ImportConversationDataRequest.newBuilder()
              .setName(
                  ConversationDatasetName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION_DATASET]")
                      .toString())
              .setInputConfig(InputConfig.newBuilder().build())
              .build();
      client.importConversationDataAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
