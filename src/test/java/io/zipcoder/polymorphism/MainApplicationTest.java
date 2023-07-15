package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
    @Test
    public void testMe(){}

    @Test
    public void getPetNameTest() {
        //Given
        Pet pet = new Pet();
        pet.setName("Tito");

        //When
        String actualDogName = "Tito";
        String expectedDogName = pet.getName();

        //Then
        Assert.assertEquals(expectedDogName, actualDogName);

    }

    @Test
    public void getCatNameTest() {
        //Given
        Cat cat = new Cat();
        cat.setName("Larry");

        //When
        String actualCatName = "Larry";
        String expectedCatName = cat.getName();

        //Then
        Assert.assertEquals(expectedCatName, actualCatName);

    }
    @Test
    public void getDogNameTest() {
        //Given
        Dog dog = new Dog();
        dog.setName("Spots");

        //When
        String actualDogName = "Spots";
        String expectedDogName = dog.getName();

        //Then
        Assert.assertEquals(expectedDogName, actualDogName);

    }
    @Test
    public void getFishNameTest() {
        //Given
        Dog dog = new Dog();
        dog.setName("Guppie");

        //When
        String actualFishName = "Guppie";
        String expectedFishName = dog.getName();

        //Then
        Assert.assertEquals(expectedFishName, actualFishName);

    }
    @Test
    public void setPetNameTest() {
        //Given
        Pet pet = new Pet("Tito");
        pet.setName("Moxy");

        //When
        String actualPetName = "Moxy";
        String expectedPetName = pet.getName();

        //Then
        Assert.assertEquals(expectedPetName, actualPetName);

    }

    @Test
    public void setCatNameTest() {
        //Given
        Cat cat = new Cat();
        cat.setName("Tabby");

        //When
        String actualCatName = "Tabby";
        String expectedCatName = cat.getName();

        //Then
        Assert.assertEquals(expectedCatName, actualCatName);

    }

    @Test
    public void setDogNameTest() {
        //Given
        Dog dog = new Dog();
        dog.setName("Snoopy");

        //When
        String actualDogName = "Snoopy";
        String expectedDogName = dog.getName();

        //Then
        Assert.assertEquals(expectedDogName, actualDogName);

    }
    @Test
    public void setFishNameTest() {
        //Given
        Fish fish = new Fish();
        fish.setName("Goldie");

        //When
        String actualFishName = "Goldie";
        String expectedFishName = fish.getName();

        //Then
        Assert.assertEquals(expectedFishName, actualFishName);

    }

    @Test
    public void petSpeakTest(){
        //Given
        Pet pet = new Pet();

        //When
        String actualPetSpeak = null;
        String expectedPetSpeak = pet.speak();

        //Then
        Assert.assertEquals(expectedPetSpeak, actualPetSpeak);

    }

    @Test
    public void catSpeakTest(){
        //Given
        Cat cat = new Cat();

        //When
        String actualCatSpeak = "Meow Meow";
        String expectedCatSpeak = cat.speak();

        //Then
        Assert.assertEquals(expectedCatSpeak, actualCatSpeak);

    }

    @Test
    public void dogSpeakTest(){
        //Given
        Dog dog = new Dog();

        //When
        String actualDogSpeak = "Bark Bark";
        String expectedDogSpeak = dog.speak();

        //Then
        Assert.assertEquals(expectedDogSpeak, actualDogSpeak);
    }

    @Test
    public void fishSpeakTest(){
        //Given
        Fish fish = new Fish();

        //When
        String actualFishSpeak = "Glug Glug";
        String expectedFishSpeak = fish.speak();

        //Then
        Assert.assertEquals(expectedFishSpeak, actualFishSpeak);
    }

}
