package io.zipcoder.polymorphism;

public class Fish extends Pet {

    public Fish(){}

    public Fish(String name) {
        this.setName(name);

    }

    public String speak() {
        return "Glug Glug";
    }
}
