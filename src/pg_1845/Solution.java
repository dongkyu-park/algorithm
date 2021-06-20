package pg_1845;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {

        Set<Integer> phoneketmonSet = new HashSet<>();
        int maxChoice = nums.length / 2;

        for (int num : nums) {
            phoneketmonSet.add(num);
        }

        return maxChoice > phoneketmonSet.size() ? phoneketmonSet.size() : maxChoice;
    }
}