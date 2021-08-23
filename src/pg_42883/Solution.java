package pg_42883;

class Solution {
    public String solution(String number, int k) {
        String answer = "";

        int numberOfDigit = number.length() - k;
        int endCount = k;
        int index = 0;

        while (numberOfDigit > 0) {

            char max = '0';

            for (int i = index; i <= endCount; i++) {
                if (max < number.charAt(i)) {
                    max = number.charAt(i);
                    index = i + 1;

                    if (max == '9') {
                        break;
                    }
                }
            }

            answer += String.valueOf(max);
            endCount++;
            numberOfDigit--;

        }

        return answer;
    }
}