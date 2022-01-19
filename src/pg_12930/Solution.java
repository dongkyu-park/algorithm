package pg_12930;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stringArr = s.split(" ", -1);

        for (int i = 0; i < stringArr.length; i++) {
            String word = stringArr[i];

            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    answer += Character.toUpperCase(word.charAt(j));
                    continue;
                }
                answer += Character.toLowerCase(word.charAt(j));
            }

            if (i != stringArr.length - 1) {
                answer += " ";
            }
        }

        return answer;
    }
}
