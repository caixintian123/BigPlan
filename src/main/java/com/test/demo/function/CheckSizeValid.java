package com.test.demo.function;

import com.test.demo.VO.User;
import com.test.demo.annotation.CheckSize;

import java.lang.reflect.Field;

public class CheckSizeValid {
    public static void check(User user) throws IllegalAccessException {
        for (Field field : user.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            CheckSize checkSize = field.getAnnotation(CheckSize.class);
            if (checkSize != null ){
                Object object = field.get(user);
                if (object instanceof Integer){
                    int num = (int) object;
                    if (num < checkSize.min()){
                        System.out.println("too short");
                    }else {
                        System.out.println("too long");
                    }
                }
            }
        }

    }
}
