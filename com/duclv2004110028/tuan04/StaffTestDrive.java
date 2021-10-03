package com.duclv2004110028.tuan04;
import java.util.Scanner;
public class StaffTestDrive {
    public static void main(String[] args) {
        Staff[] stafflist = new Staff[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < stafflist.length; i++){
            System.out.print("Tên nhân viên: ");
            String ten = bienNhap.nextLine();
            System.out.print("Địa chỉ: ");
            String dia = bienNhap.nextLine();
            System.out.print("Bộ phận làm việc: ");
            String bo = bienNhap.nextLine();
            System.out.print("Ngày sinh: ");
            String ngay = bienNhap.nextLine();
            System.out.print("Lương: ");
            String luong = bienNhap.nextLine();
            bienNhap.nextLine();
            stafflist[i] = new Staff(ten, dia, bo, ngay, luong);

        }

        System.out.println("-----Thông tin nhân viên sau khi nhập-----");
        for (Staff staff : stafflist) {
            staff.intThongtinnhanvien();
            
        }
    
    }
}
