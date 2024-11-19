/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2023f.bse.pkg045;

/**
 *
 * @author 2023f-bse-045
 */
import java.util.Scanner;
import java.util.Random;
public class BSE045 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for(int i=1; i<=arr.length-1;i++){
            arr[i]= r.nextInt(1000000);
            if(arr[i]<10000){
                System.out.println("Account "+i+": "+arr[i]+" (Low Balance)");
            }
            else{
                System.out.println("Account "+i+": "+arr[i]);
            
            }
        }
        
    }
    
}
