package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int switcher;

        System.out.println("Chose which exercise to run: 1/2/3/4/5");

        Scanner in = new Scanner(System.in);
        switcher = in.nextInt();

        switch (switcher) {
            case 1:
                ex1();
                break;
            case 2:
                ex2();
                break;
            case 3:
                ex3();
                break;
            case 4:
                ex4();
                break;
            case 5:
                ex5();
                break;
            default:
                System.out.println("No such exercise!");
                break;
        }
    }

    // EX.1
    private static void ex1() {
        long result = 0;

        System.out.println("EX.1: Add up all the integer numbers from 1 to 1000000");
        for (int i = 1; i <= 100000; i++) {
            result += i;
        }
        System.out.printf("Result: %d%n", result);
    }

    //EX.2
    private static void ex2() {
        int a;
        int b;
        int c;

        System.out.println("EX.2: Check if given segments can form a triangle");
        System.out.println("Please input variables, to check if You can make triangle out of them (a,b,c)");

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        in.close();

        if (((a + b) > c)
                && ((a + c) > b)
                && ((b + c) > a)) {
            System.out.println("That variables can form a triangle");
        } else {
            System.out.println("That variables can't form a triangle");
        }
    }

    //EX.3
    private static void ex3() {
        int result = 0;
        double product;

        System.out.println("EX.3 Find such numbers, in range 1:100, that fulfills such condition: a^2+b^2=c^2");
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                product = Math.sqrt(b * b + a * a);
                if (product <= 100
                        && product >= 1
                        && product == (int) product) {
                    result++;
                }
            }
        }
        System.out.printf("There are: %d such numbers%n", result);
    }

    //EX.4
    private static void ex4() {
        String minutesFormatted;
        int hours;
        int minutes;
        int minutesIncrement;
        int timeCalculated;

        System.out.println("EX.4: Create time calculator, to add up given minutes to given current time");
        System.out.println("Input numbers as follows : hour, minutes, increment in minutes");

        Scanner in = new Scanner(System.in);
        hours = in.nextInt();
        minutes = in.nextInt();
        minutesIncrement = in.nextInt();
        in.close();

        timeCalculated = hours * 60 + minutes + minutesIncrement;

        if ((timeCalculated % 60) <= 9) {
            minutesFormatted = "0" + timeCalculated % 60;
        } else {
            minutesFormatted = Integer.toString(timeCalculated % 60);
        }
        if ((timeCalculated / 60) >= 25) {
            timeCalculated -= 24 * 60;
        }
        System.out.printf("It is: %d:%d, in %d minutes it will be %d:%s%n", hours, minutes,
                minutesIncrement, timeCalculated / 60, minutesFormatted);
    }

    //EX.5 aka "Chinczyk"
    private static void ex5() {
        Random generator = new Random();
        int playerAPosition = 1;
        int playerBPosition = 1;

        System.out.println("EX.5: write simple board game simulator aka Ludo");
        while (playerAPosition < 1000 && playerBPosition < 1000) {
            playerAPosition += generator.nextInt(6) + 1;
            if (playerBPosition == playerAPosition) {
                playerBPosition = 1;
            }
            playerBPosition += generator.nextInt(6) + 1;
            if (playerAPosition == playerBPosition) {
                playerAPosition = 1;
            }
        }
        if (playerAPosition >= 1000) {
            System.out.println("Player A won!");
        } else {
            System.out.println("Player B won!");
        }
    }
}
