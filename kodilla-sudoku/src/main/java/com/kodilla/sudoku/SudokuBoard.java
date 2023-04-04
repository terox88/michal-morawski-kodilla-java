package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final List<SudokuRow> board = new ArrayList<>();
    public final static int BOARD_SIZE = 9;

    public SudokuBoard() {
        for(int i = 0; i < BOARD_SIZE; i++) {
            board.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getBoard() {
        return board;
    }

    @Override
    public String toString() {
        String result = "";
        for (SudokuRow row : board ) {
            result += "|";
            for(SudokuElement element : row.getSudokuRow()) {
                if(element.getValue() == -1) {
                    result += "   ";
                } else {
                    result += element.getValue();
                }
                result +="|";
            }
            result += "\n-------------------------------------\n";
        }
        return result;
    }
}
