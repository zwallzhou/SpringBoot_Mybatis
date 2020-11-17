package com.zwall.leetcode;

/**
 * @description: board = [ ['A','B','C','E'], ['S','F','C','S'], ['A','D','E','E'] ]
 * 
 *               给定 word = "ABCCED", 返回 true 给定 word = "SEE", 返回 true 给定 word = "ABCB", 返回 false
 * 
 *
 * @author: zhou.wei
 * @create: 2020-11-09 19:48
 **/
public class 质素拆分 {
    public static void main(String[] args) {
        System.out.println(getCount(18));
    }

    public static int getCount(int target) {
         int count = 0;
        if (target <= 1) {
            return count;
        }
        for (int i = 2; i < target / 2; i++) {
            if (isZhiShu(i) && isZhiShu(target - i)) {
                System.out.println(i + "---" + (target - i));
                count++;
            }
        }
        return count;
    }

    public static boolean isZhiShu(int num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
