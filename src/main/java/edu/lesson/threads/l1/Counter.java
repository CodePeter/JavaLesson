package edu.lesson.threads.l1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private int count = 0;
    private AtomicInteger countSafe = new AtomicInteger(0);
    private Integer countWrap = new Integer(0);

    public int incByOne() {
//        int count = 0;
        for(int i=0; i<100000; i++) count++;
        System.out.println(count);
        return count;
    }

    public int incByOneWrap() {
//        int count = 0;
        for(int i=0; i<100000; i++) countWrap++;
        System.out.println(countWrap);
        return countWrap;
    }

    public AtomicInteger incByOneSafe() {
//        AtomicInteger countSafe = new AtomicInteger(0);

        for(int i=0; i<100000; i++) countSafe.getAndIncrement();
//        Thread.sleep(100);
        System.out.println(countSafe);
        return countSafe;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
