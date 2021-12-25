package com.duclv2004110028.thicuoiki1;

import java.text.SimpleDateFormat;

public class linkedlist {
    private int size;
    private NodeHangHoa head, tail;
    HangHoa hangHoa = new HangHoa();
    SimpleDateFormat df = new SimpleDateFormat();
    
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
        public void search(int ma)
        {
            NodeHangHoa nHangHoa = this.head;
            System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
            System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "Mã Hàng", "Tên Hàng", "Số Lượng", "Giá Hàng", "Loại Hàng", "Ngày Nhập Kho");
            NodeHangHoa nhh = searchID(ma);
           if(nhh != null)
           { 
            System.out.printf("%-20d %-20S %-20S %-20d %-20.2fVND %-20S\n",nHangHoa.getHangHoa().ID, nHangHoa.getHangHoa().tenHangHoa, nHangHoa.getHangHoa().loai, nHangHoa.getHangHoa().soLuong, nHangHoa.getHangHoa().giaHang, df.format(nHangHoa.getHangHoa().ngayNhap));
           }
           else{
               System.out.println("Mã Không Hợp Lệ!!!");
           }
        }
        private NodeHangHoa searchID(int ma)
        {
            NodeHangHoa nhh = this.head;
            while(nhh != null)
            {
                if(nhh.id(ma))
                {
                    return nhh;
                }
                nhh = nhh.next;
            }
            return null;
        }
        // public void delHead(HangHoa hangHoa){
        //     if(head == null){
        //         System.out.println("Không có gì để xóa!");
        //     }else{
        //         head = head.next;
        //     }
        // }
        // public void DelTail(HangHoa hangHoa){
        //     NodeHangHoa p = this.head;
        //     while(p.next.next != null){
        //         p=p.next;
        //     }
        //     p.next = p.next.next;
        // }

    public void showData(){
        NodeHangHoa nHangHoa = this.head;
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "mã hàng", "tên hàng", "số lượng", "giá hàng", "loại hàng", "ngày nhập kho");
        while(nHangHoa != null){
            System.out.printf("%-20d %-20S%-20S %-20d %-20.2fVND %-20S\n",nHangHoa.getHangHoa().ID, nHangHoa.getHangHoa().tenHangHoa, nHangHoa.getHangHoa().loai, nHangHoa.getHangHoa().soLuong, nHangHoa.getHangHoa().giaHang, df.format(nHangHoa.getHangHoa().ngayNhap));
            nHangHoa = nHangHoa.getNext();
        }
    }
}

