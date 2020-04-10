package edu.lesson.threads.l9;

import java.util.concurrent.TimeUnit;

public class Eat implements Runnable {
    private Meal meal;

    public Eat(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                meal.waitForCook();
                System.out.println("i am eating");
                TimeUnit.MILLISECONDS.sleep(200);
                meal.eat();
//                TimeUnit.MILLISECONDS.sleep(200);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
