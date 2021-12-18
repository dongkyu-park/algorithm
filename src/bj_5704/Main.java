package bj_5704;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean[] arr = new boolean[26];
            boolean flag = false;
            String sentence = sc.nextLine();

            if (sentence.equals("*")) {
                break;
            }

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    continue;
                }

                if (!arr[sentence.charAt(i) - 'a']) {
                    arr[sentence.charAt(i) - 'a'] = true;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (!arr[i]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }
        }
    }
}
