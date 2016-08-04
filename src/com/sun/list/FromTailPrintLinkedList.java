package com.sun.list;

import java.util.ArrayList;

/**
 * Created by Chris on 2016/8/4.
 * description:输入一个链表，从尾到头打印链表每个节点的值。(剑指offer)
 */
class ListNode {
    public int val;
    public ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}
public class FromTailPrintLinkedList {
    private static ArrayList<Integer> temp = new ArrayList<Integer>();

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode != null){
            printListFromTailToHead(listNode.next);
            temp.add(listNode.val);
        }
        return temp;
    }
    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(printListFromTailToHead(a));
    }
}
