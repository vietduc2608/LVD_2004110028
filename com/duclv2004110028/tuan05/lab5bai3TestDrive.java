package com.duclv2004110028.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class lab5bai3TestDrive {
    static ArrayList<lab5bai3> l5b3s = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       do {
        System.out.println("=====Menu=====");
        System.out.println("1.Nhập danh sách");      
        System.out.println("2.Tìm và xóa sản phẩm theo tên");
        System.out.println("3.Sắp xếp giảm dần theo giá");
        System.out.println("4.Xuất Giá Trung Bình");
        System.out.println("Lựa chọn của bạn là: ");
        int n = sc.nextInt();

        switch(n)
        {
            case 0:
            break;
            case 1:
            nhapThongTin();
            break;
            case 2:
            xoaTheoTen();
            break;
            case 3:
            sapXep();
            break;
            case 4:
            xuatThongTin();
            break;
            default:
            System.out.println("Lựa chọn ko hợp lệ! Vui lòng chọn lại");
        }
       } while (true);
        
    }
    
    public static void nhapThongTin() {
        System.out.println("Nhập danh sách sản phẩm ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            lab5bai3 l5b3 = new lab5bai3();
            l5b3.nhapThongTin();
            l5b3s.add(l5b3);
                   
        }      
    }
    public static void xoaTheoTen() {
        System.out.println("Nhập tên sản phẩm cần tìm và xóa: ");
        sc.nextLine();
        String ten = sc.nextLine();
        for (lab5bai3 lab5bai3 : l5b3s) {
            if(ten.equals(lab5bai3.tensanpham))
            {
                l5b3s.remove(lab5bai3);
                break;
            }
        }
        xuatThongTin();
    }    
    public static void sapXep() {
        Collections.sort(l5b3s, new Comparator<lab5bai3>(){
            @Override
            public int compare(lab5bai3 o1, lab5bai3 o2) {
                if(o1.dongia < o2.dongia)
                {
                    return -1;
                }
                return 1;
            }
        }); 
        System.out.println("Danh sách sau khi sắp xếp: ");
        xuatThongTin();
        
    }
    // public void xuatGiaTrungBinh() {
  
    // }
    public static void xuatThongTin() {
        System.out.printf("%-20S %-20S %-20S %-20S\n","Tên Sản Phẩm", "Đơn Giá","Giảm Giá","Thuế");
        for (lab5bai3 lab5bai3 : l5b3s) {
            lab5bai3.inThongTin();
        }
        
    }
}

