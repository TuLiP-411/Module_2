package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch test = new StopWatch();
        test.start();
        double sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        test.stop();
        System.out.println("Elapsed time: " + test.getElapsedTime());
    }
}
