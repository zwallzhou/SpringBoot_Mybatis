package com.zwall.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-09 19:48
 **/
public class 全排列 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        permute(ints);
    }
    public static List<List<Integer>> permute(int[] ints){
        List<List<Integer>> resultList = new ArrayList<>();
        boolean[] useArr = new boolean[ints.length];
        recursive(ints,ints.length,0,new ArrayList<>(),useArr,resultList);
        return resultList;
    }
    public static void recursive(int[] ints, int length, int deep, List<Integer> centerArr, boolean[] useArr,
        List<List<Integer>> resultList) {
        if (deep >= length) {
            resultList.add(new ArrayList<>(centerArr));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!useArr[i]) {
                centerArr.add(ints[i]);
                useArr[i] = true;
                recursive(ints, length, deep + 1, centerArr, useArr, resultList);
                useArr[i] = false;
                centerArr.remove(centerArr.size() - 1);
            }
        }

    }

}
