package pg_12899;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int temp = (n - 1) % 3;

            if (temp == 0) {
                answer.insert(0, "1");
            }
            if (temp == 1) {
                answer.insert(0, "2");
            }
            if (temp == 2) {
                answer.insert(0, "4");
            }

            n = (n - 1) / 3;
        }
        return answer.toString();
    }
}