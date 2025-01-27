package org.example.designpattern.builderdesignpattern.prejava8;

public class Employee {

    private final int id;
   private final  String name;
    private final  String title;

    public Employee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.title = builder.title;
    }

    public String toString(){
        return this.name + " "+ this.id+" "+ this.title;
    }

    public static class Builder {

        private int id;
        private String name;
        private String category;
        private String title;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder text(String text) {
            this.name = name;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
