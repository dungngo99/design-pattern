package com.design.pattern.learnn.Singleton;

public class SingletonObject {

  private static final SingletonObject singleton = new SingletonObject();

  private SingletonObject() {
  }

  public static SingletonObject getInstance() {
    return singleton;
  }

  public void showMessage() {
    System.out.println("show message!");
  }
}
