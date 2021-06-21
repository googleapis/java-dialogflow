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

import static com.google.cloud.dialogflow.v2.EnvironmentsClient.GetEnvironmentHistoryPagedResponse;
import static com.google.cloud.dialogflow.v2.EnvironmentsClient.ListEnvironmentsPagedResponse;

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
import com.google.protobuf.Timestamp;
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
public class EnvironmentsClientTest {
  private static MockEnvironments mockEnvironments;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private EnvironmentsClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockEnvironments = new MockEnvironments();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockEnvironments));
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
    EnvironmentsSettings settings =
        EnvironmentsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = EnvironmentsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listEnvironmentsTest() throws Exception {
    Environment responsesElement = Environment.newBuilder().build();
    ListEnvironmentsResponse expectedResponse =
        ListEnvironmentsResponse.newBuilder()
            .setNextPageToken("")
            .addAllEnvironments(Arrays.asList(responsesElement))
            .build();
    mockEnvironments.addResponse(expectedResponse);

    AgentName parent = AgentName.ofProjectName("[PROJECT]");

    ListEnvironmentsPagedResponse pagedListResponse = client.listEnvironments(parent);

    List<Environment> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEnvironmentsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockEnvironments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEnvironmentsRequest actualRequest = ((ListEnvironmentsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEnvironmentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEnvironments.addException(exception);

    try {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      client.listEnvironments(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listEnvironmentsTest2() throws Exception {
    Environment responsesElement = Environment.newBuilder().build();
    ListEnvironmentsResponse expectedResponse =
        ListEnvironmentsResponse.newBuilder()
            .setNextPageToken("")
            .addAllEnvironments(Arrays.asList(responsesElement))
            .build();
    mockEnvironments.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListEnvironmentsPagedResponse pagedListResponse = client.listEnvironments(parent);

    List<Environment> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEnvironmentsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockEnvironments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListEnvironmentsRequest actualRequest = ((ListEnvironmentsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listEnvironmentsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEnvironments.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listEnvironments(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEnvironmentTest() throws Exception {
    Environment expectedResponse =
        Environment.newBuilder()
            .setName(
                EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
            .setDescription("description-1724546052")
            .setAgentVersion(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setTextToSpeechSettings(TextToSpeechSettings.newBuilder().build())
            .setFulfillment(Fulfillment.newBuilder().build())
            .build();
    mockEnvironments.addResponse(expectedResponse);

    GetEnvironmentRequest request =
        GetEnvironmentRequest.newBuilder()
            .setName(
                EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
            .build();

    Environment actualResponse = client.getEnvironment(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEnvironments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEnvironmentRequest actualRequest = ((GetEnvironmentRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEnvironmentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEnvironments.addException(exception);

    try {
      GetEnvironmentRequest request =
          GetEnvironmentRequest.newBuilder()
              .setName(
                  EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
              .build();
      client.getEnvironment(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createEnvironmentTest() throws Exception {
    Environment expectedResponse =
        Environment.newBuilder()
            .setName(
                EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
            .setDescription("description-1724546052")
            .setAgentVersion(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setTextToSpeechSettings(TextToSpeechSettings.newBuilder().build())
            .setFulfillment(Fulfillment.newBuilder().build())
            .build();
    mockEnvironments.addResponse(expectedResponse);

    CreateEnvironmentRequest request =
        CreateEnvironmentRequest.newBuilder()
            .setParent(
                EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
            .setEnvironment(Environment.newBuilder().build())
            .setEnvironmentId("environmentId-950205810")
            .build();

    Environment actualResponse = client.createEnvironment(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEnvironments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateEnvironmentRequest actualRequest = ((CreateEnvironmentRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getEnvironment(), actualRequest.getEnvironment());
    Assert.assertEquals(request.getEnvironmentId(), actualRequest.getEnvironmentId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createEnvironmentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEnvironments.addException(exception);

    try {
      CreateEnvironmentRequest request =
          CreateEnvironmentRequest.newBuilder()
              .setParent(
                  EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
              .setEnvironment(Environment.newBuilder().build())
              .setEnvironmentId("environmentId-950205810")
              .build();
      client.createEnvironment(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateEnvironmentTest() throws Exception {
    Environment expectedResponse =
        Environment.newBuilder()
            .setName(
                EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
            .setDescription("description-1724546052")
            .setAgentVersion(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setTextToSpeechSettings(TextToSpeechSettings.newBuilder().build())
            .setFulfillment(Fulfillment.newBuilder().build())
            .build();
    mockEnvironments.addResponse(expectedResponse);

    UpdateEnvironmentRequest request =
        UpdateEnvironmentRequest.newBuilder()
            .setEnvironment(Environment.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .setAllowLoadToDraftAndDiscardChanges(true)
            .build();

    Environment actualResponse = client.updateEnvironment(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockEnvironments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateEnvironmentRequest actualRequest = ((UpdateEnvironmentRequest) actualRequests.get(0));

    Assert.assertEquals(request.getEnvironment(), actualRequest.getEnvironment());
    Assert.assertEquals(request.getUpdateMask(), actualRequest.getUpdateMask());
    Assert.assertEquals(
        request.getAllowLoadToDraftAndDiscardChanges(),
        actualRequest.getAllowLoadToDraftAndDiscardChanges());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateEnvironmentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEnvironments.addException(exception);

    try {
      UpdateEnvironmentRequest request =
          UpdateEnvironmentRequest.newBuilder()
              .setEnvironment(Environment.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .setAllowLoadToDraftAndDiscardChanges(true)
              .build();
      client.updateEnvironment(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteEnvironmentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockEnvironments.addResponse(expectedResponse);

    DeleteEnvironmentRequest request =
        DeleteEnvironmentRequest.newBuilder()
            .setName(
                EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
            .build();

    client.deleteEnvironment(request);

    List<AbstractMessage> actualRequests = mockEnvironments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteEnvironmentRequest actualRequest = ((DeleteEnvironmentRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteEnvironmentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEnvironments.addException(exception);

    try {
      DeleteEnvironmentRequest request =
          DeleteEnvironmentRequest.newBuilder()
              .setName(
                  EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
              .build();
      client.deleteEnvironment(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getEnvironmentHistoryTest() throws Exception {
    EnvironmentHistory.Entry responsesElement = EnvironmentHistory.Entry.newBuilder().build();
    EnvironmentHistory expectedResponse =
        EnvironmentHistory.newBuilder()
            .setNextPageToken("")
            .addAllEntries(Arrays.asList(responsesElement))
            .build();
    mockEnvironments.addResponse(expectedResponse);

    GetEnvironmentHistoryRequest request =
        GetEnvironmentHistoryRequest.newBuilder()
            .setParent(
                EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    GetEnvironmentHistoryPagedResponse pagedListResponse = client.getEnvironmentHistory(request);

    List<EnvironmentHistory.Entry> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getEntriesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockEnvironments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetEnvironmentHistoryRequest actualRequest =
        ((GetEnvironmentHistoryRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getEnvironmentHistoryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockEnvironments.addException(exception);

    try {
      GetEnvironmentHistoryRequest request =
          GetEnvironmentHistoryRequest.newBuilder()
              .setParent(
                  EnvironmentName.ofProjectEnvironmentName("[PROJECT]", "[ENVIRONMENT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.getEnvironmentHistory(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
