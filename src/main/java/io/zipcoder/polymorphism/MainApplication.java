package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Pet> petList;
        int currentNum = 0;

        //Ask how many pest
        System.out.println("Hello, how many pets do you have?");
        int numOfPets = input.nextInt();
        petList = new ArrayList<>(numOfPets);


        //Ask what kind of pet
        while (currentNum < numOfPets) {
            System.out.printf("What kind of pet is pet number %d ", (currentNum +1));
            String petType = input.next().toLowerCase();


            switch (petType) {
                case "cat":
                    System.out.println("And what is the cat's names?");
                    String catName = input.next();

                    Cat cat = new Cat(catName);
                    petList.add(currentNum, cat);
                    currentNum ++;
                    break;

                case "dog":
                    System.out.println("And what is the dog's names?");
                    String dogName = input.next();

                    Dog dog = new Dog(dogName);
                    petList.add(currentNum, dog);
                    currentNum ++;
                    break;

                case "fish":
                    System.out.println("And what is the fish's names?");
                    String fishName = input.next();

                    Fish fish = new Fish(fishName);
                    petList.add(currentNum, fish);
                    currentNum ++;
                    break;
            }

        }

        int petNum = 0;
        for (Pet pets : petList) {

            System.out.printf("Pet number %s: Pet name: %d, and it says: %d ", petNum +1, pets.getName(), pets.speak());

            petNum++;
        }

    }
}
