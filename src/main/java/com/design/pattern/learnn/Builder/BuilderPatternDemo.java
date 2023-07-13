package com.design.pattern.learnn.Builder;

public class BuilderPatternDemo {

  public static void main(String[] args) {
    Item item = ItemBuilder
        .create()
        .setItemName("Burger")
        .setItemStore("McDonald")
        .setItemPrice(1.02)
        .build();
    System.out.println("item: " + item);

    Item item2 = ItemBuilderLazy
        .create()
        .setItemName("Salad")
        .setItemStore("ChicFilA")
        .setItemPrice(0.5)
        .build();
    System.out.println("item: " + item2);
  }
}
