package com.design.pattern.learnn.Bridge;

public class Circle extends Shape {

  private String x, y, r;

  public Circle(String x, String y, String r, DrawAPI drawAPI) {
    super(drawAPI);
    this.x = x;
    this.y = y;
    this.r = r;
  }

  @Override
  public void draw() {
    this.drawAPI.draw(this.x, this.y, this.r);
  }
}
