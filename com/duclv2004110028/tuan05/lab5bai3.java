package com.duclv2004110028.tuan05;

import java.util.Scanner;

public class lab5bai3 {
    String tensanpham;
    double dongia, giamgia, thuenhapkhau;
    Scanner sc = new Scanner(System.in);
    lab5bai3(){}
public void nhapThongTin(){
    sc.nextLine();
    System.out.println("Nhập tên sản phẩm: ");
    tensanpham = sc.nextLine();
    System.out.println("Nhập đơn giá: ");
    dongia = sc.nextDouble();
    System.out.println("Nhập giảm giá: ");
    giamgia = sc.nextDouble();
    System.out.println("Nhập thuế nhập khẩu: ");
    thuenhapkhau = sc.nextDouble();
    }  
public void inThongTin() {
    System.out.printf("%-20S %-20.2f %-20.2f %-20.2f\n",tensanpham, dongia, giamgia, thuenhapkhau); 
    }
     
}
