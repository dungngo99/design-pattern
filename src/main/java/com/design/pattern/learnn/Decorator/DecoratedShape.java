package com.design.pattern.learnn.Decorator;

public abstract class DecoratedShape {
  private Shape originalShape;

  public DecoratedShape(Shape shape) {
    this.originalShape = shape;
  }

  public abstract void drawBorder();

  public Shape getOriginalShape() {
    return originalShape;
  }

  public void setOriginalShape(Shape originalShape) {
    this.originalShape = originalShape;
  }

}
