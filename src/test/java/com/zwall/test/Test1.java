package com.zwall.test;

import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.thymeleaf.util.MapUtils;

import java.util.Arrays;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-05-31 21:51
 **/
public class Test1 {
    @Test
    public void test1() {
        String str = "a|b|c|";
        String[] split = str.split("\\|");
        System.out.println(split[split.length - 1]);
    }
}
