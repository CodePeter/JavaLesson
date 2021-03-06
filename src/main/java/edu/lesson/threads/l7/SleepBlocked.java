package edu.lesson.threads.l7;

import java.util.concurrent.TimeUnit;

public class SleepBlocked implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptionException");
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}
