package leet_83;

import java.util.ArrayList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<ListNode> completeListNode = new ArrayList<>();
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.next != null) { // check not in last point
                if (currentNode.val == currentNode.next.val) { // current val == next val
                    currentNode.next = currentNode.next.next;
                    continue;
                }
            }

            // current val != next val
            completeListNode.add(currentNode);
            currentNode = currentNode.next;
        }

        return completeListNode.size() > 0 ? completeListNode.get(0) : head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}