package chapter1;

import java.util.HashSet;
import java.util.Set;

class Q1 {
    static boolean isUnique(String str) {
        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (letters.contains(c))
                return false;

            letters.add(c);
        }

        return true;
    }

    static boolean isUniqueNoExtraSpace(String str) {
        // TODO
        return false;
    }
}
