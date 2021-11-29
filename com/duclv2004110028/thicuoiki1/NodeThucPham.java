package com.duclv2004110028.thicuoiki1;

public class NodeThucPham {
    public ThucPham thucPham;
    public NodeThucPham next;
    public NodeThucPham(ThucPham thucPham){
        this.thucPham = thucPham;
        this.next = null;
    }
    public void hienThiData(){
        thucPham.inThongTin();
    }
}
