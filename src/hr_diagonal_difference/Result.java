package hr_diagonal_difference;

import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diagonalLeftToRight = 0;
        int diagonalRightToLeft = 0;

        for (int i = 0, j = 0, k = arr.size() - 1; i < arr.size(); i++, j++, k--) {
            diagonalLeftToRight += arr.get(i).get(j);
            diagonalRightToLeft += arr.get(i).get(k);
        }

        return Math.abs(diagonalLeftToRight - diagonalRightToLeft);
    }
}