package bj_11383;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] arr = new String[N];
        boolean possible = true;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            String wideImg = "";

            for (int j = 0; j < arr[i].length(); j++) {
                wideImg += arr[i].charAt(j);
                wideImg += arr[i].charAt(j);
            }

            if (wideImg.equals(sc.next())) {
                continue;
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println("Eyfa");
        } else {
            System.out.println("Not Eyfa");
        }
    }
}
