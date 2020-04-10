package edu.lesson.threads.l10;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class LiftOffRunnerNo implements Runnable {
    private Queue<LiftOff> rockets;
    public LiftOffRunnerNo(Queue<LiftOff> queue) {
        this.rockets = queue;
    }
    public void add(LiftOff lo) {
//        try {
            rockets.add(lo);
//
//        } catch (InterruptedException e) {
//            System.out.println("Interrupting during put()");
//        }
    }

    @Override
    public void run() {
//        try {
            while (!Thread.interrupted()&&rockets.size()>0) {
                LiftOff rocket = rockets.poll();
                rocket.run();
            }
//        } catch (InterruptedException e) {
//            System.out.println("Waking from take()");
//        }
        System.out.println("Existing LiftOffRunner");
    }
}
