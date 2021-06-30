package io.github.lvivjavaclub.immutables;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public abstract class Order {

  public abstract List<Item> items();

  @Value.Lazy
  public int totalCount() {
    int count = 0;

    System.out.println("totalCount");
    for (Item i : items())
      count += i.count();

    return count;
  }
}
