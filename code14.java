class ATM {
    private double balance;
    private int pin;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void verifyAndWithdraw(int enteredPin, double amount) throws Exception {
        if (this.pin != enteredPin) {
            throw new Exception("Wrong PIN entered!");
        }

        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        }

        if (amount <= 0) {
            throw new Exception("Withdrawal amount must be positive!");
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}

public class Code14 {
    public static void main(String[] args) {
        ATM am = new ATM();
        am.setPin(1234);
        am.setBalance(100000);

        try {
          am.verifyAndWithdraw(1235, 5000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
