package com.epam.ekaterina_starodubova.java.lesson1.task1;

public class SumOfEvenNumbers {

    public void sumOfEven() {
        int[] arrayofNumbers = GenerateArray.generateArray();
        int sum = 0;

        for (int i = 0; i < arrayofNumbers.length; i++) {
            if (i % 2 != 0) {
                sum = arrayofNumbers[i] + sum;
            }
        }
        System.out.println();
        System.out.println(sum);
    }

}
