package com.epam.ekaterina_starodubova.java.lesson1.task1;

public class ChangeNegativeByZero {
    public void changeNegativeByZeroNumber() {
        int[] arrayOfNumbers = GenerateArray.generateArray();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < 0) {
                arrayOfNumbers[i] = 0;
            }
        }

        for (Integer number: arrayOfNumbers) {
            System.out.print(number + " ");
        }
    }

}
