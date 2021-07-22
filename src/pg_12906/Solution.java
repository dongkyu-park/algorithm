package pg_12906;

import java.util.*;

class Solution{
    public static int[] solution(int[] arr) {

        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                arrList.add(arr[i]);
            }
        }
        arrList.add(arr[arr.length - 1]);

        int[] answer = new int[arrList.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}