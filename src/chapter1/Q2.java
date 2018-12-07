package chapter1;

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
}
