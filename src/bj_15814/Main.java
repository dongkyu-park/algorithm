package bj_15814;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String[] split = sc.nextLine().split(" ");
            int first = Integer.parseInt(split[0]);
            int second = Integer.parseInt(split[1]);

            char temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

        for (char c : arr) {
            System.out.print(c);
        }
    }
}
