package com.duclv2004110028.tuan03;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe = new Xe("Le Viet Duc");
        System.out.println("Ten Chu Xe: "+xe.tenChuXe);
        xe = new Xe("Le Viet Duc", "Honda");
        System.out.println("Ten Chu Xe: "+xe.tenChuXe + " " +" Hang San Xuat: "+ xe.hangSx);
        xe = new Xe("Le Viet Duc", "Honda", "Vario");
        System.out.println("Ten Chu Xe: "+xe.tenChuXe + " " +" Hang San Xuat: "+ xe.hangSx + " " +" Dong Xe: "+ xe.dongXe);
        xe = new Xe("Le Viet Duc", "Honda", "Vario", "A1");
        System.out.println("Ten Chu Xe: "+xe.tenChuXe + " " +" Hang San Xuat: "+ xe.hangSx + " " +" Dong Xe: "+ xe.dongXe + " " + " Giay Phep: "+xe.giayPhep);
        xe = new Xe("Le Viet Duc", "Honda", "Vario", "A1", 150);
        System.out.println("Ten Chu Xe: "+xe.tenChuXe + " " +" Hang San Xuat: "+ xe.hangSx + " " +" Dong Xe: "+ xe.dongXe + " " + " Giay Phep: "+ xe.giayPhep+ " " +" Dung Tich Xang: "+ xe.dungTichXang);
    }
    
}
