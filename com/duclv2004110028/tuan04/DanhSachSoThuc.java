package com.duclv2004110028.tuan04;
import java.util.ArrayList;
import java.util.Scanner;
public class DanhSachSoThuc {
    private ArrayList<Double> list = new ArrayList<>();

    public void nhap(){
        System.out.println("Nhap danh sach cac so thuc: ");
        Scanner sc = new Scanner(System.in);
        int yes = 1;
        list.clear();
        do {
            System.out.println("Nhap so: ");
            double num = sc.nextDouble();
            list.add(num);

            System.out.println("Ban co muon nhap tiep (1: tiep, 0: thoat):");
            yes = sc.nextInt();

        }while ( yes == 1);
    }
    public void hienThi(){
        System.out.println("===============");
        for (Double item : list){
            System.out.println(" "+ item);
        }
        System.out.println();
    }
    public void tinhTong(){
        double sum = 0;
        for (Double item : list) {
            sum += item;
        }
        System.out.println("Tong:" + sum);
    }
}
