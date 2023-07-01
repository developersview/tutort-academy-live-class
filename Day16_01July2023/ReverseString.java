import java.util.Stack;

/**
 * @author pranoy.chakraborty
 * @Date 01/07/2023
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Geeks"));
    }

    static String reverse(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while (stack.size() != 0) {
            ans.append(stack.peek());
            stack.pop();
        }
        return ans.toString();
    }
}
