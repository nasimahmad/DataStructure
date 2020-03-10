package com.sns.sorting;

import java.util.Arrays;

public class BubbleSort {
    
    public int[] sort(int[] array) {
        System.out.println("Sorting starts : "+Arrays.toString(array));
        for(int i=0;i<array.length;i++) {
            boolean isSwiped = false;
            for(int j=0;j<array.length-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwiped = true;
                }
            }
            System.out.println(Arrays.toString(array));
            if(!isSwiped) {
                break;
            }
        }
        System.out.println("Sorting ends : "+Arrays.toString(array));
        return array;
    }
    
    
    public static void main(String args[])
    {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(new int[]{1,2,3});
    }
}
