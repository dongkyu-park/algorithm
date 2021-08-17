package pg_42885;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        while (left < right) {

            int sum = people[right];

            for (int i = left; i < right; i++) {
                sum += people[i];
                if (sum > limit) {
                    right--;
                    left = i;
                    answer++;
                    break;
                } else if (sum == limit) {
                    right--;
                    left = i + 1;
                    answer++;
                    break;
                }

                // 마지막 사람인데, sum < limit 라서 체크되지 않은 경우.
                // 마지막 사람 전에서 위쪽에서 left == right가 되어 버리면 아래의 조건문은 실행되지 않으므로,
                // while문을 빠져나갈 수 있게끔만 해주고, 리턴에서 조건을 걸어준다.
                if (i == right - 1) {
                    left = right;
                }

            }

        }

        return left == right ? answer + 1 : answer;
    }
}