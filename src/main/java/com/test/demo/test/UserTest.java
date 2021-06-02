package com.test.demo.test;

import com.test.demo.VO.User;
import com.test.demo.function.CheckSizeValid;

public class UserTest {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        user.setAge(-1);
        CheckSizeValid.check(user);
    }
}
