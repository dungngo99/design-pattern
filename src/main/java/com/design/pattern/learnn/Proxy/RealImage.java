package com.design.pattern.learnn.Proxy;

public class RealImage implements Image {

  @Override
  public void display() {
    System.out.println("Show real image");
  }

}
