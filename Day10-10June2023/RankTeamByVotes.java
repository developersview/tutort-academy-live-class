import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 11/06/2023
 */
public class RankTeamByVotes {
    public static void main(String[] args) {
        System.out.println(rankTeams(new String[]{"ABC", "ACB", "ACB", "ABC", "ACB"}));
    }

    public static String rankTeams(String[] votes) {
        int n = votes[0].length();
        int[][] rt = new int[26][n];

        for (int i = 0; i < votes.length; i++) {
            for (int j = 0; j < n; j++) {
                char c = votes[i].charAt(j);
                rt[c - 'A'][j]++;
            }
        }

        Character[] temp = new Character[n];
        for (int i = 0; i < n; i++) {
            temp[i] = votes[0].charAt(i);
        }

        Arrays.sort(temp, (a, b) -> {
            for (int i = 0; i < n; i++) {
                if (rt[a - 'A'][i] != rt[b - 'A'][i]) {
                    return rt[b - 'A'][i] - rt[a - 'A'][i];
                }
            }
            return a - b;
        });

        char[] res = new char[n];
        for (int i = 0; i < n; i++) {
            res[i] = temp[i];
        }

        return new String(res);
    }
}

