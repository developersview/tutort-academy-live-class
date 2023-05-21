/**
 * @author pranoy.chakraborty
 * @Date 20/05/2023
 */
public class Main {
    public static void main(String[] args) {
        long n = 100000;
        for (long i = 2; i < n; i = i * i) {
            System.out.println(i);
        }
    }
}
