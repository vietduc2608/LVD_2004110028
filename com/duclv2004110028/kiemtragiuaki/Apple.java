package com.duclv2004110028.kiemtragiuaki;

import java.util.ArrayList;
import java.util.Scanner;

public class Apple {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Apple> Apples = new ArrayList<>();
    String mausac;
    int ma;
    float khoiluong;

    public Apple(Scanner sc, String mausac, int ma, float khoiluong) {
        this.sc = sc;
        this.mausac = mausac;
        this.ma = ma;
        this.khoiluong = khoiluong;
    }  
    
    Apple(){}

    Apple(String ms, int id, float kl){
        mausac = ms;
        ma = id;
        khoiluong = kl;
    }

    void inThongTin(){
        System.out.printf("%-20S %-20S %-20S\n", mausac, ma, khoiluong);
    }

    void nhapThongTin(){
        sc.nextLine();
        System.out.println("Nhập màu sắc: ");
        mausac = sc.nextLine();
        System.out.println("Nhập mã id: ");
        ma = sc.nextInt();
        System.out.println("Nhập khối lượng: ");
        khoiluong = sc.nextFloat();

    }
    
    public static void themApple(){
        System.out.println("Nhập số lượng Apple muốn thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Apple apple = new Apple();
            apple.nhapThongTin();
            Apples.add(apple);
        }
    }

    public static void timApple(){
        sc.nextLine();
        System.out.println("Nhập màu: ");
        String color = sc.nextLine();
        for (Apple apple : Apples) {
            if (color.equals(color)){
                // apple.inThongTin();
                apple.inApple();
                break;
            }
        }
    }
    public static void inApple(){
        System.out.printf("%-20S %-20S %-20S\n", "Màu sắc", "Mã ID", "Khối Lượng");
        for (Apple apple : Apples) {
            apple.inThongTin();
        }
    }
}
