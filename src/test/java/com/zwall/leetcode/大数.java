package com.zwall.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-10 21:55
 **/
public class 大数 {



    public static void main(String[] args) {
        int[] ints = new int[5];
        String tt ="55555";
        char[] chars = tt.toCharArray();
        for(char c:chars){
            System.out.println(c);
        }
        //System.out.println(ints);
    }

    public static String bigMulti(String a,String b){
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int[] ints = new int[charsA.length + charsB.length];
        for(int i=charsA.length-1;i>0;i--){
            int intA = charsA[i];
            for(int j=charsB.length;j>0;j--){
                int intB = charsB[j];
                int tmpResult = intA*intB;
                int i1 = tmpResult % 10;
                int i2 = tmpResult/10;

                int i3 = ints[i + j] + i1;
                int i4 = ints[i + j+1] + i2;
                if(i3>=10){
                    ints[i + j]=i3-10;
                    i4+=1;
                }
            }
        }
        return null;
    }

    public static void addNum(int firs,int second,int index,int[] ints,int plus){
        int a1 = ints[index]+firs;
        int a2 = ints[index+1]+second;
        if(a1>=10){
            ints[firs] = a1-10;

        }else {
            ints[firs]=a1;
            ints[second]=a2;
        }

    }


}
