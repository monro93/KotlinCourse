package org.example.kotlinWorkshop.java.lesson01.t2_constructors.t2_4;

import org.jetbrains.annotations.NotNull;

public class ClassWithComplexConstructor {
  private final int property1;
  @NotNull
  private String property2;

  public ClassWithComplexConstructor(int property1, @NotNull String property2) {
    this.property1 = property1 + 5;
    this.property2 = property2;
  }

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
