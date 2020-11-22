package com.zwall.niuke;

import java.util.Arrays;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-19 21:45
 **/
public class 名字漂亮度 {
    public static void main(String[] args) {
        StringBuffer sf = new StringBuffer();
        countAll("AcaD");
    }

    public static int countAll(String name){
        char[] chars = name.toLowerCase().toCharArray();
        Arrays.sort(chars);
        int plus = 26;
        int sum = 26;
        char pre = chars[0];
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=pre){
                pre=chars[i];
                plus--;
            }
            sum=sum+plus;
        }
        System.out.println("----"+sum);
        return sum;
    }
}
