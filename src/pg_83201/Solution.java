package pg_83201;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";

        for (int i = 0; i < scores.length; i++) {

            int min = 101;
            int max = -1;
            long sum = 0;
            long totalCount = 0;

            int checkMinCount = 0;
            int checkMaxCount = 0;

            for (int j = 0; j < scores.length; j++) {
                if (max < scores[j][i]) {
                    max = scores[j][i];
                    checkMaxCount = 1;
                } else if (max == scores[j][i]) {
                    checkMaxCount++;
                }

                if (min > scores[j][i]) {
                    min = scores[j][i];
                    checkMinCount = 1;
                } else if (min == scores[j][i]) {
                    checkMinCount++;
                }
            }

            for (int j = 0; j < scores.length; j++) {

                if (j == i) {

                    if ((scores[j][i] == max && checkMaxCount >= 2)
                        || (scores[j][i] == min && checkMinCount >= 2)
                        || (scores[j][i] != max && scores[j][i] != min)) {
                            totalCount++;
                            sum += scores[j][i];
                    }

                } else {
                    totalCount++;
                    sum += scores[j][i];
                }
            }

            long avg = sum / totalCount;

            if (avg >= 90) {
                answer += "A";
            } else if (avg >= 80) {
                answer += "B";
            } else if (avg >= 70) {
                answer += "C";
            } else if (avg >= 50) {
                answer += "D";
            } else {
                answer += "F";
            }

        }

        return answer;
    }
}