package bj_11650;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i][0] != arr[j][0]) {
//                    if (arr[i][0] > arr[j][0]) {
//                        int temp = arr[i][0];
//                        arr[i][0] = arr[j][0];
//                        arr[j][0] = temp;
//
//                        int temp2 = arr[i][1];
//                        arr[i][1] = arr[j][1];
//                        arr[j][1] = temp2;
//                    }
//                }
//
//                if (arr[i][0] == arr[j][0]) {
//                    if (arr[i][1] > arr[j][1]) {
//                        int temp = arr[i][1];
//                        arr[i][1] = arr[j][1];
//                        arr[j][1] = temp;
//
//                        int temp2 = arr[i][0];
//                        arr[i][0] = arr[j][0];
//                        arr[j][0] = temp2;
//                    }
//                }
//            }
//        }

//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] e1, int[] e2) {
//                if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
//                    return e1[1] - e2[1];
//                }
//                else {
//                    return e1[0] - e2[0];
//                }
//            }
//        });

        Arrays.sort(arr, (o1, o2) -> {
           if (o1[0] == o2[0]) {
               return Integer.compare(o1[1], o2[1]);
           } else {
               return Integer.compare(o1[0], o2[0]);
           }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
