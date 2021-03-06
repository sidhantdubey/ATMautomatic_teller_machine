/**
 * @author YASH KUMAR SINGH
 * @version 1.01
 */
package yashbank;

import ATM.ATM;

/**
 * abstract class
 */
public class YashBank implements ATM {

    /**
     * money to deposit
     *
     * @param amount
     * @return deposited + previous balance
     */
    @Override
    public double deposit(double amount) {
        return 0;
    }

    /**
     * method to widthrawl money from bank
     *
     * @param amount
     * @return money left after withrawl
     */
    @Override
    public double withdrawl(double amount) {
        return amount;
    }

    /**
     * method to show balance
     */
    @Override
    public void showBalance() {

    }

    /**
     * to authenticate user
     *
     * @param atmPin
     * @return boolean value true if pin matched else false
     */
    @Override
    public boolean verifyPin(int atmPin) {

        return false;
    }
}
