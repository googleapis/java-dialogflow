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

package com.google.cloud.dialogflow.v2.stub;

import static com.google.cloud.dialogflow.v2.VersionsClient.ListVersionsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.CreateVersionRequest;
import com.google.cloud.dialogflow.v2.DeleteVersionRequest;
import com.google.cloud.dialogflow.v2.GetVersionRequest;
import com.google.cloud.dialogflow.v2.ListVersionsRequest;
import com.google.cloud.dialogflow.v2.ListVersionsResponse;
import com.google.cloud.dialogflow.v2.UpdateVersionRequest;
import com.google.cloud.dialogflow.v2.Version;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the Versions service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class VersionsStub implements BackgroundResource {

  public UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse> listVersionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listVersionsPagedCallable()");
  }

  public UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listVersionsCallable()");
  }

  public UnaryCallable<GetVersionRequest, Version> getVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: getVersionCallable()");
  }

  public UnaryCallable<CreateVersionRequest, Version> createVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: createVersionCallable()");
  }

  public UnaryCallable<UpdateVersionRequest, Version> updateVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: updateVersionCallable()");
  }

  public UnaryCallable<DeleteVersionRequest, Empty> deleteVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteVersionCallable()");
  }

  @Override
  public abstract void close();
}
