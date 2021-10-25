package com.duclv2004110028.tuan07;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        
        
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(4);
        myLinkedList.addLast(3);
        myLinkedList.addLast(8);
        myLinkedList.addFirst(1);
        myLinkedList.removeFist(1);
        myLinkedList.removeLast(8);


        myLinkedList.print();
        
    }
}
