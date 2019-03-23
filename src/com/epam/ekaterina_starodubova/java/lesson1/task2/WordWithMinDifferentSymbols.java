package com.epam.ekaterina_starodubova.java.lesson1.task2;

import java.util.Scanner;

public class WordWithMinDifferentSymbols {
    public void findWordWithMinDifferentSymbols() {

        System.out.println("Введите слова");
        Scanner scanner = new Scanner(System.in);
        String currentString = scanner.nextLine();
        String delimeter = " ";

        String[] arrayOfWord = currentString.split(delimeter);
        int countUniq = 0;

        for (int j = 0; j < arrayOfWord.length; j++) {
            boolean[] isItThere = new boolean[Character.MAX_VALUE];

            for (int i = 0; i < arrayOfWord[j].length(); i++) {
                isItThere[arrayOfWord[j].charAt(i)] = true;
            }
            int count = 0;

            for (int k = 0; k < isItThere.length; k++) {
                if (isItThere[k] == true) {
                    count++;
                }
            }

            if (j == 0) {
                countUniq = count;
            }
            if (count < countUniq ) {
                countUniq = count;
            }
        }

        System.out.println("Word with min count " + countUniq);

    }
}
