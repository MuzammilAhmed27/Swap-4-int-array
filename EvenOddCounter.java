/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bse045;
import java.util.Scanner;
/* @author 2023F-BSE-045 */
public class EvenOddCounter {
    public static void main(String[] args) {
        int[] array = {45, 31, 1, 7, 27, 47, 99, 82, 59, 70};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }}
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    
    }}
           
           
          
          
    