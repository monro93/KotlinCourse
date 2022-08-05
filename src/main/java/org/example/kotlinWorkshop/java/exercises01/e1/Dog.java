package org.example.kotlinWorkshop.java.exercises01.e1;


import org.jetbrains.annotations.NotNull;

public class Dog extends Pet implements Digger {

  private final DogRace race;
  private String owner;

  public Dog(@NotNull DogIdentification dogIdentification, @NotNull DogRace race, @NotNull String owner) {
    super(dogIdentification.name());
    this.race = race;
    this.owner = owner;
  }

  @Override
  public void makeSound() {
    System.out.println("Bup bup bup");
  }

  @Override
  public void dig() {
    System.out.println("I'm digging");
  }

  public DogRace getRace() {
    return race;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  @Override
  public String toString() {
    return "I'm "+getName()+" from the race "+race.name()+" and my owner is "+owner;
  }
}
