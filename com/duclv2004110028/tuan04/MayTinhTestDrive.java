package com.duclv2004110028.tuan04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MayTinhTestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<MayTinh> mayTinhs = new ArrayList<>();
    public static void main(String[] args) {
        do{
            menu();
            System.out.println("Nhập Lựa Chọn:");
            int n = sc.nextInt();
            switch(n)
            {
                case 0:
                break;
                case 1:
                themMayTinh();
                break;
               
                case 2:
                xoaThongTin();
                break;
                case 3:
                inThongTin();
                break;
                default:
                System.out.println("Lựa Chọn Không Hợp Lệ!!!");
            
            }
        }while(true);
    }
    private static void menu()
    {
         System.out.println("==================MENU==============");
        System.out.println("=1============Thêm Máy Tính==========");
        System.out.println("=2============Xoá Thông Tin=========");
        System.out.println("=3=========Hiển Thị Danh Sách=======");
        System.out.println("=4============Sửa Thông Tin=========");
        System.out.println("=5=========Sắp Xếp Theo Giá=======");
        System.out.println("=0================THOÁT=============");
    }
    private static void themMayTinh()
    {
        System.out.println("Nhập Số Lượng Muốn Thêm:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            MayTinh mt = new MayTinh();
            mt.nhapThongTin();
            mayTinhs.add(mt);
        }
    }
    private static void xoaThongTin()
    {
        System.out.println("Nhập Giá Muốn Xoá");
        double g = sc.nextDouble();
        for (MayTinh mayTinh : mayTinhs) {
            if(mayTinh.gia == g)
            {
                mayTinhs.remove(mayTinh);
            }
        }
    }
    private static void inThongTin()
    {
        System.out.println("=================Thông Tin Máy Tính=================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S %-20S\n","Nhà Sản Xuất","Hệ Điều Hành","Năm Sản Xuất","Năm Bảo Hành","Ram","CPU","Giá");
        for (MayTinh mayTinh : mayTinhs) {
            mayTinh.xuatThongTin();
        }
    }
    
}
