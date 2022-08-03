package org.example.kotlinWorkshop.java.lesson01;

abstract class DAInheritanceParent {
  protected int property1;

  public DAInheritanceParent(int property1) {
    this.property1 = property1;
  }

  abstract String getAnString();
}
