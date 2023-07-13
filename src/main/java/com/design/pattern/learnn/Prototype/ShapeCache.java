package com.design.pattern.learnn.Prototype;

import java.util.Hashtable;

public class ShapeCache {
  
  private static Hashtable<String, Shape> cache = new Hashtable<>();

  public static Shape getShape(String id) {
    if (cache.containsKey(id)) {
      Shape shape = cache.get(id);
      return (Shape) shape.clone();
    }
    return null;
  }

  public static void createShape(String id, String type) {
    if (cache.containsKey(id)) {
      return;
    }

    Shape newShape;
    if (type.equals("Circle")) {
      newShape = new Circle();
    } else if (type.equals("Rectangle")) {
      newShape = new Rectangle();
    } else if (type.equals("Square")) {
      newShape = new Square();
    } else {
      return;
    }
    cache.put(id, newShape);
  }
}
