package com.design.pattern.learnn.Command;

public class SellStock implements Order {

  private Stock abcStock;

  public SellStock(Stock stock) {
    abcStock = stock;
  }

  @Override
  public void execute() {
    abcStock.sell();
  }
}
