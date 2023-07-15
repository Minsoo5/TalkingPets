package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Hello, how many pets do you have?");
        int numOfPets = input.nextInt();

        System.out.println("And what are their names?");
        String petName = input.nextLine();

        Cat cat = new Cat();

        cat.setName("Lapis");

        System.out.println(cat.getName());

        System.out.println(cat.speak());


    }
}
