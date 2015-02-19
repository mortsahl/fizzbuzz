package com.company;

public class Main {

    public static void main(String[] args) {

        final int START = 1;
        final int END = 100;

        int count = START;

        while (count <= END) {
            if (count % 3 == 0 && count % 5 != 0) {
                System.out.println("fizz");
            } else if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (count % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(count);
            }
            count++;
        }
    }
}
