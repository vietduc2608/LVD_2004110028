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
            int yes;
            listHangHoa.DuLieuMoi();
            do{
                System.out.println("===========================MENU===========================");
                System.out.println("=1====================Them Hang Hoa=======================");
                System.out.println("=2=====================Xoa Hang Hoa=======================");
                System.out.println("=3=====================Sua Hang Hoa=======================");
                System.out.println("=4===================Sap Xep Hang Hoa=====================");
                System.out.println("=5===============Xem Danh Sach Hang Hoa===================");
                System.out.println("=6==================Thong Ke Hang Hoa=====================");
                System.out.println("=7==================Tim Kiem Hang Hoa=====================");
                System.out.println("=0=========================THOAT==========================");
                System.out.println("Nhap Lua Chon Cua Ban: ");
                int lc = sc.nextInt();
                switch(lc)
                {
                    case 0:
                        break;
                    case 1:
                    do {
                    String loai = null; 
                    sc.nextLine();
                    System.out.println("Chon Loai: [1: Thuc Pham; 2: Sanh Su; 3: Dien May]");
                    int n = sc.nextInt();
                    switch(n)
                    {
                        case 1: loai = "Thuc Pham";
                        break;
                        case 2: loai = "Sanh Su";
                        break;
                        case 3: loai = "Dien May";
                        break;
                        default: 
                            System.out.println("Loai Khong Hop Le!!!");
                        break;
                    }
                    sc.nextLine();
                    System.out.println("Nhap Ten Hang: ");
                    String tenHangHoa = sc.nextLine();
                    System.out.println("Nhap So Luong: ");
                    int soLuong = sc.nextInt();
                    System.out.println("Nhap Gia: ");
                    float giaHang = sc.nextFloat();
                    sc.nextLine();
                    try {
                        System.out.println("Nhap Ngay Nhap Kho: ");
                        ngayNhap = df.parse(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Ngay Khong Hop Le");
                    }
                    HangHoa hangHoa = new HangHoa(soLuong, tenHangHoa, loai, giaHang, ngayNhap);
                    listHangHoa.ThemHangHoa(hangHoa);
                    System.out.println("Ban co muon nhap tiep (1: tiep, 0: thoat):");
                    yes = sc.nextInt();
                } while (yes == 1);
                        break;
                    case 2:
                    System.out.println("Nhap Ma Can Xoa: ");
                    int ma = sc.nextInt();
                    listHangHoa.XoaHangHoa(ma);
                    listHangHoa.showData();
                        break;
                    case 3:
                    System.out.println("Nhap Ma Can Sua: ");
                    int id = sc.nextInt();
                    listHangHoa.SuaThongTinHangHoa(id);
                        break;
                    case 4:
                    System.out.println("Lua Chon Cua Ban: [1:Sap Xep Tang Dan, 2:Sap Xep Giam Dan]");
                    int lll = sc.nextInt();
                    String llc = null;
                    switch(lll){
                        case 1: llc = "Sap Xep Tang Dan";
                        listHangHoa.SapXepTangDan();
                        break;
                        case 2: llc = "Sap Xep Giam Dan";
                        listHangHoa.SapXepGiamDan();
                        break;
                        default:
                        System.out.println("Lua Chon Khong Hop Le");
                        break;
                    }     
                        break;
                    case 5: 
                    listHangHoa.showData();
                        break;
                    case 6:
                    listHangHoa.ThongKe();
                        break;
                    case 7:
                        sc.nextLine();  
                        System.out.println("Nhap Loai Muon Tim: [1: Thuc Pham; 2: Sanh Su; 3: Dien May]");
                        int l = sc.nextInt();
                        String l1 = null;
                        switch(l){
                            case 1: l1 = "Thuc Pham";
                            break;
                            case 2: l1 = "Sanh Su";
                            break;
                            case 3: l1 = "Dien May";
                            break;
                            default: System.out.println("Loai Khong Hop Le");
                            break;
                        }
                        listHangHoa.TimKiemTheoLoai(l1); 
                        break;
                    default:
                        System.out.println("Lua Chon Khong Hop Le!!!");              
                    break;
                }
            }while(true);   
        }
}


