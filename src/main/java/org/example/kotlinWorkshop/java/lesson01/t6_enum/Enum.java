package org.example.kotlinWorkshop.java.lesson01.t6_enum;

public enum Enum {
  SOMETHING1(2), SOMETHING2(3);

  private final int property1;

  Enum(int property1) {
    this.property1 = property1;
  }

  public int getProperty1() {
    return property1;
  }
}
