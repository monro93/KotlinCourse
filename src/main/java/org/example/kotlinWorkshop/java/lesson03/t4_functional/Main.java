package org.example.kotlinWorkshop.java.lesson03.t4_functional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    var list = List.of("apple", "pear", "peach", "banana", "watermelon");

    System.out.println("get the ones starting by p:");
    System.out.println(list.stream().filter(it -> it.startsWith("p")).toList());

    System.out.println("get the last one starting by p:");
    var newList = list.stream().filter(it -> it.startsWith("p")).toList();
    System.out.println(newList.get(newList.size()-1));

    System.out.println("get the first starting by y or null:");
    var newList2 = list.stream().filter(it -> it.startsWith("y")).toList();
    System.out.println(newList2.size() > 0 ? newList2.get(0) : null);

    System.out.println("New list with 'I like ' as a prefix");
    System.out.println(list.stream().map(it -> "I like "+it).toList());

    System.out.println("New list with the length of the words");
    System.out.println(list.stream().map(String::length).toList());

    System.out.println("New map with the length of the words and the name");
    System.out.println(list.stream().collect(Collectors.toMap(Function.identity(), String::length)));
  }
}
