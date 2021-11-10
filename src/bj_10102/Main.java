package bj_10102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        String vote = sc.next();

        int[] answer = new int[2];

        for (int i = 0; i < V; i++) {
            if (vote.charAt(i) == 'A') {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        if (answer[0] > answer[1]) {
            System.out.println("A");
        } else if (answer[0] == answer[1]) {
            System.out.println("Tie");
        } else {
            System.out.println("B");
        }
    }
}
