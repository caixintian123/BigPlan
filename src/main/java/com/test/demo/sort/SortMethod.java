package com.test.demo.sort;

import java.util.Arrays;

/**
 * 1.1 算法描述
 * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 针对所有的元素重复以上的步骤，除了最后一个；
 * 重复步骤1~3，直到排序完成。
 */
public class SortMethod {

//    冒泡排序
    private static int[] bubbleSort(int[] arr){
        int len = arr.length;
        for (int i=0;i<len-1;i++){
            for (int y=0;y<len-1-i;y++){
                if (arr[y]>arr[y+1]){
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
        return arr;
    }


    //    冒泡排序
    public static int[] selectSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int minIndex =i;
            for (int y=i+1;y<arr.length;y++){
                if (arr[y]<arr[minIndex]) {
                    minIndex = y ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    public static int[] quickSort(int[] arr){
        int l =arr.length;
        int r =0;
        int x = arr[0];

        return arr;
    }



    public static void main(String[] args) {
        int [] arr = new int[]{3,2,5,7,45,22,87,234,4,1,444,23,56};
//         bubbleSort(arr);
         selectSort(arr);

    }
}
