package com.duclv2004110028.tuan05;

import java.util.Scanner;

public class SVGD {
    Scanner sc = new Scanner(System.in);
    String hoTen;
    double diemTB;
    SVGD(){}

public  SVGD(String hT, double d){
    hT = hoTen;
    d = diemTB;
    
}
public void nhapThongTin()
    {
        System.out.println("Nhập tên sinh viên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập điểm: ");
        diemTB = sc.nextDouble();
    }
public void inThongTin(){
        System.out.println("Tên Sinh Viên: "+hoTen  +" Điểm: "+diemTB);
    }

}
        
