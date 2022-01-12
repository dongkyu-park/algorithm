package leet_7;

public class Solution {
    public int reverse(int x) {
        long answer = 0;

        while (x != 0) {
            answer *= 10;
            answer += x % 10; // 더하는 작업을 후 순위로 두어야 마지막 값이 1의 자리로 들어간다.
            x /= 10;
        }

        if (Integer.MIN_VALUE <= answer && answer <= Integer.MAX_VALUE) {
            return (int) answer;
        }

        return 0;
    }
}
