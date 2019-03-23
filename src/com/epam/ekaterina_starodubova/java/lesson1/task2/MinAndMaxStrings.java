package com.epam.ekaterina_starodubova.java.lesson1.task2;

import java.io.IOException;
import java.util.Scanner;

public class MinAndMaxStrings {
    public void findMinAndMaxStrings() throws IOException {

        int countOfString = 5;
        Scanner scannerString = new Scanner(System.in);

        int minLength = 0;
        String minString = null;
        int maxLength = 0;
        String maxString = null;

        for (int i = 0; i < countOfString; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            String currentString = scannerString.nextLine();

            if (i == 0) {
                minString = currentString;
                minLength = currentString.length();
            }
            if (currentString.length() < minLength) {
                minLength = currentString.length();
                minString = currentString;
            }
            if (currentString.length() > maxLength) {
                maxLength = currentString.length();
                maxString = currentString;
            }
        }

        System.out.println("Min string is - " + minString + " with length - " + minLength);
        System.out.println("Max string is - " + maxString + " with length - " + maxLength);
    }
}
