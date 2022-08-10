package org.example.kotlinWorkshop.java.lesson02.t5_null.t5_2;

import org.jetbrains.annotations.NotNull;

public class NullCoalesceOperator {
    private class AnObject {
        private String name;

        public AnObject(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private AnObject anObject;

    public NullCoalesceOperator(AnObject anObject) {
        this.anObject = anObject;
    }

    public AnObject getAnObject() {
        return anObject;
    }

    @NotNull
    public String getAnObjectNameOrDefault() {
        if(anObject == null || anObject.name == null) {
            return "default";
        }
        return anObject.name;
    }
}
