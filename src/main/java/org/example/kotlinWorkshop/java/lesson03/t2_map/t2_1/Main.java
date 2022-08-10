package org.example.kotlinWorkshop.java.lesson03.t2_map.t2_1;

import java.util.Map;

public class Main {

  public static void main(String[] args) {
    var classWithImmutableMap = new ClassWithImmutableMap(
        Map.of("some_key", "some_value", "another_key", "another_value")
    );

    classWithImmutableMap.getMap().put("another_key3", "anotherValue");

    //unreachable code
    System.out.println(classWithImmutableMap.getMap());
    System.out.println(classWithImmutableMap.getMap().get("some_key"));
  }
}
