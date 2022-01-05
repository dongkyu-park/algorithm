package bj_1052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr =sc.nextLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);

        int answer = divideBottle(N, K, 0, 1);

        if (answer == 0) {
            System.out.println("-1");
        } else {
            System.out.println(answer);
        }
    }

    public static int divideBottle(int bottle, int myBottle, int buyBottle, int depth) {
        if (bottle <= myBottle) {
            return buyBottle;
        }

        System.out.println(bottle + "," + myBottle + "," + buyBottle + "," + depth);

        if (bottle % 2 == 0) {
            depth *= 2;
            return divideBottle(bottle / 2, myBottle, buyBottle, depth);
        }

        buyBottle += depth;
        depth *= 2;
        return divideBottle((bottle + 1) / 2, myBottle, buyBottle, depth);
    }
}
