package io.github.lvivjavaclub.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface PlayerInfo {

  @Value.Parameter
  long id();

  @Value.Default
  default String name() {
    return "Anonymous_" + id();
  }

  @Value.Default
  default int gamesPlayed() {
    return 0;
  }
}
