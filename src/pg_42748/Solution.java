package pg_42748;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] resultArr = new int[commands.length];

        for (int i = 0 ; i < commands.length; i++) {
            int a = commands[i][0] - 1;
            int b = commands[i][1];
            int k = commands[i][2] - 1;

            int[] tempArr = Arrays.copyOfRange(array, a, b);
            Arrays.sort(tempArr);
            resultArr[i] = tempArr[k];
        }

        return resultArr;
    }
}