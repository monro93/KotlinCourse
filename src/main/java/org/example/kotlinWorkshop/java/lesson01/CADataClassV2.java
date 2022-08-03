package org.example.kotlinWorkshop.java.lesson01;

import java.io.Serializable;
import lombok.Value;

@Value
public class CADataClassV2 implements Serializable {
  int intProperty;
  String stringProperty;
}
