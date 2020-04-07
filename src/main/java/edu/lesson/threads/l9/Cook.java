package edu.lesson.threads.l9;

import java.util.concurrent.TimeUnit;

public class Cook implements Runnable {
    private Meal meal;
    public Cook(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                System.out.println("i am cooking");
                TimeUnit.MILLISECONDS.sleep(200);
                meal.cook();
                meal.waitForEat();

            }
        } catch (InterruptedException e) {

        }
    }
}
