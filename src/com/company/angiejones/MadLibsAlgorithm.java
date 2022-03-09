package com.company.angiejones;

import java.util.Scanner;

public class MadLibsAlgorithm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // get the season of the year from user
        System.out.println("Enter a season of the year");
        String season = scanner.nextLine();

        // get a whole number from user
        System.out.println("Enter a Whole Number");
        int wholeNumber = scanner.nextInt();

        // get an adjective from the user
        System.out.println("Enter an adjective");
        String adjective = scanner.nextLine();

        // close scanner
        scanner.close();
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee");
    }
}
