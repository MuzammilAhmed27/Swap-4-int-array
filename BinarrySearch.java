/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;
/* @author 2023F-BSE-045 */
public class BinarrySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int firstOccurrence = binarySearchFirstOccurrence(sortedArray, target);
        
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
    public static int binarySearchFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Look on the left side for first occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }}
        return result;
    }
}