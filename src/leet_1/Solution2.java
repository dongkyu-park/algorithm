package leet_1;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])) return new int[]{hashMap.get(nums[i]),i};

            hashMap.put(target-nums[i], i);
        }
        return null;
    }
}