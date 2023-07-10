package com.design.pattern.learnn.Singleton;

public class SingletonDemo {
  public static void main(String[] agrs) {
    SingletonObject object = SingletonObject.getInstance();
    object.showMessage();
  }
}
