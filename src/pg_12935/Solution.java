package pg_12935;

class Solution {
    public int[] solution(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int count = 0;
        int[] answer = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[count++] = arr[i];
        }

        return answer;
    }
}