package com.duclv2004110028.tuan03;


public class NhanVienTestDrive {
    public static void main(String[] args) {
       NhanVien nhanVien = new NhanVien("Le Viet Duc");
       System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien);
       nhanVien = new NhanVien("Le Viet Duc", "Da Lat");
       System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien + " Dia chi: " +nhanVien.diachi);
       nhanVien = new NhanVien("Le Viet Duc", "Da Lat", "Quan Li");
       System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien + " Dia chi: " +nhanVien.diachi + " Bo Phan Lam Viec: " +nhanVien.bophanlamviec);
       nhanVien = new NhanVien("Le Viet Duc", "Da Lat", "Quan Li", "8/26/2002");
       System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien + " Dia chi: " +nhanVien.diachi + " Bo Phan Lam Viec: " +nhanVien.bophanlamviec + " Ngay sinh: " +nhanVien.ngaysinh);
       nhanVien = new NhanVien("Le Viet Duc", "Da Lat", "Quan Li", "8/26/2002", 2000000);
       System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien + " Dia chi: " +nhanVien.diachi + " Bo Phan Lam Viec: " +nhanVien.bophanlamviec + " Ngay sinh: " +nhanVien.ngaysinh + " Luong: " + nhanVien.luong);


    }
}
