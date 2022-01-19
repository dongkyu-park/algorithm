package pg_42840;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {

        int[] supo1 = {1, 2, 3, 4 ,5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int answerCount1 = 0;
        int answerCount2 = 0;
        int answerCount3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (supo1[i % 5] == answers[i]) {
                answerCount1++;
            }

            if (supo2[i % 8] == answers[i]) {
                answerCount2++;
            }

            if (supo3[i % 10] == answers[i]) {
                answerCount3++;
            }
        }

        int max = Math.max(Math.max(answerCount1, answerCount2), answerCount3);
        ArrayList<Integer> answerList = new ArrayList<>();

        if (max == answerCount1) {
            answerList.add(1);
        }

        if (max == answerCount2) {
            answerList.add(2);
        }

        if (max == answerCount3) {
            answerList.add(3);
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}