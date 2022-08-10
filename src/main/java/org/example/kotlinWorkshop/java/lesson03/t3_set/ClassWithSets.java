package org.example.kotlinWorkshop.java.lesson03.t3_set;

import java.util.HashSet;
import java.util.Set;

public class ClassWithSets {
  private Set<String> immutableSet;
  private Set<String> mutableSet;

  public ClassWithSets() {
    immutableSet = Set.of("hi", "hello");
    mutableSet = new HashSet<>(Set.of("hi", "hello"));


    mutableSet.add("hi");
    immutableSet.add("hi");
  }
}
