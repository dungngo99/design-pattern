package com.design.pattern.learnn.UnitTest;

import java.util.List;

public class User {
  private String user;
  private String password;
  private String role;
  private List<String> posts;

  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public List<String> getPosts() {
    return posts;
  }
  public void setPosts(List<String> posts) {
    this.posts = posts;
  }
}
