public class Pattern {
    public static void main(String[] args) {
        //pyramidStar();
        pyramidNumber();
    }

    public static void pyramidStar() {
        int maxRow = 5;
        for (int row = 0; row < maxRow; row++) {
            for (int space = maxRow - 1 - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star < (row * 2) + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramidNumber() {
        int maxRow = 3;
        int count = 1;
        for (int row = 0; row < maxRow; row++) {
            for (int space = maxRow - 1 - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int num = 0; num < (row * 2) + 1; num++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
