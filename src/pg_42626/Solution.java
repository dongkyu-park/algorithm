package pg_42626;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        while (pq.peek() < K) {

            if (pq.isEmpty() || pq.size() == 1) {
                return -1;
            }

            pq.add(pq.poll() + pq.poll() * 2);
            answer++;
        }

        return answer;
    }
}