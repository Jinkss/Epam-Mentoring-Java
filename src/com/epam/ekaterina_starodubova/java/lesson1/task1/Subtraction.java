package com.epam.ekaterina_starodubova.java.lesson1.task1;

public class Subtraction {
    public void subtractionBetween() {
        int[] arrayNumbers = GenerateArray.generateArray();
        int sum = 0;
        int min = 10;

        for (int i = 0; i < arrayNumbers.length; i++) {
            sum = arrayNumbers[i] + sum;

            if(i == 0) {
                min = arrayNumbers[i];
            }
            else {
                if (arrayNumbers[i] < min) {
                    min = arrayNumbers[i];
                }
            }
        }

        float average = (float) sum / arrayNumbers.length;
        float sub = average- min;
        System.out.print(sub + " ");
    }

}
