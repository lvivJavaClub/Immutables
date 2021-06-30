package io.github.lvivjavaclub.immutables;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PRIVATE)
public interface Person {
  String name();
  String address();
}
