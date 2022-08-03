package org.example.kotlinWorkshop.java.lesson01;

public class DAInheritanceChild extends DAInheritanceParent {

  private final String property2;

  public DAInheritanceChild(int property1, String property2) {
    super(property1);
    this.property2 = property2;
  }

  @Override
  String getAnString() {
    return property2;
  }
}