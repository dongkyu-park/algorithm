package bj_11098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sc.nextLine();
            int max = 0;
            String answer = "";

            for (int j = 0; j < p; j++) {
                String[] player = sc.nextLine().split(" ");

                if (max < Integer.parseInt(player[0])) {
                    max = Integer.parseInt(player[0]);
                    answer = player[1];
                }
            }

            System.out.println(answer);
        }
    }
}
