package org.example.kotlinWorkshop.java.lesson02;

import java.util.List;

public class CBForEach {
  public void printAll(List<String> list) {
    for (String item: list) {
      System.out.println(item);
    }
  }

  public void printAllFunctional(List<String> list) {
    list.forEach((item) -> System.out.println(item));
  }

  public void printAllFunctional2(List<String> list) {
    list.forEach(System.out::println);
  }
}
