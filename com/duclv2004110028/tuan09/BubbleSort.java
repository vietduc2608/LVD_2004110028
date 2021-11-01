package com.duclv2004110028.tuan09;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        System.out.println("Mảng ban đầu: " +Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp: "+Arrays.toString(arr));
        }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < n-i; j++) {
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }  
}
