/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;
/* @author 2023F-BSE-045 */
import java.util.Random;
import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] accountBalances = {0, 100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000};
        int targetBalance = 500000;

        int index = Arrays.binarySearch(accountBalances, targetBalance);
        if (index >= 0) {
            System.out.println("Balance " + targetBalance + " found at Account No. " + index);
        } else {
            System.out.println("Balance " + targetBalance + " not found.");
        }
    }
}