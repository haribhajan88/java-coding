
class NegativeAmountException extends Exception {
    NegativeAmountException(String msg) { super(msg); }
}
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) { super(msg); }
}
class NetworkFailureException extends Exception {
    NetworkFailureException(String msg) { super(msg); }
}

class Transaction {
    void process() throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        int error = (int)(Math.random() * 4); // 0 to 3
        if (error == 0) throw new NegativeAmountException("Amount is negative!");
        if (error == 1) throw new InsufficientFundsException("Not enough balance!");
        if (error == 2) throw new NetworkFailureException("Network issue!");
        System.out.println("Transaction successful!");
    }
}

public class banl_trans {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.process();
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}