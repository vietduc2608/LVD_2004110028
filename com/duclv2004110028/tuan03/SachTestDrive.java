package com.duclv2004110028.tuan03;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach = new Sach("HCM", 1000, 2000, 10, 1, "09/21/2021");
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND " + " Gia ban: " +sach.giaban +" VND "  + " So luong: " +sach.soluong + " Quyen " + " Phan Loai: " +sach.loai + " " + "Nam xuat ban: " +sach.namxuatban);
        sach = new Sach("HCM", 1000, 2000, 10, 1);
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND " +" Gia ban: " +sach.giaban + " VND " + "So luong: " +sach.soluong + " Quyen " + " Phan Loai: " +sach.loai);
        sach = new Sach("HCM", 1000, 2000, 10);
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND " +" Gia ban: " +sach.giaban + " VND " + "So luong: " +sach.soluong + " Quyen ");
        sach = new Sach("HCM", 1000, 2000);
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND " +" Gia ban: " +sach.giaban + " VND ");
        sach = new Sach("HCM", 1000);
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND ");
        sach = new Sach("HCM");
        System.out.println("Nha xuat ban: " +sach.nhaxuatban);
    
    
    }
}
