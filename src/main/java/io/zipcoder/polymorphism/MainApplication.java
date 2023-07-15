package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Hello, how many pets do you have?");
        input.nextLine();


        Cat cat = new Cat();

        cat.setName("Lapis");

        System.out.println(cat.getName());

        System.out.println(cat.speak());


    }
}
