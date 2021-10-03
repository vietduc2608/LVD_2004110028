package com.duclv2004110028.tuan04;

public class Book {
    String nhaxuatban, namxuatban, loai;
    int soluong;
    float giaban;

    Book(){}

    Book(String nxb, String xb, String l, int sl, float gb){
        nhaxuatban = nxb;
        namxuatban = xb;
        loai = l;
        soluong = sl;
        giaban = gb;
    }

    void intThongtinsach(){
        System.out.println("Nhà xuất bản: " +nhaxuatban + "  Năm xuất bản: " +namxuatban + "  Loại sách: " + loai + "  Số lượng: " +soluong + "  Giá bán: " +giaban);
    }
}
