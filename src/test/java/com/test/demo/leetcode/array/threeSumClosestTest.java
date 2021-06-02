package com.test.demo.leetcode.array;

import com.test.demo.DemoApplication;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class threeSumClosestTest extends TestCase {


    @Test
    public void testThreeSumClosest(){
        ThreeSumClosest_16 service = new ThreeSumClosest_16();
        int[] nums = new int[]{-1,2,1,-4};
        int target =1;

        service.threeSumClosest(nums,target);

    }
}