package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Leetcode {

	public static void main(String[] args) {

		//initialize l1
		ListNode l1 = new ListNode(1);
		ListNode curr = l1;
		curr.next = new ListNode(9);
		curr = curr.next;
		curr.next = new ListNode(1);
		curr = curr.next;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(4);
		
		curr = reverseList(l1);
		while (curr != null) {
			System.out.println(curr.val);
			curr = curr.next;}
	}

    public static ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode temp;
            while (head != null && head.next != null) {
            	temp = head.next;
            	head.next = prev;
            	prev = head;
            	head = temp;
            }//while
            head.next = prev;
            return head;
			    }//method
    }//class