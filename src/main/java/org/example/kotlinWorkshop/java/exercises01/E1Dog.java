package org.example.kotlinWorkshop.java.exercises01;


import org.jetbrains.annotations.NotNull;

public class E1Dog extends E1Pet implements E1Digger {

  private final E1DogRace race;
  private String owner;

  public E1Dog(@NotNull E1DogIdentification e1DogIdentification, @NotNull E1DogRace race, @NotNull String owner) {
    super(e1DogIdentification.name());
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

  public E1DogRace getRace() {
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
