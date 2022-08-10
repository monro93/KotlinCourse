package org.example.kotlinWorkshop.java.lesson03.t2_map.t2_2;

import java.util.Map;

public class ClassWithMutableMap {
  private Map<String, String> map;

  public ClassWithMutableMap(Map<String, String> map) {
    this.map = map;
  }

  public Map<String, String> getMap() {
    return map;
  }
}
