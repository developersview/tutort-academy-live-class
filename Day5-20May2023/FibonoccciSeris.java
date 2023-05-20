/**
 * @author pranoy.chakraborty
 * @Date 20/05/2023
 */
public class FibonoccciSeris {
    public static void main(String[] args) {
        fibbo(30);
        System.out.println();
        fibbo(2);
    }

    static void fibbo(int n) {
        if (n <= 2) System.out.print(1+" ");
        int a = 1, b = 1;
        for (int i = 1; i < n; i++) {
            System.out.print(a + " ");
            int temp = b;
            b = temp + a;
            a = temp;
        }
    }
}
