package org.leetcode.anaste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class T217 {

    public boolean containsDuplicate(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {

            }
        }
        return true;
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
        int[] nums = new int[]{1,2,3,1};
        assertTrue( containsDuplicate(nums) );
    }

    @Test
    void test2() {
        int[] nums = new int[]{1,2,3,4};
        assertTrue( containsDuplicate(nums) );
    }

    @Test
    void test3() {
        int[] nums = new int[]{1,2,3,4};
        assertTrue( containsDuplicate(nums) );
    }

}
