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

import static com.google.cloud.dialogflow.v2.AnswerRecordsClient.ListAnswerRecordsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
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
public class AnswerRecordsClientTest {
  private static MockAnswerRecords mockAnswerRecords;
  private static MockServiceHelper mockServiceHelper;
  private AnswerRecordsClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAnswerRecords = new MockAnswerRecords();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAnswerRecords));
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
    AnswerRecordsSettings settings =
        AnswerRecordsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AnswerRecordsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listAnswerRecordsTest() throws Exception {
    AnswerRecord responsesElement = AnswerRecord.newBuilder().build();
    ListAnswerRecordsResponse expectedResponse =
        ListAnswerRecordsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAnswerRecords(Arrays.asList(responsesElement))
            .build();
    mockAnswerRecords.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListAnswerRecordsPagedResponse pagedListResponse = client.listAnswerRecords(parent);

    List<AnswerRecord> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAnswerRecordsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnswerRecords.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAnswerRecordsRequest actualRequest = ((ListAnswerRecordsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAnswerRecordsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnswerRecords.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listAnswerRecords(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAnswerRecordsTest2() throws Exception {
    AnswerRecord responsesElement = AnswerRecord.newBuilder().build();
    ListAnswerRecordsResponse expectedResponse =
        ListAnswerRecordsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAnswerRecords(Arrays.asList(responsesElement))
            .build();
    mockAnswerRecords.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");

    ListAnswerRecordsPagedResponse pagedListResponse = client.listAnswerRecords(parent);

    List<AnswerRecord> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAnswerRecordsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnswerRecords.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAnswerRecordsRequest actualRequest = ((ListAnswerRecordsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAnswerRecordsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnswerRecords.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      client.listAnswerRecords(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAnswerRecordsTest3() throws Exception {
    AnswerRecord responsesElement = AnswerRecord.newBuilder().build();
    ListAnswerRecordsResponse expectedResponse =
        ListAnswerRecordsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAnswerRecords(Arrays.asList(responsesElement))
            .build();
    mockAnswerRecords.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAnswerRecordsPagedResponse pagedListResponse = client.listAnswerRecords(parent);

    List<AnswerRecord> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAnswerRecordsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAnswerRecords.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAnswerRecordsRequest actualRequest = ((ListAnswerRecordsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAnswerRecordsExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnswerRecords.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAnswerRecords(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateAnswerRecordTest() throws Exception {
    AnswerRecord expectedResponse =
        AnswerRecord.newBuilder()
            .setName(
                AnswerRecordName.ofProjectAnswerRecordName("[PROJECT]", "[ANSWER_RECORD]")
                    .toString())
            .setAnswerFeedback(AnswerFeedback.newBuilder().build())
            .build();
    mockAnswerRecords.addResponse(expectedResponse);

    AnswerRecord answerRecord = AnswerRecord.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    AnswerRecord actualResponse = client.updateAnswerRecord(answerRecord, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAnswerRecords.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAnswerRecordRequest actualRequest = ((UpdateAnswerRecordRequest) actualRequests.get(0));

    Assert.assertEquals(answerRecord, actualRequest.getAnswerRecord());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateAnswerRecordExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAnswerRecords.addException(exception);

    try {
      AnswerRecord answerRecord = AnswerRecord.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateAnswerRecord(answerRecord, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
