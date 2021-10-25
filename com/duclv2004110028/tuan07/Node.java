package com.duclv2004110028.tuan07;

public class Node {
    //Nội dung
    int data; 

    //Liên kết đến nút tiếp theo
    //Tham chiếu
    Node next;//Biến tham chiếu kiểu Node
   
    public Node(){}

    public Node(int d){
        data = d;

    }

    public Node(int d, Node n){
        data = d;
        next = n;
    }
}
