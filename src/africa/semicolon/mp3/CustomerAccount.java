package africa.semicolon.mp3;

public class CustomerAccount {

    private double balance;
//    private double amount;
//    private double withdraw;
//
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
      if (amount < 1) {
          System.out.println("Get out man");
      }
      else
          this.balance += amount;

  }

    public double getAcountBalance() {
        return this.balance;
    }

    public double withdraw(double amount) {
        this.balance -= amount;
        return balance;

    }

}
