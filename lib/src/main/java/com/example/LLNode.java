package com.example;

/**
 * Created by admin on 2016/9/17.
 */
public class LLNode {
    public int number;
    public LLNode next;

    public LLNode(int i) {
        this(i, null);
    }

    public LLNode(int i, LLNode node) {
        number = i;
        next = node;
    }
    /*
    public LLNode add(int i) {
        LLNode node = new LLNode(i);
        next = node;
        return node;
    }
    */
}
