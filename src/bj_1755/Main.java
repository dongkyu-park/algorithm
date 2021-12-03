package bj_1755;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        int M = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);

        String[] arrNum = {"zero", "one", "two", "three", "four", "five",
                            "six", "seven", "eight", "nine", "ten"};
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < (N - M + 1); i++) {
            if (M + i < 10) {
                map.put(arrNum[M + i], M + i);
            } else {
                map.put((arrNum[(M + i) / 10] + " " + arrNum[(M + i) % 10]), M + i);
            }
        }

        int order = 0;

        for (String key : map.keySet()) {
            System.out.print(map.get(key));
            order++;

            if (order == 10) {
                System.out.println();
                order = 0;
            } else {
                System.out.print(" ");
            }
        }

    }
}
