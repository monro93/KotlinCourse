package org.example.kotlinWorkshop.java.lesson02.t5_null.t5_1;

public class NullChainOperator {
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

    public NullChainOperator(AnObject anObject) {
        this.anObject = anObject;
    }

    public AnObject getAnObject() {
        return anObject;
    }

    public String getAnObjectNameOrNull() {
        if(anObject == null || anObject.name == null) {
            return null;
        }
        return anObject.name;
    }
}
