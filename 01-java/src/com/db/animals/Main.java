package com.db.animals;

public class Main {
    public static void main(String args[]){
        Pig pig = new Pig();
        pig.animalSound();

        Dog dog = new Dog();
        dog.animalSound();

        //Animal animal = new Animal();
        //animal.animalSound();

        Animal animal1 = new Pig();
        animal1.animalSound();

        Animal dirtyPig = new Pig();
        dirtyPig.animalSound();
        ((Pig)dirtyPig).playsInDirt(); // avem nevoie de cast

        Animal dirtyDog = new Dog();
        dirtyDog.animalSound();
        if(dirtyDog instanceof Pig) {
            ((Pig) dirtyDog).playsInDirt();
        }else{
            System.err.println("Dog cannot be cast to pig");
        }
    }
}
abstract class Animal implements Being{
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void lives(){
        System.out.println("...");

    }

    @Override
    public abstract void lives(int miliseconds);
}

class Pig extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void lives(int miliseconds) {

    }

    public void playsInDirt(){
        System.out.println("Plays in dirt");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    @Override
    public void lives(int miliseconds) {

    }
}

class Plant implements Being{

    @Override
    public void lives() {

    }

    @Override
    public void lives(int miliseconds) {

    }
}
interface Being{
    void lives();
    void lives(int miliseconds);
}