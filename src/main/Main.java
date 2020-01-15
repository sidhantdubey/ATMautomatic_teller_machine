/**
 * @author YASH KUMAR SINGH
 * @version 1.01
 */
package main;

import yashbank.YashBank;

/**
 * main class from ehre program exeutes
 */
public class Main {
    /**
     * main function/main method
     *
     * @param args to have command line input
     */
    public static void main(String[] args) {
        YashBank yashBank = new YashBank();
        yashBank.verifyPin(123);
        yashBank.deposit(1000);
        yashBank.showBalance();
        yashBank.withdrawl(200);
    }
}
