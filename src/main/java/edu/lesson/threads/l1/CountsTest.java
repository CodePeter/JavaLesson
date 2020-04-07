package edu.lesson.threads.l1;

public class CountsTest {




    public static void main(String[] args) {
        final Counter counter = new Counter();
        for (int i=0; i<5; i++) {
            Thread t = new Thread(() -> {
//                counter.incByOne();
                counter.incByOneSafe();
//                try {
//                    counter.incByOneSafe();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.print(counter.getCount());
            }, "thread:"+i);
            t.start();
            System.out.println("  name:"+t.getName());
        }
    }

    public static int increase(int counter) {
        for (int i=0; i<100; i++) counter++;
        return counter;
    }
}
