package bj_3449;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int distance = 0;
            String first = sc.next();
            String second = sc.next();

            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) == second.charAt(j)) {
                    continue;
                }
                distance++;
            }
            System.out.println("Hamming distance is " + distance + ".");
        }
    }
}
