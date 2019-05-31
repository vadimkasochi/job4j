package ru.job4j.Array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {

        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] == data[i + 1][i + 1]) {
                leftDiagonal++;
            }
            if (data[data.length - 1][data.length - 1] == data[data.length - 1 - i][data.length - 1 - i]) {
                rightDiagonal++;
            }
        }
        return leftDiagonal == data.length - 1 || rightDiagonal == data.length - 1;
    }
}

    