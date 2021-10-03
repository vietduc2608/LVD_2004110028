package com.duclv2004110028.tuan03;

public class TaiKhoan {
    String tenTk;
    int stk;
    double soDu;
    TaiKhoan(String name){
        tenTk = name;
    }
    TaiKhoan(String ten, int sTk)
    {
        tenTk = ten;
        stk = sTk;
    }
    TaiKhoan(String tenTK, int STK,double soDuTk )
    {
        tenTk = tenTK;
        stk = STK;
        soDu = soDuTk;
    }
}
