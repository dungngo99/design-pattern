package com.design.pattern.learnn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BasicTaskTest {

  @Autowired
  private LearnnApplication learnnApplication;

  @Test
  public void contextLoads() throws Exception {
    assert (learnnApplication != null);
  }

  @ParameterizedTest
  @ValueSource(strings = {"abc", "def"})
  public void parameterizedTest(String source) throws Exception {
    assert (source.equals("abc") || source.equals("def"));
  }

  
}