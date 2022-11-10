package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int index = 0; index < array.length; index++) {
            for (int cell = 0; cell < array[index].length; cell++) {
                if (array[index][cell] < 0) {
                    array[index][cell] = 0;
                }
            }
        }
        return array;
    }
}