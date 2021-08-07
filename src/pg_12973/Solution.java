package pg_12973;

class Solution {
    public int solution(String s) {
        int answer = 1;
        StringBuilder myString = new StringBuilder(s);

        for (int i = 0; i < myString.length() - 1; i++) {
            if (myString.charAt(i) == myString.charAt(i + 1)) {
                myString.deleteCharAt(i + 1);
                myString.deleteCharAt(i);
                i = -1;
            }
        }

        if (myString.length() != 0) {
            return 0;
        }

        return answer;
    }
}