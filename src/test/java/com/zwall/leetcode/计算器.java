package com.zwall.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 字符串表达式可以包含左括号 ( ，右括号 )，加号 + ，减号 -，乘法 *，除法 / 非负整数和空格  。
 * @author: zhou.wei
 * @create: 2020-11-21 23:19
 **/
public class 计算器 {
    public static void main(String[] args) {
        calculate("1+2*3-5");
    }

    public static int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        char[] chars = s.toCharArray();
        int sum=0;
        char sign = '+';
        for(int i=0;i<chars.length;i++){
            char aChar = chars[i];
            if (Character.isDigit(aChar)){
                while (i<chars.length&&Character.isDigit(chars[i])){
                    i++;
                    sum = sum*10+(aChar-'0');
                }
                switch (sign){
                    case '+':
                        stack.push(sum);
                        break;
                    case '-':
                        stack.push(-sum);
                        break;
                    case '*':
                        stack.push(stack.pop()*sum);
                        break;
                    case '/':
                        stack.push(stack.pop()/sum);
                        break;
                     default:
                         break;
                }
                if(i==chars.length){
                    break;
                }
                sum=0;
                i--;
            }else{
                sign=aChar;
            }
        }
        int result = 0;
        while (!stack.isEmpty()){

            result=result+stack.pop();
        }
        System.out.println("---- "+result);
        return result;
    }


}
