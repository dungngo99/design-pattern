package com.design.pattern.learnn.Command;

public class BuyStock implements Order {

  private Stock abcStock;

  public BuyStock(Stock stock) {
    abcStock = stock;
  }

  @Override
  public void execute() {
    abcStock.buy();
  }
}
