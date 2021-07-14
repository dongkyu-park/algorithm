package pg_12925;

class Solution {
    public int solution(String s) {
        int answer = 0;

        boolean checkSign = true;

        if (s.charAt(0) == '-') {
            checkSign = false;
        }

        if (s.charAt(0) != '-' && s.charAt(0) != '+') {
            for (int i = 0; i < s.length(); i++) {
                char number = s.charAt(i);
                answer = answer * 10 + (number - '0');
            }
        } else {
            for (int i = 1; i < s.length(); i++) {
                char number = s.charAt(i);
                answer = answer * 10 + (number - '0');
            }
        }

        return checkSign ? answer : -1 * answer;
    }
}