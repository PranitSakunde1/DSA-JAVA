package com.dsa.arrays.java;

/*
Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]



Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 https://neetcode.io/courses/advanced-algorithms/0

 */
public final class maximumSubarray {

    public static void main(String[] args) {
        // Main method implementation
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maxSum(arr);
        kadanes(arr);
    }

    /**
     * Finds the maximum sum of any contiguous subarray within the given array.
     *
     * @param arr the input array of integers
     * @return the maximum sum of any contiguous subarray
     */
    private static int maxSum(int arr[]) {
        // Initialize maxSum with the first element of the array
        int maxSum = arr[0];

        // Outer loop: iterate through all possible starting positions
        for (int i = 0; i < arr.length; i++) {
            // Initialize currSum to 0 for each new starting position
            int currSum = 0;
            // Inner loop: calculate sum of subarrays starting from index i
            for (int j = i; j < arr.length; j++) {
                // Add the current element to currSum
                currSum = currSum + arr[j];
                // If currSum is greater than maxSum, update maxSum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        // Time Complexity: O(n^2)
        // The outer loop runs n times, where n is the length of the array.
        // For each iteration of the outer loop, the inner loop runs from i to n.
        // This results in a total of n + (n-1) + (n-2) + ... + 1 iterations,
        // which simplifies to (n * (n+1)) / 2, giving us a time complexity of O(n^2).

        return maxSum;
    }

    /**
     * Finds the maximum sum of any contiguous subarray within the given array using
     * Kadane's algorithm.
     *
     * @param arr the input array of integers
     * @return the maximum sum of any contiguous subarray
     */
    private static int kadanes(int arr[]) {
        // Initialize maxSum with the first element of the array
        int maxSum = arr[0];

        // Initialize currSum to keep track of the current sum
        int currSum = 0;

        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Reset currSum to 0 if it becomes negative
            currSum = Math.max(currSum, 0);

            // Add the current element to currSum
            currSum = currSum + arr[i];

            // Update maxSum if currSum is greater
            maxSum = Math.max(maxSum, currSum);
        }

        // Time Complexity: O(n)
        // The algorithm iterates through the array once, performing constant-time
        // operations for each element. This results in a linear time complexity,
        // where n is the length of the input array.

        // Print the maximum sum
        System.err.println(maxSum);

        // Return the maximum sum
        return maxSum;
    }

}