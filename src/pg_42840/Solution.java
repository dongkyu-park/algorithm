package pg_42840;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {

        int[] supo1 = {1, 2, 3, 4 ,5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (supo1[i % 5] == answers[i]) {
                count1++;
            }

            if (supo2[i % 8] == answers[i]) {
                count2++;
            }

            if (supo3[i % 10] == answers[i]) {
                count3++;
            }
        }

        int max = Math.max(Math.max(count1, count2), count3);

        ArrayList<Integer> arrList = new ArrayList<>();

        if (max == count1) {
            arrList.add(1);
        }

        if (max == count2) {
            arrList.add(2);
        }

        if (max == count3) {
            arrList.add(3);
        }

        int[] arr = new int[arrList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrList.get(i);
        }

        return arr;
    }
}