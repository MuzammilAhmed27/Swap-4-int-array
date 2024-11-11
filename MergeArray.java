/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bse045;
import java.util.Scanner;
/* @author 2023F-BSE-045 */
public class MergeArray {
    public static void main(String[] args) {
           int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        
        int[] mergedArray = new int[4 + 4];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        System.out.println("\nMerged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
           }}}
           
           
          
          
    