package com.duclv2004110028.tuan04;
import java.util.Scanner;
public class CarTestDrive {
    public static void main(String[] args) {
        Car[] carlist = new Car[2];
        Scanner bienNhap = new Scanner(System.in);
        for(int i = 0; i < carlist.length; i++){
            System.out.print("Tên chủ xe: ");
            String chuxe = bienNhap.nextLine();
            System.out.print("Hẫng sản xuất: ");
            String hang = bienNhap.nextLine();
            System.out.print("Dòng xe: ");
            String dong = bienNhap.nextLine();
            System.out.print("Giấy phép: ");
            String giay = bienNhap.nextLine();
            System.out.print("Dung tích xăng: ");
            String dung = bienNhap.nextLine();
            bienNhap.nextLine();
            carlist[i] = new Car(chuxe, hang, dong, giay, dung);

        }

        System.out.println("----Thông tin xe sau khi nhập-------");
        
        for (Car car : carlist) {
            car.intThongtinxe();
            
        }
    }
}
