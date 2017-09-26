package com.maptools.controller;

/**
 * 二分查找（有序队列）
 * Created by mr on 2017/9/26.
 */
public class BinarySearch {

    static int target = 221;

    public static void main(String[] args) {
        int[] a = {2, 6, 9, 11, 12, 24, 27, 37, 48, 69, 88, 91, 193, 221};
        System.out.println(search(a, target) + "");
        System.out.println(binarySearch(a, target) + "");
    }

    //me
    private static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle = (right - left) / 2;
        while (left <= right) {
            if (arr[middle] > target) {
                right = middle - 1;
                middle = (right - left) / 2;
            } else if (arr[middle] < target) {
                left = middle + 1;
                middle = (right - left) / 2 + left;
            } else {
                return middle;
            }
        }
        return -1;
    }

    //binarySearch
    private static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int middle = l + (r - l) / 2;
            if (target < arr[middle]) {
                r = middle - 1;
            } else if (target > arr[middle]) {
                l = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
