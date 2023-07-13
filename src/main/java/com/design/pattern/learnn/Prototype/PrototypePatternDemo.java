package com.design.pattern.learnn.Prototype;

public class PrototypePatternDemo {
  public static void main(String[] args) {
    ShapeCache.createShape("1", "Circle");
    ShapeCache.createShape("2", "Rectangle");
    ShapeCache.createShape("3", "Square");
    Shape shape1 = ShapeCache.getShape("1");
    shape1.draw();
    Shape shape2 = ShapeCache.getShape("100");
    assert (shape2 == null);
  }
}
