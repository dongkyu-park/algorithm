package bj_10173;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String sentence = sc.nextLine();
            boolean findNemo = false;

            if (sentence.equals("EOI")) {
                break;
            }

            for (int i = 0; i < sentence.length() - 4; i++) {
                if (sentence.charAt(i) == 'n' || sentence.charAt(i) == 'N') {
                    if ((sentence.charAt(i + 1) == 'e' || sentence.charAt(i + 1) == 'E') &&
                            (sentence.charAt(i + 2) == 'm' || sentence.charAt(i + 2) == 'M') &&
                            (sentence.charAt(i + 3) == 'o' || sentence.charAt(i + 3) == 'O')) {
                        findNemo = true;
                    }
                }
            }

            if (findNemo) {
                System.out.println("Found");
            } else {
                System.out.println("Missing");
            }
        }
    }
}
