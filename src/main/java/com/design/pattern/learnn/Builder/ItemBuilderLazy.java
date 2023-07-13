package com.design.pattern.learnn.Builder;

public class ItemBuilderLazy {
  private String itemName;

  private String itemStore;

  private Double itemPrice;

  private ItemBuilderLazy() {
  }

  public static ItemBuilderLazy create() {
    return new ItemBuilderLazy();
  }

  public ItemBuilderLazy setItemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  public ItemBuilderLazy setItemStore(String itemStore) {
    this.itemStore = itemStore;
    return this;
  }

  public ItemBuilderLazy setItemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  public Item build() {
    Item item = new Item();
    item.setName(itemName);
    item.setStore(itemStore);
    item.setPrice(itemPrice);
    return item;
  }
}
