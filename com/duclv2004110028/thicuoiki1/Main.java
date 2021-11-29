package com.duclv2004110028.thicuoiki1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<ThucPham> thucpham = new ArrayList<>();
    public static void main(String[] args) {
        
        int n;
        do {
            menu();
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    themHangHoa();
                    break;
                case 2:
                    xoaHangHoa();
                    break;
                case 3:
                    suaHoangHoa();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    sapXepTangDan();
                    break;
                case 6:
                    sapXepGiamDan();
                    break;
                case 7:
                    thongKe();
                    break;
                case 8:
                    xuatThongTin();
                    break;
                default:
                    break;
            }
        } while (n != 0);
    }

    public static void menu() {
        System.out.println("=======================");
        System.out.println("1.========Thêm Hàng Hóa=========");
        System.out.println("2.=========Xóa Hàng Hóa=========");
        System.out.println("3.=========Sửa Hàng Hóa=========");
        System.out.println("4.===========Tìm Kiếm===========");
        System.out.println("5.=======Sắp Xếp Tăng Dần=======");
        System.out.println("6.=======Sắp Xếp Giảm Dần=======");
        System.out.println("7.============Thống Kê==========");
        System.out.println("8.==========Xuất Thông Tin======");
        System.out.println("Nhập lựa chọn của bạn: ");
        }
        

    private static void themHangHoa(){
        System.out.println("Nhập Số Lượng Muốn Thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ThucPham tp = new ThucPham();
            tp.NhapDuLieu();
            thucpham.add(tp);
        }
    }

    private static void suaHoangHoa(){

    }

    private static void xoaHangHoa(){
        System.out.println("Nhập Mã Thực Phẩm Muốn Xóa: ");
        int maHang = sc.nextInt();
        for (ThucPham thucPham : thucpham) {
            if(thucPham.MaHang == maHang){
                thucpham.remove(thucPham);
            }
        }
    }

    private static void timKiem(){

    }

    private static void sapXepGiamDan(){

    }

    private static void sapXepTangDan(){

    }

    private static void thongKe(){

    }

    private static void xuatThongTin(){
        System.out.println("=======Thông Tin Hàng Hóa=======");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n", "Mã Hàng Hóa", "Tên Hàng Hóa", "Số Lượng Tồn Kho", "Giá Nhập", "Ngày Nhập Kho");
        for (ThucPham thucPham : thucpham) {
            thucPham.inThongTin();
        }
    }
}

