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
package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.EntityTypesClient.ListEntityTypesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest;
import com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest;
import com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest;
import com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest;
import com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest;
import com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse;
import com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest;
import com.google.cloud.dialogflow.v2beta1.EntityType;
import com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest;
import com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest;
import com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse;
import com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Dialogflow API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class EntityTypesStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<ListEntityTypesRequest, ListEntityTypesPagedResponse>
      listEntityTypesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listEntityTypesPagedCallable()");
  }

  public UnaryCallable<ListEntityTypesRequest, ListEntityTypesResponse> listEntityTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: listEntityTypesCallable()");
  }

  public UnaryCallable<GetEntityTypeRequest, EntityType> getEntityTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: getEntityTypeCallable()");
  }

  public UnaryCallable<CreateEntityTypeRequest, EntityType> createEntityTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: createEntityTypeCallable()");
  }

  public UnaryCallable<UpdateEntityTypeRequest, EntityType> updateEntityTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: updateEntityTypeCallable()");
  }

  public UnaryCallable<DeleteEntityTypeRequest, Empty> deleteEntityTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteEntityTypeCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<BatchUpdateEntityTypesRequest, BatchUpdateEntityTypesResponse, Struct>
      batchUpdateEntityTypesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchUpdateEntityTypesOperationCallable()");
  }

  public UnaryCallable<BatchUpdateEntityTypesRequest, Operation> batchUpdateEntityTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: batchUpdateEntityTypesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<BatchDeleteEntityTypesRequest, Empty, Struct>
      batchDeleteEntityTypesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchDeleteEntityTypesOperationCallable()");
  }

  public UnaryCallable<BatchDeleteEntityTypesRequest, Operation> batchDeleteEntityTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: batchDeleteEntityTypesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<BatchCreateEntitiesRequest, Empty, Struct>
      batchCreateEntitiesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchCreateEntitiesOperationCallable()");
  }

  public UnaryCallable<BatchCreateEntitiesRequest, Operation> batchCreateEntitiesCallable() {
    throw new UnsupportedOperationException("Not implemented: batchCreateEntitiesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<BatchUpdateEntitiesRequest, Empty, Struct>
      batchUpdateEntitiesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchUpdateEntitiesOperationCallable()");
  }

  public UnaryCallable<BatchUpdateEntitiesRequest, Operation> batchUpdateEntitiesCallable() {
    throw new UnsupportedOperationException("Not implemented: batchUpdateEntitiesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<BatchDeleteEntitiesRequest, Empty, Struct>
      batchDeleteEntitiesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchDeleteEntitiesOperationCallable()");
  }

  public UnaryCallable<BatchDeleteEntitiesRequest, Operation> batchDeleteEntitiesCallable() {
    throw new UnsupportedOperationException("Not implemented: batchDeleteEntitiesCallable()");
  }

  @Override
  public abstract void close();
}
