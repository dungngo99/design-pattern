package com.design.pattern.learnn.Prototype;

public class Circle extends Shape {
  
  public Circle() {
    super.setType("Circle");
  }

  @Override
  public void draw() {
    System.out.println("Circle");
  }
}
