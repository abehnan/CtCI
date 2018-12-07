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
}