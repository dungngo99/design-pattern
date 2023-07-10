package com.design.pattern.learnn.Factory;

public class ShapeFactory {
  public static Shape create(String type) {
    if (type.equals("Circle")) {
      return new Circle();
    } else if (type.equals("Square")) {
      return new Square();
    } else if (type.equals("Rectangle")) {
      return new Rectangle();
    }
    return null;
  }
}
