import java.util.HashSet;
import java.util.Set;

class LengthOfLongestSubstring {
    static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int leftIndex = 0, rightIndex = 0;
        Set<Character> u = new HashSet<Character>();
        while(rightIndex<s.length()) {
            if(!u.contains(s.charAt(rightIndex))) {
                u.add(s.charAt(rightIndex++));
                max = Math.max(max, u.size());
                System.out.println("Char: " + s.charAt(rightIndex-1) + " - Set: " + u.toString() + " - Max: " + max);
            } else {
                u.remove(s.charAt(leftIndex++));
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        String str = "pwwkew";
        System.out.println("The input string is " + str);
        int len = lengthOfLongestSubstring(str);
        System.out.println("The length of "
                + "the longest non repeating character is " + len);
    }

}