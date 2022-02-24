package com.example.dialogflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.cloud.dialogflow.v2.ConversationModelName;
import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationProfileName;
import com.google.cloud.dialogflow.v2.DocumentName;
import com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig;
import com.google.cloud.dialogflow.v2.KnowledgeBaseName;
import com.google.cloud.dialogflow.v2.SuggestionFeature.Type;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class CreateConversationProfileTest {

  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");

  private static void requireEnvVar(String varName) {
    assertNotNull(System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @Test
  public void testCreateConversationProfileArticleFaq() throws IOException {
    String conversationProfileDisplayName = UUID.randomUUID().toString();
    String location = "global";

    // Check the conversation profile does not yet exists
    List<ConversationProfile> conversationProfiles = 
        ConversationProfileManagement.listConversationProfiles(PROJECT_ID, location);
    assertFalse(conversationProfiles.stream().anyMatch(conversationProfile -> 
          conversationProfile.getDisplayName().equals(conversationProfileDisplayName)));
    
    // Create a conversation profile
    String articleSuggestionKnowledgeBaseId = UUID.randomUUID().toString();
    String faqKnowledgeBaseId = UUID.randomUUID().toString();
    ConversationProfile createdConversationProfile = 
        ConversationProfileManagement.createConversationProfileArticleFaq(
          PROJECT_ID, 
          conversationProfileDisplayName, 
          location,
          Optional.of(articleSuggestionKnowledgeBaseId), 
          Optional.of(faqKnowledgeBaseId));
    assertEquals(conversationProfileDisplayName, createdConversationProfile.getDisplayName());
    List<SuggestionFeatureConfig> featureConfigsList = createdConversationProfile
          .getHumanAgentAssistantConfig().getHumanAgentSuggestionConfig().getFeatureConfigsList();
    assertEquals(2, featureConfigsList.size());
    assertTrue(featureConfigsList
          .stream()
          .filter(featureConfig -> 
            featureConfig.getSuggestionFeature().getType().equals(Type.ARTICLE_SUGGESTION))
          .anyMatch(featureConfig -> 
            KnowledgeBaseName.parse(
              featureConfig
                .getQueryConfig().getKnowledgeBaseQuerySource().getKnowledgeBases(0)
            ).getKnowledgeBase().equals(articleSuggestionKnowledgeBaseId)));
    assertTrue(featureConfigsList
          .stream()
          .filter(featureConfig -> 
            featureConfig.getSuggestionFeature().getType().equals(Type.FAQ))
          .anyMatch(featureConfig -> 
            KnowledgeBaseName.parse(
              featureConfig
                .getQueryConfig().getKnowledgeBaseQuerySource().getKnowledgeBases(0)
            ).getKnowledgeBase().equals(faqKnowledgeBaseId)));
      
    // List conversation profiles
    conversationProfiles = 
        ConversationProfileManagement.listConversationProfiles(PROJECT_ID, location);
    assertTrue(conversationProfiles.stream().anyMatch(conversationProfile -> 
          conversationProfile.getDisplayName().equals(conversationProfileDisplayName)));

    // Get the conversation profile
    String conversationProfileId = ConversationProfileName.parse(
        createdConversationProfile.getName()).getConversationProfile();
    ConversationProfile gotConversationProfile = 
        ConversationProfileManagement.getConversationProfile(
          PROJECT_ID, location, conversationProfileId);
    assertEquals(
        createdConversationProfile.getDisplayName(), gotConversationProfile.getDisplayName());
    assertEquals(createdConversationProfile.getName(), gotConversationProfile.getName());

    // Delete the conversation profile
    ConversationProfileManagement.deleteConversationProfile(
        PROJECT_ID, location, conversationProfileId);

    // Verify the converstion profile is deleted
    conversationProfiles = 
        ConversationProfileManagement.listConversationProfiles(PROJECT_ID, location);
    assertFalse(conversationProfiles.stream().anyMatch(conversationProfile -> 
          conversationProfile.getDisplayName().equals(conversationProfileDisplayName)));
  }

  @Test
  public void testCreateConversationProfileSmartReply() throws IOException {
    String conversationProfileDisplayName = UUID.randomUUID().toString();
    String location = "global";

    // Check the conversation profile does not yet exists
    List<ConversationProfile> conversationProfiles = 
        ConversationProfileManagement.listConversationProfiles(PROJECT_ID, location);
    assertFalse(conversationProfiles.stream().anyMatch(conversationProfile -> 
          conversationProfile.getDisplayName().equals(conversationProfileDisplayName)));
    
    // Create a conversation profile
    String smartReplyKnowledgeBaseId = UUID.randomUUID().toString();
    String smartReplyDocumentId = UUID.randomUUID().toString();
    DocumentName smartReplyAllowlistName = DocumentName.ofProjectLocationKnowledgeBaseDocumentName(
        PROJECT_ID, location, smartReplyKnowledgeBaseId, smartReplyDocumentId);
    String smartReplyModelId = UUID.randomUUID().toString();
    ConversationModelName smartReplyModelName = 
        ConversationModelName.of(PROJECT_ID, location, smartReplyModelId);
    System.out.println(smartReplyModelName);
    ConversationProfile createdConversationProfile = 
        ConversationProfileManagement.createConversationProfileSmartReply(
          PROJECT_ID, 
          conversationProfileDisplayName, 
          location,
          smartReplyAllowlistName.toString(), 
          smartReplyModelName.toString());
    assertEquals(conversationProfileDisplayName, createdConversationProfile.getDisplayName());
    List<SuggestionFeatureConfig> featureConfigsList = createdConversationProfile
          .getHumanAgentAssistantConfig().getHumanAgentSuggestionConfig().getFeatureConfigsList();
    assertEquals(1, featureConfigsList.size());
    assertEquals(Type.SMART_REPLY, featureConfigsList.get(0).getSuggestionFeature().getType());
    assertEquals(smartReplyAllowlistName.toString(), 
        featureConfigsList.get(0).getQueryConfig().getDocumentQuerySource().getDocuments(0));
    assertEquals(smartReplyModelName.toString(), 
        featureConfigsList.get(0).getConversationModelConfig().getModel());
      
    // List conversation profiles
    conversationProfiles = 
        ConversationProfileManagement.listConversationProfiles(PROJECT_ID, location);
    assertTrue(conversationProfiles.stream().anyMatch(conversationProfile -> 
          conversationProfile.getDisplayName().equals(conversationProfileDisplayName)));

    // Get the conversation profile
    String conversationProfileId = ConversationProfileName.parse(
        createdConversationProfile.getName()).getConversationProfile();
    ConversationProfile gotConversationProfile = 
        ConversationProfileManagement.getConversationProfile(
          PROJECT_ID, location, conversationProfileId);
    assertEquals(
        createdConversationProfile.getDisplayName(), gotConversationProfile.getDisplayName());
    assertEquals(createdConversationProfile.getName(), gotConversationProfile.getName());

    // Delete the conversation profile
    ConversationProfileManagement.deleteConversationProfile(
        PROJECT_ID, location, conversationProfileId);

    // Verify the converstion profile is deleted
    conversationProfiles = 
        ConversationProfileManagement.listConversationProfiles(PROJECT_ID, location);
    assertFalse(conversationProfiles.stream().anyMatch(conversationProfile -> 
          conversationProfile.getDisplayName().equals(conversationProfileDisplayName)));
  }
}
