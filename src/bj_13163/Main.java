package bj_13163;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            boolean firstSyllable = false;
            sb.append("god");
            String name = sc.nextLine();
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == ' ' && !firstSyllable) {
                    firstSyllable = true;
                }

                if (firstSyllable) {
                    if (name.charAt(j) == ' ') {
                        continue;
                    }
                    sb.append(name.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
