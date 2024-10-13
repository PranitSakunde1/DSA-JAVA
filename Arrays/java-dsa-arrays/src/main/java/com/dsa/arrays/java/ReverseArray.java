package com.dsa.arrays.java;

import java.util.Stack;

/*
 * Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first 
 element becomes the last, the second element becomes second last and so on.

Examples:

Input: arr[] = {1, 4, 3, 2, 6, 5}  
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.


Input: arr[] = {4, 5, 1, 2} 
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
 */
public class ReverseArray {

    /**
     * Reverses the elements of the given integer array.
     * 
     * This method first pushes all the elements of the input array onto a stack.
     * Then, it pops the elements from the stack and assigns them back to the
     * original array,
     * effectively reversing the order of the elements.
     * 
     * @param arr the integer array to be reversed
     */
    private static void reverseArrayUsingStack(int arr[]) {
        Stack<Integer> s = new Stack<>();

        System.out.println(java.util.Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.pop();
        }
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 3, 2, 6, 5 };
        reverseArrayUsingStack(arr);
        reverseArray(arr);
    }

    // more efficient for memory
    /**
     * Reverses the elements of the given integer array.
     * 
     * This method uses a two-pointer approach to swap the elements at the beginning
     * and end of the array, and then moves the pointers inward until the entire
     * array is reversed.
     * 
     * @param arr the integer array to be reversed
     */
    private static void reverseArray(int arr[]) {
        int min = 0;
        int max = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            min++;
            max--;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }

}
