package com.duclv2004110028.kiemtragiuaki;
import java.util.Scanner;
public class AppleTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Apple apple = new Apple();
        do {
            System.out.println("=========Menu=========");
            System.out.println("1======Thêm Apple======");
            System.out.println("2=======Tìm Apple======");
            System.out.println("3========In Apple======");
            System.out.println("4=========Thoát========");
            System.out.println("Nhập lựa chọn của bạn: ");
            int n = sc.nextInt();

            switch(n){
                case 0:
                break;
                case 1:
                apple.themApple();
                break;
                case 2:
                apple.timApple();
                break;
                case 3:
                apple.inApple();
                break;
                default:
                System.out.println("Lựa chọn sai!! Vui lòng chọn lại");
            }
        } while (true);
    }
}
