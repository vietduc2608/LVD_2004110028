package com.duclv2004110028.thicuoiki1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThucPham {
    String TenHangHoa;
    String loai = null;
    int SoLuongTonKho, MaHang;
    float GiaNhap;
    Date NgayNhapKho;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    public static int autoId;
    
    public ThucPham() {}

    public String getTenHangHoa() {
        return TenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        TenHangHoa = tenHangHoa;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
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

    // public static int getAutoId() {
    //     return autoId;
    // }

    // public static void setAutoId(int autoId) {
    //     ThucPham.autoId = autoId;
    // }

    public ThucPham(String tenHangHoa, String loai, int soLuongTonKho, float giaNhap, Date ngayNhapKho) {
        MaHang = ThucPham.autoId++;
        TenHangHoa = tenHangHoa;
        this.loai = loai;
        SoLuongTonKho = soLuongTonKho;
        GiaNhap = giaNhap;
        NgayNhapKho = ngayNhapKho;
    }
    // -------------------end getter and setter-----------------------

    public void inThongTin() {
        System.out.println("=============================================Thông Tin Hàng Hóa=============================================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "Ma Hang Hoa", "Ten Hang Hoa", "Loai" ,"So Luong Ton Kho", "Gia Nhap", "Ngay Nhap Kho");
        System.out.printf("%-20d %-20S %-20S %-20d %-20.2fVND %-20S\n", this.autoId, this.TenHangHoa, this.loai, this.SoLuongTonKho, this.GiaNhap,this.format.format(NgayNhapKho) );
    }

    public void NhapDuLieu() {
        int l;
        // System.out.println("Nhập Mã Sản Phẩm: ");
        // MaHang = sc.nextInt();
        // sc.nextLine();
        System.out.println("Chon Loai");
        System.out.println("Loai 1; Loai 2; Loai 3;");
        l = sc.nextInt();
        if (l == 1) {
            loai = "Thuc Pham";
        }
        if (l == 2) {
            loai = "Sanh Su";
        }
        if (l == 3) {
            loai = "Dien May";
        }
        if( l > 3){
            loai = "Lua Chon Khong Hop Le!!!";
        }
        sc.nextLine();
        System.out.println("Nhap Ten San Pham: ");
        TenHangHoa = sc.nextLine();
        System.out.println("Nhap Gia Nhap: ");
        GiaNhap = sc.nextFloat();
        System.out.println("Nhap So Luong Ton Kho: ");
        SoLuongTonKho = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Ngay Nhap Kho: ");
        String ngayNhapKhoString = sc.nextLine();
        if (ngayNhapKhoString.equals("")) {
            NgayNhapKho = null;
        } else {
            try {
                NgayNhapKho = format.parse(ngayNhapKhoString);
            } catch (ParseException ex) {
                System.out.println("Ngay Khong Hop Le!!!!!");
            }
        }
    }

}
