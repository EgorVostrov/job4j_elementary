package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (char i = 0; i < word.length - 1; i++) {
            if (word[i] != post[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}