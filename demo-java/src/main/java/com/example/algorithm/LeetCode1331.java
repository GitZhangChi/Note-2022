package com.example.algorithm;

import java.util.Arrays;

public class LeetCode1331 {


    static public int[] arrayRankTransform(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 2, newArr, 1, 1);
        return newArr;

    }


    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};


        int[] arr2 = arrayRankTransform(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
