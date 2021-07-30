package pg_17681;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] temp1Arr = new String[n];
        String[] temp2Arr = new String[n];

        for (int i = 0; i < n; i++) {

            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int j = n - 1; j >= 0; j--) {

                int arr1Temp = arr1[i] % 2;
                int arr2Temp = arr2[i] % 2;

                if (arr1Temp == 0) {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }

                if (arr2Temp == 0) {
                    sb2.append(" ");
                } else {
                    sb2.append("#");
                }

                arr1[i] = arr1[i] / 2;
                arr2[i] = arr2[i] / 2;

                if (j == 0) {
                    temp1Arr[i] = sb.reverse().toString();
                    temp2Arr[i] = sb2.reverse().toString();
                }

            }
        }

        for (int i = 0; i < n; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {

                if (temp1Arr[i].charAt(j) == '#' || temp2Arr[i].charAt(j) == '#') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }

                if (j == n - 1) {
                    answer[i] = sb.toString();
                }

            }
        }

        return answer;
    }
}