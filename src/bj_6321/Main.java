package bj_6321;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String computer = sc.next();
            sb.append("String #" + (i + 1) + "\n");

            for (int j = 0; j < computer.length(); j++) {
                if ((computer.charAt(j) == 'Z')) {
                    sb.append('A');
                } else {
                    sb.append((char) (computer.charAt(j) + 1));
                }
            }
            sb.append("\n\n");
        }

        System.out.println(sb.toString());
    }
}
