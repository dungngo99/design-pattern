package com.design.pattern.learnn.Command;

public class CommandPatternDemo {

  public static void main(String[] args) {
    Stock abcStock = new Stock("abc", 10);

    BuyStock buyOrder = new BuyStock(abcStock);
    SellStock sellOrder = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyOrder);
    broker.takeOrder(buyOrder);
    broker.takeOrder(sellOrder);
    broker.placeOrder();
  }
}
