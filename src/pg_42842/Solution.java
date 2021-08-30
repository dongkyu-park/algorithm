package pg_42842;

class Solution {
    public int[] solution(int brown, int yellow) {

        int[] answer = {};

        // x는 노란사각형의 가로값, y는 세로값
        double x = yellow;

        for (double y = 1; y <= yellow; y++) {
            if ((x * 2) + (y * 2) + 4 == brown) {
                answer = new int[] {(int)x + 2, (int)y + 2};
                break;
            }

            // for문으로 세로가 +1 증가했을 때, 다음 가로값 구한 뒤 넣기.
            x = yellow / (y + 1);
        }

        return answer;

    }

}