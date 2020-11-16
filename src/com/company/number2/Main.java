package com.company.number2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int h = readInt();
        char ch = 'a';
        printTriangle(h, ch);
    }

    private static int readInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input h = ");
        return sc.nextInt();
    }

    public static void printTriangle(int h, char ch) {
        for (int i = 1; i <= h; i++) {
            for (int count = 1; count <= i; count++) {
                System.out.print(ch);
                if (ch == 'a') {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.print("\n");

        }
    }
}

