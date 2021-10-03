package com.duclv2004110028.tuan04;

public class Car {
    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    String dungtichxang;
    

    Car(){}

    Car(String tcx, String hsx, String d, String gp, String dtx){
        tenchuxe = tcx;
        hangsanxuat = hsx;
        dong = d;
        giayphep = gp;
        dungtichxang = dtx;
       
    }
    
    void intThongtinxe(){
        System.out.println("Tên chủ xe " +tenchuxe + "  Hãng sản xuất: " +hangsanxuat + "  Dòng xe " +dong + "  Giấy phép: " +giayphep + "Dung tích xăng: " + dungtichxang);
        
    }
}
