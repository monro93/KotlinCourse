package org.example.kotlinWorkshop.java.lesson03.t1_list.t1_1;

import java.util.List;

public class ClassWithImmutableList {
  private List<String> list;

  public ClassWithImmutableList(List<String> list) {
    this.list = list;
  }

  public List<String> getList() {
    return list;
  }
}
