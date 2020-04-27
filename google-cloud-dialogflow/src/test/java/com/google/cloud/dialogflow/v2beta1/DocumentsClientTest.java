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
package com.google.cloud.dialogflow.v2beta1;

import static com.google.cloud.dialogflow.v2beta1.DocumentsClient.ListDocumentsPagedResponse;

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
public class DocumentsClientTest {
  private static MockAgents mockAgents;
  private static MockContexts mockContexts;
  private static MockDocuments mockDocuments;
  private static MockEntityTypes mockEntityTypes;
  private static MockEnvironments mockEnvironments;
  private static MockIntents mockIntents;
  private static MockKnowledgeBases mockKnowledgeBases;
  private static MockSessionEntityTypes mockSessionEntityTypes;
  private static MockSessions mockSessions;
  private static MockServiceHelper serviceHelper;
  private DocumentsClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAgents = new MockAgents();
    mockContexts = new MockContexts();
    mockDocuments = new MockDocuments();
    mockEntityTypes = new MockEntityTypes();
    mockEnvironments = new MockEnvironments();
    mockIntents = new MockIntents();
    mockKnowledgeBases = new MockKnowledgeBases();
    mockSessionEntityTypes = new MockSessionEntityTypes();
    mockSessions = new MockSessions();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(
                mockAgents,
                mockContexts,
                mockDocuments,
                mockEntityTypes,
                mockEnvironments,
                mockIntents,
                mockKnowledgeBases,
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
    DocumentsSettings settings =
        DocumentsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DocumentsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void listDocumentsTest() {
    String nextPageToken = "";
    Document documentsElement = Document.newBuilder().build();
    List<Document> documents = Arrays.asList(documentsElement);
    ListDocumentsResponse expectedResponse =
        ListDocumentsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllDocuments(documents)
            .build();
    mockDocuments.addResponse(expectedResponse);

    KnowledgeBaseName parent = KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]");

    ListDocumentsPagedResponse pagedListResponse = client.listDocuments(parent);

    List<Document> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDocumentsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockDocuments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDocumentsRequest actualRequest = (ListDocumentsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, KnowledgeBaseName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listDocumentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDocuments.addException(exception);

    try {
      KnowledgeBaseName parent = KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]");

      client.listDocuments(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getDocumentTest() {
    DocumentName name2 = DocumentName.of("[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");
    String displayName = "displayName1615086568";
    String mimeType = "mimeType-196041627";
    String contentUri = "contentUri-388807514";
    Document expectedResponse =
        Document.newBuilder()
            .setName(name2.toString())
            .setDisplayName(displayName)
            .setMimeType(mimeType)
            .setContentUri(contentUri)
            .build();
    mockDocuments.addResponse(expectedResponse);

    DocumentName name = DocumentName.of("[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");

    Document actualResponse = client.getDocument(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDocuments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDocumentRequest actualRequest = (GetDocumentRequest) actualRequests.get(0);

    Assert.assertEquals(name, DocumentName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getDocumentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDocuments.addException(exception);

    try {
      DocumentName name = DocumentName.of("[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");

      client.getDocument(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createDocumentTest() throws Exception {
    DocumentName name = DocumentName.of("[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");
    String displayName = "displayName1615086568";
    String mimeType = "mimeType-196041627";
    String contentUri = "contentUri-388807514";
    Document expectedResponse =
        Document.newBuilder()
            .setName(name.toString())
            .setDisplayName(displayName)
            .setMimeType(mimeType)
            .setContentUri(contentUri)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createDocumentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockDocuments.addResponse(resultOperation);

    KnowledgeBaseName parent = KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]");
    Document document = Document.newBuilder().build();

    Document actualResponse = client.createDocumentAsync(parent, document).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDocuments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDocumentRequest actualRequest = (CreateDocumentRequest) actualRequests.get(0);

    Assert.assertEquals(parent, KnowledgeBaseName.parse(actualRequest.getParent()));
    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createDocumentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDocuments.addException(exception);

    try {
      KnowledgeBaseName parent = KnowledgeBaseName.of("[PROJECT]", "[KNOWLEDGE_BASE]");
      Document document = Document.newBuilder().build();

      client.createDocumentAsync(parent, document).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDocumentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteDocumentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockDocuments.addResponse(resultOperation);

    DocumentName name = DocumentName.of("[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");

    Empty actualResponse = client.deleteDocumentAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDocuments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDocumentRequest actualRequest = (DeleteDocumentRequest) actualRequests.get(0);

    Assert.assertEquals(name, DocumentName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDocumentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDocuments.addException(exception);

    try {
      DocumentName name = DocumentName.of("[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");

      client.deleteDocumentAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateDocumentTest() throws Exception {
    DocumentName name = DocumentName.of("[PROJECT]", "[KNOWLEDGE_BASE]", "[DOCUMENT]");
    String displayName = "displayName1615086568";
    String mimeType = "mimeType-196041627";
    String contentUri = "contentUri-388807514";
    Document expectedResponse =
        Document.newBuilder()
            .setName(name.toString())
            .setDisplayName(displayName)
            .setMimeType(mimeType)
            .setContentUri(contentUri)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateDocumentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockDocuments.addResponse(resultOperation);

    Document document = Document.newBuilder().build();

    Document actualResponse = client.updateDocumentAsync(document).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDocuments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateDocumentRequest actualRequest = (UpdateDocumentRequest) actualRequests.get(0);

    Assert.assertEquals(document, actualRequest.getDocument());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateDocumentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDocuments.addException(exception);

    try {
      Document document = Document.newBuilder().build();

      client.updateDocumentAsync(document).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void reloadDocumentTest() {
    String name = "name3373707";
    boolean done = true;
    Operation expectedResponse = Operation.newBuilder().setName(name).setDone(done).build();
    mockDocuments.addResponse(expectedResponse);

    ReloadDocumentRequest request = ReloadDocumentRequest.newBuilder().build();

    Operation actualResponse = client.reloadDocument(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDocuments.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ReloadDocumentRequest actualRequest = (ReloadDocumentRequest) actualRequests.get(0);

    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void reloadDocumentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDocuments.addException(exception);

    try {
      ReloadDocumentRequest request = ReloadDocumentRequest.newBuilder().build();

      client.reloadDocument(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
