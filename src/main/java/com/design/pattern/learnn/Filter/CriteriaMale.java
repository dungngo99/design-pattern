package com.design.pattern.learnn.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CriteriaMale implements Criteria{
  
  @Override
  public List<Person> criteria(List<Person> persons) {
    List<Person> filteredPersons = new ArrayList<>();
    persons.forEach(p -> {
      if (Objects.nonNull(p) && p.getGender().equals("male")) {
        filteredPersons.add(p);
      }
    });

    return persons;
  }
}
