package com.example;

public class LinkList {
    LLNode head, tail;

    public LinkList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public LLNode addToHead(int i){
        head = new LLNode(i, head);
        if (tail == null) {
            tail = head;
        }
        return head;
    }

    public LLNode addToTail(int i){
        LLNode node;
        if (tail !=  null){
            node = new LLNode(i);
            tail.next = node;
            tail = tail.next;
        } else {
            node = addToHead(i);
        }
        return node;
    }

    public LLNode deleteFromHead() {
        LLNode node = head;
        if (head == tail) {
            //for 1 or 0 notes in LL
            head = tail = null;
        } else {
            head = head.next;
        }
        return node;
    }

    public LLNode deleteFromTail() {
        LLNode node = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            LLNode temp;
            for (temp = head; temp.next != tail; temp = temp.next);
            tail = temp;
            tail.next = null;
        }
        return node;
    }

    public void printAll() {
        System.out.print("print LinkList:[");
        for (LLNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.number + ", ");
        }
        System.out.println("] with H=" + head.number + "T=" + tail.number);
    }

    public boolean isInList(int i){
        LLNode temp;
        for (temp = head; temp != null && temp.number != i; temp = temp.next);
        return temp != null;
    }

    public int delete(int i) {
        LLNode pre, curr;
        int count = 0;
        if (isEmpty()) {
            return 0;
        }
        for (pre = head, curr = head.next; curr != null; pre = pre.next, curr = curr.next)  {
            //System.out.println("pre.number = " + pre.number + " curr.number=" + curr.number);
            if (pre.number == i && head == tail) {
                head = tail = null;
                count++;
                printAll();
            } else if (pre.number == i) {
                head = pre.next;
                count++;
                printAll();
            } else if (curr.number == i) {
                pre.next = curr.next;
                if (curr == tail) {
                    tail = pre;
                    break;
                }
                curr = curr.next;
                count++;
                printAll();
            }
        }
        return count;
    }
}
