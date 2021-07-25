package pg_68644;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> arrList = new ArrayList<>(set);
        int[] answer = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}