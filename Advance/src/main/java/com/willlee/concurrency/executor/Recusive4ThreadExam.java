package com.willlee.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Recusive4ThreadExam {
    private final static int NUMBER = 10000000;

    public static void main(String[] args) throws InterruptedException {
        double[] array = new double[NUMBER];
        for (int i = 0; i < NUMBER; i++) {
            array[i] = i;
        }

        long startTime = System.currentTimeMillis();
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(new ArrayTask(array, 0, NUMBER / 4));
        service.execute(new ArrayTask(array, NUMBER / 4, NUMBER / 2));
        service.execute(new ArrayTask(array, NUMBER / 2, NUMBER * 3 / 4));
        service.execute(new ArrayTask(array, NUMBER * 3 / 4, NUMBER));
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
        long endTime = System.currentTimeMillis();
        System.out.println("Time span = " + (endTime - startTime));

    }
}

class ArrayTask implements Runnable {
    final double[] array;
    final int lo, hi;

    ArrayTask(double[] array, int lo, int hi) {
        this.array = array;
        this.lo = lo;
        this.hi = hi;
    }

    public void run() {
        for (int i = lo; i < hi; ++i)
            array[i] = Math.sin(array[i]) + Math.cos(array[i]) + Math.tan(array[i]);
    }
}
