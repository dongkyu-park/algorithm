package pg_70129;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int zeroCount = 0;
        int loop = 0;

        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                }
            }

            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());

            loop++;
        }

        answer[0] = loop;
        answer[1] = zeroCount;

        return answer;
    }
}