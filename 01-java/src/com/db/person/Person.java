package com.db.person;

public class Person extends Creature{
    String name;
    private int age;
    float height;
    public boolean isSleeping;
    public static long NO_PERSONS = 0;

    public Person(){
        System.out.println("Inside no params com.db.person.Person constructor");
    }

    public Person(String name) { // constructor
        this.name = name;
        this.isSleeping = false;
        Person.NO_PERSONS++;
        System.out.println("Inside com.db.person.Person constructor");

    }



    public void goToSleep() {
        this.isSleeping=true;
    }

    void wakeUp(){
        this.isSleeping = false;
    }

    public static void showNoOfPersons() {
        System.out.println("No of persons: " + NO_PERSONS);
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
