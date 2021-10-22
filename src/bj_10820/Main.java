package bj_10820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String N = sc.nextLine();

            int lowerCase = 0;
            int upperCase = 0;
            int number = 0;
            int blank = 0;

            for (int i = 0; i < N.length(); i++) {
                if (N.charAt(i) >= 'a' && N.charAt(i) <= 'z') {
                    lowerCase++;
                    continue;
                }

                if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                    upperCase++;
                    continue;
                }

                if (N.charAt(i) >= '0' && N.charAt(i) <= '9') {
                    number++;
                    continue;
                }

                if (N.charAt(i) == ' ') {
                    blank++;
                    continue;
                }
            }
            System.out.println(lowerCase + " " + upperCase + " " + number + " " + blank);
        }

        sc.close();

    }
}
