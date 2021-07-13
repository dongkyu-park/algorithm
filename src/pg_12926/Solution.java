package pg_12926;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int temp = 0;

        for (int i = 0; i < s.length(); i++) {

            temp = s.charAt(i) + n;

            if (s.charAt(i) == (' ' + 0)) {
                temp = ' ' + 0;
            } else if (s.charAt(i) >= ('A' + 0) && s.charAt(i) <= ('Z' + 0)) {
                if (temp > ('Z' + 0)) {
                    temp = 'A' + temp - 'Z' - 1;
                }
            } else {
                if (temp > ('z' + 0)) {
                    temp = 'a' + temp - 'z' - 1;
                }
            }

            answer += (char) temp;
        }

        return answer;
    }

}