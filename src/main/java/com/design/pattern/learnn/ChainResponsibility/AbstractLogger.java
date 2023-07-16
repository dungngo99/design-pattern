package com.design.pattern.learnn.ChainResponsibility;

public abstract class AbstractLogger {
  public static final int INFO = 1;
  public static final int DEBUG = 2;
  public static final int ERROR = 3;

  protected int level;

  protected AbstractLogger nextLogger;

  public void setNextLogger(AbstractLogger nextLogger) {
    this.nextLogger = nextLogger;
  }

  public void logMessage(int maxLevel, String message) {
    if (this.level <= maxLevel) {
      write(message);
    }
    if (nextLogger != null) {
      // go from start to end but stop writing message at maxLevel
      nextLogger.logMessage(maxLevel, message);
    }
  }

  abstract protected void write(String message);
}
