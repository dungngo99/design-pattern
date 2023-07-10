package com.design.pattern.learnn.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
  @Override
  public Shape getShape(String shape) {
    if (shape.equals("RoundedRectangle")) {
      return new RoundedRectangle();
    } else if (shape.equals("RoundedSquare")) {
      return new RoundedSquare();
    }
    return null;
  }
  
}
