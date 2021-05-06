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

package com.google.cloud.dialogflow.v2beta1;

import static com.google.cloud.dialogflow.v2beta1.VersionsClient.ListVersionsPagedResponse;

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
public class VersionsClientTest {
  private static MockVersions mockVersions;
  private static MockServiceHelper mockServiceHelper;
  private VersionsClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockVersions = new MockVersions();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockVersions));
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
    VersionsSettings settings =
        VersionsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = VersionsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listVersionsTest() throws Exception {
    Version responsesElement = Version.newBuilder().build();
    ListVersionsResponse expectedResponse =
        ListVersionsResponse.newBuilder()
            .setNextPageToken("")
            .addAllVersions(Arrays.asList(responsesElement))
            .build();
    mockVersions.addResponse(expectedResponse);

    AgentName parent = AgentName.ofProjectName("[PROJECT]");

    ListVersionsPagedResponse pagedListResponse = client.listVersions(parent);

    List<Version> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getVersionsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListVersionsRequest actualRequest = ((ListVersionsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listVersionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      client.listVersions(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listVersionsTest2() throws Exception {
    Version responsesElement = Version.newBuilder().build();
    ListVersionsResponse expectedResponse =
        ListVersionsResponse.newBuilder()
            .setNextPageToken("")
            .addAllVersions(Arrays.asList(responsesElement))
            .build();
    mockVersions.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListVersionsPagedResponse pagedListResponse = client.listVersions(parent);

    List<Version> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getVersionsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListVersionsRequest actualRequest = ((ListVersionsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listVersionsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listVersions(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getVersionTest() throws Exception {
    Version expectedResponse =
        Version.newBuilder()
            .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
            .setDescription("description-1724546052")
            .setVersionNumber(135927952)
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockVersions.addResponse(expectedResponse);

    VersionName name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]");

    Version actualResponse = client.getVersion(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetVersionRequest actualRequest = ((GetVersionRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getVersionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      VersionName name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]");
      client.getVersion(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getVersionTest2() throws Exception {
    Version expectedResponse =
        Version.newBuilder()
            .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
            .setDescription("description-1724546052")
            .setVersionNumber(135927952)
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockVersions.addResponse(expectedResponse);

    String name = "name3373707";

    Version actualResponse = client.getVersion(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetVersionRequest actualRequest = ((GetVersionRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getVersionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      String name = "name3373707";
      client.getVersion(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createVersionTest() throws Exception {
    Version expectedResponse =
        Version.newBuilder()
            .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
            .setDescription("description-1724546052")
            .setVersionNumber(135927952)
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockVersions.addResponse(expectedResponse);

    AgentName parent = AgentName.ofProjectName("[PROJECT]");
    Version version = Version.newBuilder().build();

    Version actualResponse = client.createVersion(parent, version);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateVersionRequest actualRequest = ((CreateVersionRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(version, actualRequest.getVersion());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createVersionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      AgentName parent = AgentName.ofProjectName("[PROJECT]");
      Version version = Version.newBuilder().build();
      client.createVersion(parent, version);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createVersionTest2() throws Exception {
    Version expectedResponse =
        Version.newBuilder()
            .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
            .setDescription("description-1724546052")
            .setVersionNumber(135927952)
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockVersions.addResponse(expectedResponse);

    String parent = "parent-995424086";
    Version version = Version.newBuilder().build();

    Version actualResponse = client.createVersion(parent, version);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateVersionRequest actualRequest = ((CreateVersionRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(version, actualRequest.getVersion());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createVersionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      String parent = "parent-995424086";
      Version version = Version.newBuilder().build();
      client.createVersion(parent, version);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateVersionTest() throws Exception {
    Version expectedResponse =
        Version.newBuilder()
            .setName(VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]").toString())
            .setDescription("description-1724546052")
            .setVersionNumber(135927952)
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockVersions.addResponse(expectedResponse);

    Version version = Version.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Version actualResponse = client.updateVersion(version, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateVersionRequest actualRequest = ((UpdateVersionRequest) actualRequests.get(0));

    Assert.assertEquals(version, actualRequest.getVersion());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateVersionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      Version version = Version.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateVersion(version, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteVersionTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockVersions.addResponse(expectedResponse);

    VersionName name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]");

    client.deleteVersion(name);

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteVersionRequest actualRequest = ((DeleteVersionRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteVersionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      VersionName name = VersionName.ofProjectVersionName("[PROJECT]", "[VERSION]");
      client.deleteVersion(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteVersionTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockVersions.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteVersion(name);

    List<AbstractMessage> actualRequests = mockVersions.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteVersionRequest actualRequest = ((DeleteVersionRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteVersionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVersions.addException(exception);

    try {
      String name = "name3373707";
      client.deleteVersion(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
