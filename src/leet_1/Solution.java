package leet_1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        Loop1 :
        for (int i = 0; i < nums.length - 1; i++) {
            Loop2 :
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break Loop1;
                }
            }
        }

        return answer;
    }
}
