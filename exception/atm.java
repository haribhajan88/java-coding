class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) { super(msg); }
}

class ATM {
    int balance = 10000;
    void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException("Insufficient balance!");
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }
}

public class atm {
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(12000); // Try changing this to 5000 to test success
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    