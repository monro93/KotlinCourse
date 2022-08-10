package org.example.kotlinWorkshop.java.lesson03.t2_map.t2_2;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    var classWithMutableMap = new ClassWithMutableMap(
        new HashMap<>(Map.of("some_key", "some_value", "another_key", "another_value"))
    );

    classWithMutableMap.getMap().put("another_key3", "anotherValue");

    System.out.println(classWithMutableMap.getMap());
    System.out.println(classWithMutableMap.getMap().get("some_key"));
  }
}
