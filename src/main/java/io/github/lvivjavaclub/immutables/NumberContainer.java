package io.github.lvivjavaclub.immutables;

import com.google.common.base.Preconditions;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public abstract class NumberContainer {
  public abstract List<Number> nonEmptyNumbers();

  @Value.Check
  protected void check() {
    Preconditions.checkState(!nonEmptyNumbers().isEmpty(),
        "'nonEmptyNumbers' should have at least one number");
  }
}
