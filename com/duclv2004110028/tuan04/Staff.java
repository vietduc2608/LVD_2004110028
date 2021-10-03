package com.duclv2004110028.tuan04;

public class Staff {
    String tennhanvien;
    String diachi;
    String bophanlmviec;
    String ngaysinh;
    String luong;
    
    Staff(){}

    Staff(String tnv, String dc, String bplv, String ns, String l){
        tennhanvien = tnv;
        diachi = dc;
        bophanlmviec = bplv;
        ngaysinh = ns;
        luong = l;
    }
    
    void intThongtinnhanvien(){
        System.out.println("Tên nhân viên " +tennhanvien + "  Địa chỉ " +diachi + "  Bộ phận làm việc: " +bophanlmviec + "  Ngày sinh: " +ngaysinh + "  Lương: " +luong);
    }
}
