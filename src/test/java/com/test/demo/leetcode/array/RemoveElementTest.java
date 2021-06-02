package com.test.demo.leetcode.array;

import com.test.demo.DemoApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RemoveElementTest {
    @Autowired
    RemoveElement_27 removeElement_27;

    @Test
    public void test(){
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int actual = removeElement_27.removeElement(nums, val);
        int expect = 5;
        Assert.assertEquals(expect,actual);
    }

}
