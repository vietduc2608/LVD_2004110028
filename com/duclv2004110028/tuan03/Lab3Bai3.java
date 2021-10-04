package com.duclv2004110028.tuan03;
import java.util.Arrays;
import java.util.Scanner;
public class Lab3Bai3 {
    public static void main(String[] args) {
        int[] soNguyen = new int [5];
    //nhập mảng
    Scanner nhapMang = new Scanner(System.in);
    for(int i = 0; i < soNguyen.length; i++){
        System.out.println("số thứ "+(i+1));
        soNguyen[i] = nhapMang.nextInt();
        
    }
    //xuất mảng vừa nhập
    System.out.print("mảng vừa nhập");
    for (int i : soNguyen) {
        System.out.print("\t"+i);
    }
    //xuất mảng theo thứ tự tăng dần
    System.out.print("\nmảng sau khi sắp xếp:");
    Arrays.sort(soNguyen);
    for (int i : soNguyen) {
        System.out.print("\t"+i);
    }
    //tìm giá trị nhỏ nhất
    int min = soNguyen[0];
    for(int i = 0; i< soNguyen.length; i++){
        min = Math.min(min, soNguyen[i]);
    }
    System.out.print("\nPhần tử có giá trị nhỏ nhất:"+min);
    //tính trung bình cộng các số chia hết cho 3
    int tong = 0;
    int dem = 0;
    for(int i=0; i < soNguyen.length; i++){
        if(soNguyen[i] % 3 == 0){
            tong+=soNguyen[i];
            dem++;
        }
    }
    System.out.println("\ntrung bình cộng các số chia hết cho 3:"+(tong/dem));
    }
}
