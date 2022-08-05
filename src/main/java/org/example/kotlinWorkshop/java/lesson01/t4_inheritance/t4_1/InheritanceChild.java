package org.example.kotlinWorkshop.java.lesson01.t4_inheritance.t4_1;

public class InheritanceChild extends InheritanceParent {

  private final String property2;

  public InheritanceChild(int property1, String property2) {
    super(property1);
    this.property2 = property2;
  }

  @Override
  String getAnString() {
    return property2;
  }
}