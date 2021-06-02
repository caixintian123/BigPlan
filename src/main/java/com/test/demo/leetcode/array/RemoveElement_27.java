package com.test.demo.leetcode.array;

import org.springframework.stereotype.Service;

/**
 * 27
 * @author caixintian
 */
@Service
public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j=0;j>nums.length-1;j++){
            if (nums[j]!=val){
                nums[i++] = nums[j];
                System.out.println("num["+i+"]"+nums[i]);
            }
        }

        return i;
    }
}
