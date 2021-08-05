package pg_12909;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                count++;
                continue;
            }

            count--;

            if (count < 0) {
                break;
            }
        }

        if (count != 0) {
            answer = false;
        }

        return answer;
    }
}