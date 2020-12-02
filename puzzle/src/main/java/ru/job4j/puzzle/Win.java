package ru.job4j.puzzle;

public class Win {

     /*
    public static boolean checkHorizontal(int[][] board) {
        boolean rsl = true;
        for (int row = 0; row < board[row].length - 1; row++) {
            for (int cell = 0; cell < board.length - 1; cell++) {
                if (board[row][cell] != board[row][cell + 1]) {
                    rsl = false;
                }
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board) {
        boolean rsl = true;
        for (int cell = 0; cell < board[cell].length - 1; cell++) {
            for (int row = 0; row < board.length - 1; row++) {
                if (board[row][cell] != board[row + 1][cell]) {
                    rsl = false;
                }
            }
        }
        return rsl;
    }
     */

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int cell) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][cell] != 1) {
                result = false;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                rsl = true;
            }
        }
        return rsl;
    }
}