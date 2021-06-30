package io.github.lvivjavaclub.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Item {
  @Value.Parameter
  abstract String name();
  @Value.Parameter
  abstract int count();
}
