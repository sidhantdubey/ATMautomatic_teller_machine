package ATM;

public interface ATM {
    double deposit(double amount);

    double showBalabance(double amount);

    void showBalance();

    boolean verifyPin(int atmPin);
}
