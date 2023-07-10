package com.design.pattern.learnn.AbstractFactory;

public class FactoryProducer {

  public static AbstractFactory getFactory(String factory) {
    if (factory.equals("ShapeFactory")) {
      return new ShapeFactory();
    } else if (factory.equals("RoundedShapeFactory")) {
      return new RoundedShapeFactory();
    }
    return null;
  }
}
