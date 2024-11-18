/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;

/**
 *
 * @author For_all
 */
import java.util.Arrays;

public class MergeSortGeneric {
    public static void main(String[] args) {
        // For integers
        Integer[] intArray = {47, 31, 1, 6, 32, 45};
        System.out.println("Unordered Integer list:");
        printArray(intArray);

        mergeSort(intArray, 0, intArray.length - 1);
        System .out.println("Sorted Integer list:");
        printArray(intArray);

        // For strings
        String[] strArray = {"String3", "String2", "String5", "String1", "String5"};
        System.out.println("Unordered String list:");
        printArray(strArray);

        mergeSort(strArray, 0, strArray.length - 1);
        System.out.println("Sorted String list:");
        printArray(strArray);
    }

    public static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
 }}
    public static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;}
            k++;}
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static <T> void printArray(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}