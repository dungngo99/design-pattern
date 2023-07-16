package com.design.pattern.learnn.Command;

public class Stock {
  private String name;
  private Integer quantity;

  public Stock(String name, Integer quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public void buy() {
    System.out.println(String.format("Stock [ Name: %s, Quantity: %s] bought", name, quantity));
  }

  public void sell() {
    System.out.println(String.format("Stock [ Name: %s, Quantity: %s] sold", name, quantity));
  }
}
