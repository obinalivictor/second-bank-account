import org.jspecify.annotations.Nullable;

public class BankAccount {
    private String name;
    private double balance;
    private int pin;

    public BankAccount(String name, int pin) {
        this.name = name;
        this.pin = pin;
    }


    public void setName(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public void setBalance (double newBalance){
        if(newBalance > 0.0){
            this.balance = newBalance;
        }
    }

    public double getBalance(int pin){
        if(pin == this.pin) {
            return balance;
        }
        return 0;
    }




    public void deposit(int depositAmount) {
        if(depositAmount < 0){
            throw new IllegalArgumentException("deposit amount must be positive");
        }else
            balance = balance + depositAmount;
    }

    public void withdraw(int withdrawalAmount, int pin) {
        if (pin != this.pin) {
            throw new IllegalArgumentException("Invalid pin");
        }
        if(this.balance <= 0){
            throw new IllegalArgumentException("Insufficient funds");
        }
        if(withdrawalAmount <= 0){
         throw new IllegalArgumentException("Incorrect withdrawal amount, try again ! ");
        }
        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;
        }
    }
}