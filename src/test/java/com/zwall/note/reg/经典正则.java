package com.zwall.note.reg;

import org.junit.Test;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2019-08-11 21:54
 **/
public class 经典正则 {

    /**
     *  1.匹配最外层表达式  (?<=\{).*(?=\})
     *      内容:{a{b{c}}}  结果:a{b{c}}
     *  2.匹配最内层    {[^{}]+}
     *      内容:{a{b{c}}}    匹配:{c}
     *  3.匹配#中间的内容 (?<=#).*?(?=#)   ?在其他限制符号后为 非贪婪模式
     *      内容:#11#2#3#4#   匹配:11234
     *
     *  4.匹配不包含固定单词的字符串 \b((?!word).)+\b
     *      内容:9word2 one  匹配:one
     *  5.匹配非.js结尾的文件 \b\w+\.((?!js\b)\w)+
     *      内容:1.js 2.java  匹配:2.java   分析:由于(?!js\b)是不占位的则\w会在原位置.
     */

    @Test
    public void test01(){
        System.out.println("aa");
    }
}
