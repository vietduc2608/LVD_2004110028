package com.duclv2004110028.thicuoiki1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int n;
        do {
            main.menu();
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    themHangHoa();
                    break;
                case 2:
                    xoaHangHoa();
                    break;
                case 3:
                    suaHoangHoa();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    sapXepTangDan();
                    break;
                case 6:
                    sapXepGiamDan();
                    break;
                case 7:
                    thongKe();
                default:
                    break;
            }
        } while (n != 0);
    }

    public static void menu() {
        System.out.print("******************");
        System.out.println("1.========Thêm Hàng Hóa=========");
        System.out.println("2.=========Xóa Hàng Hóa=========");
        System.out.println("3.=========Sửa Hàng Hóa=========");
        System.out.println("4.===========Tìm Kiếm===========");
        System.out.println("5.=======Sắp Xếp Tăng Dần=======");
        System.out.println("6.=======Sắp Xếp Giảm Dần=======");
        System.out.println("7.============Thống Kê==========");
        }

    private static void themHangHoa(){

    }

    private static void suaHoangHoa(){

    }

    private static void xoaHangHoa(){

    }

    private static void timKiem(){

    }

    private static void sapXepGiamDan(){

    }

    private static void sapXepTangDan(){

    }

    private static void thongKe(){

    }
}

