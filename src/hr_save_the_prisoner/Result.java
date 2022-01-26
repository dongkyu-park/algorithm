package hr_save_the_prisoner;

class Result {

    /*
     * Complete the 'saveThePrisoner' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER s
     */

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int order = m % n;
        int delay = s - 1;

        int answer = (order + delay) % n;

        if (answer == 0) {
            return n;
        }
        return answer;
    }
}
