package com.example.dialogflow;

import com.google.api.gax.rpc.ApiException;
import com.google.cloud.dialogflow.v2.ConversationName;
import com.google.cloud.dialogflow.v2.Participant;
import com.google.cloud.dialogflow.v2.Participant.Role;
import com.google.cloud.dialogflow.v2.ParticipantName;
import com.google.cloud.dialogflow.v2.ParticipantsClient;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class ParticipantManagement {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "my-project-id";
    String location = "my-location";
    String conversationId = "my-conversation-id";
    Role role = Role.END_USER;
    
    // Create a participant
    Participant participant = createParticipant(projectId, location, conversationId, role);

    // Get the participant
    String participantId = ParticipantName.parse(participant.getName()).getParticipant();
    getParticipant(projectId, location, conversationId, participantId);

    // List participants
    listParticipants(projectId, location, conversationId);
  }

  // [START dialogflow_list_participants]
  public static List<Participant> listParticipants(
      String projectId, String location, String conversationId) 
      throws ApiException, IOException {
    List<Participant> participants = Lists.newArrayList();
    try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
      ConversationName conversationName = 
          ConversationName.ofProjectLocationConversationName(projectId, location, conversationId);
      for (Participant participant : 
          participantsClient.listParticipants(conversationName).iterateAll()) {
        System.out.println("====================");
        System.out.format("Role: %s\n", participant.getRole());
        System.out.format("Name: %s\n", participant.getName());
        participants.add(participant);
      }
    }
    return participants;
  }
  // [END dialogflow_list_participants]
  
  // [START dialogflow_create_participant]
  public static Participant createParticipant(
      String projectId, String location, String conversationId, Role role) 
      throws ApiException, IOException {
    try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
      ConversationName conversationName = 
          ConversationName.ofProjectLocationConversationName(projectId, location, conversationId);
      Participant participant = Participant.newBuilder().setRole(role).build();
      Participant newParticipant = 
          participantsClient.createParticipant(conversationName, participant);
      System.out.println("====================");
      System.out.println("Participant Created:");
      System.out.format("Role: %s\n", newParticipant.getRole());
      System.out.format("Name: %s\n", newParticipant.getName());
      return newParticipant;
    }
  }
  // [END dialogflow_create_participant]

  // [START dialogflow_get_participant]
  public static Participant getParticipant(
      String projectId, String location, String conversationId, String participantId) 
      throws ApiException, IOException {
    try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
      ParticipantName participantName = 
          ParticipantName.ofProjectLocationConversationParticipantName(
            projectId, location, conversationId, participantId);
      Participant participant = participantsClient.getParticipant(participantName);
      System.out.println("====================");
      System.out.println("Participant Got:");
      System.out.format("Role: %s\n", participant.getRole());
      System.out.format("Name: %s\n", participant.getName());
      return participant;
    }
  }
  // [END dialogflow_create_participant]
}
