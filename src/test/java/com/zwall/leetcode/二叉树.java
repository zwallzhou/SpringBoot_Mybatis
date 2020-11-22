package com.zwall.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-10 21:55
 **/
public class 二叉树 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        int[] ints = new int[5];
        System.out.println(ints);
    }

    // BFS 广度优先
    public int maxDepth2(TreeNode root) {
        int deepTh = 0;
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode head = queue.poll();
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
                size--;
            }
            deepTh += 1;
        }
        return deepTh;
    }
    //DFS
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int L =maxDepth(root.left);
        int R =maxDepth(root.right);
        return Math.max(L,R)+1;
    }

    //
}
