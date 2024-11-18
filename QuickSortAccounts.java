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
import java.util.Random;

public class QuickSortAccounts {
    static class Account {
        int accountNo;
        int balance;

        Account(int accountNo, int balance) {
            this.accountNo = accountNo;
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Size of the array
        Account[] accounts = new Account[n];
        Random random = new Random();

        // Initialize accounts with random balances
        for (int i = 0; i < n; i++) {
            accounts[i] = new Account(1000 + i, random.nextInt(100001)); // Account No. from 1000 to 1009
        }

        System.out.println("Accounts before sorting:");
        printAccounts(accounts);

        quickSort(accounts, 0, n - 1);

        System.out.println("Accounts after sorting by balance:");
        printAccounts(accounts);
    }

    public static void quickSort(Account[] accounts, int low, int high) {
        if (low < high) {
            int pi = partition(accounts, low, high);
            quickSort(accounts, low, pi - 1);
            quickSort(accounts, pi + 1, high);
        }
    }

    public static int partition(Account[] accounts, int low, int high) {
        int pivot = accounts[high].balance;
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (accounts[j].balance > pivot) { // Sort in descending order
                i++;
                Account temp = accounts[i];
                accounts[i] = accounts[j];
                accounts[j] = temp;
            }
        }
        Account temp = accounts[i + 1];
        accounts[i + 1] = accounts[high];
        accounts[high] = temp;
        return i + 1;
    }

    public static void printAccounts(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("Account No: " + account.accountNo + " Balance: " + account.balance);
        }
        System.out.println();
    }
}