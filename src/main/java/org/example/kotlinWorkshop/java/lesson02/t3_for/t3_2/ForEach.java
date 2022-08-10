package org.example.kotlinWorkshop.java.lesson02.t3_for.t3_2;

import java.util.List;

public class ForEach {
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
