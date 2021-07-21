package pg_12910;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }

        int[] answer;

        if (arrList.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[arrList.size()];
            for (int i = 0; i < arrList.size(); i++) {
                answer[i] = arrList.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;

    }
}