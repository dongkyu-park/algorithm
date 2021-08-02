package pg_82612;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int fee = 0;

        for (int i = 1; i <= count; i++) {
            fee += price * i;
        }

        if (money < fee) {
            answer = fee - money;
        }

        return answer;
    }
}