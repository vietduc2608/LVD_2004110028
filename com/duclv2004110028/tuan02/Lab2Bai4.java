package com.duclv2004110028.tuan02;
import java.util.Scanner;
public class Lab2Bai4 {
    public static void main(String[] args) {
        int suLuaChon;
        do{
        System.out.println("==============Menu============");
        System.out.println(">>1. Giải phương trình bậc I");
        System.out.println(">>2. Giải phương trình bậc II");
        System.out.println("==============Menu============");
        System.out.print("Lựa chọn chức năng:");
        Scanner scanner = new Scanner(System.in);
        suLuaChon = scanner.nextInt();
        switch(suLuaChon){
            case 1: giaiPTBacI(); break;
            case 2: giaiPTBacII(); break;
            
            default: System.out.println("Kết thúc chương trình");
        }}while(suLuaChon >=1 && suLuaChon <= 2);
    }

    static void giaiPTBacI(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double soA = scanner.nextDouble();
        System.out.println("Nhập b:");
        double soB = scanner.nextDouble();
        double x = -soB / soA;
        if(soA == 0){
            if(soB == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else 
                System.out.println("Phương trình vô nghiệm");
        }else
            System.out.printf("Nghiệm của phương trình là x = %.2f",x);
    }

    
    static void giaiPTBacII(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double soA = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        double soB = scanner.nextDouble();
        System.out.println("Nhập số c: ");
        double soC = scanner.nextDouble();
        double delta = Math.pow(soB, 2) -4 * soA * soC;
        if(soA == 0){
            if(soB == 0){
                if(soC == 0){
                    System.out.println("Phương trình vô số nghiệm");
                }else
                    System.out.println("Phương trình vô nghiệm");
            }else
            System.out.printf("Phương trình có nghiệm x = %.2f",-soC/soB);
        }else
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }else
                if(delta == 0){
                    System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f",-soB /(2*soA));
                }else
                    System.out.printf("x1 = %.2f x2 = %.2f",(-soB + Math.sqrt(delta)) / (2 * soA), (-soB -Math.sqrt(delta) / (2 *soA)));
    
    }
}
