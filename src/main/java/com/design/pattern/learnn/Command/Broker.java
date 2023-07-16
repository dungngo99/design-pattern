package com.design.pattern.learnn.Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

  private List<Order> orderList;

  public Broker() {
    orderList = new ArrayList<>();
  }

  public void takeOrder(Order order) {
    orderList.add(order);
  }

  public void placeOrder() {
    orderList.forEach(order -> {
      order.execute();
    });
    orderList.clear();
  }
}
