
import java.util.List;
import java.util.LinkedList;
/*Given a string s, find the longest palindromic substring in s.
You may assume that the maximum length of s is 1000.
For example, input: “babad”, return “bab”, “aba” is also a valid answer, you only
need to find one.*/

public class LargestPalindromeinString {
    public static void main(String args[]) {
        String string = "geegsgn";
        String palindrome = findPalindrome(string);
        if (palindrome == null) {
            System.out.println("No palindrome found");
            return;
        }
        System.out.println("Longest palindrome is : " + palindrome);


    }

    static String findPalindrome(String str) {
        if (str == null || str == "") {
            return null;
        }
        List<String> substringList = new LinkedList<String>();
        int maxSize = 0;
        String maxString = null;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < str.length() - i; j++) {
                substringList.add(getSubstring(str, i, j));
            }
        }

        for (String s : substringList) {
            if (s.equals(getReverse(s)) && s.length() > maxSize) {
                maxSize = s.length();
                maxString = s;
            }
        }

        return maxString;

    }

    static String getSubstring(String str, int startIndex, int length) {// length is length of substring
        char[] input = str.toCharArray();
        int outputLength = Math.min(str.length() - startIndex, length);
        char[] output = new char[outputLength];
        for (int i = startIndex; i < startIndex + outputLength; i++) {
            output[i - startIndex] = input[i];
        }
        return new String(output);
    }


    static String getReverse(String str) {
        char[] charArray1 = str.toCharArray();
        char[] charArray2 = new char[str.length()];
        for (int i = charArray1.length - 1; i >= 0; i--) {
            charArray2[charArray1.length - 1 - i] = charArray1[i];
        }

        return new String(charArray2);
    }
}
