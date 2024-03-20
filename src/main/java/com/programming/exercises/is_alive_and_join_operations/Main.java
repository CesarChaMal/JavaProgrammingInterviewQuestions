package com.programming.exercises.is_alive_and_join_operations;

class DemoThread extends Thread {

    public DemoThread(String name) {
        super(name);
        setPriority(MAX_PRIORITY);
    }
}

class DemoThread2 extends Thread {

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count);
            count++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        DemoThread t = new DemoThread("Thread 1");

        System.out.println("ID " + t.getId());
        System.out.println("NAME " + t.getName());
        System.out.println("PRIORITY " + t.getPriority());
        t.start();
        System.out.println("STATE " + t.getState());
        System.out.println("ALIVE " + t.isAlive());

        DemoThread2 t2 = new DemoThread2();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }

        t2.setDaemon(true);
        t2.start();
        // t2.interrupt();

        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join(); // Now main will not terminate till the daemon thread is terminated
        } catch (Exception e) {

        }
    }
} 