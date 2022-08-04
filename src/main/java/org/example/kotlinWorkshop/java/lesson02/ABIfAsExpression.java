package org.example.kotlinWorkshop.java.lesson02;

public class ABIfAsExpression {

  int value;
  public void assignBigger(int first, int second) {
    if(first > second) {
      value = first;
    } else {
      value = second;
    }
  }
}
