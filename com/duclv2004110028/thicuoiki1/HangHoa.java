package com.duclv2004110028.thicuoiki1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangHoa{
    String tenHangHoa, loai = null;
    float giaHang;
    int ID, soLuong;
    static int autoId;
    Date ngayNhap = new Date();
    SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    String strDate = df.format(ngayNhap);
    public HangHoa(){}
    
    public int getID() {
        return ID;
    }
    public void setiD(int ID) {
        this.ID = ID;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getTenHangHoa() {
        return tenHangHoa;
    }
    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }
    public String getLoai() {
        return loai;
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }
    public float getGiaHang() {
        return giaHang;
    }
    public void setGiaHang(float giaHang) {
        this.giaHang = giaHang;
    }
    public Date getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
    public HangHoa( int soLuong, String tenHangHoa, String loai, float giaHang, Date ngayNhap) {
        this.ID = autoId++;
        this.soLuong = soLuong;
        this.tenHangHoa = tenHangHoa;
        this.loai = loai;
        this.giaHang = giaHang;
        this.ngayNhap = ngayNhap;
    }
}