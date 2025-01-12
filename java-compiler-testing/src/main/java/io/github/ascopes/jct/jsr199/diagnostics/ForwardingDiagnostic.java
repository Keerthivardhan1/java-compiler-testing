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
package io.github.ascopes.jct.jsr199.diagnostics;

import static java.util.Objects.requireNonNull;

import io.github.ascopes.jct.annotations.Nullable;
import java.util.Locale;
import javax.tools.Diagnostic;
import org.apiguardian.api.API;
import org.apiguardian.api.API.Status;

/**
 * Partial {@link Diagnostic} implementation that delegates to a provided diagnostic implementation
 * internally.
 *
 * <p>Used to provide composition to extend behaviour rather than direct inheritance.
 *
 * @param <S> the source file type.
 * @author Ashley Scopes
 * @since 0.0.1
 */
@API(since = "0.0.1", status = Status.EXPERIMENTAL)
public abstract class ForwardingDiagnostic<S> implements Diagnostic<S> {

  private final Diagnostic<? extends S> original;

  /**
   * Initialize this forwarding diagnostic.
   *
   * @param original the original diagnostic to delegate to.
   */
  protected ForwardingDiagnostic(Diagnostic<? extends S> original) {
    this.original = requireNonNull(original, "original");
  }

  @Override
  public Kind getKind() {
    return original.getKind();
  }

  @Nullable
  @Override
  public S getSource() {
    return original.getSource();
  }

  @Override
  public long getPosition() {
    return original.getPosition();
  }

  @Override
  public long getStartPosition() {
    return original.getStartPosition();
  }

  @Override
  public long getEndPosition() {
    return original.getEndPosition();
  }

  @Override
  public long getLineNumber() {
    return original.getLineNumber();
  }

  @Override
  public long getColumnNumber() {
    return original.getColumnNumber();
  }

  @Nullable
  @Override
  public String getCode() {
    return original.getCode();
  }

  @Override
  public String getMessage(@Nullable Locale locale) {
    return original.getMessage(locale);
  }

  /**
   * {@inheritDoc}
   *
   * <p><strong>Note:</strong> this representation may vary depending on the compiler that
   * initialized it.</p>
   *
   * @return the string representation of the diagnostic.
   */
  @Override
  public String toString() {
    return original.toString();
  }
}
