package org.example.kotlinWorkshop.java.lesson02.t2_when;

public class Switch {
  //classic java
  public void printAOn123Bon4AndCOn569OrXOtherwiseClassic(int number) {
    switch (number) {
      case 1,2,3:
        System.out.println("A");
      break;
      case 4:
        System.out.println("B");
        break;
      case 5,6,9:
        System.out.println("C");
        break;
      default:
        System.out.println("X");
        break;
    }
  }

  //Java 13
  public void printAOOn123Bon4AndCOOn569OrXOOtherwiseModern(int number) {
    switch (number) {
      case 1, 2, 3 -> System.out.println("A");
      case 4 -> System.out.println("B");
      case 5, 6, 9 -> System.out.println("C");
      default -> System.out.println("X");
    }
  }
}
