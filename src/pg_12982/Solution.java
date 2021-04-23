package pg_12982;

public class Solution {

    public int solution(int[] d, int budget) {

        int answer = 0;
        int sum = 0;
        int temp = 0;

        // d 배열을 오름차순으로 정렬
        for (int i=0; i < d.length; i++) {

            for (int k=0; k < d.length-i; k++) {
                if(d[k] > d[k+1]) {
                    temp = d[k+1];
                    d[k+1] = d[k];
                    d[k] = temp;
                } else {
                    break;
                }
            }

        }

        // 정렬한 배열로 정답 도출
        for (int i=0; i < d.length; i++) {
            sum = sum + d[i];
            if (sum > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}