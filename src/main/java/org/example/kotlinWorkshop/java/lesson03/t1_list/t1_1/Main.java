package org.example.kotlinWorkshop.java.lesson03.t1_list.t1_1;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    var classWithImmutableList = new ClassWithImmutableList(List.of("something"));

    classWithImmutableList.getList().add("potato");

    //unreachable code
    System.out.println(classWithImmutableList.getList());
  }
}
