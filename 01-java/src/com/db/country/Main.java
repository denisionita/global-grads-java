package com.db.country;

import com.db.person.Person;
import com.db.person.Student;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        //com.db.person.Person person = new com.db.person.Person();
        //System.out.println("com.db.person.Person is: " + person);

        int a = 4;
        boolean isTrue = false;
        float height = (float) 3.141592653589793;
        double height2 =  3.141592653589793;
        System.out.println("Height is: " + height);
        System.out.println("Height is: " + height2);

        long b = 1234124123211231l;

        double c = 3;

        System.out.println(4 + 5);
        System.out.println(4 + -5);
        System.out.println(4 - 5);

        int d = 3;
        System.out.println(d++); //3
        System.out.println(++d);//5
        System.out.println(d);//5

        d-=2;// d = d - 2
        System.out.println(d);

        System.out.println(d >= 3);
        System.out.println(!(d >= 3));

        //operatori logici (de scurtcircuitare)
        isTrue = true;
        System.out.println(isTrue && (d==4));

        int x=5; //101
        int y=4; //100
        System.out.println(x&y);
        // 100

        // 101 << => 1010; 0 + 2 + 8
        System.out.println(5 << 2);

        final int INSTALL_OS = 1;
        final int INSTALL_DRIVERS = 2;
        final int INSTALL_OFFICE = 3;

        int whatToInstall = INSTALL_OS;

        switch (whatToInstall){
            case INSTALL_OS:
                System.out.println("Install OS");
                //break;
            case INSTALL_DRIVERS:
                System.out.println("Install drivers");
                break;
            case INSTALL_OFFICE:
                System.out.println("Install office");
                break;
        }

        for(int i=0; i<10; i++){

        }
        /*for(;;){
            //loop infinit
        }*/

        boolean stopMe = false;
        for(System.out.println("Only once");!stopMe; System.out.println("Hey"),System.out.println("Continuing")){
            System.out.println("Continuing");
            //Math.random(); // [0; 1)
            if(Math.random() < 0.5){
                stopMe = !stopMe;
            }
        }

        long[] myNumbers = new long[10];
        int nbOfNumbers = 0;
        while(nbOfNumbers < 5){
            myNumbers[nbOfNumbers++] = (long) (Math.random() *123412512312314l);
        }

        for(int i = 0; i< nbOfNumbers; i++) {
            System.out.println(myNumbers[i] + " ");
        }
        System.out.println(); // \n

        Person person1 = new Person("Vasile");
        System.out.println("com.db.person.Person: " + person1);
        System.out.println("Is sleeping? " + person1.isSleeping);
        person1.goToSleep();
        System.out.println("Is sleeping? " + person1.isSleeping());

        Person person2 = new Person("Gigel");

        System.out.println("No persons:  " + Person.NO_PERSONS); // e camp de clasa, il accesam cu numele clasei
        Person.showNoOfPersons();

        Student student1 = new Student("Popescu");
        System.out.println("Is sleeping? " + student1.isSleeping());
        student1.setSleeping(true);
        System.out.println("Is sleeping? " + student1.isSleeping());

        System.out.println("com.db.person.Student info: " + student1.toString());
        student1.setGrade(7.2f);
        System.out.println("com.db.person.Student grade: " +student1.getGrade());

    }
}
