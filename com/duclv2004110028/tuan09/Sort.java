package com.duclv2004110028.tuan09;
import java.util.Arrays;

public class Sort {
public static void main(String[] args) {
    int arr[] = {5, 1, 12, -5, 16, 2, 12, 14};
        System.out.println("Mảng ban đầu: " +Arrays.toString(arr));
        sort(arr);
        System.out.println("Mảng sau khi sắp xếp: "+Arrays.toString(arr));
        }
    static void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
        while(j>= 0 && arr[j]>key){
            arr[j+1] = arr[j];
            j=j-1;
        }
        arr[j+1] = key;
        }
    }
}

