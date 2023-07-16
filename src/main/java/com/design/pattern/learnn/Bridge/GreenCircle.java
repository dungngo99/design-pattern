package com.design.pattern.learnn.Bridge;

public class GreenCircle implements DrawAPI {

  @Override
  public void draw(String x, String y, String r) {
    System.out.println(String.format("Green circle: x=%s; y=%s; r=%s", x, y, r));
  }
}
