package pg_49993;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {

            int count = 0;

            for (int j = 0; j < skill_trees[i].length(); j++) {

                if (skill.contains(String.valueOf(skill_trees[i].charAt(j)))) {
                    if (skill.charAt(count) == skill_trees[i].charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }

                if (j == skill_trees[i].length() - 1) {
                    answer++;
                }

            }

        }

        return answer;
    }
}