package com.duclv2004110028.tuan03;

public class NhanVien {
    String tennhanvien, diachi, bophanlamviec, ngaysinh;
    float luong;
    
    NhanVien()
    {

    }
    NhanVien(String tnv)
    {
        tennhanvien = tnv;
    }
    NhanVien(String tnv1, String dc)
    {
        tennhanvien = tnv1;
        diachi = dc;
    }
    NhanVien(String tnv2, String dc1, String bplv)
    {
        tennhanvien = tnv2;
        diachi = dc1;
        bophanlamviec = bplv;

    }
    NhanVien(String tnv3, String dc2, String bplv1, String ns)
    {
        tennhanvien = tnv3;
        diachi = dc2;
        bophanlamviec = bplv1;
        ngaysinh = ns;
    
    }
    NhanVien(String tnv4, String dc3, String bplv2, String ns1, float l)
    {
        tennhanvien = tnv4;   
        diachi = dc3;
        bophanlamviec = bplv2;
        ngaysinh = ns1;
        luong = l;
    
    }
}
