package io.zipcoder.polymorphism;

public class Dog extends Pet {


    public Dog(){}

    public Dog(String name){
        this.setName(name);

    }
    public String speak() {
        return "Bark Bark";
    }
}
