package rekord.zad10;

public record BankAccount(String number, double balance) {

    public BankAccount(String number){
        this(number, 0.0);
    }
}
