/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bse045;
import java.util.Arrays;
/* @author 2023F-BSE-045 */
public class ZigZagSorting {
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 8, 6, 2, 1};
        Arrays.sort(array);

        for (int i = 1; i < array.length; i += 2) {
            if (i + 1 < array.length && array[i] < array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        System.out.println("Zigzag Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
