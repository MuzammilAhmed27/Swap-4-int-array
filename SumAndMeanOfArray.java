/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bse045;
/* @author 2023F-BSE-045 */
public class SumAndMeanOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }}
           
           
          
          
    