package com.design.pattern.learnn.Proxy;

public class ProxyPatternDemo {

  public static void main(String[] args) {
    Image realImage = new RealImage();
    realImage.display();

    Image proxyImage = new ProxyImage(realImage);
    proxyImage.display();
  }
}
