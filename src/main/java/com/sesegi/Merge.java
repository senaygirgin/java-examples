package com.sesegi;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        merge(new int[]{0}, new int[]{1}, 0,1);
        merge(new int[]{1}, new int[]{}, 1,0);
        merge(new int[]{1,2,3,0,0,0}, new int[]{2,5,6}, 3,3);
        merge(new int[]{5,7,9,0,0,0}, new int[]{6,8,9}, 3,3);
    }

    public static void merge(int[] nums1, int[] nums2, int m, int n){
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;

        }

        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println("=====================");
    }
}