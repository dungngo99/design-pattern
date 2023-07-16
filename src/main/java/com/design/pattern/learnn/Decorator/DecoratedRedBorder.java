package com.design.pattern.learnn.Decorator;

public class DecoratedRedBorder extends DecoratedShape {

  public DecoratedRedBorder(Shape shape) {
    super(shape);
  }

  @Override
  public void drawBorder() {
    super.getOriginalShape().draw();
    System.out.println("Draw red border");
  }
}
