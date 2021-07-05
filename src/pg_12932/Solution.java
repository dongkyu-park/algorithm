package pg_12932;

class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        long temp = 0;
        int count = 0;

        while (n > 0) {
            temp = n % 10;
            answer[count] = (int) temp;
            n = n / 10;
            count++;
        }

        return answer;
    }
}