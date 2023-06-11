import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author pranoy.chakraborty
 * @Date 10/06/2023
 */
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(findLongestSubstringMethod2("abcabcdef"));
        System.out.println(findLongestSubstringMethod2("CODINGISAWESOME"));
        System.out.println(findLongestSubstringMethod2("abcabcbb"));
        System.out.println(findLongestSubstringMethod2("bbbb"));
        System.out.println(findLongestSubstringMethod2("pwwkew"));
        System.out.println(findLongestSubstringMethod2("abcabdbbdef"));
    }

    static String findLongestSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
            }
            visited.put(currChar, end);
        }
        return output;
    }

    static String findLongestSubstringMethod2(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        int start = 0, end = 0;
        String result = "";
        Set<Character> visited = new HashSet<>();
        while (end < s.length()) {
            if (visited.add(s.charAt(end))) {
                end++;
            } else {
                visited.remove(s.charAt(start));
                start++;
            }
            if (result.length() < end - start + 1) {
                result = s.substring(start, end);
            }
        }
        return result;
    }
}
