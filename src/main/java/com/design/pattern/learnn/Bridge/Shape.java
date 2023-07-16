package com.design.pattern.learnn.Bridge;

public abstract class Shape {
  protected DrawAPI drawAPI;

  public Shape(DrawAPI drawAPI) {
    this.drawAPI = drawAPI;
  }

  public abstract void draw();
}
