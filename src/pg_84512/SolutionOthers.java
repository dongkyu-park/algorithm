package pg_84512;

public class SolutionOthers {
    String arr[] = {"A", "E", "I", "O", "U"};
    int cnt = 0;
    int ans = 0;

    public int solution(String word) {
        perm(0, "", word);
        return ans;
    }

    public void perm(int idx, String s, String word) {

        if (idx == 5) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            String ss = s + arr[i];
            cnt++;
            System.out.println(ss);
            if (ss.equals(word)) {
                ans = cnt;
                return;
            }
            perm(idx + 1, ss, word);
        }
    }

}
