/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bse045;
import java.util.Scanner;
/* @author 2023F-BSE-045 */
public class SwapElements {
    public static void main(String[] args) {
           int [] arr1 ={1,2,3,4};
           int [] arr2 ={5,6,7,8};
           System.out.print("Array-1 Before: ");
           for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+", ");
           }
           System.out.println("");
           System.out.print("Array-2 Before: ");
           for(int i=0;i<arr1.length;i++){
           System.out.print(arr2[i]+", ");
           }
           for(int i=0;i<arr1.length;i++){
           int[] temp = new int[5];
           temp[i]=arr1[i];
           arr1[i]=arr2[i];
           arr2[i]=temp[i];}
           System.out.println("");
           System.out.print("Array-1 After: ");
           for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+", ");
           }
           System.out.println("");
           System.out.print("Array-2 After: ");
           for(int i=0;i<arr1.length;i++){
           System.out.print(arr2[i]+", ");
           }}
           
           
          
          
          
}
}