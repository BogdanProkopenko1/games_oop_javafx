package ru.job4j.puzzle;

public class Win {

    //По горизонтали
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

    //По вертикали
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
 }
