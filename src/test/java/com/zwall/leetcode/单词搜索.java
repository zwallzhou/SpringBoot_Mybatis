package com.zwall.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * board = [ ['A','B','C','E'], ['S','F','C','S'], ['A','D','E','E'] ]
 * 
 *     给定 word = "ABCCED", 返回 true 给定 word = "SEE", 返回 true 给定 word = "ABCB", 返回 false
 * 
 *
 * @author: zhou.wei
 * @create: 2020-11-09 19:48
 **/
public class 单词搜索 {
    public static void main(String[] args) {

        if(isZhiShu(3)){
            System.out.println("是质素");
        }
    }

    public boolean exist(char[][] board, String word) {

        return false;
    }

    public static int getCount(int target){
        int count =0;
        for(int i=2;i<target/2;i++){
            if(isZhiShu(i)&&isZhiShu(target-i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isZhiShu(int num){
        boolean result = true;
        for(int i=2;i<num;i++){
            System.out.println(11);
            if(num%i==0){
                result = false;
            }
        }
        return result;
    }
}
