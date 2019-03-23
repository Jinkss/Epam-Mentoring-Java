package com.epam.ekaterina_starodubova.java.lesson1.task1;

public class ChangeMaxNegativeAndMinPositive {

    public void changeMaxNegativeAndMinPositive() {
        int[] arrayOfNumbers = GenerateArray.generateArray();

        int maxNegative = 0;
        int maxNegativeOrderNumber = 0;
        int minPositive = 0;
        int minPositiveOrderNumber = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < 0) {
                if (maxNegative == 0) {
                    maxNegative = arrayOfNumbers[i];
                    maxNegativeOrderNumber = i;
                }

                if(maxNegative > arrayOfNumbers[i]) {
                    maxNegative = arrayOfNumbers[i];
                    maxNegativeOrderNumber = i;
                }
            }

            if (arrayOfNumbers[i] > 0) {
                if (minPositive == 0) {
                    minPositive = arrayOfNumbers[i];
                    minPositiveOrderNumber = i;
                }

                if(minPositive > arrayOfNumbers[i]) {
                    minPositive = arrayOfNumbers[i];
                    minPositiveOrderNumber = i;
                }
            }
        }

        int temp = arrayOfNumbers[maxNegativeOrderNumber];
        arrayOfNumbers[maxNegativeOrderNumber] = arrayOfNumbers[minPositiveOrderNumber];
        arrayOfNumbers[minPositiveOrderNumber] = temp;

        for (Integer number: arrayOfNumbers) {
            System.out.print(number + " ");
        }
    }



}
