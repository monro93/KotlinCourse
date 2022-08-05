package org.example.kotlinWorkshop.java.lesson01.t4_inheritance.t4_1;

abstract class InheritanceParent {
  protected int property1;

  public InheritanceParent(int property1) {
    this.property1 = property1;
  }

  abstract String getAnString();
}
