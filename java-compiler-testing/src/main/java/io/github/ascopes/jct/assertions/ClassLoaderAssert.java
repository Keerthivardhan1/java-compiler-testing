/*
 * Copyright (C) 2022 - 2022 Ashley Scopes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.ascopes.jct.assertions;

import org.apiguardian.api.API;
import org.apiguardian.api.API.Status;
import org.assertj.core.api.AbstractAssert;

/**
 * Assertions to perform on a classloader.
 *
 * <p>Deprecated for removal: see
 * <a href="https://github.com/assertj/assertj-core/issues/2639">assertj-core GH-2639</a>.
 *
 * @author Ashley Scopes
 * @since 0.0.1
 * @deprecated I have put up a pull request for AssertJ to support this functionality in AssertJ
 *     Core. Once this is merged, this class will be removed from this API.
 */
@API(since = "0.0.1", status = Status.EXPERIMENTAL)
@Deprecated(forRemoval = true)
public final class ClassLoaderAssert extends AbstractAssert<ClassLoaderAssert, ClassLoader> {

  /**
   * Initialize a new assertions object.
   *
   * @param actual the class loader to assert upon.
   */
  public ClassLoaderAssert(ClassLoader actual) {
    super(actual, ClassLoaderAssert.class);
  }
}
