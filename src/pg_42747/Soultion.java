package pg_42747;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int max = citations[citations.length - 1];

        // 논문 인용 0이 최댓값이라면, 0 리턴
        if (max == 0) {
            return answer;
        }

        for (int i = max; i > 0; i--) {

            // 남아있는 배열의 갯수가 배열의 인용된 논문의 최대 갯수보다 작다면, 한개 낮은 값으로 스킵
            if (citations.length < i) {
                continue;
            }

            // 정렬 된 배열의 끝값에서 뒤에서 max개 만큼 뺀 index 위치의 값이 max값보다 작다면 스킵
            if (citations[citations.length - i] < i) {
                continue;
            } else {
                answer = i;
                break;
            }

        }

        return answer;
    }
}