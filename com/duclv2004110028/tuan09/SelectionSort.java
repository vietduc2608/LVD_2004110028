package com.duclv2004110028.tuan09;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 12, -5, 16, 2, 12, 14};
        System.out.println("Mảng ban đầu: " +Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: "+Arrays.toString(arr));
        }
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length -1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        // (cách 2) -> bỏ 2 cái sysout 
        // System.out.println("Mảng sắp xếp tăng dần");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
    }
}
