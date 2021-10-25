package com.duclv2004110028.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(2);

        System.out.println(queue);

        //lấy ra 1 phần tử - trong queue - lấy đầu
        int phanTuDuocLayRa = queue.remove();
        System.out.println("Phần tử được lấy ra từ Queue: "+phanTuDuocLayRa);
        System.out.println("Phần tử còn lại: ");
        System.out.println(queue);

        //thăm 1 phần tử của Queue - ko loại khỏi danh sách queue
        int phanTuDuocTham =  queue.peek();
        System.out.println("Phần tử được thăm: "+phanTuDuocTham);
        System.out.println("Phần tử còn lại: ");
        System.out.println(queue);
    }
}
