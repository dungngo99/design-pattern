package com.design.pattern.learnn.Builder;

public class ItemBuilder {

  private Item item;

  private ItemBuilder() {
    item = new Item();
  }

  public static ItemBuilder create() {
    return new ItemBuilder();
  }

  public ItemBuilder setItemName(String name) {
    item.setName(name);
    return this;
  }

  public ItemBuilder setItemStore(String store) {
    item.setStore(store);
    return this;
  }

  public ItemBuilder setItemPrice(Double price) {
    item.setPrice(price);
    return this;
  }

  public Item build() {
    return item;
  }
}
