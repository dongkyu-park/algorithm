package pg_42578;

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (map.get(clothes[i][1]) != null) {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            } else {
                map.put(clothes[i][1], 1);
            }
        }

        //경우의 수 구하기
        /* 예시) : (headgear 개수 + 1) * (eyewear 개수 + 1) - 1
        동일 의상 카테고리 개수에 1을 더해주는 이유는 해당 카테고리의 의상을 입지 않는 경우도 있기 때문이다.
        마지막에 -1을 해주는 이유는 최소 1개의 의상은 입기 때문이다.
        -1을 해주지 않으면 의상을 하나도 입지 않은 경우도 나온다.
        */
        for (Integer value : map.values()) {

            answer *= value + 1;

        }

        return answer - 1;

    }
}