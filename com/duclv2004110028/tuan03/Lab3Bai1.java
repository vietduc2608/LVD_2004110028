package com.duclv2004110028.tuan03;

import java.util.Scanner;
public class Lab3Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên n: ");
        Scanner scanner = new Scanner(System.in);
        int soN = scanner.nextInt();
        boolean kiemTra = true;
        for(int i =2; i < soN; i++){
            if(soN % i == 0){ 
            kiemTra = false;
            break;
            }
        }
        if(kiemTra == true)
            System.out.printf("%d là số nguyên tố",soN);
        else
            System.out.printf("%d không phải là số nguyên tố",soN); 
    }
}
