package com.design.pattern.learnn.ChainResponsibility;

public class ChainDemoPattern {

  private static AbstractLogger getChainOfLoggers() {

    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    consoleLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(errorLogger);

    return consoleLogger;
  }

  public static void main(String[] args) {
    AbstractLogger startLogger = getChainOfLoggers();

    startLogger.logMessage(AbstractLogger.INFO, "This is an information.");
    
    System.out.println("");
    
    startLogger.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

    System.out.println("");
    
    startLogger.logMessage(AbstractLogger.ERROR, "this is an error level information.");
  }
}
