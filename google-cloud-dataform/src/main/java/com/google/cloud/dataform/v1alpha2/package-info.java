/*
 * Copyright 2022 Google LLC
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

/**
 * A client to Dataform API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= DataformClient =======================
 *
 * <p>Service Description: Dataform is a service to develop, create, document, test, and update
 * curated tables in BigQuery.
 *
 * <p>Sample for DataformClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (DataformClient dataformClient = DataformClient.create()) {
 *   RepositoryName name = RepositoryName.of("[PROJECT]", "[LOCATION]", "[REPOSITORY]");
 *   Repository response = dataformClient.getRepository(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.dataform.v1alpha2;

import javax.annotation.Generated;
