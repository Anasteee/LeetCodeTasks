package org.leetcode.anaste;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class T242 {
    public boolean isAnagram(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char2);
        Arrays.sort(char1);

        return Arrays.equals(char1, char2);
    }

    /**
     * <p>assertTrue(expression);</p>
     * <p>assertFalse(expression);</p>
     * <p>assertEquals(expected, actual);</p>
     * <p>assertNotEquals(unExpected, actual);</p>
     * <p>assertArrayEquals(expected, actual);</p>
     */
    @Test
    void test1() {
        assertTrue(isAnagram("anagram", "nagaram"));
    }

    @Test
    void test2() {

    }

    @Test
    void test3() {

    }
}
