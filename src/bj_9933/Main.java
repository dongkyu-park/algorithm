package bj_9933;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];
        boolean flag = false;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < N - 1; i++) {
            String word = arr[i];
            StringBuffer sb = new StringBuffer(word);
            String reverse = sb.reverse().toString();
            int len = reverse.length();

            if (word.equals(reverse)) {
                System.out.println(len + " " + reverse.charAt(len / 2));
            }

            for (int j = i + 1; j < N; j++) {
                if (arr[j].length() == len && arr[j].equals(reverse)) {
                    flag = true;
                    System.out.println(len + " " + reverse.charAt(len / 2));
                    break;
                }
            }

            if (flag) {
                break;
            }
        }
    }
}
