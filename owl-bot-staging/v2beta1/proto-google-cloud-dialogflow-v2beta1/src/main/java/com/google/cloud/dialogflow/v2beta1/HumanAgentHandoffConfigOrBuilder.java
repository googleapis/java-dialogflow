// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/conversation_profile.proto

package com.google.cloud.dialogflow.v2beta1;

public interface HumanAgentHandoffConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Uses LivePerson (https://www.liveperson.com).
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.LivePersonConfig live_person_config = 1;</code>
   * @return Whether the livePersonConfig field is set.
   */
  boolean hasLivePersonConfig();
  /**
   * <pre>
   * Uses LivePerson (https://www.liveperson.com).
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.LivePersonConfig live_person_config = 1;</code>
   * @return The livePersonConfig.
   */
  com.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.LivePersonConfig getLivePersonConfig();
  /**
   * <pre>
   * Uses LivePerson (https://www.liveperson.com).
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.LivePersonConfig live_person_config = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.LivePersonConfigOrBuilder getLivePersonConfigOrBuilder();

  /**
   * <pre>
   * Uses Salesforce Live Agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.SalesforceLiveAgentConfig salesforce_live_agent_config = 2;</code>
   * @return Whether the salesforceLiveAgentConfig field is set.
   */
  boolean hasSalesforceLiveAgentConfig();
  /**
   * <pre>
   * Uses Salesforce Live Agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.SalesforceLiveAgentConfig salesforce_live_agent_config = 2;</code>
   * @return The salesforceLiveAgentConfig.
   */
  com.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.SalesforceLiveAgentConfig getSalesforceLiveAgentConfig();
  /**
   * <pre>
   * Uses Salesforce Live Agent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.SalesforceLiveAgentConfig salesforce_live_agent_config = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.SalesforceLiveAgentConfigOrBuilder getSalesforceLiveAgentConfigOrBuilder();

  public com.google.cloud.dialogflow.v2beta1.HumanAgentHandoffConfig.AgentServiceCase getAgentServiceCase();
}
