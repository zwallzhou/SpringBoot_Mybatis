package com.zwall.leetcode;

/**
 * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
 你可以对一个单词进行如下三种操作：
 插入一个字符
 删除一个字符
 替换一个字符
 * @author: zhou.wei
 * @create: 2020-11-21 20:34
 **/
public class 汉明距离 {
    /**
     *
     * 插入: 比较 word1[i] word2[j-1]
     * 删除: 比较 word1[i-1] word2[j]
     * 替换: 比较 word1[i-1] word2[j-1]
     *
     * 上诉三个min+1
     *
     * @param args
     */
    public static void main(String[] args) {

    }
    // 递归
    public static int compareInstance(String word1,String word2){
        if(word1.length()==0||word2.length()==0){
            return Math.max(word1.length(),word2.length());
        }
        if(word1.charAt(word1.length()-1)==word2.charAt(word2.length()-1)){
            return compareInstance(word1.substring(0,word1.length()-1),word2.substring(0,word2.length()-1));
        }
        return 1+Math.min(1,2);//对应公式三个递归
    }

    //动态规划 参考：https://leetcode-cn.com/problems/edit-distance/solution/dong-tai-gui-hua-java-by-liweiwei1419/
    //dp[i][j] = min(dp[i - 1][j - 1], dp[i][j - 1] + 1, dp[i - 1][j] + 1, dp[i - 1][j - 1] + 1)
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=word2.length();j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){ //这里注意减1
                    dp[i][j]=dp[i-1][j-1];
                    continue;
                }
                dp[i][j]=1+Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
