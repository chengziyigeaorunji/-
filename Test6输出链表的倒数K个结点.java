package edu.xalead;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 例如：给定一个链表: 1->2->3->4->5, 和 n = 2。当删除了倒数第二个节点后，链表变为 1->2->3->5
 * 思路分析:
 * 1.逆序链表
 * 2.删除第K个结点.
 */
public class Test6输出链表的倒数K个结点 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode nixu(ListNode listNode){
        if(listNode==null){
            return null;
        }
        ListNode pre=null;
        ListNode next=null;
        while (listNode!=null) {
            next=listNode.next;
            listNode.next=pre;
            pre=listNode;
            listNode=next;
        }
        return pre;
    }
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head.next==null||head==null){
            return head;
        }
        if(n<=2){
            return nixu(head).next;
        }
        ListNode node=nixu(head);
        ListNode temp=node;
        for (int i=1;i<n-1;i++){
            temp=temp.next;
        }
        if(temp.next.next!=null) {
            temp.next = temp.next.next;
            return nixu(temp);
        }
        temp.next=null;
        return temp;
    }
}
