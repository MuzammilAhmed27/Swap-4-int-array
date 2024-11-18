/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;

/**
 *
 * @author For_all
 */
import java.util.Random;
class BankAccount {
    int accountNumber;
    int balance;
    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }}
public class QuickSortBankAccounts {
    public static void main(String[] args) {
        int n = 10; // Number of accounts
        BankAccount[] accounts = new BankAccount[n];
        Random random = new Random();
        // Initialize accounts with random balances
        for (int i = 0; i < n; i++) {
            int accountNumber = 1000 + i; // Example account number
            int balance = random.nextInt(100001); // Random balance between 0 and 100000
            accounts[i] = new BankAccount(accountNumber, balance);
        }
        // Sort accounts in descending order of balance
        quickSort(accounts, 0, accounts.length - 1);
        // Print sorted accounts
        System.out.println("Sorted Accounts (Descending Order by Balance):");
        for (BankAccount account : accounts) {
            System.out.println("Account No: " + account.accountNumber + ", Balance: " + account.balance);
        }}
    // Quick Sort method
    public static void quickSort(BankAccount[] accounts, int low, int high) {
        if (low < high) {
            int pi = partition(accounts, low, high);
            quickSort(accounts, low, pi - 1);
            quickSort(accounts, pi + 1, high);
        }}
    // Partition method for Quick Sort
    public static int partition(BankAccount[] accounts, int low, int high) {
        int pivot = accounts[high].balance; // Choosing the last element as pivot
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            // If current balance is greater than or equal to pivot
            if (accounts[j].balance >= pivot) {
                i++;
                // Swap accounts[i] and accounts[j]
                BankAccount temp = accounts[i];
                accounts[i] = accounts[j];
                accounts[j] = temp;
            }}
        // Swap accounts[i + 1] and accounts[high] (or pivot)
        BankAccount temp = accounts[i + 1];
        accounts[i + 1] = accounts[high];
        accounts[high] = temp;
        return i + 1;
    }
}