package com.zwall.niuke;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-21 19:23
 **/
public class 链表的第k个节点 {

    public static void main(String[] args) {
        LinkNode head = new LinkNode();
        head.val=0;
        LinkNode curr =head;
        for(int i=1;i<5;i++){
            LinkNode tmp = new LinkNode();
            tmp.val=i;
            curr.next =tmp;
            curr=tmp;
        }
        //findNode(head,5);
        delNode(head,3);
    }
    // 查找第k个节点
    public static void findNode(LinkNode linkNode,int k){
        if(linkNode==null){
            System.out.println("");
        }
        int len = 0;
        LinkNode countNode =linkNode;
        while (countNode!=null){
            countNode=countNode.next;
            len++;
        }

        LinkNode curr = linkNode;
        while (curr!=null){
            if(len==k){
                System.out.println("--------"+curr.val);
                return;
            }
            len--;
            curr=curr.next;
        }

    }

    // 根据值删除节点
    public static LinkNode delNode(LinkNode linkNode,int val){
        LinkNode curr = linkNode;
        LinkNode pre = null;
        while (curr!=null){
            if(curr.val==val){
                pre.next=curr.next;
                curr.next=null;
            }
            pre=curr;
            curr=curr.next;
        }

        return linkNode;
    }

    static class LinkNode{
        int val;
        LinkNode next;
    }
}
