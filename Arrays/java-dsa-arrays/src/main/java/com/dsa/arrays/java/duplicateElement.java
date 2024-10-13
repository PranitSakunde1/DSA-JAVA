package com.dsa.arrays.java;

import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
 */
public class duplicateElement {
    /**
     * Main method to demonstrate the usage of containDuplicate and
     * containDuplicateHashSet methods.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize an array with duplicate elements
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // Initialize an array without duplicate elements
        int[] nums2 = { 1, 3, 4, 2 };

        // Call containDuplicate method with nums2 and store the result
        boolean result = containDuplicate(nums2);
        // Print the result
        System.err.println(result);

        // Call containDuplicateHashSet method with nums and store the result
        result = containDuplicateHashSet(nums);
        // Print the result
        System.err.println(result);
    }

    /**
     * Checks if the given array contains any duplicate elements using sorting
     * approach.
     * 
     * @param arr The input array to check for duplicates
     * @return true if duplicates are found, false otherwise
     */
    private static boolean containDuplicate(int arr[]) {
        // Sort the array in ascending order
        java.util.Arrays.sort(arr);
        // Iterate through the array up to the second-to-last element
        for (int i = 0; i <= arr.length - 2; i++) {
            // If current element is equal to the next element, a duplicate is found
            if (arr[i] == arr[i + 1])
                return true;
        }
        // No duplicates found
        return false;
    }

    /**
     * Checks if the given array contains any duplicate elements using HashSet
     * approach.
     * 
     * @param arr The input array to check for duplicates
     * @return true if duplicates are found, false otherwise
     */
    private static boolean containDuplicateHashSet(int arr[]) {
        // Create a HashSet to store unique elements
        HashSet<Integer> numbers = new HashSet<>();
        // Iterate through each element in the array
        for (int integer : arr) {
            // If the current element is already in the HashSet, a duplicate is found
            if (numbers.contains(integer)) {
                return true;
            } else {
                // Add the current element to the HashSet
                numbers.add(integer);
            }
        }
        // No duplicates found
        return false;
    }
}
