package com.tts;

import java.util.Scanner;

public class JavaLoops {
    Scanner scanner = new Scanner(System.in);
    public void loops() {
        int N = scanner.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            int sum = N * i;
            System.out.println(N + " x " + i + " = " + sum);
        }
    }
}
