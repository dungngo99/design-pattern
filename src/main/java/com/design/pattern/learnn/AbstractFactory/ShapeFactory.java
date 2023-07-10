package com.design.pattern.learnn.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

  @Override
  public Shape getShape(String shape) {
    if (shape.equals("Rectangle")) {
      return new Rectangle();
    }
    return null;
  }
}
