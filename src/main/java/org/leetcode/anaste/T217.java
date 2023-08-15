package org.leetcode.anaste;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class T217 {
    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i] == nums[j]){
//                    return true;
//                }
//            }
//        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
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
        assertFalse( containsDuplicate(nums) );
    }

    @Test
    void test3() {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        assertTrue( containsDuplicate(nums) );
    }

}
