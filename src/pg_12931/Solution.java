package pg_12931;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String temp = String.valueOf(n);

        String[] arr = temp.split("");

        for(String s : arr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}