package pg_12921;

class Solution {
    public int solution(int n) {
        int answer = 0;

        boolean check = false;
        for (int i = 2; i <= n; i++) {

            int a = (int) Math.sqrt(i);

            for (int j = 2; j <= a; j++) {
                if (i % j == 0) {
                    check = true;
                    break;
                }
            }

            if (check) {
                check = false;
                continue;
            }
            answer++;
        }

        return answer;
    }
}