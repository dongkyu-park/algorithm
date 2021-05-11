package bj_4673;

public class Main {
    public static final int LAST_NUMBER = 10001;

    public static void main(String[] args) {

        boolean[] check = new boolean[LAST_NUMBER];

        for (int i = 1; i < LAST_NUMBER; i++) {
            int n = d(i);

            if (n < LAST_NUMBER) {
                check[n] = true;
            }
        }

        for (int i = 1; i < LAST_NUMBER; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }

    }

    public static int d(int n) {
        int result = n;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
