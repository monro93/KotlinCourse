package org.example.kotlinWorkshop.java.exercises01;

import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

public abstract class E1Pet {
  @NonNull
  private String name;

  public E1Pet(@NonNull String name) {
    this.name = name;
  }

  public abstract void makeSound();

  public @NotNull String getName() {
    return name;
  }
}
