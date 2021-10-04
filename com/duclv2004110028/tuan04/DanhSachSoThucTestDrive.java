package com.duclv2004110028.tuan04;
import java.util.Scanner;
public class DanhSachSoThucTestDrive {
    public static void main(String[] args) {
        DanhSachSoThuc ds = new DanhSachSoThuc();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("====Menu Chuong Trinh====");
            System.out.println("1=====Nhap Danh Sach======");
            System.out.println("2====Hien Thi Danh Sach====");
            System.out.println("3=======Tinh Tong==========");
            System.out.println("0=========Thoat============");
            
            System.out.println("Lua chon cua chon la: ");

            choice = sc.nextInt();
            if(choice != 0){
                switch(choice){
                    case 0:
                    System.exit(0);
                    case 1:
                    ds.nhap();
                    break;
                    case 2:
                    ds.hienThi();
                    break;
                    case 3:
                    ds.tinhTong();
                    break;
                    default:
                    System.out.println("Nhap sai gia tri! Vui long nhap lai");
                }
            }
        } while (choice != 0);

        System.out.println("====Chuong Trinh Ket Thuc====");
    }
    
}
