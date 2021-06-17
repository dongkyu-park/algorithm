package bj_15650;

import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static int N, M;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        dfs(1, 0);

    }

    public static void dfs(int at, int depth) {

        /*
		 깊이가 M이랑 같을경우 출력
		*/
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i <= N; i++) {

            // 현재 깊이를 index로 하여 해당 위치에 i 값을 담는다
            arr[depth] = i;

            /*
		    재귀호출 :
		    현재 i 값보다 다음 재귀에서 더 커야하므로
		    i + 1 의 값을 넘겨주고, 깊이 또한 1 증가시켜 재귀호출해준다
		    */
            dfs(i + 1, depth + 1);

        }
    }
}
