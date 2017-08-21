package com.joshua.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/18.
 */
public class SudokuTest {
    @Test
    public void isValidSudoku() throws Exception {
        Sudoku sudoku = new Sudoku();
        String[] resource = {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
        char[][] board = new char[9][9];
        for (int i=0;i<resource.length;i++){
            board[i] = resource[i].toCharArray();
        }
        sudoku.isValidSudoku(board);
    }

}