package edu.lesson.threads.l1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StaticCount implements Runnable {
    private static int count = 0;
    private final int id = count++;

    @Override
    public void run() {
        System.out.println("id: "+id);
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0; i<5; i++) {
            exec.execute(new StaticCount());
        }
        exec.shutdownNow();
    }
}

