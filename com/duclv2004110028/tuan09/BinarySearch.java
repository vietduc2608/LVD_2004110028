// package com.duclv2004110028.tuan09;
// import java.util.Arrays;


// public class BinarySearch {
//     public static void main(String[] args) {
//         int arr[] = {5, 1, 12, -5, 16, 2, 12, 14};
//         System.out.println("Mảng ban đầu: " +Arrays.toString(arr));
//         binarySearch(arr, x);
//         System.out.println("Mảng sau khi sắp xếp: "+Arrays.toString(arr));
//         }
//         public static int binarySearch(int arr[], int x){
//             int l = 0, r = arr.length -1;
//             while(l<=r){
//                 int m =1 +(r-1)/2;
//                 //check if x is present at mid 
//                 if(arr[m] == x)
//                     return m;
//                 //if x greater, ignore left half
//                 if(arr[m] < x)
//                     l = m+1;

//                 // if x is smaller, ignore right half
//                 else    
//                     r = m=1;
//                 }
//                 //if we reach here, then element  was
//                 //not present
//                 return -1;
//             }
//         }
//     }
// }


