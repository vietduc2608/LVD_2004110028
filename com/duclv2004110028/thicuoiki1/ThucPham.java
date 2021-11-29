package com.duclv2004110028.thicuoiki1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ThucPham{
    String TenHangHoa;
    int SoLuongTonKho, MaHang;      
    float GiaNhap;
    Date NgayNhapKho;   
    public static int autoId;
    ThucPham(){}

    public ThucPham(String tenHangHoa, int soLuongTonKho, int maHang, float giaNhap, Date ngayNhapKho) {
        this.TenHangHoa = tenHangHoa;
        this.SoLuongTonKho = soLuongTonKho;
        this.MaHang = maHang;
        this.GiaNhap = giaNhap;
        this.NgayNhapKho = ngayNhapKho;
    }
    //-------------------begin getter and setter-----------------------
    public String getTenHangHoa() {
        return TenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        TenHangHoa = tenHangHoa;
    }

    public int getSoLuongTonKho() {
        return SoLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        SoLuongTonKho = soLuongTonKho;
    }

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int maHang) {
        MaHang = maHang;
    }

    public float getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        GiaNhap = giaNhap;
    }

    public Date getNgayNhapKho() {
        return NgayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        NgayNhapKho = ngayNhapKho;
    }
    //-------------------end getter and setter-----------------------

    public void inThongTin(){
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n", MaHang, TenHangHoa, SoLuongTonKho, GiaNhap, NgayNhapKho);
    }
    
    public void NhapDuLieu(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Mã Sản Phẩm: ");
        MaHang = sc.nextInt();
        System.out.println("Nhập Tên Sản Phẩm: ");
        TenHangHoa = sc.nextLine();
        System.out.println("Nhập Giá Nhập: ");
        GiaNhap = sc.nextFloat();
        System.out.println("Nhập Số Lượng Tồn Kho: ");
        SoLuongTonKho = sc.nextInt();
        System.out.println("Nhập Ngày Nhập Kho: ");
        String ngayNhapKhoString = sc.nextLine();
        if(ngayNhapKhoString.equals("")){
            NgayNhapKho = null;
        }else{
            try{
                NgayNhapKho = format.parse(ngayNhapKhoString);   
            }catch (ParseException ex){
                Logger.getLogger(ThucPham.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
