package com.test.demo.VO;

import com.test.demo.annotation.CheckSize;
import io.swagger.annotations.ApiModel;

@ApiModel
public class User {

    @CheckSize
    private int age;

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
