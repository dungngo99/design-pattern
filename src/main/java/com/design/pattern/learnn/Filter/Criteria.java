package com.design.pattern.learnn.Filter;

import java.util.List;

public interface Criteria {
  public List<Person> criteria(List<Person> persons);
}
