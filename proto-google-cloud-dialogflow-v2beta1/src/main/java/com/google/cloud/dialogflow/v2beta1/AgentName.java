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

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class AgentName implements ResourceName {

  @Deprecated
  protected AgentName() {}

  private static final PathTemplate PROJECT_AGENT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/agent");
  private static final PathTemplate PROJECT_LOCATION_AGENT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}/agent");

  private volatile Map<String, String> fieldValuesMap;
  private PathTemplate pathTemplate;
  private String fixedValue;

  private String project;
  private String location;

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  private AgentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    pathTemplate = PROJECT_AGENT_PATH_TEMPLATE;
  }

  private AgentName(ProjectLocationAgentBuilder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    pathTemplate = PROJECT_LOCATION_AGENT_PATH_TEMPLATE;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static Builder newProjectAgentBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static ProjectLocationAgentBuilder newProjectLocationAgentBuilder() {
    return new ProjectLocationAgentBuilder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AgentName of(String project) {
    return newProjectAgentBuilder().setProject(project).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static AgentName ofProjectAgentName(String project) {
    return newProjectAgentBuilder().setProject(project).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static AgentName ofProjectLocationAgentName(String project, String location) {
    return newProjectLocationAgentBuilder().setProject(project).setLocation(location).build();
  }

  public static String format(String project) {
    return newBuilder().setProject(project).build().toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectAgentName(String project) {
    return newBuilder().setProject(project).build().toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectLocationAgentName(String project, String location) {
    return newProjectLocationAgentBuilder()
        .setProject(project)
        .setLocation(location)
        .build()
        .toString();
  }

  public static AgentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    if (PROJECT_AGENT_PATH_TEMPLATE.matches(formattedString)) {
      Map<String, String> matchMap = PROJECT_AGENT_PATH_TEMPLATE.match(formattedString);
      return ofProjectAgentName(matchMap.get("project"));
    } else if (PROJECT_LOCATION_AGENT_PATH_TEMPLATE.matches(formattedString)) {
      Map<String, String> matchMap = PROJECT_LOCATION_AGENT_PATH_TEMPLATE.match(formattedString);
      return ofProjectLocationAgentName(matchMap.get("project"), matchMap.get("location"));
    }
    throw new ValidationException("JobName.parse: formattedString not in valid format");
  }

  public static List<AgentName> parseList(List<String> formattedStrings) {
    List<AgentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AgentName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AgentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_AGENT_PATH_TEMPLATE.matches(formattedString)
        || PROJECT_LOCATION_AGENT_PATH_TEMPLATE.matches(formattedString);
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

  /** Builder for projects/{project}/agent. */
  public static class Builder {

    private String project;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder(AgentName agentName) {
      Preconditions.checkArgument(
          agentName.pathTemplate == PROJECT_AGENT_PATH_TEMPLATE,
          "toBuilder is only supported when AgentName has the pattern of "
              + "projects/{project}/agent.");
      project = agentName.project;
    }

    public AgentName build() {
      return new AgentName(this);
    }
  }

  /** Builder for projects/{project}/locations/{location}/agent. */
  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static class ProjectLocationAgentBuilder {

    private String project;
    private String location;

    private ProjectLocationAgentBuilder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public ProjectLocationAgentBuilder setProject(String project) {
      this.project = project;
      return this;
    }

    public ProjectLocationAgentBuilder setLocation(String location) {
      this.location = location;
      return this;
    }

    public AgentName build() {
      return new AgentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AgentName that = (AgentName) o;
      return (Objects.equals(this.project, that.project))
          && (Objects.equals(this.location, that.location));
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
    h ^= Objects.hashCode(location);
    return h;
  }
}
