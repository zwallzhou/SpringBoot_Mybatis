package com.zwall.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-11 20:40
 **/
class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(1);
        minStack.push(2);
        System.out.println(minStack.getMin());
    }

}
