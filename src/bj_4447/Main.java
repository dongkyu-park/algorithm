package bj_4447;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int goodMan = 0;
        int badMan = 0;
        String answer = "";

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            goodMan = 0;
            badMan = 0;
            answer = "";

            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == 'g' || name.charAt(j) == 'G') {
                    goodMan++;
                }

                if (name.charAt(j) == 'b' || name.charAt(j) == 'B') {
                    badMan++;
                }
                answer += name.charAt(j);
            }

            if (goodMan == badMan) {
                answer += " is NEUTRAL";
            }

            if (goodMan > badMan) {
                answer += " is GOOD";
            }

            if (goodMan < badMan) {
                answer += " is A BADDY";
            }

            System.out.println(answer);
        }
    }
}
