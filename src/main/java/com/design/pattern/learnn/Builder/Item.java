package com.design.pattern.learnn.Builder;

public class Item {
  private String name;

  private String store;

  private Double price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Item [name=" + name + ", store=" + store + ", price=" + price + "]";
  }

}
