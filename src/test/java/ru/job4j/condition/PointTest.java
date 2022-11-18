package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        point1.distance(point2);
        int expected = 2;
        assertThat(point2.distance(point1)).isEqualTo(expected);
    }
}