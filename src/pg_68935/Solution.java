package pg_68935;

class Solution {
    public int solution(int n) {
        int answer = 0;

        String temp = "";

        while (n > 0) {
            temp += n % 3;
            n /= 3;
        }

        for (int i = 0; i < temp.length(); i++) {
            answer += (temp.charAt(i) - '0') * (int)Math.pow(3, temp.length() -1 - i);
        }

        return answer;
    }
}