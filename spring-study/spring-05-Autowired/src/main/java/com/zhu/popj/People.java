package com.zhu.popj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {

//    @Autowired //(required = false or true)
//    @Qualifier(value = "cat111")
//    public Cat cat;
//    @Autowired
//    @Qualifier(value = "dog222")
//    public Dog dog;

    @Resource(name = "cat2")
    private Cat cat;

    @Resource
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
