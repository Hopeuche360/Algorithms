package com.company.medium;

import lombok.Data;


public class Person {
    //attributes or variables
    String name;
    int age;

    //methods that define behaviors
    public void speak(){
        System.out.println("I can talk");
    }
    public void move() {
        System.out.println("I can move");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        //create an object of class Person called person1
        Person person1 = new Person();

        //define its attributes and methods
        person1.setName("John Doe");
        person1.setAge(22);
        person1.speak();
        person1.move();

        System.out.println(person1);
    }
}
