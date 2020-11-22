package com.zwall.niuke;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-22 20:43
 **/
public class 完全数 {
    public static void main(String[] args) {
        countAll(1000); //6 28 496
    }
    // 除自身外的所有因数之合等于自身
    public static int countAll(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println("---- "+i);
            }
            sum=0;
        }
        return 0;
    }
}
