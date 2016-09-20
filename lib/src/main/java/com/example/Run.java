package com.example;

/**
 * Created by admin on 2016/9/17.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("Linklist test begin:5,5,2,8,6,7,1,5,4,5,");
        LinkList ll = new LinkList();
        ll.addToTail(5);
        ll.addToTail(2);
        ll.addToTail(8);
        ll.addToTail(6);
        ll.addToTail(7);
        ll.addToTail(1);
        ll.addToTail(5);
        ll.addToTail(4);
        ll.addToHead(5);
        ll.addToTail(5);
        ll.printAll();
        System.out.println("delete all 5 count:" +  ll.delete(5));
        System.out.println("is 7 in list:" + ll.isInList(7));
        System.out.println("is 10 in list:" + ll.isInList(10));
        ll.printAll();
        ll.deleteFromHead();
        ll.printAll();
        ll.deleteFromTail();
        ll.printAll();
    }
}
