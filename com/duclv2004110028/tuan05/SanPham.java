package com.duclv2004110028.tuan05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanPham {
    Scanner sc = new Scanner(System.in);
    ArrayList<SanPham> list = new ArrayList<>();
    String ten;
    double gia;


    SanPham(){}
    SanPham(String t, double g){
    ten = t;
    gia = g;

    }
public void nhapThongTin() {
    sc.nextLine();
    System.out.println("Nhập danh sách sản phẩm: ");
    int i = 1;
    do {
        System.out.printf("Tên sản phẩm %d: " , i);
        String st = sc.nextLine();
        if(st.isEmpty()){
            break;
        }
        System.out.printf("Giá sản phẩm: ");
        double gia =sc.nextDouble();
        list.add(new SanPham(ten, gia));
        sc.nextLine();
        i++;
    
    } while (true);
}

public void hienThi(){
    System.out.println("Danh sách sản phẩm: ");
    for (SanPham sanPham : list) {
        System.out.printf("%20s %.2f\n", ten, gia);
    }
}

// public void sapXep(){
//     Collections.sort(list, (a,b)->(int) (a.compareTo(b));
//     System.out.println("Danh sách sau khi sắp xếp: ");
//     hienThi();
//     }
public void timVaXoa() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tên sản phẩm cần tìm và xóa: ");
    String ten = sc.nextLine();
    for (SanPham sanPham : list) {
        if(sanPham.equals(ten))
        list.remove(sanPham);
        break;
    }
    
}

public void meNu() {
    
    do {
        System.out.println("=====Menu=====");
        System.out.println("1.Nhập danh sách");
        System.out.println("2.Hiển thị danh sách");      
        System.out.println("3.Tìm và xóa sản phẩm theo tên");
        // System.out.println("4.Sắp xếp giảm dần theo giá");
        System.out.println("Lựa chọn của bạn là: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 0:
            break;
            case 1:
            nhapThongTin();
            break;
            case 2:
            hienThi();
            break;
            // case 3:
            // sapXep();
            // break;
            case 4:
            timVaXoa();
            break;
            default:
            System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại");
             
        }
    } while (true);
    
}

}
    
