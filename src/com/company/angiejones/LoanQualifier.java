package com.company.angiejones;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] args) {
        // initialise what we know
        int requiredSalary = 30000;
        int requiredNumberOfYearsAtCurrentJob = 2;

        // get what we don't know
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your current salary");
        double employeeSalary = scanner.nextDouble();

        System.out.println("Enter how many years you have been at your current job");
        double numberOfYearsAtCurrentJob = scanner.nextDouble();


        // make decision
        if (employeeSalary >= requiredSalary) {
            if (numberOfYearsAtCurrentJob >= requiredNumberOfYearsAtCurrentJob) {
                System.out.println("Congratulations, you qualified for the loan");
            } else {
                System.out.println("You need to work for at least " + requiredNumberOfYearsAtCurrentJob + " to qualify");
            }
        } else {
            System.out.println("You need to make at least " + requiredSalary + " to qualify");
        }
    }
}
