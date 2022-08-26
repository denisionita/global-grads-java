package com.db.generics;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getAge() < o2.getAge()){
            return -1;
        }
        if(o1.getAge() > o2.getAge()){
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        Animal a1 = (Animal) obj;

        return false;
    }
}
