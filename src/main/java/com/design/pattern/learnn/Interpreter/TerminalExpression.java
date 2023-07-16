package com.design.pattern.learnn.Interpreter;

public class TerminalExpression implements Expression {
  
  private String key;

  public TerminalExpression(String key) {
    this.key = key;
  }

  @Override
  public boolean interpret(String context) {
    return context.contains(this.key);
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
