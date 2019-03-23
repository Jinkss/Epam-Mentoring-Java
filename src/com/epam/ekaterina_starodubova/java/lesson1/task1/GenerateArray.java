package com.epam.ekaterina_starodubova.java.lesson1.task1;

public class GenerateArray {

    public static int[] generateArray() {
        int[] arrayOfIntegerNumber = new int[20];
        for (int i = 0; i < arrayOfIntegerNumber.length; i++) {
            arrayOfIntegerNumber[i] = generateRandomNumber();
            System.out.print(arrayOfIntegerNumber[i] + " ");
        }
        System.out.println();
        return arrayOfIntegerNumber;
    }

    private static int generateRandomNumber() {
        int min = -10;
        int max = 10;
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
}
