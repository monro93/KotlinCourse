package org.example.kotlinWorkshop.java.lesson02.t1_if.t1_2;

public class IfAsExpression {

  int value;
  public void assignBigger(int first, int second) {
    if(first > second) {
      value = first;
    } else {
      value = second;
    }
  }
}
