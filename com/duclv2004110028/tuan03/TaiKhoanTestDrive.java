package com.duclv2004110028.tuan03;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan taiKhoan = new TaiKhoan("Le Viet Duc");
        System.out.println("Ho Ten: " + taiKhoan.tenTk);
        taiKhoan = new TaiKhoan("Le Viet Duc", 123456789);
        System.out.println("Ho Ten: "+ taiKhoan.tenTk +" "+" So Tai Khoan: "+taiKhoan.stk);
        taiKhoan = new TaiKhoan("Le Viet Duc", 1234566789, 10000);
        System.out.println("Ho Ten: "+ taiKhoan.tenTk +" "+" So Tai Khoan: "+taiKhoan.stk +" So du: "+taiKhoan.soDu);
    }
}