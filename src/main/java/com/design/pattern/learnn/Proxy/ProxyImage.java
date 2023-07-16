package com.design.pattern.learnn.Proxy;

public class ProxyImage implements Image {

  private Image realImage;

  public ProxyImage(Image realImage) {
    this.realImage = realImage;
  }

  @Override
  public void display() {
    this.realImage.display();
  }
}
