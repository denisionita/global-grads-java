package com.db.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Shelter {
    protected String name;
    protected Account account;
    protected LinkedList<Animal> animals;
    protected TreeSet<Animal> animalTreeSet;
    protected float latitude;
    protected float longitude;
    protected String owner;

    public Shelter(String name) {
        this(name, ""); // apelam constructorul care contine name si owner

    }

    public Shelter(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.animals = new LinkedList<>();
        this.animalTreeSet = new TreeSet<>(new AnimalAgeComparator());

    }

    public void showAnimals(){
        System.out.println("Linked list: ");
        for(int i=0;i<animals.size();i++){
            System.out.println(animals.get(i) +", ");
        }

        System.out.println("Tree set: ");
        Iterator<Animal> iterator = animalTreeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() +", ");

        }
    }


}
