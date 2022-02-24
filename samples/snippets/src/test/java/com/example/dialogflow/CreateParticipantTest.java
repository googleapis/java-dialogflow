package com.example.dialogflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.cloud.dialogflow.v2.Conversation;
import com.google.cloud.dialogflow.v2.ConversationName;
import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationProfileName;
import com.google.cloud.dialogflow.v2.Participant;
import com.google.cloud.dialogflow.v2.Participant.Role;
import com.google.cloud.dialogflow.v2.ParticipantName;
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
public class CreateParticipantTest {
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
  public void testUCreateParticipant() throws IOException {
    // Create a conversation
    Conversation createdConversation = 
        ConversationManagement.createConversation(PROJECT_ID, LOCATION, conversationProfileId);
    
    // Create a participant
    String conversationId = ConversationName.parse(createdConversation.getName()).getConversation();
    Participant createdParticipant = 
          ParticipantManagement.createParticipant(
            PROJECT_ID, LOCATION, conversationId, Role.END_USER);
    assertEquals(Role.END_USER, createdParticipant.getRole());

    // List participants
    List<Participant> participants = 
        ParticipantManagement.listParticipants(PROJECT_ID, LOCATION, conversationId);
    assertEquals(1, participants.size());
    assertEquals(createdParticipant.getName(), participants.get(0).getName());

    // Get the participant
    String participantId = ParticipantName.parse(createdParticipant.getName()).getParticipant();
    Participant gotParticipant = 
        ParticipantManagement.getParticipant(PROJECT_ID, LOCATION, conversationId, participantId);
    assertEquals(createdParticipant.getName(), gotParticipant.getName());
    
    // Complete the conversation
    ConversationManagement.completeConversation(PROJECT_ID, LOCATION, conversationId);
  }
}
