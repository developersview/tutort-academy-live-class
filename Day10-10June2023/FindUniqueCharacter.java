import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 10/06/2023
 */
public class FindUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(findUniqueCharacter("aabbcbad"));
        System.out.println(findUniqueCharacter("leetcode"));
        System.out.println(findUniqueCharacter("aabb"));
    }

    static int findUniqueCharacter(String s) {
        char[] arr = s.toCharArray();
        int[] freq = new int[26];
        for (char c : arr) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[arr[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
