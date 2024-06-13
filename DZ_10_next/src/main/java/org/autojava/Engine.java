package org.autojava;

public class Engine {
    public static void main(String[] args) {
        // Create threads using the Thread class
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        // Create threads using the Runnable interface
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        Thread thread3 = new Thread(myRunnable1);
        Thread thread4 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
