package org.example.kotlinWorkshop.java.lesson03.t1_list.t1_2;

import java.util.List;

public class ClassWithMutableList {
  private List<String> list;

  public ClassWithMutableList(List<String> list) {
    this.list = list;
  }

  public List<String> getList() {
    return list;
  }
}
