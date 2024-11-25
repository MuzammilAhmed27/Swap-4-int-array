/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;
/* @author 2023F-BSE-045 */
import java.util.Arrays;

public class SmallestMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("The smallest positive integer missing is: " + findSmallestMissingPositive(arr));
    }
    public static int findSmallestMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int smallestMissing = 1;

        for (int num : arr) {
            if (num == smallestMissing) {
                smallestMissing++;}}
        return smallestMissing;
    }
}