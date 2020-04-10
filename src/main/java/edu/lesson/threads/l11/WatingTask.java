package edu.lesson.threads.l11;

import java.util.concurrent.CountDownLatch;

public class WatingTask implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final CountDownLatch latch;
    public WatingTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String toString() {
        return String.format("WaitingTask %1$-3d ", id);
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println("Latch barrier passed for "+this);

        } catch (InterruptedException e) {
            System.out.println(this+" interrupted");
        }

    }
}
