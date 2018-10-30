package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupsOnClass3 {

    public void stu1(){
        System.out.println("GroupsOnClass1中的teacher1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的teacher2运行");
    }
}
