package pg_12954;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long sum = (long)x;
        long plus = (long)x;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = sum;
            sum += plus;
        }

        return answer;
    }
}