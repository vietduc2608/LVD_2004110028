package com.duclv2004110028.tuan04;
import java.util.Scanner;
public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien[] dSSinhVien = new SinhVien[2];
    Scanner nhapSV = new Scanner(System.in);

    System.out.println("Nhập vào danh sách sinh viên");

    for(int i = 0; i < dSSinhVien.length; i++){
        System.out.println("Nhập sinh viên thứ " + (i+1));
        System.out.println("Tên sinh viên: ");
        String tenSinhVien = nhapSV.nextLine();
        System.out.println("Mã sinh viên: ");
        String maSSV = nhapSV.nextLine();
        System.out.println("Tuổi: ");
        int tuoi = nhapSV.nextInt();
        nhapSV.nextLine();
        System.out.println("Quê quán: ");
        String queQuan = nhapSV.nextLine();
        dSSinhVien[i] = new SinhVien(tenSinhVien,maSSV,tuoi,queQuan);
    }
    System.out.println("In danh sách sinh vien");
    for (SinhVien sinhVien : dSSinhVien) {
        sinhVien.inThongTinSinhVien();
    }
    }
}
