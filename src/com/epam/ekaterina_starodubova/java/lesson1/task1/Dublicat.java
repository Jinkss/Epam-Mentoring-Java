package com.epam.ekaterina_starodubova.java.lesson1.task1;

public class Dublicat {
    public void dublicat() {
        int[] arrayOfNumbers = GenerateArray.generateArray();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if ((arrayOfNumbers[i] == arrayOfNumbers[j]) && (i % 2 != 0) && (j % 2 != 0)) {
                    System.out.print(arrayOfNumbers[i] + " ");
                }
            }
        }
    }


}
