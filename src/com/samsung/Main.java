package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "";
        int c;
        while (!str1.equals("exit")) {
            int a = in.nextInt();
            int b = in.nextInt();
            str1 = in.next();
            switch (str1) {
                case "+":
                    c = a + b;
                    System.out.println(c);
                    break;
                case "-":
                    c = a - b;
                    System.out.println(c);
                    break;
                case "*":
                    c = a * b;
                    System.out.println(c);
                    break;
                case "/":
                    c = a / b;
                    System.out.println(c);
                    break;
                case "^":
                    c = (int) Math.pow(a, b);
                    System.out.println(c);
                    break;
                case "%":
                    c = a % b;
                    System.out.println(c);
                    break;
            }
            System.out.println("Go ahead");
            if (str1.equals("exit")) break;
        }
    }
}
