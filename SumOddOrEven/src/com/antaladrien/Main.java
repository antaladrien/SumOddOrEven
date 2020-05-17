package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Sum odd or even between two number");
        System.out.println("Enter start number:");
        int num1 = myObj.nextInt();
        System.out.println("Enter end number:");
        int num2 = myObj.nextInt();
        System.out.println("Enter odd or even");
        String word = myObj.next();

        if (word.compareTo("odd") == 0) {
            System.out.println("Sum odd = " + sumOdd(num1, num2));
        } else if (word.compareTo("even") == 0) {
            System.out.println("Sum even = " + sumEven(num1, num2));
        } else {
            System.out.println("You wrote the wrong word");
        }
    }

    public static boolean isOdd(int num) {

        if ((num > 0) && (num % 2 != 0)) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

        if ((start < 0) || (end < 0) || (end < start)) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEven(int num) {

        if ((num > 0) && (num % 2 == 0)) {
            return true;
        }
        return false;
    }

    public static int sumEven(int start, int end) {

        int sum = 0;

        if ((start < 0) || (end < 0) || (end < start)) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isEven(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
