package pg_12939;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");

        int[] intArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        int min = intArr[0];
        int max = intArr[0];

        for (int i = 1; i < intArr.length; i++) {
            if (min > intArr[i]) {
                min = intArr[i];
            }

            if (max < intArr[i]) {
                max = intArr[i];
            }
        }

        answer = String.valueOf(min) + " " + String.valueOf(max);

        return answer;
    }
}