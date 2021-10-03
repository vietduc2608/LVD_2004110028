package com.duclv2004110028.tuan04;

public class Account {
    String tenchutaikhoan;
    String sotaikhoan;
    String sodutrongtaikhoan;

    Account(){}

    Account(String t, String s, String sd){
        tenchutaikhoan = t;
        sotaikhoan = s;
        sodutrongtaikhoan = sd;
    }

    void intThongtinthe(){
        System.out.println("Tên chủ tài khoản: " +tenchutaikhoan + "  Số dư tài khoản: " +sotaikhoan + "  Số dư trong tài khoản: " +sodutrongtaikhoan);
    } 
}
