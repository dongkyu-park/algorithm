package pg_12981;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {

        int[] answer = {0, 0};

        HashSet<String> set = new HashSet();
        char startWord = words[0].charAt(0);

        int peopleCount = 1;
        int idx = 1;

        for(String word : words) {

            if(peopleCount > n) {
                peopleCount = 1;
                idx++;
            }

            if(set.contains(word) || startWord != word.charAt(0)) {
                answer[0] = peopleCount;
                answer[1] = idx;
                break;
            } else {
                set.add(word);
                startWord = word.charAt(word.length() - 1);

                peopleCount++;
            }

        }
        return answer;
    }
}