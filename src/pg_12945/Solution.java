package pg_12945;

class Solution {

    public int solution(int n) {

        int a = 0, b = 1; // F(0), F(1)

        for (int i = 0; i < n; i++) {

            int sum = a + b; // F(2) = F(0) + F(1)
            sum %= 1234567;
            a = b; //F(0) <- F(1)
            b = sum; // F(1) <- F(2) (F(0) + F(1))

        }

        return a;
    }
}