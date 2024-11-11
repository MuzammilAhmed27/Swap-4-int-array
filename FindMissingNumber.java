/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bse045;
import java.util.ArrayList;
import java.util.List;
/* @author 2023F-BSE-045 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 5, 6};
        int n = array.length + 1;
        int sum = n * (n - 1) / 2;
        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
        }
        System.out.println("Missing number: " + sum);
    }
}