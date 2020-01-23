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

package com.google.cloud.dialogflow.v2;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class IntentName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/agent/intents/{intent}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String intent;

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

  private IntentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    intent = Preconditions.checkNotNull(builder.getIntent());
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
        PATH_TEMPLATE.validatedMatch(
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
    List<String> list = new ArrayList<String>(values.size());
    for (IntentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("intent", intent);
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
    return PATH_TEMPLATE.instantiate("project", project, "intent", intent);
  }

  /** Builder for IntentName. */
  public static class Builder {

    private String project;
    private String intent;

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

    private Builder() {}

    private Builder(IntentName intentName) {
      project = intentName.project;
      intent = intentName.intent;
    }

    public IntentName build() {
      return new IntentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IntentName) {
      IntentName that = (IntentName) o;
      return (this.project.equals(that.project)) && (this.intent.equals(that.intent));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= intent.hashCode();
    return h;
  }
}
