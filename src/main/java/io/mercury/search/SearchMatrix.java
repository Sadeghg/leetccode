package io.mercury.search;

public class SearchMatrix {
    public boolean solutionOne(int[][] matrix, int target) {
        int lastItem = matrix[0].length -1;
        int bottom = matrix.length -1;
        int top = 0;

        while (top <= bottom){
            int row = (top +bottom) /2;

            if (target < matrix[row][0])
                bottom = row -1;
            else if (target > matrix[row][lastItem])
                top = row +1;
            else
                break;
        }

        if (top > bottom) return false;

        int rowIndex =  (top +bottom) /2;
        int left = 0;
        int right = lastItem;
        while (left <= right){
            int middle = (left +right) /2;

            if (target > matrix[rowIndex][middle])
                left = middle +1;
            else if (target < matrix[rowIndex][middle])
                right = middle -1;
            else
                return true;
        }
        return false;
    }
}
