
package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int index = 0; index < size; index++) {
            for (int i = 0; i < size; i++) {
                result[index][i] = (1 + index) * (1 + i);
            }
        }
        return result;
    }
}