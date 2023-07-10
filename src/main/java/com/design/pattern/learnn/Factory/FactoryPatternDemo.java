package com.design.pattern.learnn.Factory;

public class FactoryPatternDemo {

  public static void main(String[] agrs) {
    Shape shape1 = ShapeFactory.create("Circle");
    shape1.draw();

    Shape shape2 = ShapeFactory.create("Square");
    shape2.draw();

    Shape shape3 = ShapeFactory.create("alo");
    assert (shape3 == null);
  }
  
}
