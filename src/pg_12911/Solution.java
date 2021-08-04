package pg_12911;

class Solution {
    public int solution(int n) {
        int answer = 0;

        int temp = countChar(digitTransfer(n), '1');

        for (int i = n + 1; i < 1000000; i++) {
            if (temp == countChar(digitTransfer(i), '1')) {
                answer = i;
                break;
            };
        }

        return answer;
    }

    public String digitTransfer(int digit) {

        StringBuffer sb = new StringBuffer();

        while(digit != 0) {
            sb.append(digit % 2);
            digit = digit / 2;
        }

        return sb.reverse().toString();
    }

    public int countChar(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

}