package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 00.1);

    }

    @Test
    public void when20to50then3() {
        double expected = 3;
        int x1 = 2;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 00.1);

    }

    @Test
    public void when82to20then6dot32() {
        double expected = 6.32f;
        int x1 = 8;
        int y1 = 2;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 00.1);
    }

    @Test
    public void when29to77then5dot38() {
        double expected = 5.38f;
        int x1 = 2;
        int y1 = 9;
        int x2 = 7;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 00.1);
    }
}


