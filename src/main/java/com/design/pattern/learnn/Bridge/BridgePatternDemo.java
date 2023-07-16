package com.design.pattern.learnn.Bridge;

public class BridgePatternDemo {

  public static void main(String[] args) {
    Shape greenCircle = new Circle("1", "2", "3", new GreenCircle());
    greenCircle.draw();

    Shape redCircle = new Circle("3", "4", "5", new RedCircle());
    redCircle.draw();
  }
}