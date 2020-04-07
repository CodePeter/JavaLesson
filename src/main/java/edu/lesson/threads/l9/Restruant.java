package edu.lesson.threads.l9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Restruant {
    public static void main(String[] args) throws InterruptedException {
        Meal meal = new Meal();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Cook(meal));
        exec.execute(new Eat(meal));
        TimeUnit.SECONDS.sleep(5);
        exec.shutdownNow();
    }
}
