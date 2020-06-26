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
package com.google.cloud.dialogflow.v2;

import static com.google.cloud.dialogflow.v2.AgentsClient.SearchAgentsPagedResponse;

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
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class AgentsClientTest {
  private static MockAgents mockAgents;
  private static MockContexts mockContexts;
  private static MockEntityTypes mockEntityTypes;
  private static MockEnvironments mockEnvironments;
  private static MockIntents mockIntents;
  private static MockSessionEntityTypes mockSessionEntityTypes;
  private static MockSessions mockSessions;
  private static MockServiceHelper serviceHelper;
  private AgentsClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAgents = new MockAgents();
    mockContexts = new MockContexts();
    mockEntityTypes = new MockEntityTypes();
    mockEnvironments = new MockEnvironments();
    mockIntents = new MockIntents();
    mockSessionEntityTypes = new MockSessionEntityTypes();
    mockSessions = new MockSessions();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(
                mockAgents,
                mockContexts,
                mockEntityTypes,
                mockEnvironments,
                mockIntents,
                mockSessionEntityTypes,
                mockSessions));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    AgentsSettings settings =
        AgentsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AgentsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getAgentTest() {
    ProjectName parent2 = ProjectName.of("[PROJECT]");
    String displayName = "displayName1615086568";
    String defaultLanguageCode = "defaultLanguageCode856575222";
    String timeZone = "timeZone36848094";
    String description = "description-1724546052";
    String avatarUri = "avatarUri-402824826";
    boolean enableLogging = false;
    float classificationThreshold = 1.11581064E8F;
    Agent expectedResponse =
        Agent.newBuilder()
            .setParent(parent2.toString())
            .setDisplayName(displayName)
            .setDefaultLanguageCode(defaultLanguageCode)
            .setTimeZone(timeZone)
            .setDescription(description)
            .setAvatarUri(avatarUri)
            .setEnableLogging(enableLogging)
            .setClassificationThreshold(classificationThreshold)
            .build();
    mockAgents.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");

    Agent actualResponse = client.getAgent(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAgentRequest actualRequest = (GetAgentRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getAgentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");

      client.getAgent(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setAgentTest() {
    ProjectName parent = ProjectName.of("[PROJECT]");
    String displayName = "displayName1615086568";
    String defaultLanguageCode = "defaultLanguageCode856575222";
    String timeZone = "timeZone36848094";
    String description = "description-1724546052";
    String avatarUri = "avatarUri-402824826";
    boolean enableLogging = false;
    float classificationThreshold = 1.11581064E8F;
    Agent expectedResponse =
        Agent.newBuilder()
            .setParent(parent.toString())
            .setDisplayName(displayName)
            .setDefaultLanguageCode(defaultLanguageCode)
            .setTimeZone(timeZone)
            .setDescription(description)
            .setAvatarUri(avatarUri)
            .setEnableLogging(enableLogging)
            .setClassificationThreshold(classificationThreshold)
            .build();
    mockAgents.addResponse(expectedResponse);

    Agent agent = Agent.newBuilder().build();

    Agent actualResponse = client.setAgent(agent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetAgentRequest actualRequest = (SetAgentRequest) actualRequests.get(0);

    Assert.assertEquals(agent, actualRequest.getAgent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void setAgentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      Agent agent = Agent.newBuilder().build();

      client.setAgent(agent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAgentTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAgents.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");

    client.deleteAgent(parent);

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAgentRequest actualRequest = (DeleteAgentRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAgentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");

      client.deleteAgent(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void searchAgentsTest() {
    String nextPageToken = "";
    Agent agentsElement = Agent.newBuilder().build();
    List<Agent> agents = Arrays.asList(agentsElement);
    SearchAgentsResponse expectedResponse =
        SearchAgentsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllAgents(agents)
            .build();
    mockAgents.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");

    SearchAgentsPagedResponse pagedListResponse = client.searchAgents(parent);

    List<Agent> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAgentsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchAgentsRequest actualRequest = (SearchAgentsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void searchAgentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");

      client.searchAgents(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void trainAgentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("trainAgentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAgents.addResponse(resultOperation);

    ProjectName parent = ProjectName.of("[PROJECT]");

    Empty actualResponse = client.trainAgentAsync(parent).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TrainAgentRequest actualRequest = (TrainAgentRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void trainAgentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");

      client.trainAgentAsync(parent).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void exportAgentTest() throws Exception {
    String agentUri = "agentUri-1700713166";
    ExportAgentResponse expectedResponse =
        ExportAgentResponse.newBuilder().setAgentUri(agentUri).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportAgentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAgents.addResponse(resultOperation);

    ProjectName parent = ProjectName.of("[PROJECT]");

    ExportAgentResponse actualResponse = client.exportAgentAsync(parent).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportAgentRequest actualRequest = (ExportAgentRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void exportAgentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");

      client.exportAgentAsync(parent).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void importAgentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("importAgentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAgents.addResponse(resultOperation);

    ProjectName parent = ProjectName.of("[PROJECT]");
    ImportAgentRequest request =
        ImportAgentRequest.newBuilder().setParent(parent.toString()).build();

    Empty actualResponse = client.importAgentAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportAgentRequest actualRequest = (ImportAgentRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void importAgentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      ImportAgentRequest request =
          ImportAgentRequest.newBuilder().setParent(parent.toString()).build();

      client.importAgentAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void restoreAgentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("restoreAgentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAgents.addResponse(resultOperation);

    ProjectName parent = ProjectName.of("[PROJECT]");
    RestoreAgentRequest request =
        RestoreAgentRequest.newBuilder().setParent(parent.toString()).build();

    Empty actualResponse = client.restoreAgentAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RestoreAgentRequest actualRequest = (RestoreAgentRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void restoreAgentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      RestoreAgentRequest request =
          RestoreAgentRequest.newBuilder().setParent(parent.toString()).build();

      client.restoreAgentAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getValidationResultTest() {
    ValidationResult expectedResponse = ValidationResult.newBuilder().build();
    mockAgents.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");
    GetValidationResultRequest request =
        GetValidationResultRequest.newBuilder().setParent(parent.toString()).build();

    ValidationResult actualResponse = client.getValidationResult(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAgents.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetValidationResultRequest actualRequest = (GetValidationResultRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getValidationResultExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAgents.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      GetValidationResultRequest request =
          GetValidationResultRequest.newBuilder().setParent(parent.toString()).build();

      client.getValidationResult(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
