package com.design.pattern.learnn.UnitTest;

public class Mocking {
  User user;

  public void setUser(User user) {
    this.user = user;
  }

  public int assignPermission() {
    if (user.getRole().equals("admin")) {
      return 1;
    }
    return -1;    
  }
}
