package com.duclv2004110028.thicuoiki1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Product {
    String Loai, TenHangHoa;
    int SoLuongTonKho, MaHang;      
    float GiaNhap;
    Date NgayNhapKho;
    
    Product(){}

    public Product(String loai, String tenHangHoa, int soLuongTonKho, int maHang, float giaNhap, Date ngayNhapKho) {
        this.Loai = loai;
        this.TenHangHoa = tenHangHoa;
        this.SoLuongTonKho = soLuongTonKho;
        this.MaHang = maHang;
        this.GiaNhap = giaNhap;
        this.NgayNhapKho = ngayNhapKho;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }

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

    public void inThongTin(){
        System.out.println("Loại" +Loai + "Tên Hàng Hóa: "+TenHangHoa + "Mã Hàng: "+MaHang + "Số lượng tồn kho: "+SoLuongTonKho + "Giá Nhập: "+GiaNhap + "Ngày nhập kho: " +NgayNhapKho);
    }
    
    public void NhapDuLieu(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Mã Sản Phẩm: ");
        MaHang = sc.nextInt();
        System.out.println("Nhập Loại: ");
        Loai = sc.nextLine();
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
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void hienThi(){
        System.out.println(this);
    }

        
    
}
