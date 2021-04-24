package pg_12977;

class SolutionOthers {

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i]+nums[j]+nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int n) {
        int max = (int) Math.ceil(Math.sqrt(n));
        for (int i = 2; i <= max; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}