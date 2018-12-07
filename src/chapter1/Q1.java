package chapter1;

import java.util.HashSet;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {
        String hello = "Hello!";
        boolean helloResult = isUnique(hello);
        String name = "Alexander";
        boolean nameResult = isUnique(name);
        String uniqueStr = "asdf";
        boolean uniqueStrResult = isUnique(uniqueStr);
        System.out.println("helloResult: " + helloResult);
        System.out.println("nameResult: " + nameResult);
        System.out.println("uniqueStrResult: " + uniqueStrResult);
    }

    private static boolean isUnique(String str) {
        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (letters.contains(c))
                return false;

            letters.add(c);
        }

        return true;
    }

    private static boolean isUniqueNoExtraSpace(String str) {
        // TODO
        return false;
    }
}
