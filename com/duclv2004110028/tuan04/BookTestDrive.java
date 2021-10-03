package com.duclv2004110028.tuan04;
import java.util.Scanner;
public class BookTestDrive {
    public static void main(String[] args) {
        Book[] booklist = new Book[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < booklist.length; i++ ){
            System.out.print("Nhà xuất bản: ");
            String nxb = bienNhap.nextLine();
            System.out.print("Năm xuất bản: ");
            String xb = bienNhap.nextLine();
            System.out.print("Loại sách: ");
            String loai = bienNhap.nextLine();
            System.out.print("Số lượng: ");
            int sl = bienNhap.nextInt();
            System.out.print("Giá: ");
            float gb =bienNhap.nextFloat();
            bienNhap.nextLine();
            booklist[i] = new Book(nxb, xb, loai, sl, gb);
        
        }

        System.out.println("---Thông tin sách sau khi nhập----");
        
        for (Book book : booklist) {
            book.intThongtinsach();
        }

        int []arr = {1, 2};
        int newElement = 3;
        int n = arr.length;
        int [] newArr = new int[n + 1];
        for(int i = 0; i < n; i++){
            newArr[i] = arr[i];
        }
        System.out.println("In mảng cũ");
        for (int x : arr) {
            System.out.println(x);
        }
        newArr[n] = newElement;
        System.out.println("In mảng mới");
        for (int x : newArr) {
            System.out.println(x);
        }
    }
}
