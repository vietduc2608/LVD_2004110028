package com.duclv2004110028.tuan03;

import java.util.Scanner;

public class MayTinh {
   
    String nhaSx, heDieuHanh, namSx, namBh,ram, cpu;
    double gia;
    MayTinh(String nSx)
    {
        nhaSx = nSx;
    }
    MayTinh(String nSx1, String hDh)
    {
        nhaSx = nSx1;
        heDieuHanh = hDh;
    }
    MayTinh(String nSx2, String hDh1, String nSx)
    {
        nhaSx = nSx2;
        heDieuHanh = hDh1;
        namSx = nSx;
    }
    MayTinh(String nSx3, String hDh2, String nSx1,String nBh)
    {
        nhaSx = nSx3;
        heDieuHanh = hDh2;
        namSx = nSx1;
        namBh = nBh;
    }
    MayTinh(String nSx4, String hDh3, String nSx2,String nBh1,String r)
    {
        nhaSx = nSx4;
        heDieuHanh = hDh3;
        namSx = nSx2;
        namBh = nBh1;
        ram = r;
    }
    MayTinh(String nSx5, String hDh4, String nSx3,String nBh2,String r1, String Cpu)
    {
        nhaSx = nSx5;
        heDieuHanh = hDh4;
        namSx = nSx3;
        namBh = nBh2;
        ram = r1;
        cpu = Cpu;
    }
    MayTinh(String nSx6, String hDh5, String nSx4,String nBh3,String r2, String Cpu1, double g)
    {
        nhaSx = nSx6;
        heDieuHanh = hDh5;
        namSx = nSx4;
        namBh = nBh3;
        ram = r2;
        cpu = Cpu1;
        gia = g;
    }
  
}
