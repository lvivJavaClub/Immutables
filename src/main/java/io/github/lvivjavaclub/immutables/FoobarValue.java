package io.github.lvivjavaclub.immutables;

import org.immutables.value.Value;

import java.util.List;
import java.util.Set;

@Value.Immutable
public interface  FoobarValue {
  int foo();
  String bar();
  List<Test> buz();
  Set<Long> crux();
}
