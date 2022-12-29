package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {

    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        point1.distance(point2);
        int expected = 2;
        assertThat(point2.distance(point1)).isEqualTo(expected);
    }

    @Test
    public void when00to100then10() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(10, 0);
        point1.distance(point2);
        int expected = 10;
        assertThat(point2.distance(point1)).isEqualTo(expected);
    }

    @Test
    public void when10to40then3() {

        Point point1 = new Point(1, 0);
        Point point2 = new Point(4, 0);
        point1.distance(point2);
        int expected = 3;
        assertThat(point2.distance(point1)).isEqualTo(expected);
    }

    @Test
    public void when21To20To11Then412() {
        Point point1 = new Point(2, 1);
        Point point2 = new Point(2, 0);
        Point point3 = new Point(1, 1);
        point1.distance3d(point2);
        double expected = 4.12;
        assertThat(point2.distance3d(point1)).isEqualTo(expected, offset(0.01));
    }
}