package com.course.testng;

import org.testng.annotations.Test;

public class ExcepedException {
    /**
     * 使用场景
     * 期望某一异常
     * 不合法参数抛异常
     * 预期结果，就是这个异常
     */
    //这是一个测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaild(){
        System.out.println("这是一个失败的异常测试");throw new RuntimeException();
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSeccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
