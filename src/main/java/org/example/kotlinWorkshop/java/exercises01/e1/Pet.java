package org.example.kotlinWorkshop.java.exercises01.e1;

import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

public abstract class Pet {
  @NonNull
  private String name;

  public Pet(@NonNull String name) {
    this.name = name;
  }

  public abstract void makeSound();

  public @NotNull String getName() {
    return name;
  }
}
