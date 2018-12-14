package chapter1;

import org.junit.Assert;
import org.junit.Test;

public class Chapter1Test {

    @Test
    public void isUnique() {
        Assert.assertFalse(Q1.isUnique("Alexander"));
        Assert.assertFalse(Q1.isUnique("twenty-three"));
        Assert.assertTrue(Q1.isUnique("qwerty"));
    }

    @Test
    public void isUniqueNoExtraSpace() {
        Assert.assertFalse(Q1.isUniqueNoExtraSpace("Alexander"));
        Assert.assertFalse(Q1.isUniqueNoExtraSpace("twenty-three"));
        Assert.assertTrue(Q1.isUniqueNoExtraSpace("qwerty"));
    }

    @Test
    public void isAnagram() {
        String s1 = "Aelxander";
        String s2 = "Alexander";
        String s3 = "laval";
        Assert.assertTrue(Q2.isAnagram("laval"));
        Assert.assertFalse(Q2.isAnagram("Alexander"));
    }

    @Test
    public void isPalindrome() {
        String s1 = "Aelxander";
        String s2 = "Alexander";
        String s3 = "laval";
        Assert.assertTrue(Q2.isPalindrome(s1, s2));
        Assert.assertFalse(Q2.isPalindrome(s1, s3));
    }
}