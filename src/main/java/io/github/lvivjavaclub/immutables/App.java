package io.github.lvivjavaclub.immutables;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {

    Test test = new Test();
    test.foo = Integer.valueOf(30000);
    
    FoobarValue value = ImmutableFoobarValue.builder()
        .foo(2)
        .bar("Bar")
        .addBuz(test)
        .build();

    System.out.println("value: " + value);

    test.foo = Integer.valueOf(20000);

    System.out.println("value: " + value);


    Person person = new PersonBuilder()
        .name("Jim Boe")
        .address("P.O. box 0001, Lexington, KY")
        .build();

    System.out.println("person: " + person);

    HostWithPort hostWithPort = new ImmutableHostWithPort("localhost", 8081);

    System.out.println("hostWithPort: " + hostWithPort);


    PlayerInfo veteran = ImmutablePlayerInfo.builder()
        .id(1)
        .name("Fiddler")
        .gamesPlayed(99)
        .build();
    System.out.println("veteran: " + veteran);

    PlayerInfo anonymous44 = ImmutablePlayerInfo.of(44);
    System.out.println("anonymous44: " + anonymous44);


    Order order = ImmutableOrder.builder()
        .addItems(ImmutableItem.of("item1", 11))
        .addItems(ImmutableItem.of("item2", 22))
        .build();
    System.out.println("order: " + order);
    System.out.println("totalCount33: " + order.totalCount());


    Order immutableOrder = ImmutableOrder.copyOf(order)
        .withItems(ImmutableItem.of("item2", 33));

    System.out.println("order: " + immutableOrder);
    System.out.println("totalCount66: " + immutableOrder.totalCount());


    
    ImmutableNumberContainer.builder().build();
  }
}
