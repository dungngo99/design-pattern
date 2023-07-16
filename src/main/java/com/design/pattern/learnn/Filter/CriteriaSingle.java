package com.design.pattern.learnn.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CriteriaSingle implements Criteria {

  @Override
  public List<Person> criteria(List<Person> persons) {
    List<Person> filteredPersons = new ArrayList<>();

    persons.forEach(p -> {
      if (Objects.nonNull(p) && p.getMaritalStatus().equals("Single")) {
        filteredPersons.add(p);
      }
    });

    return filteredPersons;
  }
}
