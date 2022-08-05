package org.example.kotlinWorkshop.java.lesson01.t3_data_class;

import java.io.Serializable;
import lombok.Value;

@Value
public class DataClassV2 implements Serializable {
  int intProperty;
  String stringProperty;
}
