package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,String city,int age){
        System.out.println("名字：" + name +"； 年龄：" + age +"； 城市：" + city);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"张三","杭州",15},
                {"李四","余杭",18},
                {"王五","西湖",20},
                {"马六","江干",23},
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,String city,int age){
        System.out.println("test11方法 名字：" + name +"； 年龄：" + age +"； 城市：" + city);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,String city,int age){
        System.out.println("test222方法 名字：" + name +"； 年龄：" + age +"； 城市：" + city);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"张三","杭州",25},
                    {"李四","余杭",28},
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"王五","西湖",30},
                    {"马六","江干",33},
            };
        }
        return result;
    }
}
