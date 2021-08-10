package pg_42862;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> reserveList = new ArrayList<>();
        ArrayList<Integer> lostList = new ArrayList<>();

        for (int temp : reserve) {
            reserveList.add(temp);
        }

        // 여분 체육복을 가지고 있고, 도난 당한 경우 체크
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (reserveList.get(j) == lost[i]) {
                    answer++;
                    reserveList.remove(j);
                    break;
                }

                if (j == reserveList.size() - 1) {
                    lostList.add(lost[i]);
                }
            }
        }

        for (int i = 0; i < lostList.size(); i++) {

            for (int j = 0; j < reserveList.size(); j++) {
                if (reserveList.get(j) == lostList.get(i) - 1) {
                    answer++;
                    reserveList.remove(j);
                    break;
                }

                if (reserveList.get(j) == lostList.get(i) + 1) {
                    answer++;
                    reserveList.remove(j);
                    break;
                }

            }

        }

        return answer;
    }
}