package com.company.vcgCodeChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int compare(Employee emp1, Employee emp2) {
        int flag = emp1.getName().compareTo(emp2.getName());
        if (flag == 0) {
            flag = emp1.getAge() - emp2.getAge();
        }
        return flag;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Obinna", 28);
        Employee emp2 = new Employee("Obinna", 31);

        System.out.println(compare(emp1, emp2));
    }
}
