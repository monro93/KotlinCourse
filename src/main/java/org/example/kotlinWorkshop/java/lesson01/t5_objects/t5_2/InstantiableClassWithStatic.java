package org.example.kotlinWorkshop.java.lesson01.t5_objects.t5_2;

public class InstantiableClassWithStatic {
  private final int property1;

  public InstantiableClassWithStatic(int property1) {
    this.property1 = property1;
  }

  public static String AN_STRING = "an_string";

  public static void someStaticMethod() {
  }

  public int getProperty1() {
    return property1;
  }
}
