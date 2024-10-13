package com.dsa.arrays.java;

/**
1.Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9


Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35

 */
public final class findMinMax {
   
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int arr[] = {22, 14, 8, 17, 35, 3};
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println(min);
        System.err.println(max);

    }

    /**
     * Finds the minimum element in the given integer array.
     *
     * @param arr the integer array to find the minimum element in
     * @return the minimum element in the array
     */
    private static int findMin(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        //using arrays sort method
        java.util.Arrays.sort(arr);
        int minArr = arr[0];
        System.err.println("minarr "+minArr );
        return min;
    }

    /**
     * Finds the maximum element in the given integer array.
     *
     * @param arr the integer array to find the maximum element in
     * @return the maximum element in the array
     */
    private static int findMax(int[] arr){
        int max = arr[arr.length-1];
        for(int i = 0; i<arr.length-1;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        //using arrays sort method
        java.util.Arrays.sort(arr);
        int maxArr = arr[arr.length-1];
        System.err.println("max arr "+maxArr );
        return max;
    }

    
  
}
