package com.itheima.test;

import org.junit.Test;

/**
 * @author gnehcgnaw
 * @date 2022-01-20 19:55
 */
public class SystemPropertyTest {
    @Test
    public void test1(){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.home"));
    }
}
