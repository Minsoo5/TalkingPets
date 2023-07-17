package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(){}

    public Cat(String name) {
        this.setName(name);
    }

    public String speak() {
        return "Meow Meow";
    }
}
