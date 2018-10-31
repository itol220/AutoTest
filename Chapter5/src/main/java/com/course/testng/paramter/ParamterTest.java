package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
    @Parameters({"name","city","age"})
    public void paramTest1(String name,String city,int age){
        System.out.println("名字：" + name + "；   年龄：" + age + "；  城市：" + city);
    }
}
