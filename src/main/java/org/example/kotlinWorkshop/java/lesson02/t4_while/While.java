package org.example.kotlinWorkshop.java.lesson02.t4_while;

public class While {

  public void whileLoop() {
    int x = 5;
    while (x > 0) {
      System.out.println(x);
      x--;
    }
  }


  public void doWhileLoop() {
    int x = 5;
    do {
      System.out.println(x);
      x--;
    } while (x > 0);
  }
}
