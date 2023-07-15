package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Pet {

    private String name;

//    private ArrayList<Pet> pets = new ArrayList<Pet>();
//
//    public void addPet(Pet pet) {
//        this.pets.add(pets.size(),pet);
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return null;
    }


}
