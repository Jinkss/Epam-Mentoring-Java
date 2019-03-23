package com.epam.ekaterina_starodubova.java.lesson1.task2;

import java.util.Scanner;

public class StringWithLittleLength {
    public void findStringWithLengthLessThanAverage() {
        int countOfString = 5;
        int sumOfLength = 0;
        float averageOfLength = 0;
        String[] arrayString = new String[countOfString];
        Integer[] arrayStringLength = new Integer[countOfString];

        Scanner scannerString = new Scanner(System.in);

        for (int i = 0; i < countOfString; i++) {
            System.out.println("Введите строку  " + (i + 1));
            arrayString[i] = scannerString.nextLine();
            arrayStringLength[i] = arrayString[i].length();
            sumOfLength = arrayStringLength[i] + sumOfLength;
        }

        averageOfLength = (float) sumOfLength / countOfString;

        for (int i = 0; i < countOfString; i++) {
            if (arrayStringLength[i] < averageOfLength) {
                System.out.println("Строки с длиной меньше чем средняя " + arrayString[i] + " " + arrayStringLength[i]);
            }
        }
    }

}