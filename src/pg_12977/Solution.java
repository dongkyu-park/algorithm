package pg_12977;

class Solution {

    public int solution(int[] nums) {

        int answer = 0;
        boolean[] test = new boolean[2998];

        for (int a=0; a < test.length; a++) {
            test[a] = true;
        }

        for (int b=2; b*b <= 2997; b++) {
            for (int c=b, d=2; c*d <= 2997; d++) {
                test[c*d] = false;
            }
        }

        for (int i=0; i < nums.length-2; i++) {

            for (int j=i+1; j < nums.length-1; j++) {

                for (int k=j+1; k < nums.length; k++) {

                    if(test[nums[i] + nums[j] + nums[k]]) {
                        answer++;
                    }

                }

            }

        }
        return answer;
    }
}