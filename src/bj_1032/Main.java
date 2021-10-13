package bj_1032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(sc.next());
        } else {

            String[] arr = new String[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.next();
            }

            String[] answer = new String[arr[0].length()];

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr[i].length(); j++) {

                    if (answer[j] != null && answer[j].equals("?")) {
                        continue;
                    }

                    if (arr[i].charAt(j) == arr[i + 1].charAt(j)) {
                        String str = Character.toString(arr[i].charAt(j));

                        if (answer[j] != null && answer[j].equals(str)) {
                            continue;
                        }

                        answer[j] = str;

                    } else {
                        answer[j] = "?";
                    }
                }
            }

            for (String a : answer) {
                System.out.print(a);
            }

        }

    }
}
