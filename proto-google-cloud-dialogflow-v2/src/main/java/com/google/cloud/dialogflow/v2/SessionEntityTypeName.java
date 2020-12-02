/*
 * Copyright 2020 Google LLC
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
public class SessionEntityTypeName implements ResourceName {
  private static final PathTemplate PROJECT_SESSION_ENTITY_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/agent/sessions/{session}/entityTypes/{entity_type}");
  private static final PathTemplate PROJECT_ENVIRONMENT_USER_SESSION_ENTITY_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/agent/environments/{environment}/users/{user}/sessions/{session}/entityTypes/{entity_type}");
  private volatile Map<String, String> fieldValuesMap;
  private PathTemplate pathTemplate;
  private String fixedValue;
  private final String project;
  private final String session;
  private final String entityType;
  private final String environment;
  private final String user;

  @Deprecated
  protected SessionEntityTypeName() {
    project = null;
    session = null;
    entityType = null;
    environment = null;
    user = null;
  }

  private SessionEntityTypeName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    session = Preconditions.checkNotNull(builder.getSession());
    entityType = Preconditions.checkNotNull(builder.getEntityType());
    environment = null;
    user = null;
    pathTemplate = PROJECT_SESSION_ENTITY_TYPE;
  }

  private SessionEntityTypeName(ProjectEnvironmentUserSessionEntityTypeBuilder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    environment = Preconditions.checkNotNull(builder.getEnvironment());
    user = Preconditions.checkNotNull(builder.getUser());
    session = Preconditions.checkNotNull(builder.getSession());
    entityType = Preconditions.checkNotNull(builder.getEntityType());
    pathTemplate = PROJECT_ENVIRONMENT_USER_SESSION_ENTITY_TYPE;
  }

  public String getProject() {
    return project;
  }

  public String getSession() {
    return session;
  }

  public String getEntityType() {
    return entityType;
  }

  public String getEnvironment() {
    return environment;
  }

  public String getUser() {
    return user;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static Builder newProjectSessionEntityTypeBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static ProjectEnvironmentUserSessionEntityTypeBuilder
      newProjectEnvironmentUserSessionEntityTypeBuilder() {
    return new ProjectEnvironmentUserSessionEntityTypeBuilder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static SessionEntityTypeName of(String project, String session, String entityType) {
    return newBuilder().setProject(project).setSession(session).setEntityType(entityType).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static SessionEntityTypeName ofProjectSessionEntityTypeName(
      String project, String session, String entityType) {
    return newBuilder().setProject(project).setSession(session).setEntityType(entityType).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static SessionEntityTypeName ofProjectEnvironmentUserSessionEntityTypeName(
      String project, String environment, String user, String session, String entityType) {
    return newProjectEnvironmentUserSessionEntityTypeBuilder()
        .setProject(project)
        .setEnvironment(environment)
        .setUser(user)
        .setSession(session)
        .setEntityType(entityType)
        .build();
  }

  public static String format(String project, String session, String entityType) {
    return newBuilder()
        .setProject(project)
        .setSession(session)
        .setEntityType(entityType)
        .build()
        .toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectSessionEntityTypeName(
      String project, String session, String entityType) {
    return newBuilder()
        .setProject(project)
        .setSession(session)
        .setEntityType(entityType)
        .build()
        .toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectEnvironmentUserSessionEntityTypeName(
      String project, String environment, String user, String session, String entityType) {
    return newProjectEnvironmentUserSessionEntityTypeBuilder()
        .setProject(project)
        .setEnvironment(environment)
        .setUser(user)
        .setSession(session)
        .setEntityType(entityType)
        .build()
        .toString();
  }

  public static SessionEntityTypeName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    if (PROJECT_SESSION_ENTITY_TYPE.matches(formattedString)) {
      Map<String, String> matchMap = PROJECT_SESSION_ENTITY_TYPE.match(formattedString);
      return ofProjectSessionEntityTypeName(
          matchMap.get("project"), matchMap.get("session"), matchMap.get("entity_type"));
    } else if (PROJECT_ENVIRONMENT_USER_SESSION_ENTITY_TYPE.matches(formattedString)) {
      Map<String, String> matchMap =
          PROJECT_ENVIRONMENT_USER_SESSION_ENTITY_TYPE.match(formattedString);
      return ofProjectEnvironmentUserSessionEntityTypeName(
          matchMap.get("project"),
          matchMap.get("environment"),
          matchMap.get("user"),
          matchMap.get("session"),
          matchMap.get("entity_type"));
    }
    throw new ValidationException(
        "SessionEntityTypeName.parse: formattedString not in valid format");
  }

  public static List<SessionEntityTypeName> parseList(List<String> formattedStrings) {
    List<SessionEntityTypeName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SessionEntityTypeName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (SessionEntityTypeName value : values) {
      if (Objects.isNull(value)) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_SESSION_ENTITY_TYPE.matches(formattedString)
        || PROJECT_ENVIRONMENT_USER_SESSION_ENTITY_TYPE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (Objects.isNull(fieldValuesMap)) {
      synchronized (this) {
        if (Objects.isNull(fieldValuesMap)) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (!Objects.isNull(project)) {
            fieldMapBuilder.put("project", project);
          }
          if (!Objects.isNull(session)) {
            fieldMapBuilder.put("session", session);
          }
          if (!Objects.isNull(entityType)) {
            fieldMapBuilder.put("entity_type", entityType);
          }
          if (!Objects.isNull(environment)) {
            fieldMapBuilder.put("environment", environment);
          }
          if (!Objects.isNull(user)) {
            fieldMapBuilder.put("user", user);
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
    return !Objects.isNull(fixedValue) ? fixedValue : pathTemplate.instantiate(getFieldValuesMap());
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      SessionEntityTypeName that = ((SessionEntityTypeName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.session, that.session)
          && Objects.equals(this.entityType, that.entityType)
          && Objects.equals(this.environment, that.environment)
          && Objects.equals(this.user, that.user);
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
    h ^= Objects.hashCode(session);
    h *= 1000003;
    h ^= Objects.hashCode(entityType);
    h *= 1000003;
    h ^= Objects.hashCode(environment);
    h *= 1000003;
    h ^= Objects.hashCode(user);
    return h;
  }

  /** Builder for projects/{project}/agent/sessions/{session}/entityTypes/{entity_type}. */
  public static class Builder {
    private String project;
    private String session;
    private String entityType;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getSession() {
      return session;
    }

    public String getEntityType() {
      return entityType;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setSession(String session) {
      this.session = session;
      return this;
    }

    public Builder setEntityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    private Builder(SessionEntityTypeName sessionEntityTypeName) {
      Preconditions.checkArgument(
          Objects.equals(sessionEntityTypeName.pathTemplate, PROJECT_SESSION_ENTITY_TYPE),
          "toBuilder is only supported when SessionEntityTypeName has the pattern of projects/{project}/agent/sessions/{session}/entityTypes/{entity_type}");
      project = sessionEntityTypeName.project;
      session = sessionEntityTypeName.session;
      entityType = sessionEntityTypeName.entityType;
    }

    public SessionEntityTypeName build() {
      return new SessionEntityTypeName(this);
    }
  }

  /**
   * Builder for
   * projects/{project}/agent/environments/{environment}/users/{user}/sessions/{session}/entityTypes/{entity_type}.
   */
  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static class ProjectEnvironmentUserSessionEntityTypeBuilder {
    private String project;
    private String environment;
    private String user;
    private String session;
    private String entityType;

    protected ProjectEnvironmentUserSessionEntityTypeBuilder() {}

    public String getProject() {
      return project;
    }

    public String getEnvironment() {
      return environment;
    }

    public String getUser() {
      return user;
    }

    public String getSession() {
      return session;
    }

    public String getEntityType() {
      return entityType;
    }

    public ProjectEnvironmentUserSessionEntityTypeBuilder setProject(String project) {
      this.project = project;
      return this;
    }

    public ProjectEnvironmentUserSessionEntityTypeBuilder setEnvironment(String environment) {
      this.environment = environment;
      return this;
    }

    public ProjectEnvironmentUserSessionEntityTypeBuilder setUser(String user) {
      this.user = user;
      return this;
    }

    public ProjectEnvironmentUserSessionEntityTypeBuilder setSession(String session) {
      this.session = session;
      return this;
    }

    public ProjectEnvironmentUserSessionEntityTypeBuilder setEntityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    public SessionEntityTypeName build() {
      return new SessionEntityTypeName(this);
    }
  }
}
