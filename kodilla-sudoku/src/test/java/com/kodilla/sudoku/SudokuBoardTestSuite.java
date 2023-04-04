package com.kodilla.sudoku;

import org.junit.jupiter.api.Test;

public class SudokuBoardTestSuite {

    @Test
    void testBoardPrint() {
        //Given
        SudokuBoard board = new SudokuBoard();

        //When & Then
        System.out.println(board);
    }
}
