package pg_42587;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순

        /*
        우선순위가 높은 문서대로 우선순위 큐에 저장된다. (내림차순)
        ex) [3, 2, 2, 1]
        */
        for (int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
        }

        boolean flag = false; // 내가 인쇄 요청한 문서인지를 판별할 상태 변수
        int count = 0; // 문서 인쇄 순서를 카운팅하는 변수

        while (flag != true) { // 내가 인쇄 요청한 문서를 찾을 때까지 반복

            for (int i = 0; i < priorities.length; i++) {

                // 내가 인쇄 요청한 문서를 찾았을 때, 해당 문서의 인덱스를 알기 위해 배열과 비교
                if (pq.peek() == priorities[i]) {

                    pq.poll(); // 큐에서 삭제 (인쇄)
                    count++; // 문서 인쇄 순서 증가

                    if (i == location) { // 내가 인쇄 요청한 문서일 때
                        flag = true;
                        break; // 반복문 탈출
                    }
                }
            }
        }

        return count;
    }
}