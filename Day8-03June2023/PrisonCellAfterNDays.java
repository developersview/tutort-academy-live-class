import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 03/06/2023
 */
public class PrisonCellAfterNDays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findCellVacancy(new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 7)));
    }

    static int[] findCellVacancy(int[] cells, int n) {
        n = n % 14 == 0 ? 14 : n % 14;
        int[] temp = new int[cells.length];
        while (n > 0) {
            for (int i = 1; i < cells.length - 1; i++) {
                if (cells[i - 1] == cells[i + 1]) {
                    temp[i] = 1;
                } else {
                    temp[i] = 0;
                }
            }
            cells = temp.clone();
            n--;
        }
        return cells;
    }
}
