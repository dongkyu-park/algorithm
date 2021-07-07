package pg_12934;

import java.lang.Math;

class SolutionOthers {
    public long solution(long n) {
        long answer = 0;

        double base = Math.sqrt(n);

        // x가 양의 정수가 아니라면(ex: 2의 제곱근 이라면 1.4142135623730951), 1로 나눈 나머지는 0보다 큰 숫자가 나오므로
        if (base % 1 > 0) {
            answer = -1;
        } else {
            answer = (long) Math.pow(base + 1, 2);
        }

        return answer;
    }
}
