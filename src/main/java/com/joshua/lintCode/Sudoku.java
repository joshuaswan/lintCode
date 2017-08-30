package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/18.
 */
public class Sudoku {
    /*
 * @param board: the board
 * @return: whether the Sudoku is valid
 */
    public boolean isValidSudoku(char[][] board) {
        // write your code here
        if (!checkCube(board)) {
            return false;
        }
        if (!checkRow(board)) {
            return false;
        }
        if (!checkCol(board)) {
            return false;
        }
        return true;
    }

    public boolean checkCube(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int nineNumber[] = new int[9];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        nineNumber[k * 3 + l] = changeToNumber(board[i * 3 + k][j * 3 + l]);

                    }
                    System.out.println(nineNumber);
                }
                if (!checkNine(nineNumber)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board) {
        for (int i = 0; i < 9; i++) {

        }
        return true;
    }

    public boolean checkCol(char[][] board) {
        for (int i = 0; i < 9; i++) {

        }
        return true;
    }

    public boolean checkNine(int[] nine) {

        for (int i = 0; i < nine.length; i++) {
            int[] compare = nine;
            compare[i] = 0;
            for (int j = 0; j < compare.length; j++) {

            }
        }
        return true;
    }

    public int changeToNumber(char arg) {
        if (arg == '.') {
            return 0;
        }
        return Character.getNumericValue(arg);
    }
}
