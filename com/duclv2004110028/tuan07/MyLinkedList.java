package com.duclv2004110028.tuan07;


public class MyLinkedList {
    Node head = null;
    Node tail = null;

    public MyLinkedList(){}

    void push(int data){
        Node newNode = new Node(data);
        if(head == null){//thêm 1 nút vào ds rỗng
            head = newNode;
        }else{//ds ko rỗng// thêm vào đuôi ds
            newNode.next = head;
            head = newNode;
        }
    }
    
    void add(int data){
        //Tạo 1 Node mới
        Node newNode = new Node(data);
        if(head == null){//thêm 1 nút vào ds rỗng
            head = newNode;
            tail = newNode;
        }else{//ds ko rỗng// thêm vào đuôi ds
            tail.next = newNode;
            tail = newNode;
        }
    }

    void removeFist(int data){
        if(head == null){
            System.out.println("Ko có gì để xóa!");
        }else{
            head = head.next;
        }
    }

    void removeLast(int data){
       Node p = head;
       while(p.next.next != null){
           p = p.next;
       }
       p.next = p.next.next; // Cho next bằng NULL
       // Hoặc viết p.next = NULL cũng được
    }

    void print(){
        Node current = head;
        
        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }
        System.out.println("Các nút trong danh sách: ");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    void find(){
        
    }
        
}
