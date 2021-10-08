package com.duclv2004110028.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHoTen {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<>();

    public void nhap(){
        sc.nextLine();
        do {
            System.out.println("Nhập họ tên: ");
            String st = sc.nextLine();

            if(st.isEmpty()){
                break;

            }
            list.add(st);
        } while (true);
    }
    public void xuat() {
        System.out.println("Danh Sách Họ Tên: ");
        for (String item : list) {
            System.out.println("Họ Tên: " +item);
            
        }
        
    }
    public  void xuatNgauNhien(){
        Collections.shuffle(list);
        xuat();
    }
    public void sapXep() {
        Collections.sort(list,(a,b)-> a.compareTo(b));
        xuat();
        
    }
    public void timVaXoa(){
        
        System.out.println("Nhập họ tên cần tìm và xóa: ");
        String hoten = sc.nextLine();
         
        for (String item : list) {
            if(item.equals(hoten)){
                list.remove(item);
                break;
            }
            
        }
    }
    public void hienThi() {
        do {
            System.out.println("Menu chức năng của chương trình");
            System.out.println("1. Nhập danh sách");
            System.out.println("2. Hiện thị danh sách");
            System.out.println("3. Sắp xếp danh sách");
            System.out.println("4. Hiện thị ngẫu nhiên danh sách");
            System.out.println("5. Tìm kiếm và xóa họ tên trong danh sách");
            System.out.println("6. Thoát chương trình");
            System.out.println("Lựa chọn của bạn là: ");
            int choice  = sc.nextInt();
            
            switch(choice)  {
                case 1:
                nhap();
                break;
                case 2:
                xuat();
                break;
                case 3:
                sapXep();
                break;
                case 4:
                hienThi();
                break;
                case 5:
                timVaXoa();
                break;
                case 6:
                System.exit(0);
                break;
            }
        } while (true);

       


        
    }
}
