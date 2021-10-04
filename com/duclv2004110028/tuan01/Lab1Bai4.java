package com.duclv2004110028.tuan01;

import java.util.Scanner;
public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        int delta = b * b - 4 * a * c;
        double canDelta = Math.sqrt(delta);
        System.out.printf("delta = %d",delta);
        System.out.printf("căn bậc 2 delta = %f",canDelta);
    }
}
