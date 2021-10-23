package com.duclv2004110028.tuan07;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(4);
        myLinkedList.add(3);
        myLinkedList.add(8);
        myLinkedList.push(1);
        myLinkedList.removeFist(1);
        myLinkedList.removeLast(8);


        myLinkedList.print();
        
    }
}
