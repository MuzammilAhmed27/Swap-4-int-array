/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2023f.bse.pkg045;

/* @author 2023f-bse-045 */
import java.util.Scanner;
import java.util.Arrays;
public class BuiltinArraySearch {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {31,47,50,1,7,5,32};
        int key = 47;
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, key);
          if(index>0){
              System.out.println(key +" found at index "+index);
          }
          else{
              System.out.println(key +" not found");    
                }
        }
       
    }
    

