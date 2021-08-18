package pg_12953;

import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {

        Arrays.sort(arr);

        int numberLcm = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            numberLcm = lcm(numberLcm, arr[i]);
        }

        return numberLcm;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public int gcd(int a, int b) {
        int r = 0;

        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}