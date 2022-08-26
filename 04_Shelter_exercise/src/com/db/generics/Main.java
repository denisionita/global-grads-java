package com.db.generics;

public class Main {

    public static void main(String[] args) {
        Shelter dogShelter = new DogShelter("Dog shelter 1");
        if(dogShelter instanceof DogShelter){

            ((DogShelter)dogShelter).addDog(new Animal<>("dog 1", 12));
            ((DogShelter)dogShelter).addDog(new Animal<>("dog 1", 27));
            ((DogShelter)dogShelter).addDog(new Animal<>("dog 1", 13));

            dogShelter.showAnimals();

        }

    }
}
