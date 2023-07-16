package com.design.pattern.learnn.Interpreter;

public class InterpreterPatternDemo {

  public static Expression getMaleExpression() {
    Expression rob = new TerminalExpression("rob");
    Expression jo = new TerminalExpression("jo");
    return new OrExpression(rob, jo);
  }

  public static Expression getMarriedWomanExpression() {
    Expression jul = new TerminalExpression("jul");
    Expression married = new TerminalExpression("married");
    return new AndExpression(jul, married);
  }

  public static void main(String[] args) {
    Expression isMale = getMaleExpression();
    Expression isMarriedWoman = getMarriedWomanExpression();

    System.out.println("jo male? " + isMale.interpret("jo"));
    System.out.println("jul married? " + isMarriedWoman.interpret("jul and married"));
  }
}
