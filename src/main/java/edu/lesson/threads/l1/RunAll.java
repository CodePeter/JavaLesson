package edu.lesson.threads.l1;

public class RunAll {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
//                            System.out.println("start ...");
                        }
                    }
                }, "cc-thread");
        t.start();
    }
}
