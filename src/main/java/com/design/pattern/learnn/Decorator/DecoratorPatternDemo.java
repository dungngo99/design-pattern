package com.design.pattern.learnn.Decorator;

public class DecoratorPatternDemo {

  public static void main(String[] args) {
    Shape circle = new Circle();
    circle.draw();

    Shape square = new Square();
    square.draw();

    DecoratedShape decoratedRedBorder = new DecoratedRedBorder(circle);
    decoratedRedBorder.drawBorder();
  }
}
