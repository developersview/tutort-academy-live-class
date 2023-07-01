import java.util.Stack;

/**
 * @author pranoy.chakraborty
 * @Date 01/07/2023
 */
public class PrefixToInfix {
    public static void main(String[] args) {
        System.out.println(convert("*-A/BC-/AKL"));
    }

    static String convert(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
}
