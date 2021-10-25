package com.duclv2004110028.tuan08;

import java.util.Stack;

public class StackDemoProgram {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();
        stack.push("Welcome");
        stack.push("To");
        stack.push("Data structure and algotithm");

        System.out.println(stack);

        //lấy 1 phần tử từ đỉnh Stack (xóa phần tử khỏi Stack)
        String popped = stack.pop();
        System.out.println("Đã lấy ra từ danh sách Stack: " +popped);
        System.out.println("Phần tử còn lại của Stack: ");
        System.out.println(stack);    
        
        //THĂM NÚT ĐỈNH // KO LOẠI KHỎI DS
        String phanTuDuocTham = stack.peek();
        System.out.println("Thăm phần tử đỉnh: "+phanTuDuocTham);
        
        //SAU KHI THĂM
        System.out.println(stack);
    }
}
