package edu.lesson.threads.l2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    public static void main(String[] args) {
        AtomicInteger a1 = new AtomicInteger(0);
        AtomicBoolean flag = new AtomicBoolean(true);

    }

    public static int incByOne(AtomicInteger a) {
        a.getAndIncrement();
        return a.get();
    }
}
