package com.company.adyen;

//class MyTask extends Thread{
//    @Override
//    public void run() {
//        for (int i = 1; i <= 15; i++) {
//            System.out.println("printing numbers....#" + i + " in child/worker thread");
//        }
//    }
//}

class MyTask implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("printing numbers....#" + i + " in child/worker thread");
        }
    }
}

class Printer {
    void printDocuments(int numberOfCopies, String documentName) {
        for (int i = 1; i <= numberOfCopies; i++) {
            System.out.println("printing " + documentName + " #" + i);
        }
    }
}

class MyThread extends Thread {

    Printer printerRef;
    
    @Override
    public void run() {

    }
}

public class Multithreading {
    //main thread
    public static void main(String[] args) {
        System.out.println("Application started.......");

//        MyTask task = new MyTask();
//        task.start();

//        Runnable runnable = new MyTask();
//        Thread thread1 = new Thread(runnable);
//        thread1.start();
        
        Thread thread1 = new Thread(new MyTask());
        thread1.start();

        for (int i = 1; i <= 15; i++) {
            System.out.println("printing numbers....#" + i + " in main thread");
        }


        System.out.println("Application finished.....");
    }
}
