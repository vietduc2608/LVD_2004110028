package com.duclv2004110028.thicuoiki1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Date ngayNhap = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        //String strDate = df.format(ngayNhap);
        linkedlist listHangHoa = new linkedlist();
        do{
            System.out.println("===========================MENU===========================");
            System.out.println("=1====================Thêm Hàng Hoá=======================");
            System.out.println("=2=====================Xoá Hàng Hoá=======================");
            System.out.println("=3=====================Sửa Hàng Hoá=======================");
            System.out.println("=4===================Sắp Xếp Hàng Hoá=====================");
            System.out.println("=5===============Xem Danh Sách Hàng Hoá===================");
            System.out.println("=6==================Thống Kê Hàng Hoá=====================");
            System.out.println("=7==================Tìm Kiếm Hàng Hoá=====================");
            System.out.println("=0=========================THOÁT==========================");
            System.out.println("Nhập Lựa Chọn Của Bạn: ");
            int lc = sc.nextInt();
            switch(lc)
            {
                case 0:
                    break;
                case 1:
                String loai = null;
                sc.nextLine();
                System.out.println("Nhập Loại Hàng [1: Thực Phẩm; 2: Sành Sứ; 3: Điện Máy]");
                int n = sc.nextInt();
                switch(n)
                {
                    case 1: loai = "Thực Phẩm";
                    break;
                    case 2: loai = "Sành Sứ";
                    break;
                    case 3: loai = "Điện Máy";
                    break;
                    default: 
                        System.out.println("Loại Không Hợp Lệ!!!");
                    break;
                }
                sc.nextLine();
                System.out.println("Nhập Tên Hàng: ");
                String tenHangHoa = sc.nextLine();
                System.out.println("Nhập Số Lượng: ");
                int soLuong = sc.nextInt();
                System.out.println("Nhập Giá: ");
                float giaHang = sc.nextFloat();
                sc.nextLine();
                try {
                    System.out.println("Nhập Ngày Nhập Kho: ");
                    ngayNhap = df.parse(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Ngày Không Hợp Lệ!");
                }
                HangHoa hangHoa = new HangHoa(soLuong, tenHangHoa, loai, giaHang, ngayNhap);
                listHangHoa.ThemHangHoa(hangHoa);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                listHangHoa.showData();
                    break;
                case 6:
                    break;
                case 7:
                System.out.println("Nhập Mã Cần Tìm: ");
                int ma = sc.nextInt();
                listHangHoa.search(ma);
                    break;
                default:
                    System.out.println("Lựa Chọn Không Hợp Lệ!!!");              
                break;
            }
        }while(true);
    }
}

