package com.timo;

import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {

        long t1 = System.currentTimeMillis();

        // Version 1: create string from a char array.
        for (int i = 0; i < 100000000; i++) {
            char[] array = new char[10];
            for (int v = 0; v < 10; v++) {
                array[v] = '?';
            }
            String result = new String(array);
        }

        long t2 = System.currentTimeMillis();

        // Version 2: create string from a StringBuilder.
        for (int i = 0; i < 100000000; i++) {
            StringBuilder builder = new StringBuilder();
            for (int v = 0; v < 10; v++) {
                builder.append('?');
            }
            String result = builder.toString();
        }

        long t3 = System.currentTimeMillis();

        // ... Benchmark timings.
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }
}
