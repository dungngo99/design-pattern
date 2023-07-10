
package com.design.pattern.learnn.AbstractFactory;

public class AbstractFactoryPatternDemo {
  public static void main(String[] args) {
    AbstractFactory factory1 = FactoryProducer.getFactory("ShapeFactory");
    assert (factory1 != null);
    Shape shape1 = factory1.getShape("Rectangle");
    assert (shape1 != null);
    shape1.draw();
    Shape shape2 = factory1.getShape("RoundedRectangle");
    assert (shape2 == null);
  }
}