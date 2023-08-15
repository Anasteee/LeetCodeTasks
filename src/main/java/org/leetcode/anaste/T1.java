package org.leetcode.anaste;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class T1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
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
        int[] nums = new int[]{2,7,11,15};
        assertArrayEquals(new int[]{0, 1}, twoSum(nums, 9));
    }

    @Test
    void test2() {
        int[] nums = new int[]{3,2,3};
        assertArrayEquals(new int[]{0, 2}, twoSum(nums, 6));
    }

    @Test
    void test3() {
        int[] nums = new int[]{3,3};
        assertArrayEquals(new int[]{0, 1}, twoSum(nums, 6));
    }
}
