package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMono2() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '},
        };
        int column = 1;
        boolean result = MatrixCheck.monoHorizontal(input, column);
        Assert.assertFalse(result);
    }

}


