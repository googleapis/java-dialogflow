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

import com.google.api.core.BetaApi;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.pathtemplate.ValidationException;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class ConversationModelName implements ResourceName {
  private static final PathTemplate PROJECT_CONVERSATION_MODEL =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/conversationModels/{conversation_model}");
  private static final PathTemplate PROJECT_LOCATION_CONVERSATION_MODEL =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/conversationModels/{conversation_model}");
  private volatile Map<String, String> fieldValuesMap;
  private PathTemplate pathTemplate;
  private String fixedValue;
  private final String project;
  private final String conversationModel;
  private final String location;

  @Deprecated
  protected ConversationModelName() {
    project = null;
    conversationModel = null;
    location = null;
  }

  private ConversationModelName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    conversationModel = Preconditions.checkNotNull(builder.getConversationModel());
    location = null;
    pathTemplate = PROJECT_CONVERSATION_MODEL;
  }

  private ConversationModelName(ProjectLocationConversationModelBuilder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    conversationModel = Preconditions.checkNotNull(builder.getConversationModel());
    pathTemplate = PROJECT_LOCATION_CONVERSATION_MODEL;
  }

  public String getProject() {
    return project;
  }

  public String getConversationModel() {
    return conversationModel;
  }

  public String getLocation() {
    return location;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static Builder newProjectConversationModelBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static ProjectLocationConversationModelBuilder
      newProjectLocationConversationModelBuilder() {
    return new ProjectLocationConversationModelBuilder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ConversationModelName of(String project, String conversationModel) {
    return newBuilder().setProject(project).setConversationModel(conversationModel).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static ConversationModelName ofProjectConversationModelName(
      String project, String conversationModel) {
    return newBuilder().setProject(project).setConversationModel(conversationModel).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static ConversationModelName ofProjectLocationConversationModelName(
      String project, String location, String conversationModel) {
    return newProjectLocationConversationModelBuilder()
        .setProject(project)
        .setLocation(location)
        .setConversationModel(conversationModel)
        .build();
  }

  public static String format(String project, String conversationModel) {
    return newBuilder()
        .setProject(project)
        .setConversationModel(conversationModel)
        .build()
        .toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectConversationModelName(
      String project, String conversationModel) {
    return newBuilder()
        .setProject(project)
        .setConversationModel(conversationModel)
        .build()
        .toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectLocationConversationModelName(
      String project, String location, String conversationModel) {
    return newProjectLocationConversationModelBuilder()
        .setProject(project)
        .setLocation(location)
        .setConversationModel(conversationModel)
        .build()
        .toString();
  }

  public static ConversationModelName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    if (PROJECT_CONVERSATION_MODEL.matches(formattedString)) {
      Map<String, String> matchMap = PROJECT_CONVERSATION_MODEL.match(formattedString);
      return ofProjectConversationModelName(
          matchMap.get("project"), matchMap.get("conversation_model"));
    } else if (PROJECT_LOCATION_CONVERSATION_MODEL.matches(formattedString)) {
      Map<String, String> matchMap = PROJECT_LOCATION_CONVERSATION_MODEL.match(formattedString);
      return ofProjectLocationConversationModelName(
          matchMap.get("project"), matchMap.get("location"), matchMap.get("conversation_model"));
    }
    throw new ValidationException(
        "ConversationModelName.parse: formattedString not in valid format");
  }

  public static List<ConversationModelName> parseList(List<String> formattedStrings) {
    List<ConversationModelName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ConversationModelName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ConversationModelName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_CONVERSATION_MODEL.matches(formattedString)
        || PROJECT_LOCATION_CONVERSATION_MODEL.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (conversationModel != null) {
            fieldMapBuilder.put("conversation_model", conversationModel);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return fixedValue != null ? fixedValue : pathTemplate.instantiate(getFieldValuesMap());
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ConversationModelName that = ((ConversationModelName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.conversationModel, that.conversationModel)
          && Objects.equals(this.location, that.location);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(fixedValue);
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(conversationModel);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    return h;
  }

  /** Builder for projects/{project}/conversationModels/{conversation_model}. */
  public static class Builder {
    private String project;
    private String conversationModel;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getConversationModel() {
      return conversationModel;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setConversationModel(String conversationModel) {
      this.conversationModel = conversationModel;
      return this;
    }

    private Builder(ConversationModelName conversationModelName) {
      Preconditions.checkArgument(
          Objects.equals(conversationModelName.pathTemplate, PROJECT_CONVERSATION_MODEL),
          "toBuilder is only supported when ConversationModelName has the pattern of projects/{project}/conversationModels/{conversation_model}");
      this.project = conversationModelName.project;
      this.conversationModel = conversationModelName.conversationModel;
    }

    public ConversationModelName build() {
      return new ConversationModelName(this);
    }
  }

  /**
   * Builder for projects/{project}/locations/{location}/conversationModels/{conversation_model}.
   */
  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static class ProjectLocationConversationModelBuilder {
    private String project;
    private String location;
    private String conversationModel;

    protected ProjectLocationConversationModelBuilder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getConversationModel() {
      return conversationModel;
    }

    public ProjectLocationConversationModelBuilder setProject(String project) {
      this.project = project;
      return this;
    }

    public ProjectLocationConversationModelBuilder setLocation(String location) {
      this.location = location;
      return this;
    }

    public ProjectLocationConversationModelBuilder setConversationModel(String conversationModel) {
      this.conversationModel = conversationModel;
      return this;
    }

    public ConversationModelName build() {
      return new ConversationModelName(this);
    }
  }
}
