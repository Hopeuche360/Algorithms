package com.company.adyen;

public class BankApp {
    int total = 100;

     synchronized void withdrawn(String name, int withdrawal) {

        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                    + withdrawal);
            total = total - withdrawal;

            System.out.println("balance after withdrawal " + total);

        } else {

            System.out.println(name
                    + " you can not withdraw "
                    + withdrawal);
            System.out.println("your balance is: " + total);

        }
    }

    synchronized void deposit(String name, int deposit) {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                + total);
    }

    public static void main(String[] args) {
        BankApp obj = new BankApp();

        ThreadWithdrawal t1
                = new ThreadWithdrawal(obj, "Arnab", 20);
        ThreadWithdrawal t2
                = new ThreadWithdrawal(obj, "Monodwip", 40);
        ThreadDeposit t3
                = new ThreadDeposit(obj, "Mukta", 35);
        ThreadWithdrawal t4
                = new ThreadWithdrawal(obj, "Rinkel", 80);
        ThreadWithdrawal t5
                = new ThreadWithdrawal(obj, "Shubham", 40);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
    class ThreadWithdrawal extends Thread {

        BankApp object;
        String name;
        int dollar;

        // Constructor of this method
        ThreadWithdrawal(BankApp ob, String name, int money)
        {
            this.object = ob;
            this.name = name;
            this.dollar = money;
        }

        // run() method for thread
        public void run() { object.withdrawn(name, dollar); }
    }

    class ThreadDeposit extends Thread {

        BankApp object;
        String name;
        int dollar;
        ThreadDeposit(BankApp ob, String name, int money)
        {
            this.object = ob;
            this.name = name;
            this.dollar = money;
        }

        public void run() {
            object.deposit(name, dollar);
        }
    }


