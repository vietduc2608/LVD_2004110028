package com.duclv2004110028.tuan04;

public class SinhVien {
    String tenSinhVien;
    String maSSV;
    int tuoi;
    String queQuan;

    public SinhVien(){}

    public SinhVien(String ten, String ma, int t, String que){
        tenSinhVien = ten;
        maSSV = ma;
        tuoi = t;
        queQuan = que;
    }

    void inThongTinSinhVien(){
        System.out.println("Tên sinh viên: " + tenSinhVien + " Mã số sinh viên: " + maSSV + " Tuổi: "+ tuoi + " Quê quán: " + queQuan);
    } 
}
