package com.example;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println("Result: " + result);

        String unusedVariable = "SonarQube";

        if (result == 30) {
            System.out.println("Correct result");
        }

        if (true) {
            System.out.println("This condition is always true");
        }

        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("x is smaller");
        } else {
            System.out.println("This will never execute");
        }

        divide(10, 0);
    }
}
