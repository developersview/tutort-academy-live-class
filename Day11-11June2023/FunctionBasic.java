/**
 * @author pranoy.chakraborty
 * @Date 11/06/2023
 */
public class FunctionBasic {
    public static void main(String[] args) {
        printNnumbers(5);
        System.out.println();
        reverseString("Hello", 5);
        System.out.println();
        System.out.println(powerOfTwo(8));
    }

    static void printNnumbers(int n) {
        if (n <= 0) {
            return;
        }
        printNnumbers(n - 1);
        System.out.print(n - 1);
    }

    static void reverseString(String s, int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(s.charAt(n - 1));
        reverseString(s, n - 1);
    }

    static boolean powerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n % 2 != 0 || n == 0) {
            return false;
        } else {
            return powerOfTwo(n / 2);
        }
    }
}
