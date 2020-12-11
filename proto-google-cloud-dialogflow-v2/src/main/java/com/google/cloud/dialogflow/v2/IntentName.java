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

import com.google.api.pathtemplate.PathTemplate;
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
public class IntentName implements ResourceName {
  private static final PathTemplate PROJECT_INTENT =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/agent/intents/{intent}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String intent;

  @Deprecated
  protected IntentName() {
    project = null;
    intent = null;
  }

  private IntentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    intent = Preconditions.checkNotNull(builder.getIntent());
  }

  public String getProject() {
    return project;
  }

  public String getIntent() {
    return intent;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static IntentName of(String project, String intent) {
    return newBuilder().setProject(project).setIntent(intent).build();
  }

  public static String format(String project, String intent) {
    return newBuilder().setProject(project).setIntent(intent).build().toString();
  }

  public static IntentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_INTENT.validatedMatch(
            formattedString, "IntentName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("intent"));
  }

  public static List<IntentName> parseList(List<String> formattedStrings) {
    List<IntentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<IntentName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (IntentName value : values) {
      if (Objects.isNull(value)) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_INTENT.matches(formattedString);
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
          if (!Objects.isNull(intent)) {
            fieldMapBuilder.put("intent", intent);
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
    return PROJECT_INTENT.instantiate("project", project, "intent", intent);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      IntentName that = ((IntentName) o);
      return Objects.equals(this.project, that.project) && Objects.equals(this.intent, that.intent);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(intent);
    return h;
  }

  /** Builder for projects/{project}/agent/intents/{intent}. */
  public static class Builder {
    private String project;
    private String intent;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getIntent() {
      return intent;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setIntent(String intent) {
      this.intent = intent;
      return this;
    }

    private Builder(IntentName intentName) {
      project = intentName.project;
      intent = intentName.intent;
    }

    public IntentName build() {
      return new IntentName(this);
    }
  }
}
