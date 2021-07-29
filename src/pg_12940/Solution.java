package pg_12940;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }

            // 두 자연수의 곱 = 최대 공약수 x 최소 공배수
            answer[1] = m * n / answer[0];

        }

        return answer;
    }
}