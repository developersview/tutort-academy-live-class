import java.util.ArrayList;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 17/06/2023
 */
public class Parenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }

    public static void generate(List<String> result, String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }
        if (open < n) {
            generate(result, s + "(", open + 1, close, n);
        }
        if (close < open) {
            generate(result, s + ")", open, close + 1, n);
        }
    }
}
