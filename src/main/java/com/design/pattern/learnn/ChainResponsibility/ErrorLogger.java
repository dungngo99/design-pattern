package com.design.pattern.learnn.ChainResponsibility;

public class ErrorLogger extends AbstractLogger {

  public ErrorLogger(int level) {
    this.level = level;
  }

  @Override
  public void write(String message) {
    System.out.println("Error console::logger: " + message);
  }
}
