package com.duclv2004110028.tuan03;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mayTinh = new MayTinh("Dell");
        System.out.println("Nha San Xuat: "+mayTinh.nhaSx);
        mayTinh = new MayTinh("Dell", "win10");
        System.out.println("Nha San Xuat: "+mayTinh.nhaSx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh);
        mayTinh = new MayTinh("Dell", "win10", "2019");
        System.out.println("Nha San Xuat: "+mayTinh.nhaSx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh + " " +" Nam San Xuat: "+ mayTinh.namSx);
        mayTinh = new MayTinh("Dell", "win10", "2019", "2 nam");
        System.out.println("Nha San Xuat: "+mayTinh.nhaSx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh + " " +" Nam San Xuat: "+ mayTinh.namSx +" Nam Bao Hanh: "+ mayTinh.namBh);
        mayTinh = new MayTinh("Dell", "win10", "2019", "2 nam", "8gb", "Intel Core i5");
        System.out.println("Nha San Xuat: "+mayTinh.nhaSx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh + " " +" Nam San Xuat: "+ mayTinh.namSx +" Nam Bao Hanh: "+ mayTinh.namBh + " Ram: "+ mayTinh.ram + " " +" CPU: "+ mayTinh.cpu);
        mayTinh = new MayTinh("Dell", "win10", "2019", "2 nam", "8gb", "Intel Core i5", 135000);
        System.out.println("Nha San Xuat: "+mayTinh.nhaSx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh + " " +" Nam San Xuat: "+ mayTinh.namSx +" Nam Bao Hanh: "+ mayTinh.namBh + " Ram: "+ mayTinh.ram + " " +" CPU: "+ mayTinh.cpu + " Gia: " +mayTinh.gia + " VND");
    }
}
