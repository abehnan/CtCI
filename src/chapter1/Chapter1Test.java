package chapter1;

import org.junit.Assert;
import org.junit.Test;

public class Chapter1Test {

    @Test
    public void isUnique() {
        String name = "Alexander";
        String age = "twenty-three";
        String unique = "qwerty";
        Assert.assertTrue(Q1.isUnique(unique));
        Assert.assertFalse(Q1.isUnique(name));
        Assert.assertFalse(Q1.isUnique(age));
    }

    @Test
    public void isUniqueNoExtraSpace() {
        String name = "Alexander";
        String age = "twenty-three";
        String unique = "qwerty";
        Assert.assertTrue(Q1.isUniqueNoExtraSpace(unique));
        Assert.assertFalse(Q1.isUniqueNoExtraSpace(name));
        Assert.assertFalse(Q1.isUniqueNoExtraSpace(age));
    }

    @Test
    public void isAnagram() {
        String name = "Alexander";
        String anagram = "laval";
        Assert.assertTrue(Q2.isAnagram(anagram));
        Assert.assertFalse(Q2.isAnagram(name));
    }
}