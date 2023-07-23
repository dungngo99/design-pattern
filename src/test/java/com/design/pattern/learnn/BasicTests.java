package com.design.pattern.learnn;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.design.pattern.learnn.UnitTest.Basics;
import com.design.pattern.learnn.UnitTest.Mocking;
import com.design.pattern.learnn.UnitTest.User;

@ExtendWith(MockitoExtension.class)
public class BasicTests {
  @Test
  public void compare() {
    int val = Basics.compare(3, 1);
    Assertions.assertEquals(val, 1);
  }

  @Test
  public void sortIntArray() {
    int[] arrays = new int[] { 5, 8, 3, 9, 1, 6 };
    Basics.sortIntArray(arrays);
    Assertions.assertArrayEquals(arrays, new int[] { 1, 3, 5, 6, 8, 9 });
  }

  @Mock
  User user;
  
  @Test
  @DisplayName("permission assigned successfully")
  public void assignPermissions() {
    Mocking mocking = new Mocking();
    mocking.setUser(user);
    when(user.getRole()).thenReturn("admin");
    Assertions.assertEquals(1, mocking.assignPermission());
  }

}
