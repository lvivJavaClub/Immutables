package io.github.lvivjavaclub.immutables;

public class Test implements Cloneable {
  public Integer foo;

  @Override
  public String toString() {
    return "Test{" +
           "foo=" + foo +
           '}';
  }
}
