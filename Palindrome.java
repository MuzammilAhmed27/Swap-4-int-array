/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bse045;
import java.util.Scanner;
/* @author 2023F-BSE-045 */
public class Palindrome {
    public static void main(String[] args) {
           String[] array = {"mom","dad","racecar","muzammil"};
        for (int i = 0; i < array.length; i++) {
            if (isPalindrome(array[i])) {
                System.out.println(array[i] + " is a palindrome.");
            } else {
                System.out.println(array[i] + " is not a palindrome.");
            }
        }
    }
        public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;}
            start++;
            end--; }
        return true;
    
    
    
    
    }}
           
           
          
          
    