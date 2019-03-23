package com.epam.ekaterina_starodubova.java.lesson1.task1;

public class TriplePositiveBeforeNegative {
    public void TriplePositive() {
        int[] arrayOfNumbers = GenerateArray.generateArray();

        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            if (arrayOfNumbers[i + 1] < 0 && arrayOfNumbers[i] > 0) {
                arrayOfNumbers[i] = arrayOfNumbers[i] * 3;
            }
        }

        for (Integer number : arrayOfNumbers) {
            System.out.print(number + " ");
        }
    }
}
