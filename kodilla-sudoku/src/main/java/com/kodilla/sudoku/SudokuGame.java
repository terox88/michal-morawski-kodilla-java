package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuGame {
    private SudokuBoard board;
    private final ConsoleHandler handler;
    private List<BackupBoard> backtrack = new ArrayList<>();

    public SudokuGame() {
        this.board = new SudokuBoard();
        this.handler = new ConsoleHandler();
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public void setBoard(SudokuBoard board) {
        this.board = board;
    }

    public boolean setTheBoard(List<SudokuData> data) {

        if (data.isEmpty()) {
            return false;
        } else {
            for (SudokuData sudoku : data) {
                board.getBoard().get(sudoku.getY() - 1).getSudokuRow().set(sudoku.getX() - 1, new SudokuElement(sudoku.getValue()));
            }
            return true;
        }
    }

    public boolean checkRows() throws CanotResolveSudokuException {
        boolean result = false;
        for (int y = 0; y < board.getBoard().size(); y++) {
            for (int x = 0; x < board.getBoard().size(); x++) {
                if (board.getBoard().get(y).getSudokuRow().get(x).getValue() == -1) {
                    for (SudokuElement element : board.getBoard().get(y).getSudokuRow()) {
                        if (element.getValue() != -1 && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().contains(element.getValue()) && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().size() > 1) {
                            board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().remove(Integer.valueOf(element.getValue()));
                            result = true;
                        }else if (element.getValue() != -1 && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().size() == 1) {
                                if (board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().contains(element.getValue())) {
                                    throw new CanotResolveSudokuException();
                                }

                        }
                    }
                    board.getBoard().get(y).getSudokuRow().get(x).enterValue();
                    result = true;
                } else {
                    for (SudokuElement element : board.getBoard().get(y).getSudokuRow()) {
                        if(board.getBoard().get(y).getSudokuRow().get(x).getValue() == element.getValue() && board.getBoard().get(y).getSudokuRow().get(x) != element) {
                            throw new CanotResolveSudokuException();
                        }
                    }
                }
                    }
                }
        return result;
    }

    public boolean checkColumns() throws CanotResolveSudokuException {
        boolean result = false;
        for (int y = 0; y < board.getBoard().size(); y++) {
            for (int x = 0; x < board.getBoard().size(); x++) {
                if (board.getBoard().get(y).getSudokuRow().get(x).getValue() == -1) {
                    for (int i = 0; i < board.getBoard().size(); i++) {
                        SudokuElement element = board.getBoard().get(i).getSudokuRow().get(x);
                        if (element.getValue() != -1 && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().contains(element.getValue()) && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().size() > 1) {
                            board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().remove(Integer.valueOf(element.getValue()));
                            result = true;
                        } else if (element.getValue() != -1 && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().size() == 1) {
                            if (element.getValue() == board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().get(0)) {
                                throw new CanotResolveSudokuException();

                            }
                        }
                    }
                    board.getBoard().get(y).getSudokuRow().get(x).enterValue();
                    result = true;
                } else  {
                    for (int i = 0; i < board.getBoard().size(); i++) {
                        SudokuElement element = board.getBoard().get(i).getSudokuRow().get(x);
                        if (board.getBoard().get(y).getSudokuRow().get(x).getValue() == element.getValue() && board.getBoard().get(y).getSudokuRow().get(x) != element) {
                            throw new CanotResolveSudokuException();
                        }

                    }
                }
            }

        }
        return result;
    }

    public boolean fieldCheck(int beginX, int beginY) throws CanotResolveSudokuException {
        boolean result = false;
        for (int y = beginY; y < beginY + 3; y++) {
            for (int x = beginY; x < beginX + 3; x++) {
                if (board.getBoard().get(y).getSudokuRow().get(x).getValue() == -1) {
                    for (int i = beginY; i < beginY + 3; i++) {
                        for (int j = beginX; j < beginX + 3; j++) {
                            SudokuElement element = board.getBoard().get(i).getSudokuRow().get(j);
                            if (element.getValue() != -1 && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().contains(element.getValue()) && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().size() > 1) {
                                board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().remove(Integer.valueOf(element.getValue()));
                                result = true;
                            } else if (element.getValue() != -1 && board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().size() == 1) {
                                if (element.getValue() == board.getBoard().get(y).getSudokuRow().get(x).getPossibleNumbers().get(0)) {
                                    throw new CanotResolveSudokuException();
                                }
                            }
                        }
                    }
                    board.getBoard().get(y).getSudokuRow().get(x).enterValue();
                    result = true;
                } else {
                    for (int i = beginY; i < beginY + 3; i++) {
                        for (int j = beginX; j < beginX + 3; j++) {
                            SudokuElement element = board.getBoard().get(i).getSudokuRow().get(j);
                            if (board.getBoard().get(y).getSudokuRow().get(x).getValue() == element.getValue() && board.getBoard().get(y).getSudokuRow().get(x) != element) {
                                throw new CanotResolveSudokuException();
                            }

                        }

                    }
                }

            }
        }
        return result;
    }
}

