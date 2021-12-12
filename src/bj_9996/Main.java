package bj_9996;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String pattern = sc.next();
        String[] arr = pattern.split("\\*");
        String firstWord = arr[0];
        String lastWord = arr[1];

        for (int i = 0; i < N; i++) {
            String fileName = sc.next();

            if (fileName.length() < firstWord.length() + lastWord.length()) {
                System.out.println("NE");
                continue;
            }

            if (fileName.startsWith(firstWord) && fileName.endsWith(lastWord)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
