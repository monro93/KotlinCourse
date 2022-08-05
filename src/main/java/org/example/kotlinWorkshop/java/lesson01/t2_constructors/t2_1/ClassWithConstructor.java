package org.example.kotlinWorkshop.java.lesson01.t2_constructors.t2_1;

import org.jetbrains.annotations.NotNull;

public class ClassWithConstructor {
  private final int property1;
  @NotNull
  private String property2;

  public ClassWithConstructor(int property1, @NotNull String property2) {
    this.property1 = property1;
    this.property2 = property2;
  }
  //No setter on property1

  public int getProperty1() {
    return property1;
  }

  @NotNull
  public String getProperty2() {
    return property2;
  }

  public void setProperty2(@NotNull String property2) {
    this.property2 = property2;
  }
}
