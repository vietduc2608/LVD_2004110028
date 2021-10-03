package com.duclv2004110028.tuan03;

public class Sach {
        float gia,giaban;
        String nhaxuatban;
        String namxuatban;
        int soluong,loai;
        
        Sach()
        {

        }
        Sach(String nxb)
        {
            nhaxuatban = nxb;
        }
        Sach(String nxb1, float g)
        {
            nhaxuatban = nxb1;
            gia = g;
        }
        Sach(String nxb2, float g1, float gb1)
        {
            nhaxuatban = nxb2;
            gia = g1;
            giaban = gb1;
        }
        Sach(String nxb3, float g2, float gb2, int sl)
        {
            nhaxuatban = nxb3;
            gia = g2;
            giaban = gb2;
            soluong = sl; 
        }
        Sach(String nxb4, float g3, float gb3, int sl1, int l1)
        {
            nhaxuatban = nxb4;
            gia = g3;
            giaban = gb3;
            soluong = sl1; 
            loai = l1;
        }
        Sach(String nxb5, float g4, float gb4, int sl2, int l3, String nxbDate)
        {
            nhaxuatban = nxb5;
            gia = g4;
            giaban = gb4;
            soluong = sl2; 
            loai = l3;
            namxuatban = nxbDate;
            
        
        }        
        
}
