package com.design.pattern.learnn.Filter;

import java.util.List;

public class AndCriteria implements Criteria{

  private Criteria criteria;
  private Criteria anotherCriteria;
  
  public AndCriteria(Criteria criteria, Criteria anotherCcriteria) {
    this.criteria = criteria;
  }

  @Override
  public List<Person> criteria(List<Person> persons) {
    List<Person> filteredPersons = criteria.criteria(persons);
    filteredPersons = anotherCriteria.criteria(filteredPersons);

    return filteredPersons;
  }
}
