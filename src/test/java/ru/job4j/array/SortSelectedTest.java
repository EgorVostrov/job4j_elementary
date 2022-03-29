package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArray1f3elements() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArray0f5elements() {
        int[] data = new int[] {3, 4, 1, 0, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 3, 4, 6};
        Assert.assertArrayEquals(expected, result);
    }
}