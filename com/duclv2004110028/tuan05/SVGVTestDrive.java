package com.duclv2004110028.tuan05;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SVGVTestDrive {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SVGD> svgds = new ArrayList<>();
   
    public static void main(String[] args) {
        
        do {
            menu();
            System.out.println("Nhập Lựa Chọn:");
            int n = sc.nextInt();
           switch (n) {
                case 0:
                break;
                case 1:
                nhapDanhSach();
                break;
                case 2:
                xuatDanhSachSinhVien();
                break;
                case 3:
                timSinhVienTheoHoTen();
                break;
                case 4:
                timVaXoaSinhVienTheoHoTen();
                break;
                case 5:
                xoaTheoDiem();
                break;
               default: System.out.println("Lựa Chọn Không Hợp Lệ!");
                   break;
           }
        } while (true);
    }
    private static void menu()
    {
        System.out.println("========================MENU========================");
        System.out.println("=1==================Nhập Sinh Viên==================");
        System.out.println("=2==================Xuất Thông Tin==================");
        System.out.println("=3=========Xuất Danh Sách Sinh Viên Theo Điểm=======");
        System.out.println("=4===============Tìm Sinh Viên Theo Tên=============");
        System.out.println("=5============Tìm Và Xóa Sinh Viên Theo Tên=========");
        System.out.println("=6============Tìm Và Xóa Sinh Viên Theo Điểm========");
        System.out.println("=0======================THOÁT=======================");
    }
    private static void nhapDanhSach(){
        System.out.println("Nhập số lượng sinh viên muốn thêm: ");
        int n = sc.nextInt();
        System.out.println("Nhập danh sách sinh viên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ "+ (i+1));
            SVGD svgd = new SVGD();
            svgd.nhapThongTin();
            svgds.add(svgd);
        }
    }
    public static void xuatDanhSachSinhVien() {
        int i = 1;

        System.out.println("==========Thông Tin Sinh Viên=========");
        for (SVGD svgd : svgds) {
            System.out.println("Sinh Viên Thứ " + i);
            svgd.inThongTin();
            i++;
        }
    }
    // Ham tim kiem sinh vien theo ten
    public static void timSinhVienTheoHoTen() {
        sc.nextLine();
        System.out.println("Nhập họ tên: ");
        String name = sc.nextLine();
        for (SVGD svgd : svgds) {
            if (name.equals(name)){
                svgd.inThongTin();
                break;
            }
        }   
            
    }
    public static void timVaXoaSinhVienTheoHoTen() {
        sc.nextLine();
        System.out.println("Nhập họ tên cần tìm và xóa: ");
        String name = sc.nextLine();
        for (SVGD svgd : svgds) {
            if (name.equals(name)){
                svgds.remove(name); 
                svgd.inThongTin();
                break;
            }
    }     
    }
    public static void xoaTheoDiem()
    {
        sc.nextLine();
        System.out.println("Nhập Điểm Muốn Xoá:");
        double d = sc.nextDouble();
        for (SVGD svgd : svgds) {
            if(svgd.diemTB == d)
            {
                svgds.remove(svgd);
            }
            break;
        }
    }     
}

            
            
            
        



