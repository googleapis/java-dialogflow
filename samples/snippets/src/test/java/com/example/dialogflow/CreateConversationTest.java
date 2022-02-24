package com.example.dialogflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.v2.Conversation;
import com.google.cloud.dialogflow.v2.Conversation.LifecycleState;
import com.google.cloud.dialogflow.v2.ConversationName;
import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationProfileName;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class CreateConversationTest {
  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String CONVERSATION_PROFILE_DISPLAY_NAME = UUID.randomUUID().toString();
  private static final String LOCATION = "global";
  private String conversationProfileId;

  private static void requireEnvVar(String varName) {
    assertNotNull(System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @Before
  public void setUp() throws IOException {
    // Create a conversation profile 
    ConversationProfile conversationProfile = 
        ConversationProfileManagement.createConversationProfileArticleFaq(
          PROJECT_ID, CONVERSATION_PROFILE_DISPLAY_NAME, LOCATION, 
          Optional.empty(), Optional.empty());
    conversationProfileId = 
      ConversationProfileName.parse(conversationProfile.getName()).getConversationProfile();
  }

  @After
  public void tearDown() throws IOException {
    // Delete the created conversation profile
    ConversationProfileManagement.deleteConversationProfile(
        PROJECT_ID, LOCATION, conversationProfileId);
  }

  @Test
  public void testCreateConversation() throws ApiException, IOException {
    // Create a conversation
    Conversation createdConversation = 
        ConversationManagement.createConversation(PROJECT_ID, LOCATION, conversationProfileId);
    assertEquals(LifecycleState.IN_PROGRESS, createdConversation.getLifecycleState());

    // List conversations
    List<Conversation> conversations = 
        ConversationManagement.listConversations(PROJECT_ID, LOCATION);
    assertTrue(conversations.stream().anyMatch(conversation -> 
        conversation.getName().equals(createdConversation.getName())));

    // Get the conversation
    String conversationId = ConversationName.parse(createdConversation.getName()).getConversation();
    Conversation gotConversation = 
        ConversationManagement.getConversation(PROJECT_ID, LOCATION, conversationId);
    assertEquals(createdConversation.getName(), gotConversation.getName());
    
    // Complete the conversation
    Conversation completedConversation = 
        ConversationManagement.completeConversation(PROJECT_ID, LOCATION, conversationId);
    assertEquals(createdConversation.getName(), gotConversation.getName());
    assertEquals(LifecycleState.COMPLETED, completedConversation.getLifecycleState());
  }
}
