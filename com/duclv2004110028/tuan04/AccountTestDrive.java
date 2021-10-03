package com.duclv2004110028.tuan04;
import java.util.Scanner;
public class AccountTestDrive {
    public static void main(String[] args) {
        Account[] accountlist = new Account[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < accountlist.length; i++){
            System.out.print("Tên chủ tài khoản: ");
            String name = bienNhap.nextLine();
            System.out.print("Số tài khoản: ");
            String so = bienNhap.nextLine();
            System.out.print("Số dư trong tài khoản: ");
            String sodu = bienNhap.nextLine();
            bienNhap.nextLine();
            accountlist[i] =  new Account(name, so, sodu);
        }

        System.out.println("----Thông tin xe sau khi nhập----");

        for (Account account : accountlist) {
            account.intThongtinthe();
            
        } 
    }
}
