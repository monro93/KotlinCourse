package org.example.kotlinWorkshop.java.lesson03.t1_list.t1_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    var classWithImmutableList = new ClassWithMutableList(new ArrayList<>(List.of("something")));

    classWithImmutableList.getList().add("potato");

    System.out.println(classWithImmutableList.getList());
  }
}
