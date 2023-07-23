package com.design.pattern.learnn.UnitTest;

import java.util.Arrays;

public class Basics {
  public static int compare(int n1, int n2) {
    if (n1 > n2)
      return 1;
    return -1;
  }

  public static void sortIntArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arrays = new int[] { 5, 8, 3, 9, 1, 6 };
    Basics.sortIntArray(arrays);
  }
}
