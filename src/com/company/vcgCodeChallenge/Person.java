package com.company.vcgCodeChallenge;


public class Person {
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String printName() {
        return "hello " + name;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Yinka");
        System.out.println(person1.printName());

    }

}
