package io.mercury.backtracking;

import java.util.HashSet;
import java.util.Set;

public class WorldSearch {



    private static char [][] BOARD;
    private static String WORD;
    private static int ROW;
    private static int COL;
    private static Set<String> PATH = new HashSet<>();

    public static void main(String[] args) {
        char [][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E' ,'E'}
        };
        String word = "ABCCED";
        boolean exists = exist(board, word);
    }
    public static boolean exist(char[][] board, String word) {
        BOARD = board;
        WORD = word;
        ROW = board.length;
        COL = board[0].length;
        for (int i = 0; i < ROW; i ++){
            for (int j = 0; j < COL; j ++){
                if (backtrack(i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean backtrack(
            int row,
            int col,
            int index
    ){
        boolean result = false;
        if (index == WORD.length()){
            return true;
        }

        String position = row + "," + col;
        if (row < 0 || col < 0
                        || row >= ROW
                        || col >= COL
                        || WORD.charAt(index) != BOARD[row][col]
                        || PATH.contains(position)
        ){
            return false;
        }
        PATH.add(position);
        result = backtrack(
                row + 1,
                col,
                index + 1
        ) ||
                backtrack(
                        row - 1,
                        col,
                        index + 1
                ) ||
                backtrack(
                        row,
                        col + 1,
                        index + 1
                ) ||
                backtrack(row,
                        col - 1,
                        index + 1
                );
        PATH.remove(position);
        return result;
    }
}
