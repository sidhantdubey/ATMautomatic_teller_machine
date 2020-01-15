package ATM;

/**
 * abstract interface of general sturucture of ATM
 */
public interface ATM {
    /**
     * amount to deposti
     *
     * @param amount
     * @return value after deposited amount
     */
    double deposit(double amount);

    /**
     * amount to withdrawl
     *
     * @param amount
     * @return money left after withdrawl
     */
    double withdrawl(double amount);

    /**
     * method to show balance left in account
     */
    void showBalance();

    /**
     * verify / authenticate user
     *
     * @param atmPin
     * @return boolean for valid user or not
     */
    boolean verifyPin(int atmPin);
}
