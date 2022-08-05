package org.example.kotlinWorkshop.java.lesson01.t4_inheritance.t4_3;

public class InheritanceChild extends InheritanceOpenClass {
  private final String property2;

  public InheritanceChild(int property1, String property2) {
    super(property1);
    this.property2 = property2;
  }

  @Override
  public String getAnString() {
    return "This is implemented";
  }
}
