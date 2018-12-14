package chapter1;

import java.util.stream.IntStream;

class Q2 {
    static boolean isAnagram(String str) {
        int len = str.length();

        for (int left = 0; left < len; left++) {
            int right = len - left - 1;

            if (right <= left)
                return true;
            else if (str.charAt(left) != str.charAt(right))
                return false;
        }

        return false;
    }

    static boolean isPalindrome(String s1, String s2) {
        int[] charCount = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i);
            charCount[index]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            int index = s2.charAt(i);

            if (charCount[index] == 0)
                return false;
            else
                charCount[index]--;
        }

        return true;
    }
}
