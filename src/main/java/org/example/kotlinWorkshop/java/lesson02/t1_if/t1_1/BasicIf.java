package org.example.kotlinWorkshop.java.lesson02.t1_if.t1_1;

public class BasicIf {
  public void whoIsBigger(int first, int second) {
    if(first > second) {
      System.out.println("first is bigger");
    } else if (first == second) {
      System.out.println("Numbers are equal");
    } else {
      System.out.println("second is bigger");
    }
  }
}
