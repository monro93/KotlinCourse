package org.example.kotlinWorkshop.java.lesson01.t3_data_class;

import java.io.Serializable;

public record DataClassV3(int intProperty, String stringProperty) implements Serializable {
}
