package com.zwall.leetcode;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-17 22:24
 **/
public class 最长回文子串 {
    public static void main(String[] args) {

    }

    /**
     * 使用动态规划 dp[i][j]=j-i>2&&dp[i+1][j-1]
     *
     */
    public static String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 1;
        if (s.length() < 2) {
            return s;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        // 先填列
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    /**
     * 暴力解法
     * @param s
     * @return
     */
    public static String longestPalindrome2(String s) {
        if (s.length() < 2) {
            return s;
        }
        int index =0;
        int maxLength =1;
        for(int i=0;i<s.length()-1;i++){
            for (int j=i+1;j<s.length();j++){
                if(j-i+1>maxLength&&isOk(s,i,j)){
                    index=i;
                    maxLength=j-i+1;
                }
            }
        }
        return s.substring(index, index + maxLength);
    }

    public static boolean isOk(String s,int i,int j){
        boolean result = true;
        for(int p=0;p<j-i+1;p++){
            if(i+p>j-p){
                return result;
            }
            if(s.charAt(i+p)!=s.charAt(j-p)){
                return false;
            }
        }
        return result;
    }

}
