package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int res = -1;
        for (int i = data[start - 1]; i <= data[finish - 1]; i++) {
            if (data[i - 1] != el) {
                res = i;
                break;
            }
        }
        return res;
    }
}