package com.sun.list;

/**
 * Created by Chris on 2016/8/10.
 * description：输入一个链表，输出该链表中倒数第k个结点。（剑指offer）
 * 思路：先走k部，记录下位置，然后指向第一个节点位置的引用与当前位置同时向next走，直到尾部。
 */

class Node {
    int val;
    Node next = null;

    Node(int val) {
        this.val = val;
    }
}

public class FindKthToTail {
    public Node FindKthToTail(Node head,int k) {
        if (head == null)
            return head;
        if (k == 0)
            return null;
        Node node = head;
        for(int i=1; i<k; ++i){
            node = node.next;
        }
        if (node == null)
            return node;
        Node cur = head;
        while(node.next != null){
            node = node.next;
            cur = cur.next;
        }
        return cur;
    }
}
