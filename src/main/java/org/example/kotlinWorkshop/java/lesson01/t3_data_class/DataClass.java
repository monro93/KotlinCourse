package org.example.kotlinWorkshop.java.lesson01.t3_data_class;

import java.io.Serializable;
import java.util.Objects;

public class DataClass implements Serializable {
  private final int intProperty;
  private final String stringProperty;

  public DataClass(int intProperty, String stringProperty) {
    this.intProperty = intProperty;
    this.stringProperty = stringProperty;
  }

  public int getIntProperty() {
    return intProperty;
  }

  public String getStringProperty() {
    return stringProperty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataClass that = (DataClass) o;
    return intProperty == that.intProperty && stringProperty.equals(that.stringProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intProperty, stringProperty);
  }

  @Override
  public String toString() {
    return "CADataClass{" +
        "intProperty=" + intProperty +
        ", stringProperty='" + stringProperty + '\'' +
        '}';
  }
}
