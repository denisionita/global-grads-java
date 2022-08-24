package com.db.person;

public class Student extends Person{

    private float grade;

    public Student(){
        super();
        System.out.println("Inside no params com.db.person.Student constructor");

    }

    public Student(String name) {
        super(name);
        System.out.println("Inside com.db.person.Student constructor");

    }

    public Student(float grade){
       // super();
        this.grade = grade;
        System.out.println("Inside com.db.person.Student grade constructor");
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "com.db.person.Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", grade=" + grade +
                '}';
    }
}
