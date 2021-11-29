package com.duclv2004110028.thicuoiki1;

import javax.crypto.interfaces.PBEKey;

public class linkedlist {
    private int size;
    private NodeThucPham head, tail;
    ThucPham thucPham = new ThucPham();
    public linkedlist(){
        ThucPham.autoId = 1;
        this.size = 0;
        this.tail = null;
        this.head = null;
    }

    public int size(){
        return this.size;
    }

    public void addLast(NodeThucPham nThucPham,int position){
        if(this.tail != null){
            this.tail.next = nThucPham;
        }
        this.tail = nThucPham;
        if(this.head == null){
            this.head = nThucPham;
        }
        this.size++;
        return;
    }

    public void showData(){
        NodeThucPham nThucPham = head;
        while(nThucPham != null){
            nThucPham.hienThiData();
            nThucPham = nThucPham.next;
        }
    }
}

