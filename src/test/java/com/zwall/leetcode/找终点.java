package com.zwall.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个正整数数组，最大为100个成员，从第一个成员开始，走到数组最后一个成员最少的步骤数。
 * 第一步必须从第一元素开始，1<=步长<len/2, 第二步开始以所在成员的数字走相应的步数，如果目标不可达返回-1，只输出最少的步骤数。
 *
 * @author: zhou.wei
 * @create: 2020-11-09 19:48
 **/
public class 找终点 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 4, 2, 6, 8, 3, 5, 4, 3, 9};
        //System.out.println(getCount(arr));
        System.out.println(test(4));
    }

    public static int test(int num){
        num-=1;
        if(num==2){
            return num;
        }
        if(num>0){
            return test(num);
        }
        return num;
    }
    //
    public static List<Integer> getCount(int[] target) {
        List<Integer> result = new ArrayList<>();//保存所有的取最小, 最好记录一个最小值即可
        for (int firstStep = 1; firstStep < target.length - 1; firstStep++) {
            Integer total = 0;
            int recursion = recursion(firstStep, 0, target.length, target, 0);
            result.add(recursion);
            System.out.println(recursion+"  ==========");
        }

        return result;
    }

    public static int recursion(int step, int currentIndex, int length, int[] target, Integer total) {

        if (currentIndex + step + 1 > length) {
            total = -1;
            return total;
        } else if (currentIndex + step + 1 == length) {
            total+=1;
            System.out.println(currentIndex+"-----"+step);
            return total;
        } else {
            currentIndex = currentIndex + step;
            step = target[currentIndex];
            return recursion(step, currentIndex, length, target, total + 1);
        }
    }

}
