package org.example.kotlinWorkshop.java.lesson03.t2_map.t2_1;

import java.util.Map;

public class ClassWithImmutableMap {
  private Map<String, String> map;

  public ClassWithImmutableMap(Map<String, String> map) {
    this.map = map;
  }

  public Map<String, String> getMap() {
    return map;
  }
}
