package io.github.lvivjavaclub.immutables;

import org.immutables.value.Value;

@Value.Style(
    of = "new", // renames "of" method to "new", which is interpreted as plain constructor
    allParameters = true // unrelated to the line above: every attribute becomes parameter
    // reminder: don't get used to inline styles, read style guide!
)
@Value.Immutable
public abstract class HostWithPort {
  @Value.Parameter(order = 2)
  public abstract int port();
  @Value.Parameter(order = 1)
  public abstract String hostname();
}
