package pg_12933;

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long[] arr = new long[String.valueOf(n).length()];

        long temp = 0;
        int count = 0;

        while (n > 0) {
            temp = n % 10;
            arr[count] = temp;
            n = n / 10;
            count++;
        }

        Arrays.sort(arr);

        String temp2 = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            temp2 += String.valueOf(arr[i]);
        }

        long answer = Long.parseLong(temp2);

        return answer;
    }
}