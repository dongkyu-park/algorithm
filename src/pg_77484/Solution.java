package pg_77484;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int sameCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < lottos.length; i++) {

            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    sameCount++;
                    break;
                }
            }
        }

        if (zeroCount == 0 && sameCount == 0) {
            answer[0] = 6;
            answer[1] = 6;
        } else if (zeroCount == 6) {
            answer[0] = 1;
            answer[1] = 6;
        } else {
            answer[0] = 7 - (zeroCount + sameCount);
            answer[1] = 7 - sameCount;
        }

        return answer;
    }
}