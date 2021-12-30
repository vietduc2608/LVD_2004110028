package com.duclv2004110028.thicuoiki1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class linkedlist {
    private int size;
    private NodeHangHoa head, tail;
    HangHoa hangHoa = new HangHoa();
    SimpleDateFormat df = new SimpleDateFormat();
    Date ngayNhap = new Date();
    Scanner sc = new Scanner(System.in);
    public linkedlist(){
        HangHoa.autoId = 1;
        this.size = 0;
        this.tail = null;
        this.head = null;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty()
    {
        return this.head == null;
    }

    public void ThemHangHoa(HangHoa hangHoa)
    {
        if(isEmpty())
        {
            this.head = this.tail = new NodeHangHoa(hangHoa);
            return;
        }
        NodeHangHoa newNode = new NodeHangHoa(hangHoa);
        this.tail.setNext(newNode);
        this.tail = newNode;
    }
    public void ThemNhieuHangHoa(HangHoa...hangHoas)
    {
        for(HangHoa hangHoa : hangHoas)
        {
            ThemHangHoa(hangHoa);
        }
    }

    public boolean XoaHangHoa(int id){
        NodeHangHoa node = this.head;
        if(this.head.getHangHoa().getID() == id){
        this.head = this.head.getNext();
        return true;
        }
        while(node != null)
        {
            if(node.getNext().getHangHoa().getID() == id){
            node.setNext(node.getNext().getNext());
                System.out.println("Đã Xoá Thành Công");
                return true;
            }
        else{
            System.out.println("ID Khong Ton Tai!!");
        }
        node = node.getNext();
    }
        System.out.println("Xoa Khong Thanh Cong!");
        return false;
}
    public boolean TimKiemTheoLoai(String l){
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "ma hang", "san pham", "loai hang", "so luong", "gia hang", "ngay nhap kho");
        boolean isFound = false;
        NodeHangHoa node = this.head;
        while(node != null)
        {
            if(node.getHangHoa().getLoai().contains(l)){
            System.out.printf("%-20d %-20S %-20S %20d %-7.3fVNĐ %20S\n", node.getHangHoa().ID, node.getHangHoa().tenHangHoa, node.getHangHoa().loai, node.getHangHoa().soLuong, node.getHangHoa().giaHang, df.format(node.getHangHoa().ngayNhap)); 
            isFound = true;
            }
            node = node.getNext();
        }
        if(!isFound)
        {
            System.out.println("Loai Muon Tim Khong Hop Le!");
            return false;
        }
        return true;
}
public void SapXepGiamDan(){
    NodeHangHoa nodeHh = this.head, nodeHh2 = null;
    HangHoa tempHangHoa;
    if(head == null)
    return;
    else{
        while(nodeHh != null){
            nodeHh2 = nodeHh.next;
            while(nodeHh2 != null){
                if(nodeHh.hangHoa.giaHang < nodeHh2.hangHoa.giaHang){
                    tempHangHoa = nodeHh.hangHoa;
                    nodeHh.hangHoa = nodeHh2.hangHoa;
                    nodeHh2.hangHoa = tempHangHoa;
                }
                nodeHh2 = nodeHh2.next;
            }
            nodeHh = nodeHh.next;
        }
    }
    showData();
}
public void SapXepTangDan(){
    NodeHangHoa nodeHh = this.head, nodeHh2 = null;
    HangHoa tempHangHoa;
    if(head == null)
    return;
    else{
        while(nodeHh != null){
            nodeHh2 = nodeHh.next;
            while(nodeHh2 != null){
                if(nodeHh.hangHoa.giaHang >  nodeHh2.hangHoa.giaHang){
                    tempHangHoa = nodeHh.hangHoa;
                    nodeHh.hangHoa = nodeHh2.hangHoa;
                    nodeHh2.hangHoa = tempHangHoa;
                }
                nodeHh2 = nodeHh2.next;
            }
            nodeHh = nodeHh.next;
        }
    }
    showData();
}

   public void DuLieuMoi(){
    try {
        String sDate1 = "26/8/2021";  
        String sDate2 = "20/10/2021";  
        String sDate3 = "01/03/2021";  
        String sDate4 = "07/07/2021";  
        String sDate5 = "25/12/2021";  
        String sDate6 = "01/02/2021";  
        String sDate7 = "30/04/2021";  
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
        Date date1=formatter1.parse(sDate1);  
        Date date2=formatter1.parse(sDate2);  
        Date date3=formatter1.parse(sDate3);  
        Date date4=formatter1.parse(sDate4);  
        Date date5=formatter1.parse(sDate5);  
        Date date6=formatter1.parse(sDate6); 
        Date date7=formatter1.parse(sDate7);
        HangHoa hangHoa1 = new HangHoa(100, "Thit", "Thuc Pham", 12000, date1);
        HangHoa hangHoa2 = new HangHoa(200, "Chau Hoa", "Sanh Su", 9000, date2);
        HangHoa hangHoa3 = new HangHoa(1500, "May Dieu Hoa", "Dien May", 55000, date3);
        HangHoa hangHoa4 = new HangHoa(1500, "Tivi", "Dien May", 15000, date4);
        HangHoa hangHoa5 = new HangHoa(1500, "Tu Lanh", "Dien May", 50000, date5);
        HangHoa hangHoa6 = new HangHoa(100, "Ca Hoi", "Thuc Pham", 7000, date6);
        HangHoa hangHoa7 = new HangHoa(1500, "Noi Com Dien", "Dien May", 15000, date7);
        HangHoa hangHoa8 = new HangHoa(2000, "My Goi", "Thuc Pham", 230, date1);
        HangHoa hangHoa9 = new HangHoa(1000, "Ly Thuy Tinh", "Sanh Su", 150, date2);
        HangHoa hangHoa10 = new HangHoa(1500, "Lo Vi Song", "Dien May", 20000, date3);
        HangHoa hangHoa11 = new HangHoa(1000, "Chen Dia", "Sanh Su", 100, date2);
        HangHoa hangHoa12 = new HangHoa(300, "Rau Cu", "Thuc Pham", 200, date6);
        HangHoa hangHoa13 = new HangHoa(1500, "May Vi Tinh", "Dien May", 70000, date7);
        HangHoa hangHoa14 = new HangHoa(1500, "Quat Dien", "Dien May", 900, date4);
        HangHoa hangHoa15 = new HangHoa(400, "Thit Ba Chi", "Thuc Pham", 25000, date5);
        HangHoa hangHoa16 = new HangHoa(500, "Sua", "Thuc Pham", 60, date2);
        HangHoa hangHoa17 = new HangHoa(1500, "May Nuoc Nong", "Dien May", 3000, date3);
        HangHoa hangHoa18 = new HangHoa(1500, "Lo Hoa", "Sanh Su", 50, date1);
        HangHoa hangHoa19 = new HangHoa(1500, "Bep Dien", "Dien May", 20000, date6);
        HangHoa hangHoa20 = new HangHoa(600, "Ca Thu", "Thuc Pham", 100, date7);
        ThemHangHoa(hangHoa1);
        ThemHangHoa(hangHoa2);
        ThemHangHoa(hangHoa3);
        ThemHangHoa(hangHoa4);
        ThemHangHoa(hangHoa5);
        ThemHangHoa(hangHoa6);
        ThemHangHoa(hangHoa7);
        ThemHangHoa(hangHoa8);
        ThemHangHoa(hangHoa9);
        ThemHangHoa(hangHoa10);
        ThemHangHoa(hangHoa11);
        ThemHangHoa(hangHoa12);
        ThemHangHoa(hangHoa13);
        ThemHangHoa(hangHoa14);
        ThemHangHoa(hangHoa15);
        ThemHangHoa(hangHoa16);
        ThemHangHoa(hangHoa17);
        ThemHangHoa(hangHoa18);
        ThemHangHoa(hangHoa19);
        ThemHangHoa(hangHoa20);
    } catch (Exception e) {
        e.getCause();
    }
}
public void ThongKe(){
    NodeHangHoa node = this.head;
    int sLtemp = 0;
    float gTtemp = 0;
    while(node != null){
        sLtemp += node.getHangHoa().getSoLuong();
        gTtemp += node.getHangHoa().getGiaHang();
        node = node.getNext();
    }
    System.out.println("=================BẢNG THỐNG KÊ====================");
    System.out.printf("%-30S %-30S\n", "tong so luong", "tong gia tri");
    System.out.printf("%-30d %-10.3fVNĐ\n", sLtemp, gTtemp);
}

public boolean SuaThongTinHangHoa(int id){
    NodeHangHoa node = this.head;
    while(node != null)
    {
        if(node.getHangHoa().getID() == id)
        {
            String loaiHh = null;
            System.out.println("Nhập Loại Hàng [1: Thuc Pham; 2: Sanh Su; 3: Dien May]");
            int l = sc.nextInt();
            switch(l)
            {
                case 1: loaiHh = "Thuc Pham";
                break;
                case 2: loaiHh = "Sanh Su";
                break;
                case 3: loaiHh = "Dien May";
                break;
                default: System.out.println("Loai Khong Hop Le!");
                break;
            }
            sc.nextLine();
            System.out.println("Nhap Ten Hang:");
            String tenHh = sc.nextLine();
            System.out.println("Nhap So Luong:");
            int soLuong = sc.nextInt();
            System.out.println("Nhap Gia:");
            float gia = sc.nextFloat();
            
            try {
                System.out.println("Nhap Ngay Nhap Kho: ");
                ngayNhap = df.parse(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ngay Khong Hop Le!");
            }
            node.getHangHoa().setTenHangHoa(tenHh);
            node.getHangHoa().setSoLuong(soLuong);
            node.getHangHoa().setGiaHang(gia);
            node.getHangHoa().setLoai(loaiHh);
            node.getHangHoa().setNgayNhap(ngayNhap);
            return true;
        }
        node = node.getNext();
    }
    System.out.println("Khong Sua Duoc!");
    return false;
}

    public void showData(){
        NodeHangHoa nHangHoa = this.head;
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "ma hang", "san pham", "loai hang", "so luong", "gia hang", "ngay nhap kho");
        while(nHangHoa != null){
            System.out.printf("%-20d %-20S %-20S %-20d %-7.3fVND %-20S\n",nHangHoa.getHangHoa().ID, nHangHoa.getHangHoa().tenHangHoa, nHangHoa.getHangHoa().loai, nHangHoa.getHangHoa().soLuong, nHangHoa.getHangHoa().giaHang, df.format(nHangHoa.getHangHoa().ngayNhap));
            nHangHoa = nHangHoa.getNext();
        }
    }
}

