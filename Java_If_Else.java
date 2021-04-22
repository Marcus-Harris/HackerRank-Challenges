package com.tts;

import java.util.Scanner;

public class Java_If_Else {
    Scanner scanner = new Scanner(System.in);

    public void ifElse() {

        System.out.println("Enter a number and I'll tell you if it's weird or not.");
        int N = scanner.nextInt();
        String maybeWeird;

        if (N % 2 != 0) {
            maybeWeird = "Weird";
        } else if (N % 2 == 0 & N >= 2 && N <=5) {
            maybeWeird = "Not Weird";
        } else if (N % 2 == 0 & N >= 6 && N <=20) {
            maybeWeird = "Weird";
        } else if (N % 2 == 0 & N > 20){
            maybeWeird = "Not Weird";
        } else {
            maybeWeird = "Weird";
        }
        System.out.println(maybeWeird);
    }
}
