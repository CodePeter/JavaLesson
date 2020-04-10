package edu.lesson.threads.l10;

import java.util.concurrent.BlockingQueue;

public class LiftOffRunner implements Runnable {
    private BlockingQueue<LiftOff> rockets;
    public LiftOffRunner (BlockingQueue<LiftOff> queue) {
        this.rockets = queue;
    }
    public void add(LiftOff lo) {
        try {
            rockets.put(lo);

        } catch (InterruptedException e) {
            System.out.println("Interrupting during put()");
        }
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                LiftOff rocket = rockets.take();
                rocket.run();
            }
        } catch (InterruptedException e) {
            System.out.println("Waking from take()");
        }
        System.out.println("Existing LiftOffRunner");
    }
}
