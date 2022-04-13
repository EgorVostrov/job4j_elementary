package ru.job4j.loop;

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int b = 0; b <= i; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}