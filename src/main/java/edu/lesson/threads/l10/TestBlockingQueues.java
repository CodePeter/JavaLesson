package edu.lesson.threads.l10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class TestBlockingQueues {
    static void getKey() {
        try {
            new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void getKey(String message) {
        System.out.println(message);
//        getKey();
    }
    static void test(String message, BlockingQueue<LiftOff> queue) throws InterruptedException {
        System.out.println(message);
        LiftOffRunner runner = new LiftOffRunner(queue);
        Thread t = new Thread(runner);
        t.start();
        for (int i=0; i<5; i++) {
            runner.add(new LiftOff(5));
        }
        getKey("Press 'Enter' ("+message+")");
        TimeUnit.SECONDS.sleep(5);
        t.interrupt();
        System.out.println("Finished " + message+" test");
    }
    static void test(String message, Queue<LiftOff> queue) throws InterruptedException {
        System.out.println(message);
        LiftOffRunnerNo runner = new LiftOffRunnerNo(queue);
        Thread t = new Thread(runner);
        t.start();
        for (int i=0; i<5; i++) {
            runner.add(new LiftOff(5));
        }
        getKey("Press 'Enter' ("+message+")");
        TimeUnit.SECONDS.sleep(5);
        t.interrupt();
        System.out.println("Finished " + message+" test");
    }

    public static void main(String[] args) throws InterruptedException {
//        test("ArrayBlockQueue", new ArrayBlockingQueue<>(3));
//        Queue在没有数据的时候被访问,无法被挂起
//        test("LinkedList", new LinkedList<>());
    }
}
