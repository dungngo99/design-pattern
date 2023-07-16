package com.design.pattern.learnn.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CriteriaFemale implements Criteria{
  @Override
  public List<Person> criteria(List<Person> persons) {
    List<Person> filteredPerson = new ArrayList<>();
    persons.forEach(p -> {
      if (Objects.nonNull(p) && p.getGender().equals("Female")) {
        filteredPerson.add(p);
      }
    });
    return filteredPerson;
  }
}
