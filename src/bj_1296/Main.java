package bj_1296;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myName = sc.next();
        int N = sc.nextInt();

        int maxWinningRate = 0;
        ArrayList<String> winnerTeamList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String teamName = sc.next();

            int[] rank = new int[4];
            addValue(rank, myName);
            addValue(rank, teamName);

            int winningRate = ((rank[0] + rank[1]) * (rank[0] + rank[2]) * (rank[0] + rank[3]) *
                    (rank[1] + rank[2]) * (rank[1] + rank[3]) *
                    (rank[2] + rank[3])) % 100;

            if (maxWinningRate < winningRate) {
                winnerTeamList = new ArrayList<>();
                winnerTeamList.add(teamName);
                maxWinningRate = winningRate;
                continue;
            }

            if (maxWinningRate == winningRate) {
                winnerTeamList.add(teamName);
                maxWinningRate = winningRate;
                continue;
            }
        }

        Collections.sort(winnerTeamList);
        System.out.println(winnerTeamList.get(0));
    }

    public static int[] addValue(int[] arr, String name) {
        for (int j = 0; j < name.length(); j++) {
            if (name.charAt(j) == 'L') {
                arr[0]++;
                continue;
            }

            if (name.charAt(j) == 'O') {
                arr[1]++;
                continue;
            }

            if (name.charAt(j) == 'V') {
                arr[2]++;
                continue;
            }

            if (name.charAt(j) == 'E') {
                arr[3]++;
                continue;
            }
        }

        return arr;
    }
}
