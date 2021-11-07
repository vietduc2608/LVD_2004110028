package com.duclv2004110028.tuan09;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LinkedList linked = new LinkedList();
        Apple apple = new Apple();
        Scanner sc = new Scanner(System.in);
        apple.display();
        linked.insertAt(new NodeApple(new Apple(12, "Yellow")), 10);
        linked.insertAt(new NodeApple(new Apple(11, "Black")), 10);
        linked.insertAt(new NodeApple(new Apple(10, "Green")), 20);
        linked.insertAt(new NodeApple(new Apple(7, "Red")), 20);
        linked.showData();
        
    }
}
